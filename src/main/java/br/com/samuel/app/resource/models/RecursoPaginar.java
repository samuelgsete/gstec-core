package br.com.samuel.app.resource.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public abstract class RecursoPaginar<T, R> {

    @Autowired
    private R listarPaginado;

    public R getListarPaginado() {
        return listarPaginado;
    }

    public abstract ResponseEntity<Page<T>> executar(String palavraChave, String ordenacao, Pageable pageable);
}