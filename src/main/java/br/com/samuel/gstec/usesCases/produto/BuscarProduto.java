package br.com.samuel.gstec.usesCases.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioProduto;

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