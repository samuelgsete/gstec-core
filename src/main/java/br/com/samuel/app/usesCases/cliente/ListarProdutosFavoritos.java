package br.com.samuel.app.usesCases.cliente;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.interfaces.IProduto;
import br.com.samuel.app.repository.RepositorioProdutosFavoritos;

@Service
public class ListarProdutosFavoritos {

    @Autowired
    private RepositorioProdutosFavoritos repositorio;

    public Set<IProduto> executar(Integer clienteId) {
        return repositorio.ListarProdutosFavoritos(clienteId);
    }
}