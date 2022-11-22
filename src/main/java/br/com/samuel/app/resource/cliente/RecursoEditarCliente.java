package br.com.samuel.app.resource.cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.resource.models.RecursoEditar;
import br.com.samuel.app.usesCases.cliente.EditarCliente;

@RestController
@RequestMapping("cliente")
public class RecursoEditarCliente extends RecursoEditar<Cliente, EditarCliente> {

    @PutMapping("{id}")
    public ResponseEntity<Cliente> executar(@PathVariable Integer id, @RequestBody Cliente cliente) {
        return ResponseEntity.ok(getEditar().executar(id, cliente));
    }
}