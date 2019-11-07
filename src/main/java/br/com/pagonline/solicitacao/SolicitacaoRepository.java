package br.com.pagonline.solicitacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {


    @Query("select s from Solicitacao s where s.idClienteOrigem = :idClienteOrigem")
    List<Solicitacao> obtemPorIdClienteOrigem(@Param("idClienteOrigem") String idClienteOrigem);

}
