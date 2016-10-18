create table usuario(
IdUsuario SERIAL NOT NULL,
Nome varchar(100) NOT NULL DEFAULT '',
Cpf varchar(15) NOT NULL DEFAULT '',
Telefone varchar(20) NOT NULL DEFAULT '',
Cidade varchar(60) NOT NULL DEFAULT '',
Estado varchar(65) NOT NULL DEFAULT '',
Endereco varchar(100) NOT NULL DEFAULT '',
Bairro varchar(100) NOT NULL DEFAULT '',
NumeroCarteira varchar(100) NOT NULL DEFAULT '',
TipoCarteira varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Pessoas PRIMARY KEY (IdUsuario)
);

create table veiculo(
IdVeiculo SERIAL NOT NULL,
TipoVeiculo varchar(50) NOT NULL DEFAULT '',
Placa varchar(50) NOT NULL DEFAULT '',
TipoCombustivel varchar(50) NOT NULL DEFAULT '',
Carga varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Veiculo PRIMARY KEY (IdVeiculo)
);

create table rota (
RotaId SERIAL NOT NULL,
Saida varchar(70) NOT NULL DEFAULT'',
Destino varchar(70) NOT NULL DEFAULT'',
DistanciaPercorrida varchar(20) NOT NULL DEFAULT'',
GastosExtras varchar(30) NOT NULL DEFAULT'',
CONSTRAINT PK_cadastroRota PRIMARY KEY (RotaId)
);

SELECT * FROM usuario
