-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: localhost    Database: huntercodexs
-- ------------------------------------------------------
-- Server version	8.0.29-0ubuntu0.20.04.3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Oauth2ClientEntity`
--

DROP TABLE IF EXISTS `Oauth2ClientEntity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Oauth2ClientEntity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `accessTokenValiditySeconds` int DEFAULT NULL,
  `client` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `refreshTokenValiditySeconds` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Oauth2ClientEntity`
--

LOCK TABLES `Oauth2ClientEntity` WRITE;
/*!40000 ALTER TABLE `Oauth2ClientEntity` DISABLE KEYS */;
INSERT INTO `Oauth2ClientEntity` VALUES (1,3600,'client_id','Y2JmY2M3NGItMDdjZC00YWJiLTkwNmItYWJkZGQ4ZmExYmVj',7200);
/*!40000 ALTER TABLE `Oauth2ClientEntity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OperatorEntity`
--

DROP TABLE IF EXISTS `OperatorEntity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `OperatorEntity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `role` int DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OperatorEntity`
--

LOCK TABLES `OperatorEntity` WRITE;
/*!40000 ALTER TABLE `OperatorEntity` DISABLE KEYS */;
INSERT INTO `OperatorEntity` VALUES (1,'1234567890',1,'OAUTH2DEMO_ADMIN'),(2,'1234567890',2,'OAUTH2DEMO_USER');
/*!40000 ALTER TABLE `OperatorEntity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RoleEntity`
--

DROP TABLE IF EXISTS `RoleEntity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `RoleEntity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RoleEntity`
--

LOCK TABLES `RoleEntity` WRITE;
/*!40000 ALTER TABLE `RoleEntity` DISABLE KEYS */;
INSERT INTO `RoleEntity` VALUES (1,'Admin Role','ROLE_ADMIN'),(2,'User Role','ROLE_USER'),(3,'Operator Role','ROLE_OPERATOR'),(4,'Tester Role','ROLE_TESTER'),(5,'Sys Role','ROLE_SYS'),(6,'Moderator Role','ROLE_MODERATOR'),(7,'Client Role','ROLE_CLIENT');
/*!40000 ALTER TABLE `RoleEntity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-05 16:47:15
