package br.com.pagonline.solicitacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class SolicitacaoTransferencia {

    @Autowired
    private AmqpPagamentoConfig.PagamentoSource source;

    void transferir(Solicitacao solicitacao){
        CongelaDto congelaDto = new CongelaDto();
        congelaDto.setIdClienteDebito(solicitacao.getIdClienteOrigem());
        congelaDto.setValor(solicitacao.getValor());
        source.congela().send(MessageBuilder.withPayload(congelaDto).build());
    }
}
