DROP TABLE IF EXISTS voice_range;
DROP SEQUENCE IF EXISTS voice_range_id;

CREATE SEQUENCE voice_range_id;

CREATE TABLE voice_range
(
	voice_range_id INTEGER PRIMARY KEY DEFAULT NEXTVAL('voice_range_id'),
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
    voice_range VARCHAR(200) NOT NULL
);

INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('John', 'Johnson', 'Bass');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Ham', 'Sandwich', 'Baritone');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Bilbo', 'Baggins', 'Tenor');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Andrew', 'Johnson', 'Soprano');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Jimmy', 'Crackcorn', 'Castrati');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Ivanna', 'Humpalot', 'Soprano');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Richard', 'Hertz', 'Alto');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Gottfried', 'Leibniz', 'Alto');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Hugh', 'Jaynus', 'Baritone');
INSERT INTO voice_range(first_name, last_name, voice_range) VALUES ('Bill', 'Dabearworkshop', 'Tenor');




