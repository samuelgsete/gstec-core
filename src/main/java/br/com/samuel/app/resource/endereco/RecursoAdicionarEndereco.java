package br.com.samuel.app.resource.endereco;

import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.resource.models.RecursoAdicionar;
import br.com.samuel.app.usesCases.endereco.AdicionarEndereco;

@RestController
@RequestMapping("cliente")
public class RecursoAdicionarEndereco extends RecursoAdicionar<Endereco, AdicionarEndereco> {

    @PutMapping("/{clienteId}/endereco")
    public ResponseEntity<Set<Endereco>> executar(@PathVariable Integer clienteId, @RequestBody Endereco endereco) {
        return ResponseEntity.ok(getAdicionar().executar(clienteId, endereco));
    }
}