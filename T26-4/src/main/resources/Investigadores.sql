create database if not exists Investigadores;
use Investigadores;

create table if not exists facultad (
	codigo int,
    nombre nvarchar(100),
    primary key(codigo)
);

create table if not exists investigadores (
	DNI varchar(8),
    nomapel nvarchar(255),
    facultad int,
    primary Key(DNI),
    foreign key(facultad) references facultad(codigo)
);

create table if not exists equipos (
	numserie char(4),
    nombre nvarchar(100),
    facultad int,
    primary key (numserie),
    foreign key (facultad) references facultad(codigo)
);

create table if not exists reserva (
	DNI varchar(8),
    numserie char(4),
    comienzo datetime,
    fin datetime,
    foreign key (DNI) references investigadores(DNI),
    foreign key (numserie) references equipos(numserie),
    unique(DNI, numserie)
);

insert into facultad values (1, 'Informatica');
insert into investigadores values ('12345678', 'pepe', 1);
insert into equipos values ('0000', 'EquipoAlpha', 1);
insert into reserva values ('12345678', '0000', '1998-06-04 00:00:00', '2021-02-25 00:00:00');