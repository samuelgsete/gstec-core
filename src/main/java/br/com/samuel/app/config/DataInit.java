package br.com.samuel.app.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.samuel.app.models.Produto;
import br.com.samuel.app.repository.RepositorioProduto;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RepositorioProduto repositorioProduto;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg) {
        criarProdutos();
    }

    public void criarProdutos() {
        Produto motoe7 = new Produto(
                "Morotola Moto E7 Plus",
                1299.99,
                "Motorola",
                "E7 Plus",
                "Moto E",
                12,
                18,
                8,
                4.0,
                0.05,
                6,
                "Smartphone Morotola Moto E7 Plus 4Gb de RAM 64Gb de Armazenamento interno",
                null);
        Produto ssd = new Produto(
                "SSD NVME Kingston 250Gb",
                174.99,
                "Kingston",
                "SNVS/250G",
                "NV1",
                24,
                30,
                12,
                2.5,
                0.12,
                6,
                "SSD 250Gb Kingston NV1",
                null);

        Produto gtx1050 = new Produto(
                "Placa de video Gigabyte Nvidia Gtx 1050Ti",
                1574.99,
                "Nvidia",
                "1050Ti",
                "Gtx",
                24,
                20,
                5,
                6.4,
                0.04,
                6,
                "Placa de video Gigabyte Nvidia Gtx 1050Ti 4Gb GDDR5",
                null);
        repositorioProduto.saveAll(Arrays.asList(motoe7, ssd, gtx1050));
    }
}