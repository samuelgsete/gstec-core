package br.com.samuel.gstec.usesCases.cliente;

import java.util.Optional;
import org.springframework.stereotype.Service;

import br.com.samuel.gstec.models.Cliente;
import br.com.samuel.gstec.repository.RepositorioCliente;
import br.com.samuel.gstec.usesCases.models.Buscar;

@Service
public class BuscarCliente extends Buscar<Cliente, RepositorioCliente> {
    public Optional<Cliente> executar(Integer id) {
        return getRepositorio().findById(id);
    }
}