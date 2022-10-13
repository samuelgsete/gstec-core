package br.com.samuel.app.usesCases.endereco;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.repository.RepositorioEndereco;
import br.com.samuel.app.usesCases.models.Editar;

@Service
public class EditarEndereco extends Editar<Endereco, RepositorioEndereco> {

    public Endereco executar(Integer id, Endereco endereco) {
        Endereco enderecoAtual = getRepositorio().findById(id).get();
        enderecoAtual.setRua(endereco.getRua());
        enderecoAtual.setRua(endereco.getRua());
        enderecoAtual.setCep(endereco.getCep());
        enderecoAtual.setBairro(endereco.getBairro());
        enderecoAtual.setMunicipio(endereco.getMunicipio());
        enderecoAtual.setUf(endereco.getUf());
        return getRepositorio().save(enderecoAtual);
    }
}