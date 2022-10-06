package br.com.samuel.gstec.usesCases.models;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Editar<T, R> {
    
    @Autowired
    private R repositorio;

    public R getRepositorio() { return repositorio; }

    public abstract T executar(Integer id, T recurso);
}