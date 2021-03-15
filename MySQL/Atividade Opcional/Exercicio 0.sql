create database db_nome_minha_casa_mais_bonita;
use db_nome_minha_casa_mais_bonita;

create table tb_categoria (	id BigInt auto_increment,
							nome varchar(255),
                            sessao int,
                            ativa boolean,
                            primary key (id));

create table tb_produto (	id BigInt auto_increment,
							nome varchar(255),
                            variedade varchar(255),
                            marca varchar(255),
                            peso float,
                            valor float,
							categoria BigInt,
                            foreign key (categoria) references tb_categoria(id),
                            primary key (id));

create table tb_usuario (	id BigInt auto_increment,
							nome varchar(255),
							sobrenome varchar(255),
							rg varchar(255),
							email varchar(255),
                            deficiente boolean,
                            primary key (id));

insert into tb_categoria(nome, sessao) values ("Limpeza", 0);
insert into tb_categoria(nome, sessao) values ("Utilidade", 2);
insert into tb_categoria(nome, sessao) values ("Higiene", 1);
insert into tb_categoria(nome, sessao) values ("Doces", 4);
insert into tb_categoria(nome, sessao) values ("Cereais", 3);

insert into tb_produto(nome, categoria, valor) values ("Vassoura", 1, 8);
insert into tb_produto(nome, categoria, valor) values ("Desinfetante", 1, 6);
insert into tb_produto(nome, categoria, valor) values ("Shampoo", 3, 5.90);
insert into tb_produto(nome, categoria, valor) values ("Gel", 3, 4.50);
insert into tb_produto(nome, categoria, valor) values ("Ancinho", 2, 7);
insert into tb_produto(nome, categoria, valor) values ("Baude", 2, 6);
insert into tb_produto(nome, categoria, valor) values ("Aveia", 4, 4.50);
insert into tb_produto(nome, categoria, valor) values ("Amendoím", 4, 3.0);

insert into tb_usuario(nome, email, deficiente) values ("Diego", "guy.de.edotensei@email.com", false);
insert into tb_usuario(nome, email, deficiente) values ("Anderson", "and.trackinas@meioamail.com", false);
insert into tb_usuario(nome, email, deficiente) values ("Luke", "the_dark@sidelook.com", false);
insert into tb_usuario(nome, email, deficiente) values ("Cris", "doisomen@email.com", false);
insert into tb_usuario(nome, email, deficiente) values ("Eric", "master7yi@sidelook.com", false);

select * from tb_produto where valor > 50;
select * from tb_produto where 3 < valor and valor < 60;
select * from tb_produto where nome like "%b%";
select * from tb_usuario where nome like "%c%";
select * from tb_categoria inner join tb_produto on tb_produto.categoria = tb_categoria.id;
select AVG(valor) from tb_produto;
select SUM(valor) from tb_produto;
select COUNT(valor) from tb_produto;
select * from tb_produto where categoria = 2;