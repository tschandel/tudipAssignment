--liquibase formatted sql

--changeset tushar:create_table_candidate
CREATE TABLE IF NOT EXISTS `candidate` (
    `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(500) NOT NULL,
    `phone_number` VARCHAR(500) NOT NULL,
    `maild_id` VARCHAR(500) NOT NULL,
    `address` VARCHAR(500) NOT NULL
);

--changeset tushar:insert_record_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Tusharadri', '9340665685', 'toshubaba.ji@gmail.com', 'Lucknow');

--changeset tushar:insert_record2_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Ashu', '9340668596', 'ash@gmail.com', 'Lucknow');

--changeset tushar:insert_record3_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Rahul', '7050669576', 'rahul@gmail.com', 'Delhi');

--changeset tushar:insert_record4_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Ramesh', '9465857010', 'ramesh@gmail.com', 'Delhi');

--changeset tushar:insert_record5_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Sonam', '8982459425', 'sonam@gmail.com', 'Pune');

--changeset tushar:insert_record6_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Pihu', '7004585961', 'pihu@gmail.com', 'Pune');

--changeset tushar:insert_record7_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Navdeep', '7989652645', 'nav@gmail.com', 'Mumbai');

--changeset tushar:insert_record8_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Suman', '8275964520', 'suman@gmail.com', 'Bangalore');

--changeset tushar:insert_record9_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Ayushmaan', '9634561231', 'ayush@gmail.com', 'Pune');

--changeset tushar:insert_record10_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Ranvir', '6340569645', 'ranvir@gmail.com', 'Delhi');

--changeset tushar:insert_record11_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Subhi', '6545829342', 'shubhi@gmail.com', 'Bangalore');

--changeset tushar:insert_record12_in_candidate
insert into `candidate` (`name`, `phone_number`, `maild_id`, `address`)
VALUES ('Sheetal', '9340668050', 'sheetu@gmail.com', 'Bangalore');
