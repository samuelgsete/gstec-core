package br.com.samuel.app.resource.models;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import lombok.Getter;

@Getter
public abstract class RecursoUpload<T, R> {

    @Autowired
    private R upload;

    public abstract ResponseEntity<T> executar(MultipartFile arquivo) throws IOException;
}