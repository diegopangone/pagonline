package br.com.pagonline.solicitacao;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableBinding(AmqpPagamentoConfig.PagamentoSource.class)
public class AmqpPagamentoConfig {

    static interface PagamentoSource {
        @Output
        MessageChannel congela();
    }

}
