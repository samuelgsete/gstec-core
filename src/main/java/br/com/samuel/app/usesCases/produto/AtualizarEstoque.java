package br.com.samuel.app.usesCases.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;

@Service
public class AtualizarEstoque {

    @Autowired
    private RepositorioProduto repositorio;

    public ResponseEntity<Produto> executar(Integer produtoId, Integer estoqueAtualizado) {
        Produto produto = repositorio.findById(produtoId).get();
        produto.setEstoque(estoqueAtualizado);
        return ResponseEntity.ok(repositorio.save(produto));
    }
}