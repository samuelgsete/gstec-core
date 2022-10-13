package br.com.samuel.app.usesCases.imagemProduto;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.repository.RepositorioImagemProduto;
import br.com.samuel.app.usesCases.models.Listar;

@Service
public class ListarImagensProduto extends Listar<ImagemProduto, RepositorioImagemProduto> {

    public List<ImagemProduto> executar() {
        return null;
    }

    public Set<ImagemProduto> executar(Integer produtoId) {
        return getRepositorio().buscarImagensPorIdProduto(produtoId);
    }
}