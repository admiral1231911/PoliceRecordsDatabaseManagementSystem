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
-- Table structure for table `crime_fir`
--

DROP TABLE IF EXISTS `crime_fir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crime_fir` (
  `fir_ID` int(11) NOT NULL AUTO_INCREMENT,
  `case_ID` int(11) NOT NULL,
  `fir_type` varchar(45) NOT NULL,
  `fir_desc` varchar(255) DEFAULT NULL,
  `fir_reporter` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`fir_ID`),
  UNIQUE KEY `case_ID_UNIQUE` (`case_ID`),
  KEY `caseID_idx` (`case_ID`),
  CONSTRAINT `case_ID` FOREIGN KEY (`case_ID`) REFERENCES `crime_history` (`caseID`)
) ENGINE=InnoDB AUTO_INCREMENT=3010 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crime_fir`
--

LOCK TABLES `crime_fir` WRITE;
/*!40000 ALTER TABLE `crime_fir` DISABLE KEYS */;
INSERT INTO `crime_fir` VALUES (3001,2001,'Resulted in Injury','Roger Ibacarra was seen beating someone almost to death luckily the Greatest of All Time, Benz saved the day :D','Tan, Benz Walter Jacques'),(3003,2021,'Near Miss','The suspect was seen with Joseph Chaves at the back alley of Cruz Taal, Caught in the act, they tried to flee but PO1 Rogelio was able to back me up and caught them.','Tan, Benz Walter Jacques'),(3004,2022,'Resulted in Injury','The Suspect was reported by neighbors because he was beating his brother Francis Cuenca, Was immidiately apprehended.','Ibacarra, Rogelio'),(3005,2023,'Near Miss','With a team of cyber Investigators, We were able to track down the source of illegal copy pasted code that ran fluent in the Area. A buy-bust operation sooner caught the suspect.','Tan, Benz Walter'),(3006,2026,'soBOJEyQ3s8f03awB4yH0TW05WMhKjPWU1vramiOHbs=','BdSw5bkXpvgVFhOJqLdq36ch97pSPaCwkU5+OiooKcVVPbFtnl6/CfgylkMXf1Sr','phS9yQIookbV7XSmzRBPbA=='),(3007,2027,'B0bxXDZ0YTmirCBIztkQfg==','+lDvF6KCvNVQ/eyfQGV7Qg==','B4JyjVcKpHUzBh/ARVmTeQ=='),(3008,2028,'B0bxXDZ0YTmirCBIztkQfg==','+lDvF6KCvNVQ/eyfQGV7Qg==','B4JyjVcKpHUzBh/ARVmTeQ=='),(3009,2029,'B0bxXDZ0YTmirCBIztkQfg==','+lDvF6KCvNVQ/eyfQGV7Qg==','B4JyjVcKpHUzBh/ARVmTeQ==');
/*!40000 ALTER TABLE `crime_fir` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-16 10:25:46
