package br.com.samuel.gstec.usesCases.models;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import lombok.Getter;

@Getter
public abstract class Upload<T, R> {
    
    @Autowired
    private R repositorio;

    public abstract T executar(MultipartFile arquivo) throws IOException;
}