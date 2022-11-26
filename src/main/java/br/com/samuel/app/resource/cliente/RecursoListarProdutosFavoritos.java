package br.com.samuel.app.resource.cliente;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.interfaces.IProduto;
import br.com.samuel.app.usesCases.cliente.ListarProdutosFavoritos;

@RestController
@RequestMapping("cliente")
public class RecursoListarProdutosFavoritos {
    
    @Autowired
    private ListarProdutosFavoritos listarFavoritos;

    @GetMapping("/{clienteId}/produtos/favoritos")
    public ResponseEntity<Set<IProduto>> executar(@PathVariable Integer clienteId) {
        return ResponseEntity.ok(listarFavoritos.executar(clienteId));
    }
}