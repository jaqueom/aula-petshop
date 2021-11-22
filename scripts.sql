CREATE USER petshop202111 WITH PASSWORD '';

CREATE DATABASE petshop202111
WITH
OWNER = petshop202111
ENCODING = 'UTF8'
CONNECTION LIMIT = -1;

GRANT ALL PRIVILEGES ON DATABASE petshop202111 TO petshop202111;
GRANT ALL ON ALL tables IN SCHEMA public TO petshop202111;
GRANT ALL ON ALL sequences IN SCHEMA public TO petshop202111;

CREATE TABLE "tb_vacina"(
"id" SERIAL NOT NULL,
"nome" VARCHAR(50),
"valor" numeric(5,2)
);

insert into tb_vacina (nome, valor) values 
('Anti Pulgas', 50),
('Anti Rábica', 70),
('Trivalente', 85);


CREATE TABLE "tb_unidade"(
"id" SERIAL NOT NULL,
"nome" VARCHAR(50),
"endereco" VARCHAR(150)
);

insert into tb_unidade (nome, endereco) values 
('Unidade Zona Norte', 'Avenida Assis Brasil, 890')
('Unidade Zona Leste', 'Avenida Bento Gonçalves, 12356'),
('Unidade Zona Sul', 'Rua Mario Totta, 60');

CREATE TABLE "tb_categoria"(
"id_categoria" SERIAL NOT NULL,
"nome_categoria" VARCHAR(100),
"descricao_categoria" VARCHAR(500),
"ativa" boolean default true
);

insert into tb_categoria (nome_categoria, descricao_categoria) values 
('Ração Cachorro', 'Linha completa de rações para seu melhor amigo'),
('Ração Gato', 'Linha premium de rações para seu felino'),
('Coleiras', 'Coleiras de todos os tipos e preços'),
('Higiene', 'Shampoos e outros produtos de higiene para seu bichano'),
('Brinquedos', 'De bolinhas a pato de borracha - tudo para os seus pets');
