package br.com.samuel.app.usesCases.models;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class Buscar<T, R> {

    @Autowired
    private R repositorio;

    public R getRepositorio() {
        return repositorio;
    }

    public abstract Optional<T> executar(Integer id);
}