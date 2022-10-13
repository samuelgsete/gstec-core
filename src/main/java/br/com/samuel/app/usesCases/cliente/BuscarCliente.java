package br.com.samuel.app.usesCases.cliente;

import java.util.Optional;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Buscar;

@Service
public class BuscarCliente extends Buscar<Cliente, RepositorioCliente> {
    public Optional<Cliente> executar(Integer id) {
        return getRepositorio().findById(id);
    }
}