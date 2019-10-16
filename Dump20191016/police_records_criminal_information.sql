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
-- Table structure for table `criminal_information`
--

DROP TABLE IF EXISTS `criminal_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criminal_information` (
  `crimID` int(11) NOT NULL AUTO_INCREMENT,
  `familyname` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `middlename` varchar(45) NOT NULL,
  `nickname` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `civilstatus` varchar(45) NOT NULL,
  `birthdate` date NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `province` varchar(45) NOT NULL,
  `homeaddress` varchar(45) NOT NULL,
  `workaddress` varchar(45) DEFAULT NULL,
  `emailaddress` varchar(45) DEFAULT NULL,
  `phonenum` varchar(45) DEFAULT NULL,
  `mobilenum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`crimID`)
) ENGINE=InnoDB AUTO_INCREMENT=1015 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criminal_information`
--

LOCK TABLES `criminal_information` WRITE;
/*!40000 ALTER TABLE `criminal_information` DISABLE KEYS */;
INSERT INTO `criminal_information` VALUES (1001,'Ibacarra','Rogelio','Rosel','Nigerian Prince','Male','Divorced','2000-02-26','Cagayan de Oro','Misamis Oriental','Capistrano','Xavier University','princeofbelair@yahoo.com','000 666 999','000 666 999'),(1009,'asdf','sdfa','asdf','asfd','Male','Single','2019-10-18','sdfasd','asdf','asdf','asdf','asdf','asdf','asdf'),(1010,'Dela Cruz','Francis James','Idunno','TheGayMan','Male','Single','1997-12-18','Tagoloan','Misamis Oriental','gayland','LGBTQ+ Headquarters,','GayJames@yahoo.com','111 111 111','111 111 111'),(1011,'tmajNMPqlbsfk1n6HxnO4g==','N6E/F5+SjlBjpxi5uHsJTg==','QlmLDCDHSn7PCMQiGt24kg==','5HREKLMrtscWETnGt9YIpA==','Male','Married','2019-10-10','fHqe99HKNyWq9zRD9BSBzA==','RLF0TPJ5ajAKVSWqRdY9Eg==','5Y5j4MchNPweTZmU0V74Lg==','Ny4vjfxC6V/WZFA9/gvxDPdhpky8zHvd+9bDMMJw7Oo=','a6HhNvcofpYGxrPsD+7YaA==','hAUsJsUs25cOhB7a7XHdCQ==','4NMbccQ+QvmjPOOIup/Org=='),(1012,'1rosH9PnUiwLtMaOitrYbg==','1rosH9PnUiwLtMaOitrYbg==','0zQ+vIeSCKX3mgtHQFxAug==','0zQ+vIeSCKX3mgtHQFxAug==','Male','Single','2019-10-16','xau4f7tTRJsyr9NWr4kCUg==','0zQ+vIeSCKX3mgtHQFxAug==','N+MACBbRm1P529hbI/GV7g==','0zQ+vIeSCKX3mgtHQFxAug==','0zQ+vIeSCKX3mgtHQFxAug==','1rosH9PnUiwLtMaOitrYbg==','0zQ+vIeSCKX3mgtHQFxAug=='),(1013,'ZUG7VAYA943lrBNMSR/W9A==','01/aAJgtZ2doDSnDWMk9Fw==','GXjCRUS6h+QrSOoHcbSGqA==','XvQqmb+DlHKMS2EXgPr6liSqufAckKnVFsl+NOEMI/k=','GbLIgJYyiZ6S6dXfgVxq0g==','aqDHTtLtVkRQdYDbOHlSgA==','2019-10-23','z9yJIJihx9vxfcslCaAqyw==','sInj0AXjqXQhYAXKjkD2rWfpa44uRb1kAHaSOKdEbcs=','sXeN9NNOwA5Y+5M37S+sJA==','jpimUxA7AzpRlfO/Vow5IWubf0Swt0x4SGFsF7Kn54U=','NOmyo2FyXMRZ2KnALYSmijeyXQt2ku32pBtsPFFoiOM=','i+9uui07ObmhRz7wpDMiu2S5t/0MsA9jSVLWVg7sFNw=','i+9uui07ObmhRz7wpDMiu2S5t/0MsA9jSVLWVg7sFNw='),(1014,'LQzVDy1myj99mIsWoxr8vQ==','Wkr0/AZLpYzhh/jfLKoU7A==','mhXzzQ4/3cD5KdW8/BNF0A==','Dh7di6oM5D147q12Y7Sk0Q==','Male','Single','2019-10-10','Yn0IpfYVtfieGyPhWKovzg==','sInj0AXjqXQhYAXKjkD2rWS5t/0MsA9jSVLWVg7sFNw=','A8TSdmsMe6D9tJp0rBsgLw==','82rCDcUywT//rwSa14B0Qvdhpky8zHvd+9bDMMJw7Oo=','B4fDHo3acEhCybiscEt3+/LrOAMx1HPaTqJDun5wMy4=','4iYZ7Ac/DMQAoPgv9EXhpw==','McvtdWRQ8dGbvF5rUZZlaQ==');
/*!40000 ALTER TABLE `criminal_information` ENABLE KEYS */;
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
