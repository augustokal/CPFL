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
    cidade varchar (20) not null,
    uf varchar (2) not null,
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
    Datafatura timestamp without time zone,
    
FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
FOREIGN KEY (id_tarifa) REFERENCES tarifas (id_tarifa)       
)
WITH ( OIDS = false); 

insert into faturas (dt_fatura) values ('10/10/2018');
select * from faturas;

CREATE FUNCTION Data_fatura ()
RETURNS TRIGGER AS $$
BEGIN
    NEW.Datafatura = now();
    RETURN NEW;
END; 
$$
LANGUAGE 'plpgsql' ;

ALTER FUNCTION Data_fatura () OWNER TO postgres;

CREATE TRIGGER  Datanovafatura 
before insert  
ON faturas 
FOR EACH ROW
EXECUTE PROCEDURE  Data_fatura ();

