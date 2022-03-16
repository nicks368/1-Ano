create database BdLivrariaNikolas

use BdLivrariaNikolas

create table tbAutor (
	idAutor int not null identity (1,1) constraint Pk_idAutor primary key (idAutor),
	nomeAutor varchar (80) not null
)

create table tbLivros (
	idAutor int foreign key references "tbAutor" (idAutor),
	nomeLivro varchar (60) not null,
	editora varchar (35) not null,
	isbn int not null,
	numeroPaginas int not null,
	genero varchar (50) not null,
)

INSERT INTO tbAutor (nomeAutor)
VALUES ('Carlos D. de Andrade')

INSERT INTO tbAutor (nomeAutor)
VALUES ('Vinícius de Moraes')

INSERT INTO tbAutor (nomeAutor)
VALUES ('Cecília Meirelles')

INSERT INTO tbAutor (nomeAutor)
VALUES ('Manuel Bandeira')

INSERT INTO tbAutor (nomeAutor)
VALUES ('Machado de Assis')

INSERT INTO tbAutor (nomeAutor)
VALUES ('Cora Coralina'

INSERT INTO tbAutor (nomeAutor)
VALUES ('Clarice Lispector')

SELECT * FROM tbAutor 

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (12438739, 'Estórias da casa velha da ponte', 6, 'Ática', 'Romance', 298 )

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (63762892, 'O tesouro da Casa velha', 6, 'Cia das Letras ', 'Romance', 172 )

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (73682920 , 'A hora da Estrela', 7, 'Cia das Letras', 'Poesia', 92)

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (72879012, 'Meu livro de cordel', 6, 'Saraiva', 'poesia', 123 )

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (98920212, 'A descoberta do mundo', 7, 'Saraiva', 'Romance',321)

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (73928923 , 'Ou isto ou aquilo', 3, 'Ática', 'poesia',122 )

INSERT INTO tbLivros (isbn, nomeLivro, idAutor, editora, genero, numeroPaginas)
VALUES (97294012, 'Estrela da Vida Inteira', 3, 'Nova Fronteira', 'Poesia', 445 )

SELECT * FROM tbLivros

-- update--

UPDATE tbAutor
SET nomeAutor = 'Carlos Drummond de Andrade'
WHERE idAutor = 1
SELECT * FROM tbAutor

-- Select--

--livros--
SELECT isbn, nomeLivro FROM tbLivros

--livros da Cora Carolina--
SELECT isbn, nomeLivro FROM tbLivros
WHERE idAutor = 6

--livros de 200 á 300 paginas--

SELECT isbn, nomeLivro, numeroPaginas FROM tbLivros
WHERE numeroPaginas>200 AND numeroPaginas<300

-- Livros que iniciam com a letra O--

SELECT isbn, nomeLivro FROM tbLivros
WHERE nomeLivro LIKE 'O%'

--Livros de romance--

SELECT isbn, nomeLivro, genero FROM tbLivros
WHERE genero = 'Romance'


