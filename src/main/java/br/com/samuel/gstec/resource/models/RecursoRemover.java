package br.com.samuel.gstec.resource.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public abstract class RecursoRemover<T, R> {

    @Autowired
    private R remover;

    public R getRemover() { return remover; }

    public abstract ResponseEntity<T> executar(Integer id);
}