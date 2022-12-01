package br.com.samuel.app.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.Carrinho;

@Repository
public interface RepositorioCarrinho extends JpaRepository<Carrinho, Integer> {

    @Query("SELECT c FROM Carrinho c WHERE c.cliente.id = :clienteId")
    public Optional<Carrinho> buscarCarrinhoPorIdCliente(@Param("clienteId") Integer clienteId);

    @Query
    (
        "SELECT SUM(i.quantidade) FROM ItemCarrinho i " +
        "WHERE i.carrinho.cliente.id = :clienteId AND i.selecionado = true"
    )
    public Optional<Integer> obterQuantidadeProdutos(@Param("clienteId") Integer clienteId);

    @Query
    (
        "SELECT DISTINCT SUM(i.quantidade) FROM Carrinho c JOIN ItemCarrinho i ON i.carrinho.id = c.id " +
        "WHERE i.selecionado = true AND c.cliente.id = :clienteId GROUP BY i.quantidade"
    )
    public Object obterQuantidadeProdutos2(@Param("clienteId") Integer clienteId);
}