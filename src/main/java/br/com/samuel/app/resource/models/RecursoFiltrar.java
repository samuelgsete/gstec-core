package br.com.samuel.app.resource.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import lombok.Getter;

@Getter
public abstract class RecursoFiltrar<T, R> {

    @Autowired
    private R filtar;

    public abstract ResponseEntity<Page<T>> executar(Pageable pageable);
}