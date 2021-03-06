-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cnpm
-- ------------------------------------------------------
-- Server version	5.5.62-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city_region` varchar(255) NOT NULL,
  `cc_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (127,'meo','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(128,'hacmao','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(129,'hacmao(admin)','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(132,'admin','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(134,'hacmao(admin)','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(135,'hacmao2(admin)','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(136,'hacmao(admin)','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(137,'hacmao(admin)','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789'),(138,'hacmao(admin)','nguyentuanhieptuki@gmail.com','0967587816','Ha Noi,Viet Nam','Ha Noi','0123456789');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-11 16:14:54
