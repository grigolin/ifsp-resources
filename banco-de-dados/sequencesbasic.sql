create table departamento(
	iddep integer,
	nomedep varchar,
	constraint pkdep primary key (iddep)
);

create table funcionario(
	idfunc integer, cpf varchar, nome varchar, cidade varchar, salario real, iddep integer,
	constraint pkfunc primary key (idfunc),
	constraint fkfuncdep foreign key (iddep) references departamento
);

create sequence sid_departamento;
create sequence sid_funcionario;

insert into departamento values (nextval('sid_departamento'), 'RH');

select * from departamento

select currval('sid_departamento')
select nextval('sid_departamento')

alter sequence sid_departamento increment by 2;
alter sequence sid_departamento minvalue 0 maxvalue 12 restart 0;
select currval('sid_departamento')

