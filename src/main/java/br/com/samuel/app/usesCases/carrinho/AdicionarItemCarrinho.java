package br.com.samuel.app.usesCases.carrinho;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.repository.RepositorioCarrinho;

@Service
public class AdicionarItemCarrinho {

    @Autowired
    private RepositorioCarrinho repositorioCarrinho;

    public ResponseEntity<Carrinho> executar(Integer carrinhoId, ItemCarrinho novoItem) {
        Carrinho carrinho = repositorioCarrinho.findById(carrinhoId).get();
        novoItem.setCarrinho(carrinho);
        Set<ItemCarrinho> itens = carrinho.getItens();
        itens.add(novoItem);
        Double subtotal = itens
                .stream()
                .mapToDouble(item -> item.getQuantidade() * item.getProduto().getPreco())
                .sum();
        Integer totalItens = itens
                .stream()
                .mapToInt(item -> item.getQuantidade())
                .sum();
        carrinho.setSubtotal(subtotal);
        carrinho.setTotalItens(totalItens);
        carrinho.setItens(itens);
        return ResponseEntity.ok(repositorioCarrinho.save(carrinho));
    }
}