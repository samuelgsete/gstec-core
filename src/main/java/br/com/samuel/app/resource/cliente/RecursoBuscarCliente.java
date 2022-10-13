package br.com.samuel.app.resource.cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.resource.models.RecursoBuscar;
import br.com.samuel.app.usesCases.cliente.BuscarCliente;

@RestController
@RequestMapping("cliente")
public class RecursoBuscarCliente extends RecursoBuscar<Cliente, BuscarCliente> {

    @GetMapping("{id}")
    public ResponseEntity<Cliente> executar(@PathVariable Integer id) {
        return getBuscar()
                .executar(id)
                .map(cliente -> ResponseEntity.ok().body(cliente))
                .orElse(ResponseEntity.notFound().build());
    }
}