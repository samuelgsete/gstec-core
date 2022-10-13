package br.com.samuel.app.usesCases.models;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Remover<T, R> {

    @Autowired
    private R repositorio;

    public R getRepositorio() {
        return repositorio;
    }

    public abstract T executar(Integer id);
}