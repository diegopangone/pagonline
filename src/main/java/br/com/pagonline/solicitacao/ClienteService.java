package br.com.pagonline.solicitacao;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "clientes")
public interface ClienteService {

    @Cacheable("clientes")
    @GetMapping("/clientes/{id}")
    Cliente getClienteUrl(@PathVariable("id") String id);

}
