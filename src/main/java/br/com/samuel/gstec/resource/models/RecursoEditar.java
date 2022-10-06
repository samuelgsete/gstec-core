package br.com.samuel.gstec.resource.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public abstract class RecursoEditar<T, R> {
    
    @Autowired
    private R editar;

    public R getEditar() { return editar; }

    public abstract ResponseEntity<T> executar(Integer id, T recurso);
}