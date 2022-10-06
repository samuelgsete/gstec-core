package br.com.samuel.gstec.usesCases.imagemProduto;

import java.io.File;
import java.nio.file.Paths;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.repository.RepositorioImagemProduto;
import br.com.samuel.gstec.usesCases.models.Remover;

@Service
public class RemoverImagemProduto extends Remover<ImagemProduto, RepositorioImagemProduto> {
    public ImagemProduto executar(Integer id) {
        return getRepositorio()
                .findById(id)
                .map(imgRemovido -> {
                    String nomeArquivo = imgRemovido.getNomeRandomico();
                    var caminho = Paths.get("produto/uploads/".concat(nomeArquivo));
		            new File(caminho.toString()).deleteOnExit();
                    getRepositorio().deleteById(id);
                    return imgRemovido;
                }).orElse(null);
    }
}