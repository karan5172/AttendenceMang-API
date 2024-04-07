-- Table structure for table `bar_chart`
--

DROP TABLE IF EXISTS `bar_chart`;

CREATE TABLE `bar_chart` (
  `Department` varchar(20) DEFAULT NULL,
  `Attendance` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table `bar_chart`
--
INSERT INTO `bar_chart` VALUES ('Developer',40),('Test Engineer',60),('Devops',86),('UI/UX',88),('Data Analyst',92),('HR',30),('Coordinator',45);
