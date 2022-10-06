package br.com.samuel.gstec.usesCases.cliente;

import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.gstec.models.Cliente;
import br.com.samuel.gstec.repository.RepositorioCliente;
import br.com.samuel.gstec.usesCases.models.Criar;

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