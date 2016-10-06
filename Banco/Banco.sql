create table estados(
EstadoId integer NOT NULL,
Nome varchar(50) NOT NULL DEFAULT '',
Sigla char(2) NOT NULL DEFAULT '',
CONSTRAINT PK_Estados PRIMARY KEY(EstadoID)
);

create table cidades(
CidadeId integer NOT NULL,
EstadoId integer NOT NULL,
Nome varchar(50) NOT NULL DEFAULT '',
CONSTRAINT PK_Cidades PRIMARY KEY(CidadeID),
CONSTRAINT FK_Estados_Cidades FOREIGN KEY (EstadoId)
REFERENCES Estados (EstadoId)
);

create table usuario(
IdUsuario SERIAL NOT NULL,
CidadeId integer NOT NULL,
EstadoId integer NOT NULL,
Nome varchar(100) NOT NULL DEFAULT '',
Cpf integer NOT NULL,
Telefone integer NOT NULL,
Estado varchar(100) NOT NULL DEFAULT '',
Cidade varchar(100) NOT NULL DEFAULT '',
Endereco varchar(100) NOT NULL DEFAULT '',
Bairro varchar(100) NOT NULL DEFAULT '',
NumeroCarteira integer NOT NULL,
TipoCarteira varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Pessoas PRIMARY KEY (IdUsuario),
CONSTRAINT FK_Estados_Usuario FOREIGN KEY (EstadoId)
REFERENCES Estados (EstadoId),
CONSTRAINT FK_Cidades_Usuario FOREIGN KEY (CidadeId)
REFERENCES Cidades (CidadeId)
);

create table veiculos(
IdVeiculo integer NOT NULL,
TipoVeiculo varchar(50) NOT NULL DEFAULT '',
Placa varchar(50) NOT NULL DEFAULT '',
TipoCombustivel varchar(50) NOT NULL DEFAULT '',
Carga varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Veiculos PRIMARY KEY (IdVeiculo)
);
