package br.com.samuel.app.resource.cartao;

import java.util.Set;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.CartaoCredito;
import br.com.samuel.app.resource.models.RecursoAdicionar;
import br.com.samuel.app.usesCases.cartao.AdicionarCartao;

@RestController
@RequestMapping("cartao-credito")
public class RecursoAdicionarCartao extends RecursoAdicionar<CartaoCredito, AdicionarCartao> {

    @PostMapping("{clienteId}/adicionar")
    public ResponseEntity<Set<CartaoCredito>> executar(@PathVariable Integer clienteId,
            @RequestBody CartaoCredito novoCartao) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(getAdicionar().executar(clienteId, novoCartao));
    }
}