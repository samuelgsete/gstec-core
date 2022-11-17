package br.com.samuel.app.resource.carrinho;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.resource.models.RecursoBuscar;
import br.com.samuel.app.usesCases.carrinho.BuscarCarrinho;

@RestController
@RequestMapping("cliente")
public class RecursoBuscarCarrinho extends RecursoBuscar<Carrinho, BuscarCarrinho> {

    @GetMapping("/{id}/carrinho")
    public ResponseEntity<Carrinho> executar(@PathVariable Integer id) {
        return getBuscar()
                .executar(id)
                .map(carrinhoEncontrado -> ResponseEntity.ok().body(carrinhoEncontrado))
                .orElse(ResponseEntity.notFound().build());
    }
}