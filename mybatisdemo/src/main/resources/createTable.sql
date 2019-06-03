use test;
create table user(
    id INT(10) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(10) NOT NULL,
    password VARCHAR(32) NOT NULL,
    user_sex INTEGER,
    nick_name VARCHAR(10) NOT NULL
)