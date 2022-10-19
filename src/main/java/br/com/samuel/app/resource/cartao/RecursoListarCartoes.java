package br.com.samuel.app.resource.cartao;

import java.util.List;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.CartaoCredito;
import br.com.samuel.app.resource.models.RecursoListar;
import br.com.samuel.app.usesCases.cartao.ListarCartoes;

@RestController
@RequestMapping("cartao-credito")
public class RecursoListarCartoes extends RecursoListar<CartaoCredito, ListarCartoes> {

    @GetMapping("{clienteId}/listar")
    public ResponseEntity<Set<CartaoCredito>> executar(@PathVariable Integer clienteId) {
        return ResponseEntity.ok(getListar().executar(clienteId));
    }

    public ResponseEntity<List<CartaoCredito>> executar() {
        return null;
    }
}