package br.com.samuel.gstec.usesCases.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioProduto;
import br.com.samuel.gstec.usesCases.models.Paginar;

@Service
public class ListarProdutosPaginado extends Paginar<Produto, RepositorioProduto> {
    public Page<Produto> executar(String palavraChave, Pageable pageable) {
        return getRepositorio().listarPaginado(palavraChave, pageable);
    }
}