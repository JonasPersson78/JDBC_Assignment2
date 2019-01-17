# JDBC_Assignment2
CREATE TABLE `sqlandjava`.`cars` (
`car_id` INT NOT NULL,
`brand` VARCHAR(45) NOT NULL,
`color` VARCHAR(45) NOT NULL,
PRIMARY KEY (`car_id`));
INSERT INTO `sqlandjava`.`cars` (`car_id`, `brand`, `color`) VALUES (1, 'Volvo' , 'Black');
INSERT INTO `sqlandjava`.`cars` (`car_id`, `brand`, `color`) VALUES (2, 'Saab', 'Blue');
INSERT INTO `sqlandjava`.`cars` (`car_id`, `brand`, `color`) VALUES (3, 'Audi' , 'Red');
INSERT INTO `sqlandjava`.`cars` (`car_id`, `brand`, `color`) VALUES (4, 'Ford', 'Green');

GRANT SELECT ON sqlandjava.cars TO user@localhost;
