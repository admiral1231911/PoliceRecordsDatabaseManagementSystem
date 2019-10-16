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
-- Table structure for table `crime_history`
--

DROP TABLE IF EXISTS `crime_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crime_history` (
  `caseID` int(11) NOT NULL AUTO_INCREMENT,
  `crimID` int(11) NOT NULL,
  `offense` varchar(45) NOT NULL,
  `offenseDesc` varchar(255) NOT NULL,
  `offenselocation` varchar(45) NOT NULL,
  `offenseDate` date NOT NULL,
  `Sentence` varchar(255) NOT NULL,
  PRIMARY KEY (`caseID`),
  KEY `caseID_idx` (`crimID`),
  CONSTRAINT `crimID` FOREIGN KEY (`crimID`) REFERENCES `criminal_information` (`crimID`)
) ENGINE=InnoDB AUTO_INCREMENT=2030 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crime_history`
--

LOCK TABLES `crime_history` WRITE;
/*!40000 ALTER TABLE `crime_history` DISABLE KEYS */;
INSERT INTO `crime_history` VALUES (2001,1001,'Domestic Violence','Beat a peson for barely helping on their simulation project.','Xavier University','2019-10-04','20 Years Imprisonment'),(2015,1009,'Corruption','asdfaa','sdfasdf','2019-10-16','asdf'),(2016,1009,'Domestic violence','asdfaa','sdfasdf','2019-10-16','asdf'),(2017,1009,'Petty crime','asdfaa','sdfasdf','2019-10-16','asdf'),(2018,1009,'police misconduct','asdfaa','sdfasdf','2019-10-16','asdf'),(2019,1009,'Corruption','asdfaa','sdfasdf','2019-10-16','asdf'),(2020,1009,'Murder','asdfaa','sdfasdf','2019-10-16','asdf'),(2021,1010,'Prostitution','Sold his body for measly 10 php just for Fun, got caught in the act with Joseph Chaves','Cruz Taal','2019-10-10','7 months imprisonment'),(2022,1010,'Domestic violence','Seen beating his brother Francis Cuenca for reasons unknown','Xavier Heights','2019-09-12','1 month Community Service'),(2023,1010,'Organized crime','Sold illegal copy pasted code to IT and Comsci Students though an intricate system of facebook accounts','Tagoloan','2019-08-31','1 Week Rehabilitation'),(2024,1011,'rMti+X4KzYESfXR4WGiF7w==','QDo5VMD9Nlhz+K5/OAok57tIzfmfK3ZbgCBF3B3KqCg=','SbfPqXhlpj9HtGA1JunUjQ==','2019-10-09','v+ZDdJ33M+BePUPDnY4DdA=='),(2025,1012,'MTrd7Kd4e/wjlzBEsn8WZz/MIxyktuBbGJ58Dl/QFwE=','Praaf63m9rPZKfdRx1Q7FQ==','0zQ+vIeSCKX3mgtHQFxAug==','2019-10-08','VcF1M2TgNfT82Gd4iS2sWw=='),(2026,1013,'pNI7iSu+WWo3832JSM7jIw==','j8dWNEgBQO2vNvF6lhF/jkqMuDLNzQSPvd7Q6bjSHbKMhb+4PM3mZ7PV5cQdKGUw','CT0YMd01lWHJTKlmvWCViQ==','2019-10-08','F/kX057liIpT3UliVdlHKVDkt6WND902mcX0y77lIj8='),(2027,1014,'2mx7H8k6izaT4a1PfcyO6w==','oCsSMei9QtfM0plJ/LrA7JPXeVkSht4TCwhK02Ud7uQ=','QvRk3nsmunPe4Po5DXBp4g==','2019-10-10','dNyMOBvqgnY2vnhPFYCr2w=='),(2028,1014,'pNI7iSu+WWo3832JSM7jIw==','oCsSMei9QtfM0plJ/LrA7JPXeVkSht4TCwhK02Ud7uQ=','QvRk3nsmunPe4Po5DXBp4g==','2019-10-10','dNyMOBvqgnY2vnhPFYCr2w=='),(2029,1014,'9box8QcNntwGBf3qWPM9MQ==','oCsSMei9QtfM0plJ/LrA7NmLoKux2zrtovQsF2AbKrE=','QvRk3nsmunPe4Po5DXBp4g==','2019-10-10','dNyMOBvqgnY2vnhPFYCr2w==');
/*!40000 ALTER TABLE `crime_history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-16 10:25:44
