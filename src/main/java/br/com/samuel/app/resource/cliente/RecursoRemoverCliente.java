package br.com.samuel.app.resource.cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.resource.models.RecursoRemover;
import br.com.samuel.app.usesCases.cliente.RemoverCliente;

@RestController
@RequestMapping("cliente")
public class RecursoRemoverCliente extends RecursoRemover<Cliente, RemoverCliente> {

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getRemover().executar(id));
    }
}