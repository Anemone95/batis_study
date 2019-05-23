create table student(
    sid INT(10) AUTO_INCREMENT PRIMARY KEY,
    sname VARCHAR(10) NOT NULL,
    major VARCHAR(32) NOT NULL,
    birth DATETIME,
    score FLOAT
);