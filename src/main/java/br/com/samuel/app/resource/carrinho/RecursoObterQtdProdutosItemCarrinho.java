package br.com.samuel.app.resource.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.usesCases.carrinho.ObterQtdProdutosItemCarrinho;

@RestController
@RequestMapping("cliente")
public class RecursoObterQtdProdutosItemCarrinho {
    
    @Autowired
    private ObterQtdProdutosItemCarrinho qtdProdutos;

    @GetMapping("{id}/carrinho/quantidade")
    public ResponseEntity<Integer> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(qtdProdutos.executar(id));
    }
}