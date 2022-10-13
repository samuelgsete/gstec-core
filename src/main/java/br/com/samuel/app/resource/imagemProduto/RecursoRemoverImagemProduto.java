package br.com.samuel.app.resource.imagemProduto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.resource.models.RecursoRemover;
import br.com.samuel.app.usesCases.imagemProduto.RemoverImagemProduto;

@RestController
@RequestMapping("produto/imagem")
public class RecursoRemoverImagemProduto extends RecursoRemover<ImagemProduto, RemoverImagemProduto> {

    @DeleteMapping("/{id}")
    public ResponseEntity<ImagemProduto> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getRemover().executar(id));
    }
}