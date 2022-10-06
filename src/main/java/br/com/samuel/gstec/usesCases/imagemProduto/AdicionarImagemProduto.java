package br.com.samuel.gstec.usesCases.imagemProduto;

import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioProduto;
import br.com.samuel.gstec.usesCases.models.Adicionar;

@Service
public class AdicionarImagemProduto extends Adicionar<ImagemProduto, RepositorioProduto> {

    public Set<ImagemProduto> executar(Integer produtoId, ImagemProduto novaImagem) {
        Produto produto = getRepositorio().findById(produtoId).get();
        produto.getImagens().add(novaImagem);
        novaImagem.setProduto(produto );
        return getRepositorio()
                .save(produto)
                .getImagens();
    }
}