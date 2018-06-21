DROP TABLE FATURAS;
DROP TABLE TARIFAS;
DROP TABLE ENDERECO;
DROP TABLE USUARIO;

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
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    uf varchar(2) not null,
   	id_usuario integer,
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
    dt_fatura TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    dt_venc TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP + INTERVAL '1 month',
    kw_gasto numeric(10,2),
    valorTotal numeric (10,2),
    id_tarifa integer,
    id_usuario integer,
	FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
	FOREIGN KEY (id_tarifa) REFERENCES tarifas (id_tarifa)
);

insert into usuario (senha, usuario, tipo, nome) values ('adm', 'adm', 'Gerente', 'adm');
insert into endereco (cep, rua, num_casa, bairro, cidade, uf, id_usuario) values ('13186-531','Rua Rubi',34,'Jardim Santa Esmeralda','Hortolândia','UF',1);

select u.*, e.* from usuario as u inner join endereco as e on (u.id_usuario = e.id_usuario);

SELECT MAX(id_usuario) FROM usuario;

select * from usuario;

SELECT u.*, e.* FROM usuario AS u INNER JOIN endereco AS e ON (u.id_usuario = e.id_usuario) WHERE u.tipo='Medidor' or u.tipo='Gerente'

select * from faturas;

select ft.*, tf.* from faturas as ft inner join tarifas as tf on (ft.id_tarifa = tf.id_tarifa) WHERE ft.id_usuario =2;

select ft.*, tf.*, u.* from faturas as ft inner join tarifas as tf on (ft.id_tarifa = tf.id_tarifa) INNER JOIN usuario AS u ON (ft.id_usuario = u.id_usuario);

