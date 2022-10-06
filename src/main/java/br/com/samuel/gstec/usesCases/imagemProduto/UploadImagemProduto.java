package br.com.samuel.gstec.usesCases.imagemProduto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.repository.RepositorioImagemProduto;
import br.com.samuel.gstec.usesCases.models.Upload;

@Service
public class UploadImagemProduto extends Upload<ImagemProduto, RepositorioImagemProduto > {
    public ImagemProduto executar(MultipartFile arquivo) throws IOException {
        var nomeRandomico = UUID.randomUUID().toString().concat(".png");
        var nomeOriginal = arquivo.getOriginalFilename();
        var caminho = Paths.get("produto/uploads/".concat(nomeRandomico));
        Files.copy(arquivo.getInputStream(), caminho, StandardCopyOption.REPLACE_EXISTING);
        var urlFoto = ServletUriComponentsBuilder
                            .fromCurrentContextPath()
                            .path("produto/imagem/download/")
                            .path(nomeRandomico)
                            .toUriString();
        return getRepositorio()
                .save(new ImagemProduto(
                        nomeRandomico, 
                        nomeOriginal, 
                        urlFoto,
                        null
                    )
                );
    }
}