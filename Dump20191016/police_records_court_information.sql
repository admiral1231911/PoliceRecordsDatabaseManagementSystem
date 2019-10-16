-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: police_records
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `court_information`
--

DROP TABLE IF EXISTS `court_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `court_information` (
  `courtID` int(11) NOT NULL AUTO_INCREMENT,
  `caseID` int(11) NOT NULL,
  `courtName` varchar(45) NOT NULL,
  `courtType` varchar(45) NOT NULL,
  `courtDesc` varchar(255) NOT NULL,
  `courtLocation` varchar(45) NOT NULL,
  PRIMARY KEY (`courtID`),
  UNIQUE KEY `caseID_UNIQUE` (`caseID`),
  KEY `caseID_idx` (`caseID`),
  CONSTRAINT `caseID` FOREIGN KEY (`caseID`) REFERENCES `crime_history` (`caseID`)
) ENGINE=InnoDB AUTO_INCREMENT=4009 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `court_information`
--

LOCK TABLES `court_information` WRITE;
/*!40000 ALTER TABLE `court_information` DISABLE KEYS */;
INSERT INTO `court_information` VALUES (4001,2001,'Cagayan de Oro Court of Justice','Supreme Court','built in 1965, is the primary court of the City of Cagayan de Oro.','Julio Pacana Street, Cagayan de Oro'),(4002,2021,'Cagayan de Oro Court','Court of Appeals','None','Julio Pacana'),(4003,2022,'Cagayan de Oro Court','Court of Appeals','None','Julio Pacana'),(4004,2023,'Cagayan de Oro Court','Court of Appeals','None','Julio Pacana'),(4005,2026,'0h0evy4SQf6Ye/arsUaurA==','TaoN6Ll8GpgFMfbMII2uvQ==','FTUA8CApeTj818vAFOTt+MBwOuf4UHh4a/X4+lR57lpkubf9DLAPY0lS1lYO7BTc','ijkNLrd5eBfA4DrzhmVaNsvGAtPztZuYv44Mmj43FT4='),(4006,2027,'9spokBNVogEMS14VfGKROw==','TaoN6Ll8GpgFMfbMII2uvQ==','Tb/TxtMGdB0qv02iiiTm3A==','IJpQkz/qznqlPlMdetJRhw=='),(4007,2028,'9spokBNVogEMS14VfGKROw==','TaoN6Ll8GpgFMfbMII2uvQ==','Tb/TxtMGdB0qv02iiiTm3A==','IJpQkz/qznqlPlMdetJRhw=='),(4008,2029,'9spokBNVogEMS14VfGKROw==','TaoN6Ll8GpgFMfbMII2uvQ==','ovkzYw4H0tHozHcO+Ar5XQ==','IJpQkz/qznqlPlMdetJRhw==');
/*!40000 ALTER TABLE `court_information` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-16 10:25:45
