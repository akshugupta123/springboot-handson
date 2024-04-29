CREATE SCHEMA db; 

 

USE db; 

 

CREATE TABLE book ( 

id INT NOT NULL AUTO_INCREMENT, 

bookTitle VARCHAR(255), 

bookPublisher VARCHAR(255), 

bookIsbn INT,

bookNumberOfPages INT,

bookYear INT


); 

 