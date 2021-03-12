create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria (	id BigInt auto_increment,
							nome varchar(30),
							sala int,
							ativa boolean,
							primary key (id));

create table tb_curso (	id BigInt auto_increment,
						nome varchar(50),
						preco float,
						promocao float,
						duracao float,
						disponivel boolean,
						categoria BigInt,
						primary key (id),
						foreign key (categoria) references tb_categoria(id));

insert into tb_categoria(nome, sala, ativa) values ("Programação", 2, true);
insert into tb_categoria(nome, sala, ativa) values ("Web", 5, true);
insert into tb_categoria(nome, sala, ativa) values ("Oratória", 4, true);
insert into tb_categoria(nome, sala, ativa) values ("Digitação", 3, true);
insert into tb_categoria(nome, sala, ativa) values ("Matrix", 1, true);

insert into tb_curso(nome, preco, categoria) values ("Iniciante em Java", 0, 1);
insert into tb_curso(nome, preco, categoria) values ("Dá-Pra-Viver com Java", 10, 1);
insert into tb_curso(nome, preco, categoria) values ("Monstro Sagrado's Java", 10000, 1);
insert into tb_curso(nome, preco, categoria) values ("Agumon HTML", 0, 2);
insert into tb_curso(nome, preco, categoria) values ("MetalGarurumon HTML", 10, 2);
insert into tb_curso(nome, preco, categoria) values ("Omnimon HTML", 10000, 2);
insert into tb_curso(nome, preco, categoria) values ("Clarividência do Código", 999999, 5);
insert into tb_curso(nome, preco, categoria) values ("La La Lambda", null, 5);

select * from tb_curso where preco > 50;
select * from tb_curso where 3 < preco and preco < 60;
select * from tb_curso where nome like "%J%";

select * from tb_curso inner join tb_categoria;

select * from tb_curso where categoria = 5;