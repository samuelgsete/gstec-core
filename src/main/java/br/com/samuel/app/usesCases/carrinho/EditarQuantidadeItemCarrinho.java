package br.com.samuel.app.usesCases.carrinho;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.samuel.app.models.Carrinho;
import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.models.ResumoPedido;
import br.com.samuel.app.repository.RepositorioCarrinho;

@Service
public class EditarQuantidadeItemCarrinho {

    @Autowired
    private RepositorioCarrinho repositorioCarrinho;

    public ResponseEntity<Carrinho> executar(Integer carrinhoId, ItemCarrinho itemCarrinho) {
        Carrinho carrinho = repositorioCarrinho.findById(carrinhoId).get();
        Set<ItemCarrinho> itens = carrinho.getItens();
        itens.stream()
            .filter(item -> itemCarrinho.equals(item))
            .map(item -> {
                item.setQuantidade(itemCarrinho.getQuantidade());
                item.setSelecionado(itemCarrinho.getSelecionado());
                return item;
            }).collect(Collectors.toSet());

        Double subtotal = itens
                .stream()
                .mapToDouble(itemAtual -> itemAtual.getQuantidade() * itemAtual.getProduto().getPrecificacao().getPrecoAvista())
                .sum();
        Integer totalItens = itens
                .stream()
                .filter(item -> item.getSelecionado())
                .mapToInt(item -> item.getQuantidade())
                .sum();
        carrinho.setTotalItens(totalItens);
        carrinho.setSubtotal(subtotal);
        carrinho.setItens(itens);

        ResumoPedido resumoPedido = new ProcessarResumoPedido().executar(itens);
        resumoPedido.setId(carrinho.getResumoPedido().getId());
        resumoPedido.setCarrinho(carrinho);
        carrinho.setResumoPedido(resumoPedido);

        Carrinho carrinhoAtualizado = repositorioCarrinho.save(carrinho);
        return ResponseEntity.ok(carrinhoAtualizado);
    }
}