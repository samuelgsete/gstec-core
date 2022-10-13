package br.com.samuel.app.resource.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public abstract class RecursoCriar<T, R> {

    @Autowired
    private R criar;

    public abstract ResponseEntity<Object> executar(T novoRecurso);

    public R getCriar() {
        return criar;
    }
}