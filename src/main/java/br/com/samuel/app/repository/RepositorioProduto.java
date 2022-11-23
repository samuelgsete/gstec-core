package br.com.samuel.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.Produto;

@Repository
public interface RepositorioProduto extends JpaRepository<Produto, Integer> {

    @Query("SELECT p FROM Produto p WHERE LOWER(p.nome) LIKE %:palavraChave% ORDER BY p.nome ASC")
    Page<Produto> listarPaginado(@Param("palavraChave") String palavraChave, Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.unidadesVendidas DESC")
    Page<Produto> listarProdutosMaisVendidos(Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.precificacao.precoAvista DESC")
    Page<Produto> listarProdutosMaisCaros(Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.precificacao.precoAvista ASC")
    Page<Produto> listarProdutosMaisBaratos(Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.precificacao.descontoAvista DESC")
    Page<Produto> listarProdutosMaiorDesconto(Pageable pageable);

    @Query("SELECT p FROM Produto p ORDER BY p.ofertadoDesde DESC")
    Page<Produto> listarProdutosMaisRecentes(Pageable pageable);
}