package br.com.samuel.app.models;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Precificacao extends EntidadeBase {

    private Double precoBase;
    private Double precoAvista;
    private Double precoParcelamento;
    private Double taxaDescontoParcelamento;
    private Double taxaDescontoAvista;
    private Double descontoAvista;
    private Double descontoParcelamento;
    private Integer parcelamento;
}