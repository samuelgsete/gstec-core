package br.com.samuel.app.usesCases.produto;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Listar;

@Service
public class ListarProdutos extends Listar<Produto, RepositorioProduto> {

    public List<Produto> executar() {
        return getRepositorio().findAll();
    }

    public Set<Produto> executar(Integer id) {
        return null;
    }
}