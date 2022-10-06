package br.com.samuel.gstec.usesCases.cliente;

import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Cliente;
import br.com.samuel.gstec.repository.RepositorioCliente;
import br.com.samuel.gstec.usesCases.models.Remover;

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