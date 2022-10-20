package br.com.samuel.app.resource.pedido;

import java.util.List;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Pedido;
import br.com.samuel.app.resource.models.RecursoListar;
import br.com.samuel.app.usesCases.Pedido.ListarPedidos;

@RestController
@RequestMapping("pedidos")
public class RecursoListarPedidosRecentes extends RecursoListar<Pedido, ListarPedidos> {

    @GetMapping("recentes")
    public ResponseEntity<List<Pedido>> executar() {
        return ResponseEntity.ok(getListar().executar());
    }

    public ResponseEntity<Set<Pedido>> executar(Integer idPai) {
        return null;
    }
}