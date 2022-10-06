package br.com.samuel.gstec.resource.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Carrinho;
import br.com.samuel.gstec.usesCases.carrinho.LimparCarrinho;

@RestController
@RequestMapping("/carrinho")
public class RecursoLimparCarrinho {
    
    @Autowired
    private LimparCarrinho limparCarrinho;

    @DeleteMapping("/{carrinhoId}/limpar")
    private ResponseEntity<Carrinho> executar(@PathVariable Integer carrinhoId) {
        return limparCarrinho.executar(carrinhoId);
    }
}