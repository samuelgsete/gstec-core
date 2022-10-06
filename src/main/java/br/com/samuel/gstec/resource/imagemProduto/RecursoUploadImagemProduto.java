package br.com.samuel.gstec.resource.imagemProduto;

import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.resource.models.RecursoUpload;
import br.com.samuel.gstec.usesCases.imagemProduto.UploadImagemProduto;

@RestController
@RequestMapping("produto")
public class RecursoUploadImagemProduto extends RecursoUpload<ImagemProduto, UploadImagemProduto> {

    @PostMapping("/imagem/upload")
    public ResponseEntity<ImagemProduto> executar(@RequestParam MultipartFile arquivo) throws IOException {
        return ResponseEntity.ok(getUpload().executar(arquivo));
    }
}