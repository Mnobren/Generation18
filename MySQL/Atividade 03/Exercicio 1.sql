create database db;
use db;

drop table tb;
create table tb (	id BigInt auto_increment,
					nome varchar(50),
					sobrenome varchar (50),
					funcao varchar(50),
					salario float,
                    
					primary key (id));

insert into tb(nome, sobrenome, funcao, salario) value("Ana","Uno","desenvolvedora",1500);
insert into tb(nome, sobrenome, funcao, salario) value("Bertha","Dos","desenvolvedora",2100);
insert into tb(nome, sobrenome, funcao, salario) value("Camila","Tres","desenvolvedora",3000);
insert into tb(nome, sobrenome, funcao, salario) value("Diana","Quatro","desenvolvedora",3900);
insert into tb(nome, sobrenome, funcao, salario) value("Elaine","Cinco","desenvolvedora",4500);

select * from tb where salario > 2000;
select * from tb where salario < 2000; 

update tb set sobrenome = "Cuatro" where id = 4;

select * from tb;