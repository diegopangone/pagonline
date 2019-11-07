package br.com.pagonline.solicitacao;

import java.math.BigDecimal;

public class NotificacaoCredito {

    private String idSolicitacao;
    private String idCorrentistaCredito;
    private BigDecimal valor;

    public NotificacaoCredito(String idSolicitacao, String idCorrentistaCredito, BigDecimal valor) {
        this.idSolicitacao = idSolicitacao;
        this.idCorrentistaCredito = idCorrentistaCredito;
        this.valor = valor;
    }

    public String getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(String idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public String getIdCorrentistaCredito() {
        return idCorrentistaCredito;
    }

    public void setIdCorrentistaCredito(String idCorrentistaCredito) {
        this.idCorrentistaCredito = idCorrentistaCredito;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
