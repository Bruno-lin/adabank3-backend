CREATE TABLE customers
(
    id         int (11) NOT NULL AUTO_INCREMENT,
    cardNumber varchar(100) DEFAULT NULL,
    username   varchar(100) DEFAULT NULL,
    balance    double (2, 1) DEFAULT NULL,
    companyName       varchar(100) DEFAULT NULL,
    companyAddress    varchar(100) DEFAULT NULL,
    companyCreditCode varchar(100) DEFAULT NULL,
    legalRepName      varchar(100) DEFAULT NULL,
    legalRepId        varchar(100) DEFAULT NULL,
    legalRepAddr      varchar(100) DEFAULT NULL,
    legalRepTel       varchar(100) DEFAULT NULL,
    createdAt         varchar(100) DEFAULT NULL,
    updatedAt         varchar(100) DEFAULT NULL,
    business          varchar(100) DEFAULT NULL,
    deleted           INTEGER NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
);

insert into customers (cardNumber, username)
values (123, 'Axel');
insert into customers (cardNumber, username)
values (456, 'Mr. Foo');
insert into customers (cardNumber, username)
values (789, 'Ms. Bar');