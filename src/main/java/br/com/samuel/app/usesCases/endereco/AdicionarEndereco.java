package br.com.samuel.app.usesCases.endereco;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Adicionar;

@Service
public class AdicionarEndereco extends Adicionar<Endereco, RepositorioCliente> {

    public Set<Endereco> executar(Integer clienteId, Endereco novoEndereco) {
        Cliente cliente = getRepositorio().findById(clienteId).get();
        Set<Endereco> enderecos = cliente.getEnderecos();
        if(novoEndereco.getEnderecoPadrao()) {
            enderecos = enderecos
                .stream()
                .map(endereco -> {
                    if(endereco.getEnderecoPadrao())
                        endereco.setEnderecoPadrao(false);
                    return endereco;
                }).collect(Collectors.toSet());
        }
        novoEndereco.setCliente(cliente);
        enderecos.add(novoEndereco);
        cliente.setEnderecos(enderecos);
        return getRepositorio()
                .save(cliente)
                .getEnderecos();
    }
}