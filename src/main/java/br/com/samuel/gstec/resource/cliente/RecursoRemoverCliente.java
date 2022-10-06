package br.com.samuel.gstec.resource.cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Cliente;
import br.com.samuel.gstec.resource.models.RecursoRemover;
import br.com.samuel.gstec.usesCases.cliente.RemoverCliente;

@RestController
@RequestMapping("cliente")
public class RecursoRemoverCliente extends RecursoRemover<Cliente, RemoverCliente> {

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getRemover().executar(id));
    }
}