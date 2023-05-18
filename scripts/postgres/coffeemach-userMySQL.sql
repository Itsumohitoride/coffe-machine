CREATE USER 'cofmachkalls'@'%' IDENTIFIED BY 'pwd';
CREATE DATABASE coffeemachine;
GRANT ALL PRIVILEGES ON coffeemachine.* TO 'cofmachkalls'@'%';
