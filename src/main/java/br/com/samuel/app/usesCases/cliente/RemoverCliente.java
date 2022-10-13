package br.com.samuel.app.usesCases.cliente;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Remover;

@Service
public class RemoverCliente extends Remover<Cliente, RepositorioCliente> {

    public Cliente executar(Integer id) {
        return getRepositorio()
                .findById(id)
                .map(clienteRemovido -> {
                    getRepositorio().deleteById(id);
                    return clienteRemovido;
                }).orElse(null);
    }
}