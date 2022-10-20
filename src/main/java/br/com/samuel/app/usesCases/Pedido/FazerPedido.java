package br.com.samuel.app.usesCases.Pedido;

import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.app.models.Pedido;
import br.com.samuel.app.repository.RepositorioPedido;
import br.com.samuel.app.usesCases.models.Criar;

@Service
public class FazerPedido extends Criar<Pedido, RepositorioPedido> {
    public URI executar(Pedido novoPedido) {
        novoPedido.getEnderecoEnvio().setPedido(novoPedido);
        novoPedido.getPagamento().setPedido(novoPedido);
        novoPedido.getPagamento().getPagador().setPagamento(novoPedido.getPagamento());
        for (var itemPedido : novoPedido.getItens()) {
            itemPedido.setPedido(novoPedido);
        }
        Pedido pedidoCriado = getRepositorio().save(novoPedido);
        URI localizacao = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pedidoCriado.getId()).toUri();
        return localizacao;
    }
}