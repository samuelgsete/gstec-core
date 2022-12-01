package br.com.samuel.app.repository;

import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.Endereco;

@Repository
public interface RepositorioEndereco extends JpaRepository<Endereco, Integer> {

    @Query("SELECT e FROM Endereco e WHERE e.cliente.id = :clienteId ORDER BY e.enderecoPadrao DESC")
    public Set<Endereco> buscarEnderecosPorIdCliente(@Param("clienteId") Integer clienteId);
}