package br.com.samuel.app.usesCases.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Paginar;

@Service
public class ListarProdutosPaginado extends Paginar<Produto, RepositorioProduto> {
    public Page<Produto> executar(String palavraChave, String ordenacao, Pageable pageable) {
        switch(ordenacao) {
            case "maisvendidos":
            return getRepositorio().listarProdutosMaisVendidos(pageable);

            case "maisbaratos":
            return getRepositorio().listarProdutosMaisBaratos(pageable);

            case "maiscaros":
            return getRepositorio().listarProdutosMaisCaros(pageable);

            case "maiordesconto":
            return getRepositorio().listarProdutosMaiorDesconto(pageable);

            case "maisrecentes":
            return getRepositorio().listarProdutosMaisRecentes(pageable);
        }
        return getRepositorio().listarPaginado(palavraChave, pageable);
    }
}