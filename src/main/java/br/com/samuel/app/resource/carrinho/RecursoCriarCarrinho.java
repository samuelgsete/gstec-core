package br.com.samuel.app.resource.carrinho;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.resource.models.RecursoCriar;
import br.com.samuel.app.usesCases.carrinho.CriarCarrinho;

@RestController
@RequestMapping("carrinho")
public class RecursoCriarCarrinho extends RecursoCriar<Carrinho, CriarCarrinho> {

    @PostMapping("/novo")
    public ResponseEntity<Object> executar(@RequestBody Carrinho novoCarrinho) {
        return ResponseEntity
                .created(getCriar().executar(novoCarrinho))
                .build();
    }
}