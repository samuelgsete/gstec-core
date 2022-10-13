package br.com.samuel.app.usesCases.imagemProduto;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.ImagemProduto;
import br.com.samuel.app.repository.RepositorioImagemProduto;
import br.com.samuel.app.usesCases.models.Remover;

@Service
public class RemoverImagemProduto extends Remover<ImagemProduto, RepositorioImagemProduto> {
    public ImagemProduto executar(Integer id) {
        return getRepositorio()
                .findById(id)
                .map(imgRemovida -> {
                    getRepositorio().deleteById(id);
                    return imgRemovida;
                }).orElse(null);
    }
}