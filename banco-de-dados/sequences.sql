-- 1
create table maquina(
	idmaquina integer, marca varchar,
	constraint pkmaquina primary key (idmaquina)
);

create table obra(
	idobra integer, descricao varchar,
	constraint pkobra primary key (idobra)
);

create table usa(
	idusa integer, datauso date, idobra integer, idmaq integer,
	constraint pkusa primary key (idusa),
	constraint fkmaq foreign key (idmaq) references maquina,
	constraint fkobra foreign key (idobra) references obra
);
-- 2
create sequence sid_obra start with 1;
create sequence sid_maquina start with 100;
create sequence sid_usa start with 1000;
-- 3
insert into obra values(nextval('sid_obra'), 'obra 1')
insert into obra values(nextval('sid_obra'), 'obra 2')

insert into maquina values(nextval('sid_maquina'), 'maq 1')
insert into maquina values(nextval('sid_maquina'), 'maq 2')


-- 4
INSERT INTO usa VALUES (nextval('sid_usa'),
                        CURRENT_DATE,
                        (SELECT idobra FROM obra WHERE descricao = 'Obra 1'),
                        (SELECT idmaquina FROM maquina WHERE marca = 'Maq 1'));

INSERT INTO usa VALUES (nextval('sid_usa'),
                        CURRENT_DATE,
                        (SELECT idobra FROM obra WHERE descricao = 'Obra 1'),
                        (SELECT idmaquina FROM maquina WHERE marca = 'Maq 2'));

INSERT INTO usa VALUES (nextval('sid_usa'),
                        CURRENT_DATE,
                        (SELECT idobra FROM obra WHERE descricao = 'Obra 2'),
                        (SELECT idmaquina FROM maquina WHERE marca = 'Maq 1'));

INSERT INTO usa VALUES (nextval('sid_usa'),
                        CURRENT_DATE,
                        (SELECT idobra FROM obra WHERE descricao = 'Obra 2'),
                        (SELECT idmaquina FROM maquina WHERE marca = 'Maq 2'));

-- 5
SELECT o.descricao, m.marca
FROM obra o
JOIN usa u ON o.idobra = u.idobra
JOIN maquina m ON u.idmaq = m.idmaquina;

-- 6
ALTER SEQUENCE sid_obra INCREMENT BY 2;

-- 7
INSERT INTO obra VALUES (nextval('sid_obra'), 'Obra 3');
INSERT INTO obra VALUES (nextval('sid_obra'), 'Obra 4');

-- 8
ALTER SEQUENCE sid_maquina INCREMENT BY -3;

-- 9
INSERT INTO maquina VALUES (nextval('sid_maquina'), 'Maq 3');
INSERT INTO maquina VALUES (nextval('sid_maquina'), 'Maq 4');
