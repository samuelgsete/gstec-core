package br.com.samuel.app.usesCases.cartao;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.CartaoCredito;
import br.com.samuel.app.repository.RepositorioCartao;
import br.com.samuel.app.usesCases.models.Remover;

@Service
public class RemoverCartao extends Remover<CartaoCredito, RepositorioCartao> {
    public CartaoCredito executar(Integer id) {
        return getRepositorio()
                .findById(id)
                .map(cartaoRemovido -> {
                    getRepositorio().deleteById(id);
                    return cartaoRemovido;
                }).orElse(null);
    }
}