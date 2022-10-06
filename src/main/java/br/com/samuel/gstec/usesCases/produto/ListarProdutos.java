package br.com.samuel.gstec.usesCases.produto;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioProduto;
import br.com.samuel.gstec.usesCases.models.Listar;

@Service
public class ListarProdutos extends Listar<Produto, RepositorioProduto> {

    public List<Produto> executar() {
        return getRepositorio().findAll();
    }

    public Set<Produto> executar(Integer id) { return null; }
}