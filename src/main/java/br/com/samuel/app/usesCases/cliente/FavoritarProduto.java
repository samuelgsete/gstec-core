package br.com.samuel.app.usesCases.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.models.ProdutosFavoritos;
import br.com.samuel.app.repository.RepositorioProdutosFavoritos;

@Service
public class FavoritarProduto {
    
    @Autowired
    private RepositorioProdutosFavoritos repositorio;

    public ProdutosFavoritos executar(Integer clienteId, Produto produtoFavorito) {
        ProdutosFavoritos produtosFavoritos = repositorio.buscarProdutosFavoritos(clienteId).get();  
        produtosFavoritos.getProdutos().add(produtoFavorito);
        return repositorio.save(produtosFavoritos);
    }
}