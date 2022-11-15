--
-- Data for Name: cor; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cor (id, codigo, nome) VALUES (1, '#000000', 'Preto');
INSERT INTO public.cor (id, codigo, nome) VALUES (2, '#FF0000', 'Vermelho');
INSERT INTO public.cor (id, codigo, nome) VALUES (5, '#F8F8FF', 'Branco');
INSERT INTO public.cor (id, codigo, nome) VALUES (6, '#000000', 'Preto');
INSERT INTO public.cor (id, codigo, nome) VALUES (7, '#F8F8FF', 'Branco');
INSERT INTO public.cor (id, codigo, nome) VALUES (9, '#000000', 'Preto');


--
-- Data for Name: precificacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.precificacao (id, desconto_avista, desconto_parcelamento, parcelamento, preco_avista, preco_base, preco_parcelamento, taxa_desconto_avista, taxa_desconto_parcelamento) VALUES (1, 1499.967, 749.9835, 12, 3499.9230000000002, 4999.89, 4249.9065, 0.3, 0.15);
INSERT INTO public.precificacao (id, desconto_avista, desconto_parcelamento, parcelamento, preco_avista, preco_base, preco_parcelamento, taxa_desconto_avista, taxa_desconto_parcelamento) VALUES (3, 299.997, 139.9986, 10, 699.9929999999999, 999.99, 859.9914, 0.3, 0.14);
INSERT INTO public.precificacao (id, desconto_avista, desconto_parcelamento, parcelamento, preco_avista, preco_base, preco_parcelamento, taxa_desconto_avista, taxa_desconto_parcelamento) VALUES (4, 449.99819999999994, 224.99909999999997, 12, 2049.9918, 2499.99, 2274.9909, 0.18, 0.09);
INSERT INTO public.precificacao (id, desconto_avista, desconto_parcelamento, parcelamento, preco_avista, preco_base, preco_parcelamento, taxa_desconto_avista, taxa_desconto_parcelamento) VALUES (5, 587.9988, 293.9994, 12, 4311.9911999999995, 4899.99, 4605.9906, 0.12, 0.06);
INSERT INTO public.precificacao (id, desconto_avista, desconto_parcelamento, parcelamento, preco_avista, preco_base, preco_parcelamento, taxa_desconto_avista, taxa_desconto_parcelamento) VALUES (7, 65.997, 24.198900000000002, 7, 153.993, 219.99, 195.7911, 0.3, 0.11);


