package br.com.samuel.app.usesCases.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class Paginar<T, R> {

    @Autowired
    private R repositorio;

    public R getRepositorio() {
        return repositorio;
    }

    public abstract Page<T> executar(String palavraChave, Pageable pageable);
}