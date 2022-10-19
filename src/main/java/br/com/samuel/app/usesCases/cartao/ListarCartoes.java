package br.com.samuel.app.usesCases.cartao;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.CartaoCredito;
import br.com.samuel.app.repository.RepositorioCartao;
import br.com.samuel.app.usesCases.models.Listar;

@Service
public class ListarCartoes extends Listar<CartaoCredito, RepositorioCartao> {

    public List<CartaoCredito> executar() {
        return null;
    }

    public Set<CartaoCredito> executar(Integer clienteId) {
        return getRepositorio().buscarCartoesPorIdCliente(clienteId);
    }
}