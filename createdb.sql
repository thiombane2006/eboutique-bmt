CREATE DATABASE eboutique;

CREATE USER 'eboutique'@'localhost' IDENTIFIED BY 'eboutique';

GRANT ALL PRIVILEGES ON eboutique.* TO 'eboutique'@'localhost';

FLUSH PRIVILEGES;
