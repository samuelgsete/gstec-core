package br.com.samuel.app.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResumoPedido extends EntidadeBase {

    private Double subtotalAvista;
    private Double subtotalParcelado;
    private Double descontoAvista;
    private Double descontoParcelado;
    private Integer parcelamento;

    @JsonIgnore
    @OneToOne
    private Carrinho carrinho;
}