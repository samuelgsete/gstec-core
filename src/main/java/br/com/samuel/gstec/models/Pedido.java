package br.com.samuel.gstec.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.samuel.gstec.models.enuns.SituacaoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pedido extends EntidadeBase {

    private Double subtotal;
    private Double frete;
    private Double desconto;

    @Column(name = "feito_em", columnDefinition = "TIMESTAMP")
    private LocalDateTime feitoEm = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private SituacaoPedido situacao;

    /*
     *  private Endereco enderecoEnvio;
        private Comprador comprador;
     */
}