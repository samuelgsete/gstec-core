package br.com.samuel.gstec.usesCases.carrinho;

import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.samuel.gstec.models.Carrinho;
import br.com.samuel.gstec.repository.RepositorioCarrinho;
import br.com.samuel.gstec.usesCases.models.Criar;

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