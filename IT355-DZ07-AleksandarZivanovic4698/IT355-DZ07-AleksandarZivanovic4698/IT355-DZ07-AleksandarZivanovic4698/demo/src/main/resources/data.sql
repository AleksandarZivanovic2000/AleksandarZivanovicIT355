DROP table IF EXISTS jelo;
DROP table IF EXISTS restoran;

CREATE TABLE restoran(

    id      INT          NOT NULL AUTO_INCREMENT,
    naziv   VARCHAR(255) NOT NULL,
    adresa  VARCHAR(255) NOT NULL,
    telefon VARCHAR(20)  NOT NULL,
    ocena   double DEFAULT 0,
    PRIMARY KEY (id)
);

CREATE TABLE jelo(
    id          INT          NOT NULL AUTO_INCREMENT,
    naziv       VARCHAR(255) NOT NULL,
    opis        VARCHAR(255),
    cena        double       NOT NULL,
    restoran_id INT          NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (restoran_id) REFERENCES restoran (id)
);

INSERT INTO restoran (naziv, adresa, telefon, ocena)
VALUES ('Restoran1', 'Test1', '1111', 3.5);

INSERT INTO restoran (naziv, adresa, telefon, ocena)
VALUES ('Restoran2', 'Test2', '2222', 4.5);

INSERT INTO jelo (naziv, opis, cena, restoran_id)
VALUES ('Jelo1', 'OvoJeOpisJela1', 100, 1);

INSERT INTO jelo (naziv, opis, cena, restoran_id)
VALUES ('Jelo2', 'OvoJeOpisJela2', 200, 1);

INSERT INTO jelo (naziv, opis, cena, restoran_id)
VALUES ('Jelo3', 'OvoJeOpisJela3', 200, 2);

INSERT INTO jelo (naziv, opis, cena, restoran_id)
VALUES ('Jelo4', 'OvoJeOpisJela4', 230, 2);

INSERT INTO jelo (naziv, opis, cena, restoran_id)
VALUES ('Jelo5', 'OvoJeOpisJela5', 345, 1);