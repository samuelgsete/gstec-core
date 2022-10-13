package br.com.samuel.app.repository;

import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.ImagemProduto;

@Repository
public interface RepositorioImagemProduto extends JpaRepository<ImagemProduto, Integer> {

    @Query("SELECT i FROM ImagemProduto i WHERE i.nomeRandomico = :nomeArquivo")
    Optional<ImagemProduto> buscarImagemPeloNome(@Param("nomeArquivo") String nomeArquivo);

    @Query("SELECT i FROM ImagemProduto i WHERE i.produto.id = :produtoId")
    public Set<ImagemProduto> buscarImagensPorIdProduto(@Param("produtoId") Integer produtoId);
}