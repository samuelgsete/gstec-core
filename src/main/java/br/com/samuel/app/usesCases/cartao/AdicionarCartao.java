package br.com.samuel.app.usesCases.cartao;

import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.CartaoCredito;
import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Adicionar;

@Service
public class AdicionarCartao extends Adicionar<CartaoCredito, RepositorioCliente> {
    public Set<CartaoCredito> executar(Integer clienteId, CartaoCredito novoCartao) {
        Cliente cliente = getRepositorio().findById(clienteId).get();
        cliente.getCartoes().add(novoCartao);
        novoCartao.setCliente(cliente);
        return getRepositorio().save(cliente).getCartoes();
    }
}