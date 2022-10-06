package br.com.samuel.gstec.usesCases.endereco;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Endereco;
import br.com.samuel.gstec.repository.RepositorioEndereco;
import br.com.samuel.gstec.usesCases.models.Listar;

@Service
public class ListarEnderecos extends Listar<Endereco, RepositorioEndereco> {

    public Set<Endereco> executar(Integer clienteId) {
        return getRepositorio().buscarEnderecosPorIdCliente(clienteId);
    }

    public List<Endereco> executar() { return null; }
}