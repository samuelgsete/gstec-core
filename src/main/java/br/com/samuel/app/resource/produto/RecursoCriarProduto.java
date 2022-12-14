package br.com.samuel.app.resource.produto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.resource.models.RecursoCriar;
import br.com.samuel.app.usesCases.produto.CriarProduto;

@RestController
@RequestMapping("/produto")
public class RecursoCriarProduto extends RecursoCriar<Produto, CriarProduto> {

    @PostMapping
    public ResponseEntity<Object> executar(@RequestBody Produto novoProduto) {
        return ResponseEntity.created(getCriar().executar(novoProduto)).build();
    }
}