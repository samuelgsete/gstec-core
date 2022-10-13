package br.com.samuel.app.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EnderecoEnvio extends EntidadeBase {

    private String rua;
    private Integer numero;
    private String cep;
    private String bairro;
    private String municipio;
    private String uf;
}