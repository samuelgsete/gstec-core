package br.com.samuel.gstec.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.gstec.models.Produto;

@Repository
public interface RepositorioProduto extends JpaRepository<Produto, Integer> { 
   
    @Query("SELECT p FROM Produto p WHERE LOWER(p.nome) LIKE %:palavraChave% ORDER BY p.nome ASC")
	Page<Produto> listarPaginado(@Param("palavraChave") String palavraChave, Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.unidadesVendidas DESC")
    Page<Produto> listarProdutosMaisVendidos(Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.preco DESC")
    Page<Produto> listarProdutosMaisCaros(Pageable pageable);
    
    @Query("SELECT p FROM Produto p ORDER BY p.preco ASC")
    Page<Produto> listarProdutosMaisBaratos(Pageable pageable);
}