package br.com.samuel.app.resource.cartao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.BandeiraCartaoCredito;
import br.com.samuel.app.usesCases.cartao.ValidadorLuhn;

@RestController
@RequestMapping("cartao-credito")
public class RecursoValidarNumero {

    @Autowired
    private ValidadorLuhn validador;

    @GetMapping("{numeroCartao}/validar")
    public ResponseEntity<BandeiraCartaoCredito> executar(@PathVariable Long numeroCartao) {
        return ResponseEntity.ok(validador.validar(numeroCartao));
    }
}