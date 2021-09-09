
CREATE SCHEMA IF NOT EXISTS myassignment ;
USE myassignment ;


CREATE TABLE IF NOT EXISTS myassignment.trainers (
  ID INT NOT NULL AUTO_INCREMENT,
  firstname VARCHAR(45) NULL DEFAULT NULL,
  lastname VARCHAR(45) NULL DEFAULT NULL,
  subject VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (ID),
  UNIQUE INDEX ID_UNIQUE (ID ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 0;


INSERT INTO trainers (firstname,lastname,subject) value
					 ("Spyros","Mauros","Srping"),
                     ("George","Pasparakis","Academic"),
                     ("Anastasios","Lelakis","OPP"),
                     ("George","Rigopoulos","MySql"),
                     ("Rafaila","Galanopoulou","JQuery");



