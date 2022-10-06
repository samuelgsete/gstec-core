package br.com.samuel.gstec.resource.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Cliente;
import br.com.samuel.gstec.usesCases.cliente.CriarCliente;

@RestController
@RequestMapping("cliente")
public class RecursoCriarCliente {
    
    @Autowired
    private CriarCliente criarCliente;

    @PostMapping("/novo")
    public ResponseEntity<Object> criarCliente(@RequestBody Cliente novoCliente) {
        return ResponseEntity
                .created(criarCliente.executar(novoCliente))
                .build();
    }
}