package br.com.pagonline.solicitacao;

import java.math.BigDecimal;

public class CongelaDto {

    private String idClienteDebito;
    private BigDecimal valor;

    public String getIdClienteDebito() {
        return idClienteDebito;
    }

    public void setIdClienteDebito(String idClienteDebito) {
        this.idClienteDebito = idClienteDebito;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
