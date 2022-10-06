package br.com.samuel.gstec.usesCases.carrinho;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Carrinho;
import br.com.samuel.gstec.models.ItemCarrinho;
import br.com.samuel.gstec.repository.RepositorioCarrinho;
import br.com.samuel.gstec.repository.RepositorioItemCarrinho;

@Service
public class RemoverItemCarrinho {

    @Autowired
    private RepositorioCarrinho repositorioCarrinho;
    
    @Autowired
    private RepositorioItemCarrinho repositorioItemCarrinho;

    public ResponseEntity<Carrinho> executar(Integer carrinhoId, ItemCarrinho itemCarrinho) {
        Carrinho carrinho = repositorioCarrinho.findById(carrinhoId).get();
        Set<ItemCarrinho> itens = carrinho.getItens();
        itens.remove(itemCarrinho);
        carrinho.setItens(itens);
        Integer totalItens = carrinho.getTotalItens() - itemCarrinho.getQuantidade();
        carrinho.setTotalItens(totalItens);
        carrinho = repositorioCarrinho.save(carrinho);
        repositorioItemCarrinho.delete(itemCarrinho);
        return ResponseEntity.ok(carrinho);
    } 
}