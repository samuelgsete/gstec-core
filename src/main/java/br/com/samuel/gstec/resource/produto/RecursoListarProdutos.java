package br.com.samuel.gstec.resource.produto;

import java.util.List;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.resource.models.RecursoListar;
import br.com.samuel.gstec.usesCases.produto.ListarProdutos;

@RestController
@RequestMapping("produto")
public class RecursoListarProdutos extends RecursoListar<Produto, ListarProdutos> {

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> executar() {
        return ResponseEntity.ok(getListar().executar());
    }

    public ResponseEntity<Set<Produto>> executar(Integer idPai) { return null; }
}