package br.com.samuel.gstec.resource.endereco;

import java.util.List;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Endereco;
import br.com.samuel.gstec.resource.models.RecursoListar;
import br.com.samuel.gstec.usesCases.endereco.ListarEnderecos;

@RestController
@RequestMapping("cliente")
public class RecursoListarEnderecos extends RecursoListar<Endereco, ListarEnderecos> {

    @GetMapping("/{clienteId}/enderecos")
    public ResponseEntity<Set<Endereco>> executar(@PathVariable Integer clienteId) {
        return ResponseEntity.ok(getListar().executar(clienteId));
    }

    public ResponseEntity<List<Endereco>> executar() { return null; }
}