package br.com.pagonline.solicitacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @Autowired
    private SolicitacaoTransferencia solicitacaoTransferencia;

    @PostMapping("/registra")
    public ResponseEntity solicitaTransferencia(@RequestBody Solicitacao solicitacao) {
        solicitacaoService.save(solicitacao);
        solicitacaoTransferencia.transferir(solicitacao);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Solicitacao>> solicitaTransferencia() {
        return ResponseEntity.ok(solicitacaoService.listarTodos());
    }
}
