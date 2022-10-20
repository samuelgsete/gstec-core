package br.com.samuel.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.samuel.app.models.Pedido;

@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, Integer> {

    @Query("SELECT p FROM Pedido p ORDER BY p.feitoEm ASC")
    public List<Pedido> listarPedidosMaisRecentes();
}