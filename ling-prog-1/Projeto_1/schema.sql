CREATE TABLE cliente (
	id_cli serial,
	nome_cli varchar(50), 
	logradouro_cli varchar(50),
	numero_cli integer,
	bairro_cli varchar(30),
	cidade_cli varchar(30),
	estado_cli varchar(2),
	cep_cli varchar(9),
	cpf_cli varchar(14),
	rg_cli varchar(15),
	CONSTRAINT cliente_pkey PRIMARY KEY (id_cli),
	CONSTRAINT cliente_cpf_key UNIQUE (cpf_cli)
)