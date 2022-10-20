package br.com.samuel.app.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import br.com.samuel.app.models.enuns.SituacaoPedido;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
   private Pagamento pagamento;

   @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
   private Set<ItemPedido> itens = new HashSet<ItemPedido>();
}