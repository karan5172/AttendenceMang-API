
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `Dept_ID` int NOT NULL AUTO_INCREMENT,
  `Dept_Name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Dept_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table `department`
INSERT INTO `department` VALUES (1,'Developer'),(2,'Test Engineer'),(3,'Devops'),(4,'UI/UX'),(5,'Data Analyst'),(6,'HR'),(7,'Coordinator');
