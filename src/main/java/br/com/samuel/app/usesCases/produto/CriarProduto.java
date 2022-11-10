package br.com.samuel.app.usesCases.produto;

import java.net.URI;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.app.models.Especificacao;
import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Criar;

@Service
public class CriarProduto extends Criar<Produto, RepositorioProduto> {
    public URI executar(Produto novoProduto) {
        Set<ImagemProduto> imagens = novoProduto.getImagens();
        for(ImagemProduto imagemAdicionada: imagens)
            imagemAdicionada.setProduto(novoProduto);
            
        Set<Especificacao> especificacoes = novoProduto.getEspecificacoes();
        for(Especificacao especificacao: especificacoes)
            especificacao.setProduto(novoProduto);
        
        Produto produtoCriado = getRepositorio().save(novoProduto);
        URI localizacao = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(produtoCriado.getId()).toUri();
        return localizacao;
    }
}