CREATE IF NOT EXISTS  DATABASE javadb;

-- CREATE SCHEMA IF NOT EXISTS javadb;

CREATE TABLE IF NOT EXISTS kisi
(
    id bigint NOT NULL,
    adi character varying(100) COLLATE pg_catalog."default",
    soyadi character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT kisi_pkey PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS kisi_adres
(
    id bigint NOT NULL,
    adres character varying(500) COLLATE pg_catalog."default",
    adres_tip integer,
    aktif boolean,
    kisi_adres_id bigint,
    CONSTRAINT kisi_adres_pkey PRIMARY KEY (id),
    CONSTRAINT fk4e2h40fdn2b8tdaxytnyadrig FOREIGN KEY (kisi_adres_id)
    REFERENCES kisi (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    );

INSERT INTO kisi (id, adi, soyadi) VALUES (1, 'Taner', 'Test');
INSERT INTO kisi (id, adi, soyadi) VALUES (2, 'Muaz', 'Test2');
INSERT INTO kisi (id, adi, soyadi) VALUES (3, 'Sadık', 'Test3');

INSERT INTO kisi_adres (id, adres, adres_tip, aktif, kisi_adres_id) VALUES (1, 'Test Adres 1', 2, true, 1);
INSERT INTO kisi_adres (id, adres, adres_tip, aktif, kisi_adres_id) VALUES (2, 'Test Adres 2', 2, true, 1);
INSERT INTO kisi_adres (id, adres, adres_tip, aktif, kisi_adres_id) VALUES (3, 'Test Adres 1', 2, true, 2);
INSERT INTO kisi_adres (id, adres, adres_tip, aktif, kisi_adres_id) VALUES (4, 'Test Adres 2', 2, true, 2);
INSERT INTO kisi_adres (id, adres, adres_tip, aktif, kisi_adres_id) VALUES (5, 'Test Adres 1', 2, true, 3);