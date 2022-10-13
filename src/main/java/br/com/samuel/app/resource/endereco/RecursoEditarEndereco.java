package br.com.samuel.app.resource.endereco;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.resource.models.RecursoEditar;
import br.com.samuel.app.usesCases.endereco.EditarEndereco;

@RestController
@RequestMapping("endereco")
public class RecursoEditarEndereco extends RecursoEditar<Endereco, EditarEndereco> {

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> executar(@PathVariable Integer id, @RequestBody Endereco endereco) {
        return ResponseEntity.ok(getEditar().executar(id, endereco));
    }
}