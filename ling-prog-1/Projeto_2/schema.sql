CREATE TABLE fornecedor(
	id_for serial,
	nome_for varchar(50),
	cnpj_for varchar(15),
	tel_for varchar(13),
	data_cad_for date,
	CONSTRAINT fornecedor_pkey PRIMARY KEY (id_for)
)

CREATE TABLE produto(
	id_prod serial,
	nome_prod varchar(50),
	desc_prod varchar(50),
	cod_bar_prod varchar(13),
	p_custo_prod double PRECISION,
	p_venda_prod double PRECISION,
	id_for INTEGER,
	CONSTRAINT produto_pkey PRIMARY KEY (id_prod),
	CONSTRAINT fornecedor_fk FOREIGN KEY (id_for) REFERENCES fornecedor (id_for)
)