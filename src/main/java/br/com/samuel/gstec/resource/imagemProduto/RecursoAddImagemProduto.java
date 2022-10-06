package br.com.samuel.gstec.resource.imagemProduto;

import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.resource.models.RecursoAdicionar;
import br.com.samuel.gstec.usesCases.imagemProduto.AdicionarImagemProduto;

@RestController
@RequestMapping("/produto")
public class RecursoAddImagemProduto extends RecursoAdicionar<ImagemProduto, AdicionarImagemProduto> {

    @PutMapping("/{produtoId}/adicionarimagem")
    public ResponseEntity<Set<ImagemProduto>> executar(@PathVariable Integer produtoId, @RequestBody ImagemProduto imagemProduto) {
        return ResponseEntity
                .ok(getAdicionar()
                .executar(produtoId, imagemProduto));
    }
}