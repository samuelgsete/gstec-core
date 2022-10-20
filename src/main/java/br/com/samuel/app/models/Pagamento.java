package br.com.samuel.app.models;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import br.com.samuel.app.models.enuns.MetodoPagamento;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pagamento extends EntidadeBase {

    private Integer codigo;
    private Double valorTransacao;
    private MetodoPagamento metodoPagamento;
    private String situacao;
    private String aprovadoEm;

    @OneToOne(mappedBy = "pagamento", cascade = CascadeType.ALL)
    @JoinColumn(name = "pagamento_id", referencedColumnName = "id")
    private Pagador pagador;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private Pedido pedido;
}