package br.com.samuel.app.usesCases.cliente;

import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.app.models.Cliente;
import br.com.samuel.app.repository.RepositorioCliente;
import br.com.samuel.app.usesCases.models.Criar;

@Service
public class CriarCliente extends Criar<Cliente, RepositorioCliente> {
    public URI executar(Cliente novoCliente) {
        Cliente clienteCriado = getRepositorio().save(novoCliente);
        URI localizacao = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(clienteCriado.getId()).toUri();
        return localizacao;
    }
}