package br.com.samuel.gstec.resource.models;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public abstract class RecursoAdicionar<T, R> {
    
    @Autowired
    private R adicionar;

    public R getAdicionar() { return adicionar; }

    public abstract ResponseEntity<Set<T>> executar(Integer idPai, T objetoFilho);
}