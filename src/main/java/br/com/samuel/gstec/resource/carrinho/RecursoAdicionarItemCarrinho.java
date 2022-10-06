package br.com.samuel.gstec.resource.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Carrinho;
import br.com.samuel.gstec.models.ItemCarrinho;
import br.com.samuel.gstec.usesCases.carrinho.AdicionarItemCarrinho;

@RestController
@RequestMapping("carrinho")
public class RecursoAdicionarItemCarrinho {

    @Autowired
    private AdicionarItemCarrinho addItemCarrinho;

    @PutMapping("/{carrinhoId}/adicionar")
    public ResponseEntity<Carrinho> excutar(@PathVariable Integer carrinhoId, @RequestBody ItemCarrinho novoItem) {
        return addItemCarrinho.executar(carrinhoId, novoItem);
    }
}