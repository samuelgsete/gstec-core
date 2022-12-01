package br.com.samuel.app.usesCases.carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.app.repository.RepositorioCarrinho;

@Service
public class ObterQtdProdutosItemCarrinho {
    
    @Autowired
    private RepositorioCarrinho repositorio;

    public Integer executar(Integer clienteId) {
        return repositorio.obterQuantidadeProdutos(clienteId).map(quantidade -> {
            return quantidade;
        }).orElse(0);
    }
}