package br.com.pagonline.solicitacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Solicitacao implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idSolicitacao;

    private String idClienteOrigem;

    private String idClienteDestino;

    private String idCorrentistaOrigem;

    private String idCorrentistaDestino;

    private BigDecimal valor;

    public Long getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(Long idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public String getIdClienteOrigem() {
        return idClienteOrigem;
    }

    public void setIdClienteOrigem(String idClienteOrigem) {
        this.idClienteOrigem = idClienteOrigem;
    }

    public String getIdClienteDestino() {
        return idClienteDestino;
    }

    public void setIdClienteDestino(String idClienteDestino) {
        this.idClienteDestino = idClienteDestino;
    }

    public String getIdCorrentistaOrigem() {
        return idCorrentistaOrigem;
    }

    public void setIdCorrentistaOrigem(String idCorrentistaOrigem) {
        this.idCorrentistaOrigem = idCorrentistaOrigem;
    }

    public String getIdCorrentistaDestino() {
        return idCorrentistaDestino;
    }

    public void setIdCorrentistaDestino(String idCorrentistaDestino) {
        this.idCorrentistaDestino = idCorrentistaDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
