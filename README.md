-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: stu
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `achievement`
--

DROP TABLE IF EXISTS `achievement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `achievement` (
  `f_id` int NOT NULL,
  `f_course_id` int DEFAULT NULL,
  `f_stu_id` varchar(45) DEFAULT NULL,
  `f_mark` int DEFAULT NULL,
  `f_teach_id` varchar(45) DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `achievement`
--

LOCK TABLES `achievement` WRITE;
/*!40000 ALTER TABLE `achievement` DISABLE KEYS */;
/*!40000 ALTER TABLE `achievement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `award`
--

DROP TABLE IF EXISTS `award`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `award` (
  `f_id` int NOT NULL,
  `f_stu_id` varchar(45) DEFAULT NULL,
  `f_nation` varchar(45) DEFAULT NULL,
  `f_pro` varchar(45) DEFAULT NULL,
  `f_college` varchar(45) DEFAULT NULL,
  `f_award_date` timestamp NULL DEFAULT NULL,
  `f_first` varchar(45) DEFAULT NULL,
  `f_second` varchar(45) DEFAULT NULL,
  `f_third` varchar(45) DEFAULT NULL,
  `f_punish_date` timestamp NULL DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `award`
--

LOCK TABLES `award` WRITE;
/*!40000 ALTER TABLE `award` DISABLE KEYS */;
/*!40000 ALTER TABLE `award` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class` (
  `f_id` int NOT NULL,
  `f_class_teach` varchar(45) DEFAULT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_establish_date` timestamp NULL DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `f_id` int NOT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_address` varchar(45) DEFAULT NULL,
  `f_phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `f_id` int NOT NULL,
  `f_major_id` int DEFAULT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_credit` int DEFAULT NULL,
  `f_hours` int DEFAULT NULL,
  `f_establish_date` timestamp NULL DEFAULT NULL,
  `f_pel_num` int DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `f_id` int NOT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_memo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `graduation`
--

DROP TABLE IF EXISTS `graduation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `graduation` (
  `f_id` varchar(45) NOT NULL,
  `f_company_id` int DEFAULT NULL,
  `f_stu_id` varchar(45) DEFAULT NULL,
  `f_status` varchar(45) DEFAULT NULL,
  `f_graduation_date` timestamp NULL DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `graduation`
--

LOCK TABLES `graduation` WRITE;
/*!40000 ALTER TABLE `graduation` DISABLE KEYS */;
/*!40000 ALTER TABLE `graduation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `major`
--

DROP TABLE IF EXISTS `major`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `major` (
  `f_id` int NOT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `major`
--

LOCK TABLES `major` WRITE;
/*!40000 ALTER TABLE `major` DISABLE KEYS */;
/*!40000 ALTER TABLE `major` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `selection`
--

DROP TABLE IF EXISTS `selection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `selection` (
  `f_id` int NOT NULL,
  `f_course_id` int DEFAULT NULL,
  `f_stu_id` varchar(45) DEFAULT NULL,
  `f_establish_date` timestamp NULL DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selection`
--

LOCK TABLES `selection` WRITE;
/*!40000 ALTER TABLE `selection` DISABLE KEYS */;
/*!40000 ALTER TABLE `selection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status` (
  `f_id` int NOT NULL,
  `f_stu_id` varchar(45) DEFAULT NULL,
  `f_content` varchar(45) DEFAULT NULL,
  `f_status_date` timestamp NULL DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu`
--

DROP TABLE IF EXISTS `stu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu` (
  `f_id` varchar(20) NOT NULL,
  `f_department_id` int DEFAULT NULL,
  `f_class_id` int DEFAULT NULL,
  `f_major_id` int DEFAULT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_gender` int DEFAULT NULL,
  `f_birthday` timestamp NULL DEFAULT NULL,
  `f_pid` varchar(45) DEFAULT NULL,
  `f_education` int DEFAULT NULL,
  `f_phone` varchar(45) DEFAULT NULL,
  `f_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu`
--

LOCK TABLES `stu` WRITE;
/*!40000 ALTER TABLE `stu` DISABLE KEYS */;
/*!40000 ALTER TABLE `stu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teach`
--

DROP TABLE IF EXISTS `teach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teach` (
  `f_id` int NOT NULL,
  `f_course_id` int DEFAULT NULL,
  `f_teach_id` varchar(45) DEFAULT NULL,
  `f_class_id` int DEFAULT NULL,
  `f_establish_date` timestamp NULL DEFAULT NULL,
  `f_memo` longtext,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teach`
--

LOCK TABLES `teach` WRITE;
/*!40000 ALTER TABLE `teach` DISABLE KEYS */;
/*!40000 ALTER TABLE `teach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `f_id` varchar(20) NOT NULL,
  `f_department_id` varchar(20) DEFAULT NULL,
  `f_name` varchar(45) DEFAULT NULL,
  `f_gender` int DEFAULT NULL,
  `f_birthday` timestamp NULL DEFAULT NULL,
  `f_pid` varchar(45) DEFAULT NULL,
  `f_education` int DEFAULT NULL,
  `f_phone` varchar(45) DEFAULT NULL,
  `f_email` varchar(45) DEFAULT NULL,
  `f_password` varchar(45) DEFAULT NULL,
  `f_title` varchar(45) DEFAULT NULL,
  `f_post` varchar(45) DEFAULT NULL,
  `f_employ_date` timestamp NULL DEFAULT NULL,
  `f_entry_date` timestamp NULL DEFAULT NULL,
  `f_quit_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('202000001001','0001','王浩',1,'2020-04-28 16:00:00','310115199412140915',2,'15000737356','5833@qq.com','123456','副高级','教师','2020-05-05 16:00:00','2020-05-07 16:00:00','2020-05-07 16:00:00'),('202000001002','0001','林杰',1,'2020-04-30 10:19:15','310115199412140917',1,'158780737356','999833@qq.com','123456','高级','教师','2020-09-06 10:16:57','2020-08-08 10:40:52','2020-04-08 10:40:52'),('202000001003','0002','林栋',1,'2020-04-30 10:19:15','310115199412140917',1,'158780737356','999833@qq.com','123456','高级','教师','2020-09-06 10:16:57','2020-08-08 10:40:52','2020-04-08 10:40:52');
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

-- Dump completed on 2020-10-10 16:39:05
