create table empregado(
	idempr integer not null,
	pnome varchar,
	snome varchar,
	dtanasc date,
	dtacontr date,
	salario integer,
	constraint pk_empr primary key (idempr),
	constraint ck_dtanasc check (dtanasc > '01/01/2001'),
	constraint ck_salario check (salario > 400),
	constraint ck_dtacon check (((CURRENT_DATE - dtanasc)/365)>=18)
)

create table pessoa(
	id integer,
	pnome varchar,
	snome varchar,
	email varchar,
	constraint pk_pessoa primary key (id),
	constraint un_aluno_email unique (email)
)

create table correntista(
	cpf integer,
	nome varchar,
	datanasc date,
	cidade varchar,
	uf varchar(2),
	constraint pk_cor primary key (cpf),
	constraint ck_dtanasc check (((CURRENT_DATE - datanasc)/365)>=18))

create table conta_corrente(
	numconta integer,
	cpfcorrentista integer,
	saldo integer,
	constraint pk_conta primary key (numconta),
	constraint fk_conta_corrent foreign key (cpfcorrentista) references correntista(cpf),
	constraint ck_saldo check (saldo>500)
)


create table livro(
	id integer,
	titulo varchar,
	isbn varchar,
	datapub date,
	constraint pk_livro primary key (id),
	constraint un_livro unique (isbn)
)

create table carro(
	idcarro integer not null,
	modelo varchar,
	marca varchar,
	ano integer,
	preco real,
	chassi varchar,
	renavam varchar,
	constraint pk_idcarr primary key (idcarro),
	constraint un_c unique (chassi),
	constraint unr unique (renavam),
	constraint ck_p check (preco>2000)
)



