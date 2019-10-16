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
-- Table structure for table `crime_type`
--

DROP TABLE IF EXISTS `crime_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crime_type` (
  `CT_ID` char(11) NOT NULL,
  `CT_Name` varchar(20) NOT NULL,
  `CT_Description` mediumtext NOT NULL,
  PRIMARY KEY (`CT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crime_type`
--

LOCK TABLES `crime_type` WRITE;
/*!40000 ALTER TABLE `crime_type` DISABLE KEYS */;
INSERT INTO `crime_type` VALUES ('9011','Murder','is the unlawful killing  of another human with  out justification or valid excuse, especially the unlawful killing of another human with malice aforethought'),('9012','Organized crime','Organized Groups that operate though illegal narcotics and loan sharking to robbery, kidnapping, and murder-for-hire.'),('9013','Illegal drug trade','The illegal drug trade or drug trafficking is a global black market dedicated to the cultivation, manufacture, distribution and sale of drugs that are subject to drug prohibition laws.'),('9014','Petty crime','An example of pickpocketing, takes place usually in locations with many people, ranging  which includes pick-pocketing, is a problem in the Philippines. It takes place usually in locations with many people.'),('9015','Rape','is considered a criminal offense. In Philippine jurisprudence, it is a heinous crime punishable by life imprisonment.  Rape of males is also legally recognized as rape by sexual assault.'),('9016','Domestic violence','is the unlawful killing of another human with out justification or valid excuse, especially the unlawful killing of another human with malice aforethought'),('9017','Human trafficking','Human trafficking and the prostitution of children is a significant issue in the Philippines, often controlled by organized crime syndicates.[5] Human trafficking in the country is a crime against humanity'),('9018','Prostitution',' It is a serious crime with penalties ranging up to life imprisonment for those involved in trafficking. It is covered by the Anti-Trafficking in Persons Act.'),('9019','Corruption','Corruption is a great problem in the Philippines. In May 2013, during the country\'s elections, some 504 political candidates were accused mostly of corruption and some of violent crimes.'),('9020','police misconduct',' prompting the Philippine National Police to investigate the matter.');
/*!40000 ALTER TABLE `crime_type` ENABLE KEYS */;
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
