create database BdNikolasPetshop 

use BdNikolasPetshop

create table TbCliente (
	idCliente int identity (1,1),
	nomeCliente varchar (80) not null,
	cepCliente varchar (20) not null,
	rgCliente varchar (20) not null,
	cpfCliente int not null,
	logradouroCliente varchar(20) not null,
	numeroLogCliente int not null,
	cidadeCliente varchar (80) not null,
	bairroCliente varchar (80) not null,
	ufCliente varchar (30) not null,

	constraint Pk_idCliente primary key (idCliente))

create table TbEspecie (
	idEspecie int identity (1,1),
	nomeEspecie varchar (40),

	constraint Pk_idEspecie primary key (idEspecie))

create table TbRaca (
	idRaca int identity (1,1) constraint Pk_idRaca primary key (idRaca),
	idEspecie int foreign key references "TbEspecie" (idEspecie),
	nomeRaca varchar (50) not null
)

create table TbTelefoneCliente (
	idTelefoneCliente int identity (1,1) constraint Pk_idTelefoneCliente primary key (idTelefoneCliente),
	idCliente int foreign key references "TbCliente" (idCliente),
	numeroTelefoneCliente varchar (20) not null
)

create table TbServico (
	idServico int identity (1,1) constraint Pk_idServico primary key (idServico),
	descricaoServico varchar (200),
	valorServico varchar (15) not null
)

create table TbAnimal (
	idAnimal int identity (1,1) constraint Pk_idAnimal primary key (idAnimal),
	idEspecie int foreign key references "TbEspecie" (idEspecie),
	idRaca int foreign key references "TbRaca" (idRaca),
	idCliente int foreign key references "TbCliente" (idCliente),
	nomeAnimal varchar (80) not null,
	pesoAnimal varchar (15) not null
)

create table TbAgendamento (
	idAgendamento int identity (1,1) constraint Pk_idAgendamento primary key (idAgendamento),
	idCliente int foreign key references "TbCliente" (idCliente),
	dataAgendamento date not null,
	horarioAgendamento time not null,
	valorTotal real not null
)

create table TbServicoAgendamento (
	idServicoAgendamento int identity (1,1) constraint Pk_idServicoAgendamento primary key (idServicoAgendamento),
	idAnimal int foreign key references  "TbAnimal" (idAnimal),
	idAgendamento int foreign key references "TbAgendamento" (idAgendamento),
	idServico int foreign key references "TbServico" (idServico),
	subtotalServicoAgendamento real not null
)

