package br.com.samuel.gstec.resource.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public abstract class RecursoBuscar<T, R> {

    @Autowired
    private R buscar;
    
    public abstract ResponseEntity<T> executar(Integer id);

    public R getBuscar() { return buscar; }
}