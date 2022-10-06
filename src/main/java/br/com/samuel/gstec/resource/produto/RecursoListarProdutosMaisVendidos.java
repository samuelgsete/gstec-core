package br.com.samuel.gstec.resource.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.resource.models.RecursoFiltrar;
import br.com.samuel.gstec.usesCases.produto.ListarProdutosMaisVendidos;

@RestController
@RequestMapping("produto")
public class RecursoListarProdutosMaisVendidos extends RecursoFiltrar<Produto, ListarProdutosMaisVendidos> {

    @GetMapping("/maisvendidos")
    public ResponseEntity<Page<Produto>> executar(Pageable pageable) {
        return ResponseEntity.ok(getFiltar().executar(pageable));
    }   
}