package br.com.samuel.app.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

import br.com.samuel.app.models.enuns.CondicaoProduto;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto extends EntidadeBase {

    private String nome;
    private String fabricante;
    private String marca;
    private String modelo;
    private String linha;
    private Integer garantia;
    private Integer estoque;
    private Integer unidadesVendidas;
    private Boolean freteGratis;
    private Boolean recemLancado;
    private Integer aprovacaoMedia;
    private CondicaoProduto condicao;
    private Double peso;
    private Double altura;
    private Double largura;
    private Double profundidade;
    private String conteudoEmbalagem;
    private Boolean estaAtivo;

    @Column(name = "ofertado_desde", columnDefinition = "TIMESTAMP")
    private LocalDateTime ofertadoDesde = LocalDateTime.now();

    @Column(length = 2040)
    private String detalhes;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private Set<ImagemProduto> imagens = new HashSet<ImagemProduto>();

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private Set<Especificacao> especificacoes = new HashSet<Especificacao>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cor_id")
    private Cor cor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "precificacao_id")
    private Precificacao precificacao;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private ProdutosFavoritos produtosFavoritos;
}