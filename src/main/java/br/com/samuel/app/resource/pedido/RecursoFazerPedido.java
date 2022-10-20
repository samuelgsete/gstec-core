package br.com.samuel.app.resource.pedido;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Pedido;
import br.com.samuel.app.resource.models.RecursoCriar;
import br.com.samuel.app.usesCases.Pedido.FazerPedido;

@RestController
@RequestMapping("pedido")
public class RecursoFazerPedido extends RecursoCriar<Pedido, FazerPedido> {
    @PostMapping
    public ResponseEntity<Object> executar(@RequestBody Pedido novoPedido) {
        return ResponseEntity.created(getCriar().executar(novoPedido)).build();
    }
}