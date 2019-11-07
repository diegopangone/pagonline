package br.com.pagonline.solicitacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitacaoService {

    @Autowired
    SolicitacaoRepository solicitacaoRepository;

    void save(Solicitacao solicitacao){
        solicitacaoRepository.save(solicitacao);
    }

    List<Solicitacao> listarTodos(){
       return solicitacaoRepository.findAll();
    }

}
