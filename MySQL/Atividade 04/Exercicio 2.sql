create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria (	id BigInt auto_increment,
							nome varchar(30),
							promocao boolean,
							tamanho float,
							primary key (id));

create table tb_pizza (	id BigInt auto_increment,
						nome varchar(50),
						preco float,
						presunto boolean,
						ovo boolean,
						pepperoni boolean,
						categoria BigInt,
						primary key (id),
						foreign key (categoria) references tb_categoria(id));

insert into tb_categoria(nome, promocao, tamanho) values ("pizza grande", 0, 4);
insert into tb_categoria(nome, promocao, tamanho) values ("pizza média", 0, 3);
insert into tb_categoria(nome, promocao, tamanho) values ("pizza pequena", 0, 2);
insert into tb_categoria(nome, promocao, tamanho) values ("mini pizza", 5.0, 1);
insert into tb_categoria(nome, promocao, tamanho) values ("esfiha", 0, 0.5);

insert into tb_pizza(nome, preco, categoria) values ("Margerita", 20, 3);
insert into tb_pizza(nome, preco, categoria) values ("Portuguesa", 24, 3);
insert into tb_pizza(nome, preco, categoria) values ("Calabresa", 28, 3);
insert into tb_pizza(nome, preco, categoria) values ("Baiana", 24, 3);
insert into tb_pizza(nome, preco, categoria) values ("Banana", 20, 2);
insert into tb_pizza(nome, preco, categoria) values ("Morango", 20, 2);
insert into tb_pizza(nome, preco, categoria) values ("Moda da Casa", 50, 4);
insert into tb_pizza(nome, preco, categoria) values ("Atum", 20, 1);

select * from tb_pizza where preco > 45;
select * from tb_pizza where 29 < preco and preco < 60;
select * from tb_pizza where nome like "%C%";

select * from tb_pizza inner join tb_categoria;

select * from tb_pizza where categoria = 3;