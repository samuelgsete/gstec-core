package br.com.samuel.app.usesCases.endereco;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.repository.RepositorioEndereco;

@Service
public class TornarEnderecoPadrao {
    
    @Autowired
    private RepositorioEndereco repositorio;

    public List<Endereco> executar(Integer clienteId, Integer enderecoId, Boolean enderecoPadrao) {
        Set<Endereco> enderecos = repositorio.buscarEnderecosPorIdCliente(clienteId);
        List<Endereco> enderecosAtualizados = enderecos.stream()
            .map(endereco -> {
                if(endereco.getEnderecoPadrao()) {
                    endereco.setEnderecoPadrao(!enderecoPadrao);
                }
                if(endereco.getId().equals(enderecoId)) {
                    endereco.setEnderecoPadrao(enderecoPadrao);
                }
                return endereco;
            }).collect(Collectors.toList());
        return repositorio.saveAll(enderecosAtualizados);
    }
}