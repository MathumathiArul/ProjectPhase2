-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('A001','Admin123'),('A002','Admin223');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES ('C01','1A'),('C02','1B'),('C03','2A'),('C04','2B'),('C05','3A'),('C06','3B'),('C07','4A'),('C08','4B');
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `class_subjects`
--

LOCK TABLES `class_subjects` WRITE;
/*!40000 ALTER TABLE `class_subjects` DISABLE KEYS */;
INSERT INTO `class_subjects` VALUES ('1A','DBMS','Revathy'),('1A','DMBS Lab','Revathy'),('1B','DBMS','Mathu'),('1B','DMBS Lab','Mathu'),('1A','Mathematics','Vasu'),('1B','Mathematics','Renuka'),('2A','PDS','Sandhya'),('2A','English','Vani'),('2B','PDS','Vinay'),('3A','Ethics','Sandhya'),('3A','CNS','Janani'),('3B','Ethics','Revathy'),('3B','CNS','Janani'),('4A','Data Analytics','Vinay'),('4A','EG','Vasu'),('4B','Data Analytics','Sandhya'),('4B','EG','Vasu');
/*!40000 ALTER TABLE `class_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1','Jai','F','1A'),('10','Ravi','M','1A'),('11','Kai','M','1A'),('12','Karthi','M','1B'),('13','Chandra','F','1B'),('14','Meena','F','1B'),('15','Nivetha','F','2A'),('16','James','M','2A'),('17','Keerthi','F','2B'),('18','Megan','F','2B'),('19','Lalith','M','3A'),('2','Arul','M','3A'),('20','Girish','M','3B'),('21','Kavi','F','3B'),('22','Laliltha','F','4A'),('3','Shannu','F','4A'),('4','Naren','M','4B'),('5','Nancy','F','4B'),('6','Sarika','F','2A'),('7','Neha','F','2B'),('8','Ram','M','4A'),('9','Aarthi','F','4B');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
INSERT INTO `subjects` VALUES ('S10','CNS'),('S03','Data Analytics'),('S02','DBMS'),('S05','DMBS Lab'),('S08','EG'),('S09','English'),('S06','Ethics'),('S01','Mathematics'),('S07','PDS'),('S04','Web Programming');
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('T1','Latha','2','F'),('T2','Revathy','5','F'),('T3','Mathu','1','F'),('T4','Vasu','10','M'),('T5','Vinay','9','M'),('T6','Vani','12','F'),('T7','Sandhya','2','F'),('T8','Renuka','3','F'),('T9','Janani','5','F');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-27 12:43:58
