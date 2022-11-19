package br.com.samuel.app.resource.endereco;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuel.app.models.Endereco;
import br.com.samuel.app.usesCases.endereco.TornarEnderecoPadrao;

@RestController
@RequestMapping("endereco")
public class RecursoTornarEnderecoPadrao {
    
    @Autowired
    private TornarEnderecoPadrao tornarEnderecoPadrao;

    @PatchMapping("{enderecoId}")
    public ResponseEntity<List<Endereco>> executar(@PathVariable Integer enderecoId,  @RequestParam Integer clienteId, @RequestParam Boolean enderecoPadrao) {
        return ResponseEntity.ok(tornarEnderecoPadrao.executar(clienteId, enderecoId, enderecoPadrao));
    }
}