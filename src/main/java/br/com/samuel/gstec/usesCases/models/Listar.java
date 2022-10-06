package br.com.samuel.gstec.usesCases.models;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Listar<T, R> {
    
    @Autowired
    private R repositorio;

    public R getRepositorio() { return repositorio; }

    public abstract List<T> executar();

    public abstract Set<T> executar(Integer idPai);
}