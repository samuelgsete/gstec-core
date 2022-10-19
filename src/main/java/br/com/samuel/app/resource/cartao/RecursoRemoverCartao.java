package br.com.samuel.app.resource.cartao;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.CartaoCredito;
import br.com.samuel.app.resource.models.RecursoRemover;
import br.com.samuel.app.usesCases.cartao.RemoverCartao;

@RestController
@RequestMapping("cartao-credito")
public class RecursoRemoverCartao extends RecursoRemover<CartaoCredito, RemoverCartao> {

    @DeleteMapping("{id}")
    public ResponseEntity<CartaoCredito> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getRemover().executar(id));
    }
}