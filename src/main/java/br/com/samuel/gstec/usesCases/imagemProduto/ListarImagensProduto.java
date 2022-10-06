package br.com.samuel.gstec.usesCases.imagemProduto;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.repository.RepositorioImagemProduto;
import br.com.samuel.gstec.usesCases.models.Listar;

@Service
public class ListarImagensProduto extends Listar<ImagemProduto, RepositorioImagemProduto> {

    public List<ImagemProduto> executar() { return null; }

    public Set<ImagemProduto> executar(Integer produtoId) {
        return getRepositorio().buscarImagensPorIdProduto(produtoId);
    }
}