--
-- Data for Name: produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produto (id, altura, aprovacao_media, condicao, conteudo_embalagem, detalhes, estoque, fabricante, frete_gratis, garantia, largura, linha, marca, modelo, nome, peso, profundidade, recem_lancado, unidades_vendidas, cor_id, precificacao_id) VALUES (2, 55, 0, 0, 'Processador AMD Ryzen 5 4600G', 'Processador AMD Ryzen 5 4600G
Esteja você jogando, trabalhando ou fazendo as tarefas do cotidiano, a velocidade sem precedentes dos processadores AMD Ryzen série 4000 G para desktop é imparável. Com os processadores AMD Ryzen para desktop.', 100, 'AMD', true, 12, 74, 'Ryzen', 'AMD', '100-100000147BO', 'Processador AMD Ryzen 5 4600G, 3.7GHz (4.2GHz Max Turbo), Cache 11MB, AM4, Vídeo Integrado', 4.21, 86, true, 0, 5, 3);
INSERT INTO public.produto (id, altura, aprovacao_media, condicao, conteudo_embalagem, detalhes, estoque, fabricante, frete_gratis, garantia, largura, linha, marca, modelo, nome, peso, profundidade, recem_lancado, unidades_vendidas, cor_id, precificacao_id) VALUES (3, 55, 0, 0, '1 Placa de Vídeo MSI; 1 Manual do Usuário', 'A GeForce RTX 3060 permite que você enfrente os jogos mais recentes usando a potência do Ampere - a arquitetura RTX de 2ª geração da NVIDIA. Obtenha um desempenho incrível com Ray Tracing Cores e Tensor Cores', 25, 'MSI', true, 12, 295, 'RTX', 'MSI', 'RTX 3060 VENTUS', 'Placa de Vídeo RTX 3060 Ventus 2X 12G OC MSI GeForce, 12GB GDDR6, 15 Gbps, Ray Tracing', 10, 327, true, 0, 6, 4);
INSERT INTO public.produto (id, altura, aprovacao_media, condicao, conteudo_embalagem, detalhes, estoque, fabricante, frete_gratis, garantia, largura, linha, marca, modelo, nome, peso, profundidade, recem_lancado, unidades_vendidas, cor_id, precificacao_id) VALUES (4, 55, 0, 0, 'Console PlayStation 5 Digital Edition', ' O console PS5 oferece novas possibilidades de jogabilidade que você nunca imaginou. Reproduza jogos para PS5 e PS4 em Blu-ray Disc. Além disso, você também pode baixar jogos digitais para PS5 e PS4 pela PlayStation Store. ', 80, 'Sony', true, 12, 295, 'PlayStation', 'Sony', 'PlayStation', 'Console Sony PlayStation 5 Digital Edition 1 Tb SSD', 2.21, 327, true, 0, 7, 5);
INSERT INTO public.produto (id, altura, aprovacao_media, condicao, conteudo_embalagem, detalhes, estoque, fabricante, frete_gratis, garantia, largura, linha, marca, modelo, nome, peso, profundidade, recem_lancado, unidades_vendidas, cor_id, precificacao_id) VALUES (1, 55, 0, 0, '1 Phone com iOS 1 Cabo de USB-C para Lightning 1  Documentação', 'Grave vídeos 4K, faça belos retratos e capture paisagens inteiras com o novo sistema de câmera dupla. Tire fotos incríveis com pouca luz usando o modo Noite. Veja cores fiéis em fotos, vídeos e jogos na tela Liquid Retina de 6.1 polegadas.', 36, 'Apple', true, 12, 295, 'Plus', 'Apple', 'iPhone 11', 'iPhone 11 Apple 64GB Vermelho, Tela de 6,1”, Câmera Dupla de 12MP, iOS', 2.21, 327, true, 0, 2, 1);
INSERT INTO public.produto (id, altura, aprovacao_media, condicao, conteudo_embalagem, detalhes, estoque, fabricante, frete_gratis, garantia, largura, linha, marca, modelo, nome, peso, profundidade, recem_lancado, unidades_vendidas, cor_id, precificacao_id) VALUES (5, 136, 0, 0, ' Memória RAM Husky DDR4 2666Mhz 8GB - HMR-D4826', 'Memória Gamer Husky Gaming - 8GB
Chegue ao próximo nível em desempenho com o seu computador gamer com a Memória Gamer Husky Gaming. Em busca do minimalismo e da simplicidade, a memória Gamer Husky é extremamente fina e leve ideal', 100, 'Husky', true, 12, 5, 'Gamming', 'Husky', 'HMR-D4826', 'Memória Gamer Husky Gaming, 8GB, 2666MHz, DDR4, CL19, Preto - HGMF001', 0.45, 33, true, 0, 9, 7);


--
-- Data for Name: especificacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (1, 'Sistema Operacional', 'IoS', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (2, 'Processador', 'A13 Bionic Neural Engine de terceira geração', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (3, 'Resolução', '1792 x 828 pixels', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (4, 'Conectividade', ' USB, Bluetooth 5.0, Wi-Fi 6 802.11ax com MIMO 2x2, NFC', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (5, 'RAM', '6 Gb', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (6, 'Câmera Frontal/Traseira', '12 Mb', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (7, 'Frequências', '- GSM 850/900/1800/1900 MHz - 3G 850/900/1900/2100 MHz', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (8, 'Capacidade', '64 Gb', 1);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (9, 'Linha de produto', 'D Ryzen 5 4000 G-Series Desktop Processors with Radeon™ Grap', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (10, 'Clock de Max Boos', 'Até 4.2GHz', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (11, 'Clock básico', '3.7GHz', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (12, 'Pacote', 'AM4', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (13, 'Tipo de memória', 'DDR4', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (14, 'Versão PCI ExpresS', ' PCIe 3.0', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (15, 'Nº de threads', '12', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (16, 'Velocidade máxima da memória', 'Até 3200MHz', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (17, 'Nº de núcleos de CPU', '6', 2);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (18, 'Clock Boost', '1807 MHz', 3);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (19, 'Núcleos', '3584 unidades', 3);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (20, 'Unidade de Procesamento Gráfico', 'NVIDIA GeForce RTX 3060  - Interface: PCI Express Gen 4', 3);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (21, 'Interface', 'PCI Express Gen 4', 3);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (22, 'Com Wi-Fi', 'Sim', 4);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (23, 'Tipo de Memória', 'GDDR6', 4);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (24, 'Memoria RAM', '16 Gb', 4);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (25, 'Capacidade', '1 Tb', 4);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (26, 'Capacidades de módulo', '8 Gb', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (27, 'Velocidade:', '2666MHz', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (28, 'Pinos', '260', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (29, 'Tecnologia', ' DDR4', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (30, 'Latências CAS', '19', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (31, 'Plug & Play', 'SIm', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (32, 'Temperatura de operação', '0º C até 70º C', 5);
INSERT INTO public.especificacao (id, nome, valor, produto_id) VALUES (33, 'Voltagem', '1.25V', 5);


--
-- Data for Name: imagem_produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (2, 600, false, 600, 'iphone11-2.jpg', '52655ec6-ff0f-4653-ab48-cfd5c4fe520e', 'http://res.cloudinary.com/dt4bynswk/image/upload/52655ec6-ff0f-4653-ab48-cfd5c4fe520e', 1);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (3, 1000, true, 1000, 'iphone11-1.jpg', 'a0154023-573e-4d83-b12f-f4a248106ab1', 'http://res.cloudinary.com/dt4bynswk/image/upload/a0154023-573e-4d83-b12f-f4a248106ab1', 1);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (4, 1144, false, 1144, 'iphone-11-3.jpeg', 'e19c845a-cf8f-4c01-aee8-5dd3ae2a91be', 'http://res.cloudinary.com/dt4bynswk/image/upload/e19c845a-cf8f-4c01-aee8-5dd3ae2a91be', 1);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (5, 1000, false, 1000, 'ryzen4600g-2.jpg', 'a8f7ce07-7b00-4f06-8993-548bf30b2981', 'http://res.cloudinary.com/dt4bynswk/image/upload/a8f7ce07-7b00-4f06-8993-548bf30b2981', 2);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (8, 1200, false, 1200, 'rtx-3060-2.png', 'c83c23a4-c1d3-4305-b973-691c47e68447', 'http://res.cloudinary.com/dt4bynswk/image/upload/c83c23a4-c1d3-4305-b973-691c47e68447', 3);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (11, 1200, false, 1200, 'rtx-3060-5.png', '28c06fae-ab8f-439e-b50b-6b88099bbb42', 'http://res.cloudinary.com/dt4bynswk/image/upload/28c06fae-ab8f-439e-b50b-6b88099bbb42', 3);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (6, 1000, true, 1000, 'ryzen4600g-1.jpg', '05dba544-d1f9-49d2-8b4b-cd53e5a5508d', 'http://res.cloudinary.com/dt4bynswk/image/upload/05dba544-d1f9-49d2-8b4b-cd53e5a5508d', 2);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (7, 1000, false, 1000, 'ryzen4600g-3.jpg', 'df0ddc62-1527-4f1d-b999-a0884c4b8c32', 'http://res.cloudinary.com/dt4bynswk/image/upload/df0ddc62-1527-4f1d-b999-a0884c4b8c32', 2);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (13, 600, false, 600, 'ps5-6.jpg', '9be043b4-77e6-449a-91f9-bb44c9ea747a', 'http://res.cloudinary.com/dt4bynswk/image/upload/9be043b4-77e6-449a-91f9-bb44c9ea747a', 4);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (14, 600, false, 600, 'ps5-4.jpg', '2605e289-135a-4c95-8924-71256c01d646', 'http://res.cloudinary.com/dt4bynswk/image/upload/2605e289-135a-4c95-8924-71256c01d646', 4);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (15, 843, false, 1124, 'ps5-6.png', '0258fb9e-ea42-4aaf-bc97-7fd0df84ee01', 'http://res.cloudinary.com/dt4bynswk/image/upload/0258fb9e-ea42-4aaf-bc97-7fd0df84ee01', 4);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (16, 607, false, 850, 'ps5-3.png', '814a2aa6-b61d-41f8-8d77-c08da579eec7', 'http://res.cloudinary.com/dt4bynswk/image/upload/814a2aa6-b61d-41f8-8d77-c08da579eec7', 4);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (17, 1200, true, 1200, 'ps5-2.png', 'dc1e3816-661d-484f-af6f-ca429cba28b7', 'http://res.cloudinary.com/dt4bynswk/image/upload/dc1e3816-661d-484f-af6f-ca429cba28b7', 4);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (18, 1062, false, 1200, 'ps5-5.png', 'd42381f3-b64a-4a9f-96ca-60d93d7f4145', 'http://res.cloudinary.com/dt4bynswk/image/upload/d42381f3-b64a-4a9f-96ca-60d93d7f4145', 4);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (12, 1200, false, 1200, 'rtx-3060-1.png', 'c12b775d-c787-46b1-b1c7-2b770fab6242', 'http://res.cloudinary.com/dt4bynswk/image/upload/c12b775d-c787-46b1-b1c7-2b770fab6242', 3);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (19, 1000, false, 1000, 'ram-ddr4-3.jpg', 'af6e08ef-60fb-48f9-801e-ca99b75f38f1', 'http://res.cloudinary.com/dt4bynswk/image/upload/af6e08ef-60fb-48f9-801e-ca99b75f38f1', 5);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (22, 1000, false, 1000, 'ram-ddr4-4.jpg', '2a1441b9-6aa6-407f-82db-1ac64c31415d', 'http://res.cloudinary.com/dt4bynswk/image/upload/2a1441b9-6aa6-407f-82db-1ac64c31415d', 5);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (20, 1000, false, 1000, 'ram-ddr4-2.jpg', 'c0aa83d1-a6dc-4524-8c31-72e5cd4d9cd8', 'http://res.cloudinary.com/dt4bynswk/image/upload/c0aa83d1-a6dc-4524-8c31-72e5cd4d9cd8', 5);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (21, 1000, true, 1000, 'ram-ddr4-1.jpg', '8078ff2e-af89-4955-be96-44696c9e6ff8', 'http://res.cloudinary.com/dt4bynswk/image/upload/8078ff2e-af89-4955-be96-44696c9e6ff8', 5);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (9, 1200, false, 1200, 'rtx-3060-3.png', 'e935bbc7-6324-4268-bd49-6c8b3caf31bf', 'http://res.cloudinary.com/dt4bynswk/image/upload/e935bbc7-6324-4268-bd49-6c8b3caf31bf', 3);
INSERT INTO public.imagem_produto (id, altura, imagem_principal, largura, nome_original, nome_randomico, url, produto_id) VALUES (10, 1200, true, 1200, 'rtx-3060-4.png', '4e5d3060-13d2-476f-ae43-03b8a7398a70', 'http://res.cloudinary.com/dt4bynswk/image/upload/4e5d3060-13d2-476f-ae43-03b8a7398a70', 3);