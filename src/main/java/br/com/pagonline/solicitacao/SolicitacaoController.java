package br.com.pagonline.solicitacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.StringJoiner;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @Autowired
    private SolicitacaoTransferencia solicitacaoTransferencia;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/registra")
    public ResponseEntity solicitaTransferencia(@RequestBody Solicitacao solicitacao) {

        solicitacao.setIdSolicitacao(solicitacao.getIdClienteOrigem()+"|"+solicitacao.getIdClienteDestino()
                +"|"+solicitacao.getIdCorrentistaOrigem()+"|"+solicitacao.getIdCorrentistaDestino()
                +"|"+solicitacao.getValor());

        Cliente cliente = clienteService.getClienteUrl(solicitacao.getIdClienteDestino());

        solicitacaoService.save(solicitacao);

        solicitacaoTransferencia.transferir(solicitacao);

        notificaCliente(cliente, solicitacao);

        return ResponseEntity.ok("OK");
    }

    void notificaCliente(Cliente cliente, Solicitacao solicitacao){

        NotificacaoCredito notificacaoCredito = new NotificacaoCredito(solicitacao.getIdSolicitacao(),
                solicitacao.getIdClienteDestino(),
                solicitacao.getValor());

        ResponseEntity responseEntity = restTemplate.postForEntity(cliente.getUrl(), notificacaoCredito, NotificacaoCredito.class);

        if(HttpStatus.OK != responseEntity.getStatusCode()){
            throw new RuntimeException("Serviço do takeshi está fora");
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Solicitacao>> listarTodos() {
        return ResponseEntity.ok(solicitacaoService.listarTodos());
    }
}
