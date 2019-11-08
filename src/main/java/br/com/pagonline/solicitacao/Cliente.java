package br.com.pagonline.solicitacao;

import java.util.List;

public class Cliente {

    private String id;
    private String nome;
    private List<String> url;
    private String status;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getUrl() {
        return url;
    }

    public String getStatus() {
        return status;
    }
}
