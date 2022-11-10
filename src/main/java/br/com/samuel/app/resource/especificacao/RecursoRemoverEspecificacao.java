package br.com.samuel.app.resource.especificacao;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Especificacao;
import br.com.samuel.app.resource.models.RecursoRemover;
import br.com.samuel.app.usesCases.especificacao.RemoverEspecificacao;

@RestController
@RequestMapping("especificacao")
public class RecursoRemoverEspecificacao extends RecursoRemover<Especificacao, RemoverEspecificacao> {

    @DeleteMapping("/{id}")
    public ResponseEntity<Especificacao> executar(@PathVariable Integer id) {
        return ResponseEntity.ok(getRemover().executar(id));
    }    
}