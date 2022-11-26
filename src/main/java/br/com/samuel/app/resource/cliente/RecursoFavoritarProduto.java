package br.com.samuel.app.resource.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.models.ProdutosFavoritos;
import br.com.samuel.app.usesCases.cliente.FavoritarProduto;

@RestController
@RequestMapping("cliente")
public class RecursoFavoritarProduto {

    @Autowired
    private FavoritarProduto favoritar;
    
    @PatchMapping("{id}/produtos/favoritos")
    public ResponseEntity<ProdutosFavoritos> executar(@PathVariable Integer id, @RequestBody Produto produto) {
        return ResponseEntity.ok(favoritar.executar(id, produto));
    }
}