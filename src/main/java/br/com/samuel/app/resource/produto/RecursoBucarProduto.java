package br.com.samuel.app.resource.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.usesCases.produto.BuscarProduto;

@RestController
@RequestMapping("/produto")
public class RecursoBucarProduto {

    @Autowired
    private BuscarProduto buscarProduto;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> executar(@PathVariable Integer id) {
        return buscarProduto.executar(id);
    }
}