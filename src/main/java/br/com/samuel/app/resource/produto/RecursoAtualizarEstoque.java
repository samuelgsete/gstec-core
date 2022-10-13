package br.com.samuel.app.resource.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.usesCases.produto.AtualizarEstoque;

@RestController
@RequestMapping("produto")
public class RecursoAtualizarEstoque {

    @Autowired
    private AtualizarEstoque atualizarEstoque;

    @PatchMapping("{id}/atualizarestoque")
    public ResponseEntity<Produto> exetuar(@PathVariable Integer id, @RequestParam() Integer estoqueAtualizado) {
        return atualizarEstoque.executar(id, estoqueAtualizado);
    }
}