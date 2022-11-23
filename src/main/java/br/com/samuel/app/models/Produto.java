package br.com.samuel.app.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
}