package br.com.samuel.app.usesCases.carrinho;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.repository.RepositorioCarrinho;

@Service
public class EditarQuantidadeItemCarrinho {

    @Autowired
    private RepositorioCarrinho repositorioCarrinho;

    public ResponseEntity<Carrinho> executar(Integer carrinhoId, ItemCarrinho itemCarrinho) {
        Carrinho carrinho = repositorioCarrinho.findById(carrinhoId).get();
        Set<ItemCarrinho> itens = carrinho.getItens();
        itens.remove(itemCarrinho);
        itens.add(itemCarrinho);
        Double subtotal = itens
                .stream()
                .mapToDouble(itemAtual -> itemAtual.getQuantidade() * itemAtual.getProduto().getPreco())
                .sum();
        Integer totalItens = itens
                .stream()
                .mapToInt(item -> item.getQuantidade())
                .sum();
        carrinho.setTotalItens(totalItens);
        carrinho.setSubtotal(subtotal);
        carrinho.setItens(itens);
        Carrinho carrinhoAtualizado = repositorioCarrinho.save(carrinho);
        return ResponseEntity.ok(carrinhoAtualizado);
    }
}