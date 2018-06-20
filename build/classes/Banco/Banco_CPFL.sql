DROP TABLE USUARIO;
DROP TABLE ENDERECO;
DROP TABLE TARIFAS;
DROP TABLE FATURAS;

create table usuario (
	id_usuario serial primary key not null,
    senha varchar (20) not null,
    usuario varchar (20) not null,
    tipo varchar(25) not null,
    nome varchar (50) not null  
);

create table endereco (
	id_end serial primary key not null,
    cep varchar (20) not null,
    rua varchar (50) not null,
    num_casa int not null,
   	id_usuario int,
  FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
);

create table tarifas (
	id_tarifa serial primary key not null,
    val_kw numeric (10,2) not null,
    val_imposto numeric (10,2) not null,
    cor varchar (20) not null,
    porcentagem numeric (10,2) not null
);

create table faturas (
	id_fatura serial primary key not null,
    dt_fatura date,
    dt_venc date,
    id_tarifa int,
    id_usuario int,
FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
FOREIGN KEY (id_tarifa) REFERENCES tarifas (id_tarifa)    
);

insert into usuario (senha, usuario, tipo, nome) values ('adm', 'adm', 'Gerente', 'adm');
