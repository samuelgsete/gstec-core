package br.com.samuel.gstec.usesCases.carrinho;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Carrinho;
import br.com.samuel.gstec.models.ItemCarrinho;
import br.com.samuel.gstec.repository.RepositorioCarrinho;
import br.com.samuel.gstec.repository.RepositorioItemCarrinho;

@Service
public class LimparCarrinho {
    
    @Autowired
    private RepositorioCarrinho repositorioCarrinho;

    @Autowired
    private RepositorioItemCarrinho repositorioItemCarrinho;

    public ResponseEntity<Carrinho> executar(Integer carrinhoId) {
        Carrinho carrinho = repositorioCarrinho.findById(carrinhoId).get();
        Set<ItemCarrinho> itens = carrinho.getItens();
        carrinho.setItens(new HashSet<ItemCarrinho>());
        carrinho.setSubtotal(0.0);
        carrinho.setTotalItens(0);
        repositorioItemCarrinho.deleteAll(itens.stream().toList());      
        return ResponseEntity.ok(repositorioCarrinho.save(carrinho));
    }
}