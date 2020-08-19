# c:\xampp\mysql\bin\mysql -uedunova -pedunova < c:\jp22\hello\knjiznicaAPP.sql

drop database if exists knjiznicaAPP;
create database knjiznicaAPP;
use knjiznicaAPP;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    broj_tel varchar(50),
    oib char(11)
);

create table posudba_knjige(
    sifra int not null primary key auto_increment,
    datum_posudbe datetime,
    datum_povratka datetime,
    osoba int not null
);

create table posudba(
    sifra int not null primary key auto_increment,
    knjiga int not null,
    posudba_knjige int not null
);

create table knjiga(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    autor varchar(50),
    godina varchar(10)
);

alter table posudba_knjige add foreign key (osoba) references osoba(sifra);

alter table posudba add foreign key (posudba_knjige) references posudba_knjige(sifra);

alter table posudba add foreign key (knjiga) references knjiga(sifra);

# select * from osoba;

insert into osoba(sifra, ime, prezime, broj_tel,oib)
values
(null, 'Mirko', 'Filipovic', '099113987', '57803036654'),
(null, 'Nenad', 'Bjelica', '098345666', '34583452878'),
(null, 'Zarko', 'Sunce', '0915559786', '88665967743'),
(null, 'Luka', 'Kulenovic', '0956776668', '26363516159');

# select * from knjiga;

insert into knjiga(sifra, naziv, autor, godina)
values
(null, 'Crni Macak', 'Edgar Allan Poe', '1843'),
(null, 'Zov divljine', 'Jack London', '1903'),
(null, 'Bijeli ocnjak', 'Jack London', '1906'),
(null, 'Zeljezna peta', 'Jack London', '1907');

# select * from posudba_knjige;

insert into posudba_knjige(sifra, datum_posudbe, datum_povratka, osoba)
values
(null, '2020-03-02','2020-03-20', 1),
(null, '2020-03-12','2020-03-12', 2),
(null, '2020-05-20',null, 3),
(null, '2020-04-13','2020-04-23', 4);

# select * from posudba;

insert into posudba(sifra, knjiga, posudba_knjige)
values
(null, 1, 2),
(null, 2, 3),
(null, 3, 1),
(null, 4, 3);


