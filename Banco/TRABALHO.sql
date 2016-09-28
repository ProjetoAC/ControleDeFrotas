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

create table pessoas(
PessoaId integer NOT NULL,
CidadeId integer NOT NULL,
EstadoId integer NOT NULL,
Nome varchar(100) NOT NULL DEFAULT '',
Cpf integer NOT NULL,
Telefone integer NOT NULL,
Endereco varchar(100) NOT NULL DEFAULT '',
Bairro varchar(100) NOT NULL DEFAULT '',
NumeroCarteiraMotorista integer NOT NULL,
TipoCarteira varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Pessoas PRIMARY KEY (PessoaId),
CONSTRAINT FK_Estados_Pessoas FOREIGN KEY (EstadoId)
REFERENCES Estados (EstadoId),
CONSTRAINT FK_Cidades_Pessoas FOREIGN KEY (CidadeId)
REFERENCES Cidades (CidadeId)
);

create table veiculos(
VeiculoId integer NOT NULL,
TipoVeiculo varchar(50) NOT NULL DEFAULT '',
Placa varchar(50) NOT NULL DEFAULT '',
TipoCombustivel varchar(50) NOT NULL DEFAULT '',
Carga varchar(100) NOT NULL DEFAULT '',
CONSTRAINT PK_Veiculos PRIMARY KEY (VeiculoId)
);

