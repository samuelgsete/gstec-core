package br.com.samuel.gstec.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.samuel.gstec.models.ImagemProduto;
import br.com.samuel.gstec.models.Produto;
import br.com.samuel.gstec.repository.RepositorioImagemProduto;
import br.com.samuel.gstec.repository.RepositorioProduto;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RepositorioProduto repositorioProduto;

    @Autowired
    private RepositorioImagemProduto repositorioImagemProduto;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg) {
        criarImagensProduto();
        criarProdutos();
    }

    public void criarImagensProduto() {
        ImagemProduto motoE71 = new ImagemProduto(
            "56525347-9eaf-422c-a93a-cb7fc1f16080.png", 
            "Moto-E7-1",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/imagem/download/56525347-9eaf-422c-a93a-cb7fc1f16080.png",
            null
        );

        ImagemProduto motoE72 = new ImagemProduto(
            "729ae99d-d459-43fc-a01e-6035738ff34f.png", 
            "Moto-E7-2",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/imagem/download/729ae99d-d459-43fc-a01e-6035738ff34f.png",
            null
        );

        ImagemProduto ssdnvme1 = new ImagemProduto(
            "782433ff-a3ff-4ea0-9fdf-37dae899ae3e.png", 
            "Ssd-nvme-1",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/imagem/download/782433ff-a3ff-4ea0-9fdf-37dae899ae3e.png",
            null
        );

        ImagemProduto ssdnvme2 = new ImagemProduto(
            "072291db-9fee-476a-8d01-459f49ec2f07.png", 
            "Ssd-nvme-2",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/imagem/download/072291db-9fee-476a-8d01-459f49ec2f07.png",
            null
        );

        ImagemProduto gtx1050ti1 = new ImagemProduto(
            "3925318d-de1d-4e2b-b6c8-fc67185e03f7.png", 
            "Gtx1050ti-1",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/download/imagem/3925318d-de1d-4e2b-b6c8-fc67185e03f7.png",
            null
        );

        ImagemProduto gtx1050ti2 = new ImagemProduto(
            "da788f21-5a43-4d3c-a5b4-b06535c2517a.png", 
            "Gtx1050ti-2",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/download/imagem/da788f21-5a43-4d3c-a5b4-b06535c2517a.png",
            null
        );

        ImagemProduto gtx1050ti3 = new ImagemProduto(
            "466438ae-6342-49fa-b54b-b02a4b60182a.png", 
            "Gtx1050ti-3",
            "http://8080-samuelgsete-gsteccore-wsdnf3gl22f.ws-us67.gitpod.io/produto/download/imagem/466438ae-6342-49fa-b54b-b02a4b60182a.png",
            null
        );

        repositorioImagemProduto.saveAll(Arrays.asList(motoE71, motoE72, ssdnvme1, ssdnvme2, gtx1050ti1, gtx1050ti2, gtx1050ti3));
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
            null
        );
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
            null
        );

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
            null
        );

        repositorioProduto.saveAll(Arrays.asList(motoe7, ssd, gtx1050));
    }
}