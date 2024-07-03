CREATE TABLE cliente
(
	id_cli serial,
	nome_cli varchar(50),
	logradouro_cli varchar(50),
	bairro_cli varchar(30),
	estado_cli varchar(2),
	cidade_cli varchar(30),
	cep_cli varchar(9),
	cpf_cli varchar(14),
	rg_cli varchar(15), 
	numero_cli integer,
	CONSTRAINT cliente_pkey PRIMARY KEY (id_cli),
	CONSTRAINT cliente_cpf_key UNIQUE (cpf_cli)
);

CREATE TABLE livro (
	id_livro serial,
	cod_livro varchar(8),
	nome varchar(50), 
	editora varchar(50),
	autor varchar(50),
	idioma varchar(30),
	descricao varchar(70),
	preco decimal,
	CONSTRAINT livro_pkey PRIMARY KEY (id_livro),
	CONSTRAINT livro_cod_key UNIQUE (cod_livro)
);

CREATE TABLE emprestimo(
	id_emprestimo serial,
	data_inicio_emprestimo date,
	data_fim_emprestimo date,
	id_livro integer,
	CONSTRAINT emprestimo_pkey PRIMARY KEY(id_emprestimo),
	CONSTRAINT emprestimo_id_livro_fkey FOREIGN KEY (id_livro) REFERENCES livro (id_livro)
);

CREATE TABLE editora(
id_editora serial,
nome_editora text,
cnpj_editora varchar(14),
sede_editora text,
CONSTRAINT editora_pkey PRIMARY KEY(id_editora),
CONSTRAINT editora_cnpj_key UNIQUE (cnpj_editora)
);

CREATE TABLE bibliotecario (
	id_bib serial,
	nome_bib varchar(50),
	cpf_bib varchar(14),
	login_bib varchar(30),
	senha_bib varchar(128),
	tipo_bib varchar(13),
	CONSTRAINT bibliotecario_pkey PRIMARY KEY (id_bib),
	CONSTRAINT bibliotecario_cpf_key UNIQUE (cpf_bib),
	CONSTRAINT bibliotecario_login_key UNIQUE (login_bib)
);

---

INSERT INTO livro (cod_livro, nome, editora, autor, idioma, descricao, preco) 
VALUES ('37653453', 'Crime e Castigo', 'Editora 34', 'Fiódor Dostoiévski', 'Português', 'Livro que explora as complexidades da moralidade e do crime', 35.00),
       ('04320241', 'Os Irmãos Karamazov', 'Editora 34', 'Fiódor Dostoiévski', 'Português', 'Clássico da literatura russa que aborda temas familiares e filosóficos', 40.00),
       ('09567034', 'Memórias do Subsolo', 'Editora 34', 'Fiódor Dostoiévski', 'Português', 'Livro que analisa a psicologia de um homem alienado da sociedade', 30.00);
