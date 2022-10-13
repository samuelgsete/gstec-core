package br.com.samuel.app.usesCases.imagemProduto;

import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Adicionar;

@Service
public class AdicionarImagemProduto extends Adicionar<ImagemProduto, RepositorioProduto> {

    public Set<ImagemProduto> executar(Integer produtoId, ImagemProduto novaImagem) {
        Produto produto = getRepositorio().findById(produtoId).get();
        produto.getImagens().add(novaImagem);
        novaImagem.setProduto(produto);
        return getRepositorio()
                .save(produto)
                .getImagens();
    }
}