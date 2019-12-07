/*
SQLyog Community v13.1.5  (32 bit)
MySQL - 10.4.6-MariaDB : Database - projekatprojektovanjesoftvera
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projekatprojektovanjesoftvera` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `projekatprojektovanjesoftvera`;

/*Table structure for table `bend` */

DROP TABLE IF EXISTS `bend`;

CREATE TABLE `bend` (
  `idIzvodjac` bigint(20) NOT NULL,
  `nazivBenda` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idIzvodjac`),
  CONSTRAINT `bend_ibfk_1` FOREIGN KEY (`idIzvodjac`) REFERENCES `izvodjac` (`idIzvodjac`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bend` */

insert  into `bend`(`idIzvodjac`,`nazivBenda`) values 
(3,'Vukovi');

/*Table structure for table `clanbend` */

DROP TABLE IF EXISTS `clanbend`;

CREATE TABLE `clanbend` (
  `idOsobaIzvodjac` bigint(20) NOT NULL,
  `idBend` bigint(20) NOT NULL,
  PRIMARY KEY (`idOsobaIzvodjac`,`idBend`),
  KEY `idBend` (`idBend`),
  CONSTRAINT `clanbend_ibfk_1` FOREIGN KEY (`idOsobaIzvodjac`) REFERENCES `osobaizvodjac` (`idIzvodjac`),
  CONSTRAINT `clanbend_ibfk_2` FOREIGN KEY (`idBend`) REFERENCES `bend` (`idIzvodjac`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clanbend` */

insert  into `clanbend`(`idOsobaIzvodjac`,`idBend`) values 
(1,3),
(2,3);

/*Table structure for table `izvodjac` */

DROP TABLE IF EXISTS `izvodjac`;

CREATE TABLE `izvodjac` (
  `idIzvodjac` bigint(20) NOT NULL,
  `email` char(100) DEFAULT NULL,
  `telefon` char(100) DEFAULT NULL,
  PRIMARY KEY (`idIzvodjac`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `izvodjac` */

insert  into `izvodjac`(`idIzvodjac`,`email`,`telefon`) values 
(1,'mejl1@gmail.com','064123123'),
(2,'mejl2@gmail.com','066123123'),
(3,'mejl3@gmail.com','067444444');

/*Table structure for table `izvodjacvrste` */

DROP TABLE IF EXISTS `izvodjacvrste`;

CREATE TABLE `izvodjacvrste` (
  `idIzvodjac` bigint(20) DEFAULT NULL,
  `idVrste` bigint(20) DEFAULT NULL,
  KEY `idIzvodjac` (`idIzvodjac`),
  KEY `idVrste` (`idVrste`),
  CONSTRAINT `izvodjacvrste_ibfk_1` FOREIGN KEY (`idIzvodjac`) REFERENCES `osobaizvodjac` (`idIzvodjac`),
  CONSTRAINT `izvodjacvrste_ibfk_2` FOREIGN KEY (`idVrste`) REFERENCES `vrstaizvodjaca` (`vrstaID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `izvodjacvrste` */

insert  into `izvodjacvrste`(`idIzvodjac`,`idVrste`) values 
(1,1),
(1,4),
(2,2);

/*Table structure for table `lokacija` */

DROP TABLE IF EXISTS `lokacija`;

CREATE TABLE `lokacija` (
  `idLokacija` bigint(20) NOT NULL,
  `imeLokacije` varchar(100) DEFAULT NULL,
  `adresa` varchar(100) DEFAULT NULL,
  `vlasnik` varchar(100) DEFAULT NULL,
  `telefon` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idLokacija`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `lokacija` */

insert  into `lokacija`(`idLokacija`,`imeLokacije`,`adresa`,`vlasnik`,`telefon`,`email`) values 
(1,'L','J','M','0','l');

/*Table structure for table `menadzer` */

DROP TABLE IF EXISTS `menadzer`;

CREATE TABLE `menadzer` (
  `idMenadzer` bigint(20) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `imeMenadzera` varchar(100) DEFAULT NULL,
  `prezimeMenadzera` varchar(100) DEFAULT NULL,
  `telefon` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `pol` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idMenadzer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `menadzer` */

insert  into `menadzer`(`idMenadzer`,`username`,`password`,`imeMenadzera`,`prezimeMenadzera`,`telefon`,`email`,`pol`) values 
(1,'aleksa','aleksa','Aleksa','Ivanovic','0645747553','aleksaivanovic24444@gmail.com','MALE'),
(2,'pera','pera','Pera','Peric','032323233','peraperic@gmail.com','MALE'),
(3,'ana','ana','Ana','Ana','066123123','anaana@gmail.com','MALE');

/*Table structure for table `nastup` */

DROP TABLE IF EXISTS `nastup`;

CREATE TABLE `nastup` (
  `idNastupa` bigint(20) NOT NULL,
  `nazivNastupa` varchar(100) DEFAULT NULL,
  `opis` varchar(100) DEFAULT NULL,
  `idLokacija` bigint(20) DEFAULT NULL,
  `idMenadzer` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idNastupa`),
  KEY `idLokacija` (`idLokacija`),
  KEY `idMenadzer` (`idMenadzer`),
  CONSTRAINT `nastup_ibfk_1` FOREIGN KEY (`idLokacija`) REFERENCES `lokacija` (`idLokacija`),
  CONSTRAINT `nastup_ibfk_2` FOREIGN KEY (`idMenadzer`) REFERENCES `menadzer` (`idMenadzer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nastup` */

insert  into `nastup`(`idNastupa`,`nazivNastupa`,`opis`,`idLokacija`,`idMenadzer`) values 
(1,'Zivarica','zivarica i bend',1,1);

/*Table structure for table `osobaizvodjac` */

DROP TABLE IF EXISTS `osobaizvodjac`;

CREATE TABLE `osobaizvodjac` (
  `idIzvodjac` bigint(20) NOT NULL,
  `ime` varchar(100) DEFAULT NULL,
  `prezime` varchar(100) DEFAULT NULL,
  `pol` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idIzvodjac`),
  CONSTRAINT `osobaizvodjac_ibfk_2` FOREIGN KEY (`idIzvodjac`) REFERENCES `izvodjac` (`idIzvodjac`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `osobaizvodjac` */

insert  into `osobaizvodjac`(`idIzvodjac`,`ime`,`prezime`,`pol`) values 
(1,'Mile','Milic','MALE'),
(2,'Maki','Makic','FEMALE');

/*Table structure for table `stavkanastupa` */

DROP TABLE IF EXISTS `stavkanastupa`;

CREATE TABLE `stavkanastupa` (
  `idNastup` bigint(20) NOT NULL,
  `idStavkaNastupa` bigint(20) NOT NULL,
  `vreme` date DEFAULT NULL,
  `trajanje` bigint(20) DEFAULT NULL,
  `idIzvodjac` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idNastup`,`idStavkaNastupa`),
  KEY `idIzvodjac` (`idIzvodjac`),
  CONSTRAINT `stavkanastupa_ibfk_1` FOREIGN KEY (`idNastup`) REFERENCES `nastup` (`idNastupa`) ON DELETE NO ACTION,
  CONSTRAINT `stavkanastupa_ibfk_2` FOREIGN KEY (`idIzvodjac`) REFERENCES `izvodjac` (`idIzvodjac`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stavkanastupa` */

insert  into `stavkanastupa`(`idNastup`,`idStavkaNastupa`,`vreme`,`trajanje`,`idIzvodjac`) values 
(1,1,'2020-01-01',20,1),
(1,2,'2020-02-05',20,2),
(1,3,'2020-01-01',20,3);

/*Table structure for table `vrstaizvodjaca` */

DROP TABLE IF EXISTS `vrstaizvodjaca`;

CREATE TABLE `vrstaizvodjaca` (
  `vrstaID` bigint(20) NOT NULL,
  `nazivVrste` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`vrstaID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vrstaizvodjaca` */

insert  into `vrstaizvodjaca`(`vrstaID`,`nazivVrste`) values 
(1,'Pevac'),
(2,'Gitarista'),
(4,'Basista'),
(5,'Klavijaturista');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
