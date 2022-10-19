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
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends EntidadeBase {

    private String nome;
    private String usuario;
    private String cpf;
    private String telefone;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<Endereco> enderecos = new HashSet<Endereco>();

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<CartaoCredito> cartoes = new HashSet<CartaoCredito>();

    @JsonIgnore
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JoinColumn(name = "carrinho_id", referencedColumnName = "id")
    private Carrinho carrinho;
}