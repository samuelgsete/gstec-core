package br.com.samuel.app.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import br.com.samuel.app.models.enuns.CondicaoProduto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto extends EntidadeBase {

    private String nome;
    private Double preco;
    private String marca;
    private String modelo;
    private String linha;
    private Integer garantia;
    private Integer estoque;
    private Integer unidadesVendidas;
    private Double peso;
    private Double taxaDesconto;
    private Integer parcelamento;
    private String detalhes;
    private Boolean freteGratis;
    private Boolean recemLancado;
    private Integer aprovacaoMedia;
    private CondicaoProduto condicao;
    private Double altura;
    private Double largura;
    private Double profundidade;
    private String conteudoEmbalagem;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private Set<ImagemProduto> imagens = new HashSet<ImagemProduto>();

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private Set<Especificacao> especificacoes = new HashSet<Especificacao>();
}