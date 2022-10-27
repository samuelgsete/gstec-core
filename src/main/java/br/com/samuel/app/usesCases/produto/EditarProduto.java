package br.com.samuel.app.usesCases.produto;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;
import br.com.samuel.app.usesCases.models.Editar;

@Service
public class EditarProduto extends Editar<Produto, RepositorioProduto> {
    public Produto executar(Integer id, Produto produto) {
        return getRepositorio()
                .findById(id)
                .map(produtoDesatualizado -> {
                    produtoDesatualizado.setNome(produto.getNome());
                    produtoDesatualizado.setPreco(produto.getPreco());
                    produtoDesatualizado.setMarca(produto.getMarca());
                    produtoDesatualizado.setModelo(produto.getModelo());
                    produtoDesatualizado.setLinha(produto.getLinha());
                    produtoDesatualizado.setPeso(produto.getPeso());
                    produtoDesatualizado.setTaxaDesconto(produto.getTaxaDesconto());
                    produtoDesatualizado.setDetalhes(produto.getDetalhes());
                    produtoDesatualizado.setUnidadesVendidas(produto.getUnidadesVendidas());
                    produtoDesatualizado.setEstoque(produto.getEstoque());
                    produtoDesatualizado.setAltura(produto.getAltura());
                    produtoDesatualizado.setLargura(produto.getLargura());
                    produtoDesatualizado.setProfundidade(produto.getProfundidade());
                    produtoDesatualizado.setConteudoEmbalagem(produto.getConteudoEmbalagem());
                    return getRepositorio().save(produtoDesatualizado);
                }).orElse(null);
    }
}