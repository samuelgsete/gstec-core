package br.com.samuel.app.usesCases.models;

import java.io.IOException;
import org.springframework.http.ResponseEntity;

public abstract class Download {
    public abstract ResponseEntity<Object> executar(String nomeArquivo) throws IOException;
}