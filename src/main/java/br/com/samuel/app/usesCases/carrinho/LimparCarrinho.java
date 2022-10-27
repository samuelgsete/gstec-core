package br.com.samuel.app.usesCases.carrinho;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.repository.RepositorioCarrinho;
import br.com.samuel.app.repository.RepositorioItemCarrinho;

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
        repositorioItemCarrinho.deleteAll(itens);
        return ResponseEntity.ok(repositorioCarrinho.save(carrinho));
    }
}