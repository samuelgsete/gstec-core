package br.com.samuel.app.repository;

import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.ProdutosFavoritos;
import br.com.samuel.app.models.interfaces.IProduto;

@Repository
public interface RepositorioProdutosFavoritos extends JpaRepository<ProdutosFavoritos, Integer> {
    
    @Query("SELECT pf FROM ProdutosFavoritos pf WHERE pf.cliente.id = :clienteId")
    Optional<ProdutosFavoritos> buscarProdutosFavoritos(@Param("clienteId") Integer clienteId);

    @Query("SELECT DISTINCT p.id AS id, p.nome AS nome, p.estoque AS estoque, i.url AS urlImagem FROM ProdutosFavoritos pf JOIN Produto p ON pf.id = p.produtosFavoritos.id JOIN ImagemProduto i ON p.id = i.produto.id WHERE pf.cliente.id = :clienteId AND i.imagemPrincipal = TRUE GROUP BY p.id, i.url")
    Set<IProduto> ListarProdutosFavoritos(@Param("clienteId") Integer clienteId);
}