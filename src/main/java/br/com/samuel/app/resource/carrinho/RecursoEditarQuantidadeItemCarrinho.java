package br.com.samuel.app.resource.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.usesCases.carrinho.EditarQuantidadeItemCarrinho;

@RestController
@RequestMapping("carrinho")
public class RecursoEditarQuantidadeItemCarrinho {

    @Autowired
    private EditarQuantidadeItemCarrinho editarQtdItemCarrinho;

    @PatchMapping("/{carrinhoId}/editarquantidade")
    public ResponseEntity<Carrinho> excutar(@PathVariable Integer carrinhoId, @RequestBody ItemCarrinho itemCarrinho) {
        return editarQtdItemCarrinho.executar(carrinhoId, itemCarrinho);
    }
}