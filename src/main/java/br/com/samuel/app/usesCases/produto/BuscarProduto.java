package br.com.samuel.app.usesCases.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;

@Service
public class BuscarProduto {

    @Autowired
    private RepositorioProduto repositorioProduto;

    public ResponseEntity<Produto> executar(Integer id) {
        return repositorioProduto
                .findById(id)
                .map(produto -> ResponseEntity.ok().body(produto))
                .orElse(ResponseEntity.notFound().build());
    }
}