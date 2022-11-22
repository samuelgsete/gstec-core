package br.com.samuel.app.usesCases.cliente;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Editar;

@Service
public class EditarCliente extends Editar<Cliente, RepositorioCliente> {

    public Cliente executar(Integer id, Cliente cliente) {
        return getRepositorio()
                .findById(id)
                .map(clienteDesatualizado -> {
                    clienteDesatualizado.setNome(cliente.getNome());
                    clienteDesatualizado.setSobrenome(cliente.getSobrenome());
                    clienteDesatualizado.setEmail(cliente.getEmail());
                    clienteDesatualizado.setTelefone(cliente.getTelefone());
                    clienteDesatualizado.setCpf(cliente.getCpf());
                    return getRepositorio().save(clienteDesatualizado);
                }).orElse(null);
    } 
}