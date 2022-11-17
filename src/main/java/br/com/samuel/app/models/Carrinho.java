package br.com.samuel.app.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carrinho extends EntidadeBase {

    private Double subtotal;
    private Integer totalItens;

    @OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL)
    private Set<ItemCarrinho> itens = new HashSet<ItemCarrinho>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resumo_pedido_id", referencedColumnName = "id")
    private ResumoPedido resumoPedido;

    @JsonIgnore
    @OneToOne(mappedBy = "carrinho")
    private Cliente cliente;
}