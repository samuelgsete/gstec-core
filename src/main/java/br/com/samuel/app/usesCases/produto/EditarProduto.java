package br.com.samuel.app.usesCases.produto;

import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Especificacao;
import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Editar;

@Service
public class EditarProduto extends Editar<Produto, RepositorioProduto> {
    public Produto executar(Integer id, Produto produto) {
        Set<ImagemProduto> imagens = produto.getImagens();
        for(ImagemProduto imagemAdicionada: imagens)
            imagemAdicionada.setProduto(produto);
            
        Set<Especificacao> especificacoes = produto.getEspecificacoes();
        for(Especificacao especificacao: especificacoes)
            especificacao.setProduto(produto);

        return getRepositorio()
                .findById(id)
                .map(produtoDesatualizado -> {    
                    produtoDesatualizado.setNome(produto.getNome());
                    produtoDesatualizado.setPrecificacao(produto.getPrecificacao());
                    produtoDesatualizado.setFabricante(produto.getFabricante());
                    produtoDesatualizado.setMarca(produto.getMarca());
                    produtoDesatualizado.setModelo(produto.getModelo());
                    produtoDesatualizado.setLinha(produto.getLinha());
                    produtoDesatualizado.setPeso(produto.getPeso());
                    produtoDesatualizado.setDetalhes(produto.getDetalhes());
                    produtoDesatualizado.setUnidadesVendidas(produto.getUnidadesVendidas());
                    produtoDesatualizado.setEstoque(produto.getEstoque());
                    produtoDesatualizado.setAltura(produto.getAltura());
                    produtoDesatualizado.setLargura(produto.getLargura());
                    produtoDesatualizado.setProfundidade(produto.getProfundidade());
                    produtoDesatualizado.setConteudoEmbalagem(produto.getConteudoEmbalagem());
                    produtoDesatualizado.setCor(produto.getCor());
                    produtoDesatualizado.setCondicao(produto.getCondicao());
                    produtoDesatualizado.setGarantia(produto.getGarantia());
                    produtoDesatualizado.setFreteGratis(produto.getFreteGratis());
                    produtoDesatualizado.setRecemLancado(produto.getRecemLancado());
                    produtoDesatualizado.setImagens(produto.getImagens());
                    produtoDesatualizado.setEspecificacoes(produto.getEspecificacoes());

                    return getRepositorio().save(produtoDesatualizado);
                }).orElse(null);
    }
}