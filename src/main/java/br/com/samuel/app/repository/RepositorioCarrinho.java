package br.com.samuel.app.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.Carrinho;

@Repository
public interface RepositorioCarrinho extends JpaRepository<Carrinho, Integer> {

    @Query("SELECT c FROM Carrinho c WHERE c.cliente.id = clienteId")
    public Optional<Carrinho> buscarCarrinhoPorIdCliente(@Param("clienteId") Integer clienteId);
}