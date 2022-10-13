package br.com.samuel.app.resource.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.resource.models.RecursoFiltrar;
import br.com.samuel.app.usesCases.produto.ListarProdutosMaisBaratos;

@RestController
@RequestMapping("produto")
public class RecursoListarProdutosMaisBaratos extends RecursoFiltrar<Produto, ListarProdutosMaisBaratos> {

    @GetMapping("/maisbaratos")
    public ResponseEntity<Page<Produto>> executar(Pageable pageable) {
        return ResponseEntity.ok(getFiltar().executar(pageable));
    }
}