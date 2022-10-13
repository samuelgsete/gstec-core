package br.com.samuel.app.resource.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.resource.models.RecursoPaginar;
import br.com.samuel.app.usesCases.produto.ListarProdutosPaginado;

@RestController
@RequestMapping("produto")
public class RecursoListarProdutosPaginado extends RecursoPaginar<Produto, ListarProdutosPaginado> {

    @GetMapping("/listarpaginado")
    public ResponseEntity<Page<Produto>> executar(@RequestParam String palavraChave, Pageable pageable) {
        return ResponseEntity.ok(getListarPaginado().executar(palavraChave, pageable));
    }
}