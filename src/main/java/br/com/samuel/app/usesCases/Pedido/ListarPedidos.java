package br.com.samuel.app.usesCases.Pedido;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Pedido;
import br.com.samuel.app.repository.RepositorioPedido;
import br.com.samuel.app.usesCases.models.Listar;

@Service
public class ListarPedidos extends Listar<Pedido, RepositorioPedido> {

    public List<Pedido> executar() {
        return getRepositorio().listarPedidosMaisRecentes();
    }

    public Set<Pedido> executar(Integer id) {
        return null;
    }
}