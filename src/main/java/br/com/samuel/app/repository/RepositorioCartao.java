package br.com.samuel.app.repository;

import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.CartaoCredito;

@Repository
public interface RepositorioCartao extends JpaRepository<CartaoCredito, Integer> {

    @Query("SELECT c FROM CartaoCredito c WHERE c.cliente.id = :clienteId")
    public Set<CartaoCredito> buscarCartoesPorIdCliente(@Param("clienteId") Integer clienteId);
}