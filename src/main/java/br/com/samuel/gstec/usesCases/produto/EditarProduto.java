package br.com.samuel.gstec.usesCases.produto;

import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioProduto;
import br.com.samuel.gstec.usesCases.models.Editar;

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
                    return getRepositorio().save(produtoDesatualizado);
                }).orElse(null);
    }
}