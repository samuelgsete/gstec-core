package br.com.samuel.gstec.resource.models;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public abstract class RecursoListar<T, R> {
    
    @Autowired
    private R listar;

    public R getListar() { return listar; }

    public abstract ResponseEntity<List<T>> executar();

    public abstract ResponseEntity<Set<T>> executar(Integer idPai);
}