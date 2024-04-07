
--
-- Table structure for table `area_chart`

CREATE TABLE `area_chart` (
  `Date` date NOT NULL,
  `Daily` bigint DEFAULT NULL,
  `Weekly` bigint DEFAULT NULL,
  `Monthly` bigint DEFAULT NULL,
  PRIMARY KEY (`Date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `area_chart`

INSERT INTO `area_chart` VALUES ('2024-02-01',400,240,360),('2024-02-02',300,139,250),('2024-02-03',200,280,190),('2024-02-04',350,200,320),('2024-02-05',450,180,400),('2024-02-06',320,300,280),('2024-02-07',280,260,220),('2024-02-08',370,180,350),('2024-02-09',420,250,370),('2024-02-10',310,210,290),('2024-02-11',380,240,310),('2024-02-12',400,270,330),('2024-02-13',370,220,360),('2024-02-14',430,250,390),('2024-02-15',250,280,400);

