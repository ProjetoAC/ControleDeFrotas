create table usuario(
IdUsuario SERIAL NOT NULL,
Nome varchar(100) NOT NULL DEFAULT '',
Cpf varchar(15) NOT NULL DEFAULT '',
Telefone varchar(20) NOT NULL DEFAULT '',
Cidade varchar(60) NOT NULL DEFAULT '',
Estado varchar(65) NOT NULL DEFAULT '',
Endereco varchar(100) NOT NULL DEFAULT '',
Bairro varchar(100) NOT NULL DEFAULT '',
NumeroCarteira integer NOT NULL,
TipoCarteira varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Pessoas PRIMARY KEY (IdUsuario)
);

create table veiculos(
IdVeiculo SERIAL NOT NULL,
TipoVeiculo varchar(50) NOT NULL DEFAULT '',
Placa varchar(50) NOT NULL DEFAULT '',
TipoCombustivel varchar(50) NOT NULL DEFAULT '',
Carga varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Veiculos PRIMARY KEY (IdVeiculo)
);

SELECT * FROM usuario
