package br.com.samuel.app.models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import br.com.samuel.app.models.enuns.BandeiraCartao;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartaoCredito extends EntidadeBase {

    private String numero;
    private String titular;
    private String validade;
    private String cvv;
    private BandeiraCartao bandeira;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CartaoCredito that = (CartaoCredito) o;
        return Objects.equals(id, that.id);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}