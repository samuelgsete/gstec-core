package br.com.samuel.gstec.usesCases.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioProduto;
import br.com.samuel.gstec.usesCases.models.Filtrar;

@Service
public class ListarProdutosMaisCaros extends Filtrar<Produto, RepositorioProduto> {

    public Page<Produto> executar(Pageable pageable) {
        return getRepositorio().listarProdutosMaisCaros(pageable);
    }
}