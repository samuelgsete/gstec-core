package br.com.samuel.gstec.resource.endereco;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Endereco;
import br.com.samuel.gstec.resource.models.RecursoRemover;
import br.com.samuel.gstec.usesCases.endereco.RemoverEndereco;

@RestController
@RequestMapping("endereco")
public class RecursoRemoverEndereco extends RecursoRemover<Endereco, RemoverEndereco> {

    @DeleteMapping("/{id}")
    public ResponseEntity<Endereco> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getRemover().executar(id));
    }
}