package br.com.samuel.app.usesCases.endereco;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.repository.RepositorioEndereco;
import br.com.samuel.app.usesCases.models.Listar;

@Service
public class ListarEnderecos extends Listar<Endereco, RepositorioEndereco> {

    public Set<Endereco> executar(Integer clienteId) {
        return getRepositorio().buscarEnderecosPorIdCliente(clienteId);
    }

    public List<Endereco> executar() {
        return null;
    }
}