create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe (id BigInt auto_increment,
						nome varchar(30),
						velocidade float,
						tamanho float,
                        primary key (id));

create table tb_personagem (id BigInt auto_increment,
							nome varchar(50),
                            classe BigInt,
                            ataque int,
                            mira int,
                            magia int,
                            defesa int,
                            primary key (id),
                            foreign key (classe) references tb_classe(id));

insert into tb_classe(nome, velocidade, tamanho) values ("bárbaro", 13, 2);
insert into tb_classe(nome, velocidade, tamanho) values ("druída", 15, 1.6);
insert into tb_classe(nome, velocidade, tamanho) values ("guerreiro", 12, 1.9);
insert into tb_classe(nome, velocidade, tamanho) values ("mago", 10, 1.7);
insert into tb_classe(nome, velocidade, tamanho) values ("clérico", 10, 1.6);

insert into tb_personagem(nome, classe, ataque, defesa) values ("Ajani", 3, 1900, 1800);
insert into tb_personagem(nome, classe, ataque, defesa) values ("Garruk", 1, 2050, 1550);
insert into tb_personagem(nome, classe, ataque, defesa) values ("Gideon", 3, 1950, 1750);
insert into tb_personagem(nome, classe, ataque, defesa) values ("Jace", 4, 1700, 1900);
insert into tb_personagem(nome, classe, ataque, defesa) values ("Teferi", 4, 1650, 1800);
insert into tb_personagem(nome, classe, ataque, defesa) values ("Vivien", 2, 1750, 2000);

select * from tb_personagem where ataque > 2000;
select * from tb_personagem where 1000 < defesa and defesa < 2000;
select * from tb_personagem where nome like "%c%";

select * from tb_personagem inner join tb_classe;

select * from tb_personagem as magos where classe = 4;