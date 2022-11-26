package br.com.samuel.app.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
public class ProdutosFavoritos extends EntidadeBase {
    
    @JsonIgnore
    @OneToOne(mappedBy = "produtosFavoritos")
    private Cliente cliente;

    @OneToMany(mappedBy = "produtosFavoritos", cascade = CascadeType.ALL)
    private Set<Produto> produtos = new HashSet<Produto>();
}