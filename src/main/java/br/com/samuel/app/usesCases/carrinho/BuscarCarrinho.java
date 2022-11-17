package br.com.samuel.app.usesCases.carrinho;

import java.util.Optional;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.repository.RepositorioCarrinho;
import br.com.samuel.app.usesCases.models.Buscar;

@Service
public class BuscarCarrinho extends Buscar<Carrinho, RepositorioCarrinho> {
    public Optional<Carrinho> executar(Integer clienteId) {
        return getRepositorio().buscarCarrinhoPorIdCliente(clienteId);
    }
}