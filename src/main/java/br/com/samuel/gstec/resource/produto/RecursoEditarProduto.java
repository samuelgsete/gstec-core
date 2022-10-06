package br.com.samuel.gstec.resource.produto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.resource.models.RecursoEditar;
import br.com.samuel.gstec.usesCases.produto.EditarProduto;

@RestController
@RequestMapping("/produto")
public class RecursoEditarProduto extends RecursoEditar<Produto, EditarProduto> {

    @PutMapping("/{id}")
    public ResponseEntity<Produto> executar(@PathVariable Integer id, @RequestBody Produto produto) {
        return ResponseEntity.ok(getEditar().executar(id, produto));
    }
}