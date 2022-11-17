package br.com.samuel.app.usesCases.carrinho;

import java.util.Set;

import br.com.samuel.app.models.ItemCarrinho;
import br.com.samuel.app.models.ResumoPedido;

public class ProcessarResumoPedido {
    public ResumoPedido executar(Set<ItemCarrinho> itens) {
        Double subtotalAvista = itens
            .stream()
            .filter(itemAtual -> itemAtual.getSelecionado())
            .mapToDouble(itemAtual -> itemAtual.getQuantidade() * itemAtual.getProduto().getPrecificacao().getPrecoAvista())
            .sum();

        Double descontoAvista = itens
            .stream()
            .filter(itemAtual -> itemAtual.getSelecionado())
            .mapToDouble(itemAtual -> itemAtual.getQuantidade() * itemAtual.getProduto().getPrecificacao().getDescontoAvista())
            .sum();

        Double subtotalParcelado = itens
            .stream()
            .filter(itemAtual -> itemAtual.getSelecionado())
            .mapToDouble(itemAtual -> itemAtual.getQuantidade() * itemAtual.getProduto().getPrecificacao().getPrecoParcelamento())
            .sum();

        Double descontoParcelado = itens
            .stream()
            .filter(itemAtual -> itemAtual.getSelecionado())
            .mapToDouble(itemAtual -> itemAtual.getQuantidade() * itemAtual.getProduto().getPrecificacao().getDescontoParcelamento())
            .sum();

        Integer parcelamento = itens.stream()
            .mapToInt(item -> item.getProduto().getPrecificacao().getParcelamento())
            .min()
            .getAsInt();
        
        ResumoPedido resumo = new ResumoPedido();
        resumo.setSubtotalAvista(subtotalAvista);
        resumo.setDescontoAvista(descontoAvista);
        resumo.setSubtotalParcelado(subtotalParcelado);
        resumo.setDescontoParcelado(descontoParcelado);
        resumo.setParcelamento(parcelamento);
        
        return resumo;
    }   
}