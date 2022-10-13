package br.com.samuel.app.models;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import br.com.samuel.app.models.enuns.SituacaoPedido;

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

   @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
   @JoinColumn(name = "pedido_id", referencedColumnName = "id")
   private EnderecoEnvio enderecoEnvio;

   @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
   @JoinColumn(name = "pedido_id", referencedColumnName = "id")
   private Comprador comprador;
}