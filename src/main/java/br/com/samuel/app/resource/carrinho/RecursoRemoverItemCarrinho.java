package br.com.samuel.app.resource.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.usesCases.carrinho.RemoverItemCarrinho;

@RestController
@RequestMapping("carrinho")
public class RecursoRemoverItemCarrinho {

    @Autowired
    private RemoverItemCarrinho removerItemCarrinho;

    @DeleteMapping("{carrinhoId}/removeritem")
    private ResponseEntity<Carrinho> executar(@PathVariable Integer carrinhoId,
            @RequestBody ItemCarrinho itemCarrinho) {
        return removerItemCarrinho.executar(carrinhoId, itemCarrinho);
    }
}