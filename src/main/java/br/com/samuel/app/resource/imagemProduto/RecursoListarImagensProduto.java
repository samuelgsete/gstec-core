package br.com.samuel.app.resource.imagemProduto;

import java.util.List;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.resource.models.RecursoListar;
import br.com.samuel.app.usesCases.imagemProduto.ListarImagensProduto;

@RestController
@RequestMapping("produto")
public class RecursoListarImagensProduto extends RecursoListar<ImagemProduto, ListarImagensProduto> {

    @GetMapping("/{id}/imagens")
    public ResponseEntity<Set<ImagemProduto>> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getListar().executar(id));
    }

    public ResponseEntity<List<ImagemProduto>> executar() {
        return null;
    }
}