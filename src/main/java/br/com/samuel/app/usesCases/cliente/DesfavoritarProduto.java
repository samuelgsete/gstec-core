package br.com.samuel.app.usesCases.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.ProdutosFavoritos;
import br.com.samuel.app.repository.RepositorioProdutosFavoritos;

@Service
public class DesfavoritarProduto {
    
    @Autowired
    private RepositorioProdutosFavoritos repositorio;

    public void executar(Integer clienteId, Integer produtoId) {
        ProdutosFavoritos produtosFavoritos = repositorio.buscarProdutosFavoritos(clienteId).get();
        produtosFavoritos
            .getProdutos()
            .stream()
            .filter(produtoFavorito -> produtoFavorito.getId() != produtoId);

        repositorio.save(produtosFavoritos);
    }
}