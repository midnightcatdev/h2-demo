create table book(
    id int auto_increment,
    title varchar(255) NOT NULL,
    pages int NOT NULL,
    author varchar(255) NOT NULL
);
--
-- -- To insert data using sql, you can also run sql queries in database
insert into book(title, pages, author) values ( 'Title of book of Flame', 328, 'Charihhhhzarddd' )