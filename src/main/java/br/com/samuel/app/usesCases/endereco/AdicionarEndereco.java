package br.com.samuel.app.usesCases.endereco;

import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Adicionar;

@Service
public class AdicionarEndereco extends Adicionar<Endereco, RepositorioCliente> {

    public Set<Endereco> executar(Integer clienteId, Endereco novoEndereco) {
        Cliente cliente = getRepositorio().findById(clienteId).get();
        cliente.getEnderecos().add(novoEndereco);
        novoEndereco.setCliente(cliente);
        return getRepositorio()
                .save(cliente)
                .getEnderecos();
    }
}