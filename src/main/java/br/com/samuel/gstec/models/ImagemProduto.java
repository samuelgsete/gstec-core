package br.com.samuel.gstec.models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class ImagemProduto extends EntidadeBase {

    private String nomeRandomico;
    private String nomeOriginal;
    private String url;
   
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="produto_id", referencedColumnName="id")
    private Produto produto;

    @Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        ImagemProduto that = (ImagemProduto) o;
        return Objects.equals(nomeRandomico, that.nomeRandomico);
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeRandomico == null) ? 0 : nomeRandomico.hashCode());
        return result;
    }
}