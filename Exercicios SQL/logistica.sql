create database BdLogisticaNikolas

use BdLogisticaNikolas

create table TbCliente (
	codCliente char (10) Primary Key not null,
	nomeEmpresa varchar (70) not null,
	nomeContato varchar(70) not null,
	cargoContato varchar(40),
	endereco varchar(50) not null,
	cidade varchar(25),
	regiao varchar(25),
	CEP	char (15) not null,
	pais varchar (25),
	telefone char (20) not null,
	fax char (20)

)

select * from TbCategorias

create table TbTransportadora (
	codTransportadora int primary key not null,
	nomeEmpresa varchar (30) not null,
	telefone char (20)
)

create table TbCategorias (
	codCategoria int primary key not null,
	nomeCategoria varchar (30) not null,
	descricao varchar (100)
)

create table TbDetalhesDoPedido (
	numeroPedido int primary key not null,
	codProduto int not null,
	precoUnitario money,
	quantidade int,
	desconto float
)

create table TbFuncionarios (
	codFuncionario int primary key not null,
	sobrenome varchar (30),
	nome varchar (30) not null,
	cargo varchar (40),
	tratamento char (10),
	dataNascimento date,
	dataContratacao date,
	endereco varchar (50),
	cidade varchar (25),
	regiao varchar (25),
	CEP char (15),
	pais varchar (25),
	telefoneResidencial char (20),
	ramal char (5),
	observacoes varchar (200)
)

create table TbFornecedor (
	codFornecedor int primary key not null,
	nomeEmpresa varchar (70) not null,
	nomeContato varchar (70) not null,
	cargoContato varchar (40),
	endereco varchar (50),
	cidade varchar (25),
	regiao varchar (25),
	CEP char (15),
	pais varchar (25),
	telefone  char (20),
	fax char (20)
)

create table TbPedidos (
	numeroPedido int primary key not null,
	codCliente char (10) not null foreign key references TbCliente (codCliente),
	codFuncionario int not null,
	dataPedido date,
	dataEntrega date,
	dataEnvio date,
	codTransportadora int not null,
	frete money,
	nomeDestinatario varchar (50),
	enderecoDestinatario varchar (50),
	cidadeDestino varchar (25),
	regiaoDestino varchar (25),
	CEPdeDestino char (15),
	paisDestino varchar (25),
)

create table TbProduto (
	codProduto int primary key not null,
	nomeProduto varchar (50) not null,
	codFornecedor int not null,
	codCategoria int not null,
	quantidadeUnidade char (30),
	precoUnitario money,
	unidadesEstoque int,
	unidadesPedidas int,
	nivelReposicao int,
	descontinuado int
)