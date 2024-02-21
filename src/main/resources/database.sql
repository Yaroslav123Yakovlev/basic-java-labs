-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: java-labs
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `last_name` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `student_id` int DEFAULT NULL,
  `gradebook_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Іванов','Іван','Іванович','2000-05-15',123456,1232312),(2,'Петров','Петро','Петрович','2001-07-20',234567,2131213),(3,'Сидоров','Олександр','Олександрович','1999-02-10',345678,4432232),(4,'Коваленко','Марія','Володимирівна','2000-12-30',456789,5432423),(5,'Павлюченко','Олег','Михайлович','2002-04-25',567890,6343422),(6,'Василенко','Анна','Петрівна','2003-09-05',678901,6243236),(7,'Лисенко','Катерина','Вікторівна','2001-11-12',789012,2131244),(8,'Савченко','Андрій','Степанович','1998-08-03',890123,8675645),(9,'Панченко','Марина','Ігорівна','2000-06-18',901234,3425673),(10,'Григоренко','Ігор','Олегович','1999-03-22',112233,2354564),(11,'Жуков','Сергій','Віталійович','2002-10-09',223344,5678346),(12,'Морозова','Тетяна','Андріївна','2001-01-08',334455,3434787),(13,'Кузнецов','Євген','Євгенович','1998-04-14',445566,3424562),(14,'Сергієнко','Ольга','Юріївна','2002-07-29',556677,1234654),(15,'Клименко','Максим','Валентинович','1999-09-16',667788,9808767),(16,'Гончаренко','Віталій','Олександрович','2003-05-04',778899,3232457),(17,'Бондаренко','Наталія','Іванівна','2000-08-28',889900,5454544),(18,'Даниленко','Денис','Сергійович','1997-12-11',990011,2445677),(19,'Мельник','Василь','Петрович','2001-03-26',112233,5454789),(20,'Гаврилюк','Олена','Андріївна','1998-10-17',223344,9087776);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-20 19:32:31
