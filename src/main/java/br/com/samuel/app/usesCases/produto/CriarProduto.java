package br.com.samuel.app.usesCases.produto;

import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Criar;

@Service
public class CriarProduto extends Criar<Produto, RepositorioProduto> {
    public URI executar(Produto novoProduto) {
        Produto produtoCriado = getRepositorio().save(novoProduto);
        URI localizacao = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(produtoCriado.getId()).toUri();
        return localizacao;
    }
}