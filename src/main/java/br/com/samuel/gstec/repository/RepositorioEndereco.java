package br.com.samuel.gstec.repository;

import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.gstec.models.Endereco;

@Repository
public interface RepositorioEndereco extends JpaRepository<Endereco, Integer> {

    @Query("SELECT e FROM Endereco e WHERE e.cliente.id = :clienteId")
    public Set<Endereco> buscarEnderecosPorIdCliente(@Param("clienteId") Integer clienteId);
}