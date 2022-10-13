package br.com.samuel.app.usesCases.carrinho;

import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.repository.RepositorioCarrinho;
import br.com.samuel.app.usesCases.models.Criar;

@Service
public class CriarCarrinho extends Criar<Carrinho, RepositorioCarrinho> {
    public URI executar(Carrinho novoCarrinho) {
        Carrinho carrinhoCriado = getRepositorio().save(novoCarrinho);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(carrinhoCriado.getId()).toUri();
        return location;
    }
}