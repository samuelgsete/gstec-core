package br.com.samuel.app.usesCases.especificacao;

import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Especificacao;
import br.com.samuel.app.repository.RepositorioEspecificacao;
import br.com.samuel.app.usesCases.models.Remover;

@Service
public class RemoverEspecificacao extends Remover<Especificacao, RepositorioEspecificacao> {

    @Override
    public Especificacao executar(Integer id) {
        return getRepositorio()
                .findById(id)
                .map(especRemovida -> {
                    getRepositorio().deleteById(id);
                    return especRemovida;
                }).orElse(null);
    } 
}