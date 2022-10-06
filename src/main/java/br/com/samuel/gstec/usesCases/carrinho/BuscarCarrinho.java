package br.com.samuel.gstec.usesCases.carrinho;

import java.util.Optional;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Carrinho;
import br.com.samuel.gstec.repository.RepositorioCarrinho;
import br.com.samuel.gstec.usesCases.models.Buscar;

@Service
public class BuscarCarrinho extends Buscar<Carrinho, RepositorioCarrinho> {
    public Optional<Carrinho> executar(Integer clienteId) {
        return getRepositorio().findById(clienteId);
    }
}