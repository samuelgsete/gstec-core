package br.com.samuel.app.usesCases.models;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class Criar<T, R> {

    @Autowired
    private R repositorio;

    public abstract URI executar(T novaInstancia);

    public R getRepositorio() {
        return repositorio;
    }
}