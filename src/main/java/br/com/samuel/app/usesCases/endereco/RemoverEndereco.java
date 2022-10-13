package br.com.samuel.app.usesCases.endereco;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.repository.RepositorioEndereco;
import br.com.samuel.app.usesCases.models.Remover;

@Service
public class RemoverEndereco extends Remover<Endereco, RepositorioEndereco> {

    public Endereco executar(Integer id) {
        return getRepositorio()
                .findById(id)
                .map(enderecoRemovido -> {
                    getRepositorio().deleteById(id);
                    return enderecoRemovido;
                }).orElse(null);
    }
}