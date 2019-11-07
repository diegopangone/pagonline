package br.com.pagonline.solicitacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${service.clientes.url}", name = "clientes")
public interface ClienteService {

    @GetMapping("/clientes/{id}")
    Cliente getClienteUrl(@PathVariable("id") String id);

}
