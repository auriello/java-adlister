USE adlister_db;


DROP TABLE IF EXISTS users;
    -- Creating the users table
CREATE TABLE IF NOT EXISTS users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       username VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL
);

-- Creating the ads table
DROP TABLE IF EXISTS ads;
CREATE TABLE IF NOT EXISTS ads (
                     id INT PRIMARY KEY AUTO_INCREMENT,
                     user_id INT NOT NULL,
                     title VARCHAR(255) NOT NULL,
                     description VARCHAR(255) NOT NULL,
                     FOREIGN KEY (user_id) REFERENCES users(id)
);
