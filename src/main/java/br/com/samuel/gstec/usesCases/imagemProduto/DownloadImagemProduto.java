package br.com.samuel.gstec.usesCases.imagemProduto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.usesCases.models.Download;

@Service
public class DownloadImagemProduto extends Download {
    
    public ResponseEntity<Object> executar(String nomeArquivo) throws IOException {
        var caminho = Paths.get("produto/uploads/".concat(nomeArquivo));
		var arquivo = new File(caminho.toString());
        var conexaoArquivo = new FileInputStream(arquivo);
        var img = new  ByteArrayResource(conexaoArquivo.readAllBytes());
        conexaoArquivo.close();
		return ResponseEntity
                .ok()
				.contentLength(arquivo.length())
				.contentType(MediaType.IMAGE_JPEG)
                .body(img);
	}
}