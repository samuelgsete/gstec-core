package br.com.samuel.app.usesCases.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import lombok.Getter;

@Getter
public abstract class Filtrar<T, R> {

    @Autowired
    private R repositorio;

    public abstract Page<T> executar(Pageable pageable);
}