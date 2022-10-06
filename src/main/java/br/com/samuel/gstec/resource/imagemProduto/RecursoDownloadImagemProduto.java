package br.com.samuel.gstec.resource.imagemProduto;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.gstec.usesCases.imagemProduto.DownloadImagemProduto;

@RestController
@RequestMapping("produto")
public class RecursoDownloadImagemProduto {

    @Autowired
    private DownloadImagemProduto downloadImagemProduto;
    
    @GetMapping("/imagem/download/{nomeArquivo}")
    public ResponseEntity<Object> executar(@PathVariable String nomeArquivo) throws IOException {
        return downloadImagemProduto.executar(nomeArquivo);
    }
}