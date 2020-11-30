use test;
create table users(
    id INT(10) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(10) NOT NULL,
    password VARCHAR(32) NOT NULL,
    user_sex VARCHAR(32),
    nick_name VARCHAR(10) NOT NULL
)
