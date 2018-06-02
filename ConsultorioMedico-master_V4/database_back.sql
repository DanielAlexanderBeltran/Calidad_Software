CREATE DATABASE  IF NOT EXISTS `clinica` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `clinica`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: clinica
-- ------------------------------------------------------
-- Server version	5.5.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cita` (
  `ID_Cita` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Fecha_Cita` date NOT NULL,
  `Hora_Cita` varchar(15) CHARACTER SET utf8 NOT NULL,
  `Dia_Cita` varchar(15) CHARACTER SET utf8 NOT NULL,
  `Semana_Cita` int(11) NOT NULL,
  `ID_Medico` int(10) unsigned NOT NULL,
  `ID_Paciente` int(10) unsigned NOT NULL,
  `Estado` varchar(15) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`ID_Cita`),
  UNIQUE KEY `ID_Cita` (`ID_Cita`),
  KEY `ID_Medico` (`ID_Medico`),
  KEY `ID_Paciente` (`ID_Paciente`),
  CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`ID_Medico`) REFERENCES `medico` (`ID_Medico`),
  CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`ID_Paciente`) REFERENCES `paciente` (`ID_Paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `citav`
--

DROP TABLE IF EXISTS `citav`;
/*!50001 DROP VIEW IF EXISTS `citav`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `citav` AS SELECT 
 1 AS `ID_Cita`,
 1 AS `ID_Medico`,
 1 AS `Nombres_Med`,
 1 AS `Apellidos_Med`,
 1 AS `Fecha_Cita`,
 1 AS `Dia_Cita`,
 1 AS `Semana_Cita`,
 1 AS `Hora_Cita`,
 1 AS `Nombres`,
 1 AS `Apellidos`,
 1 AS `Estado`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consulta` (
  `ID_Consulta` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ID_Cita` int(10) unsigned NOT NULL,
  `Descripcion_Consulta` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Diagnostico` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Receta` varchar(500) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Consulta`),
  UNIQUE KEY `ID_Consulta` (`ID_Consulta`),
  KEY `ID_Cita` (`ID_Cita`),
  CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`ID_Cita`) REFERENCES `cita` (`ID_Cita`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `consultav`
--

DROP TABLE IF EXISTS `consultav`;
/*!50001 DROP VIEW IF EXISTS `consultav`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `consultav` AS SELECT 
 1 AS `ID_Consulta`,
 1 AS `Fecha_Cita`,
 1 AS `NombresMed`,
 1 AS `ApellidosMed`,
 1 AS `Nombres`,
 1 AS `Apellidos`,
 1 AS `Descripcion_Consulta`,
 1 AS `Diagnostico`,
 1 AS `Receta`,
 1 AS `Estado`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `dia_medico`
--

DROP TABLE IF EXISTS `dia_medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dia_medico` (
  `ID_Dia_Medico` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ID_Medico` int(10) unsigned NOT NULL,
  `Dia` varchar(1) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Dia_Medico`),
  UNIQUE KEY `ID_Dia_Medico` (`ID_Dia_Medico`),
  KEY `ID_Medico` (`ID_Medico`),
  CONSTRAINT `dia_medico_ibfk_1` FOREIGN KEY (`ID_Medico`) REFERENCES `medico` (`ID_Medico`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dia_medico`
--

LOCK TABLES `dia_medico` WRITE;
/*!40000 ALTER TABLE `dia_medico` DISABLE KEYS */;
INSERT INTO `dia_medico` VALUES (6,2,'L',1);
/*!40000 ALTER TABLE `dia_medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialidad` (
  `ID_Especialidad` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) CHARACTER SET utf8 NOT NULL,
  `Descripcion` varchar(150) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Especialidad`),
  UNIQUE KEY `ID_Especialidad` (`ID_Especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` VALUES (2,'PROCTOLOGIA','ASD FG F  D FG HFG F',1);
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `expediente`
--

DROP TABLE IF EXISTS `expediente`;
/*!50001 DROP VIEW IF EXISTS `expediente`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `expediente` AS SELECT 
 1 AS `ID_Paciente`,
 1 AS `ID_Medico`,
 1 AS `ID_Consulta`,
 1 AS `Fecha_Cita`,
 1 AS `Descripcion_Consulta`,
 1 AS `Diagnostico`,
 1 AS `Receta`,
 1 AS `Nombres`,
 1 AS `Apellidos`,
 1 AS `NombreM`,
 1 AS `ApellidoM`,
 1 AS `Especialidad`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `hora_medico`
--

DROP TABLE IF EXISTS `hora_medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hora_medico` (
  `ID_Hora_Medico` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ID_Dia_Medico` int(10) unsigned NOT NULL,
  `Hora_Inicial` varchar(15) CHARACTER SET utf8 NOT NULL,
  `Hora_Final` varchar(15) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Hora_Medico`),
  UNIQUE KEY `ID_Hora_Medico` (`ID_Hora_Medico`),
  KEY `ID_Dia_Medico` (`ID_Dia_Medico`),
  CONSTRAINT `hora_medico_ibfk_1` FOREIGN KEY (`ID_Dia_Medico`) REFERENCES `dia_medico` (`ID_Dia_Medico`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hora_medico`
--

LOCK TABLES `hora_medico` WRITE;
/*!40000 ALTER TABLE `hora_medico` DISABLE KEYS */;
INSERT INTO `hora_medico` VALUES (6,6,'8:00 A.M','10:00 A.M',1);
/*!40000 ALTER TABLE `hora_medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!50001 DROP VIEW IF EXISTS `horario`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `horario` AS SELECT 
 1 AS `ID_Medico`,
 1 AS `Dia`,
 1 AS `Hora_Inicial`,
 1 AS `Hora_Final`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `horariomedico`
--

DROP TABLE IF EXISTS `horariomedico`;
/*!50001 DROP VIEW IF EXISTS `horariomedico`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `horariomedico` AS SELECT 
 1 AS `ID_Medico`,
 1 AS `Nombres`,
 1 AS `Apellidos`,
 1 AS `Nombre`,
 1 AS `Dia`,
 1 AS `Hora_Inicial`,
 1 AS `Hora_Final`,
 1 AS `Estado`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `horariov`
--

DROP TABLE IF EXISTS `horariov`;
/*!50001 DROP VIEW IF EXISTS `horariov`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `horariov` AS SELECT 
 1 AS `ID_Medico`,
 1 AS `ID_Dia_Medico`,
 1 AS `ID_Hora_Medico`,
 1 AS `Dia`,
 1 AS `Hora_Inicial`,
 1 AS `Hora_Final`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico` (
  `ID_Medico` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Apellidos` varchar(100) CHARACTER SET utf8 NOT NULL,
  `ID_Especialidad` int(10) unsigned NOT NULL,
  `ID_Usuario` int(10) unsigned NOT NULL DEFAULT '0',
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Medico`),
  UNIQUE KEY `ID_Medico` (`ID_Medico`),
  KEY `ID_Especialidad` (`ID_Especialidad`),
  CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`ID_Especialidad`) REFERENCES `especialidad` (`ID_Especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (2,'PERICO','DE LOS PALOTES',2,5,1);
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `medicov`
--

DROP TABLE IF EXISTS `medicov`;
/*!50001 DROP VIEW IF EXISTS `medicov`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `medicov` AS SELECT 
 1 AS `ID_Medico`,
 1 AS `Nombres`,
 1 AS `Apellidos`,
 1 AS `Nombre`,
 1 AS `Estado`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente` (
  `ID_Paciente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Apellidos` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Peso` float NOT NULL,
  `Altura` float NOT NULL,
  `Edad` int(11) NOT NULL,
  `Telefono` varchar(9) CHARACTER SET utf8 NOT NULL,
  `Alergias` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Enfermedades` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Tipo_Sangre` varchar(5) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  `Mail` varchar(500) NOT NULL,
  `Genero` varchar(1) NOT NULL,
  `Cedula` varchar(10) NOT NULL,
  `Direccion` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_Paciente`),
  UNIQUE KEY `ID_Paciente` (`ID_Paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (2,'perico paciente','de los palotes',23,1.23,23,'0996-8875','ninguna','infarto','O+',1,'jose@mail.com','M','1720192523','la chingada'),(3,'perico paciente','de los palotes',23,2,18,'0996-8875','ninguna','infarto','O+',1,'jose@mail.com','M','1720192523','la chingada');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `recetav`
--

DROP TABLE IF EXISTS `recetav`;
/*!50001 DROP VIEW IF EXISTS `recetav`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `recetav` AS SELECT 
 1 AS `ID_Consulta`,
 1 AS `ID_Cita`,
 1 AS `Fecha_Cita`,
 1 AS `NombresMed`,
 1 AS `ApellidosMed`,
 1 AS `NombreEsp`,
 1 AS `Nombres`,
 1 AS `Apellidos`,
 1 AS `Receta`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `ID_Usuario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Nombre_Usuario` varchar(50) CHARACTER SET utf8 NOT NULL,
  `Contrasena_Usuario` varchar(100) CHARACTER SET utf8 NOT NULL,
  `Rol_Usuario` varchar(20) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Usuario`),
  UNIQUE KEY `ID_Usuario` (`ID_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (3,'Admin','1234','Admin',1),(4,'secre','secre','Recepcionista',1),(5,'perico2','1234','Medico',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `citav`
--

/*!50001 DROP VIEW IF EXISTS `citav`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `citav` AS (select `c`.`ID_Cita` AS `ID_Cita`,`c`.`ID_Medico` AS `ID_Medico`,`m`.`Nombres` AS `Nombres_Med`,`m`.`Apellidos` AS `Apellidos_Med`,`c`.`Fecha_Cita` AS `Fecha_Cita`,`c`.`Dia_Cita` AS `Dia_Cita`,`c`.`Semana_Cita` AS `Semana_Cita`,`c`.`Hora_Cita` AS `Hora_Cita`,`p`.`Nombres` AS `Nombres`,`p`.`Apellidos` AS `Apellidos`,`c`.`Estado` AS `Estado` from ((`cita` `c` join `paciente` `p` on((`c`.`ID_Paciente` = `p`.`ID_Paciente`))) join `medico` `m` on((`c`.`ID_Medico` = `m`.`ID_Medico`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `consultav`
--

/*!50001 DROP VIEW IF EXISTS `consultav`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `consultav` AS (select `c`.`ID_Consulta` AS `ID_Consulta`,`cc`.`Fecha_Cita` AS `Fecha_Cita`,`m`.`Nombres` AS `NombresMed`,`m`.`Apellidos` AS `ApellidosMed`,`p`.`Nombres` AS `Nombres`,`p`.`Apellidos` AS `Apellidos`,`c`.`Descripcion_Consulta` AS `Descripcion_Consulta`,`c`.`Diagnostico` AS `Diagnostico`,`c`.`Receta` AS `Receta`,`c`.`Estado` AS `Estado` from (((`consulta` `c` join `cita` `cc` on((`c`.`ID_Cita` = `cc`.`ID_Cita`))) join `medico` `m` on((`cc`.`ID_Medico` = `m`.`ID_Medico`))) join `paciente` `p` on((`cc`.`ID_Paciente` = `p`.`ID_Paciente`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `expediente`
--

/*!50001 DROP VIEW IF EXISTS `expediente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `expediente` AS (select `p`.`ID_Paciente` AS `ID_Paciente`,`m`.`ID_Medico` AS `ID_Medico`,`c`.`ID_Consulta` AS `ID_Consulta`,`cc`.`Fecha_Cita` AS `Fecha_Cita`,`c`.`Descripcion_Consulta` AS `Descripcion_Consulta`,`c`.`Diagnostico` AS `Diagnostico`,`c`.`Receta` AS `Receta`,`p`.`Nombres` AS `Nombres`,`p`.`Apellidos` AS `Apellidos`,`m`.`Nombres` AS `NombreM`,`m`.`Apellidos` AS `ApellidoM`,`e`.`Nombre` AS `Especialidad` from ((((`consulta` `c` join `cita` `cc` on((`c`.`ID_Cita` = `cc`.`ID_Cita`))) join `paciente` `p` on((`cc`.`ID_Paciente` = `p`.`ID_Paciente`))) join `medico` `m` on((`cc`.`ID_Medico` = `m`.`ID_Medico`))) join `especialidad` `e` on((`m`.`ID_Especialidad` = `e`.`ID_Especialidad`))) where (`c`.`Estado` = 1)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `horario`
--

/*!50001 DROP VIEW IF EXISTS `horario`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `horario` AS (select `m`.`ID_Medico` AS `ID_Medico`,`d`.`Dia` AS `Dia`,`h`.`Hora_Inicial` AS `Hora_Inicial`,`h`.`Hora_Final` AS `Hora_Final` from (((`medico` `m` join `dia_medico` `d` on((`m`.`ID_Medico` = `d`.`ID_Medico`))) join `hora_medico` `h` on((`d`.`ID_Dia_Medico` = `h`.`ID_Dia_Medico`))) join `especialidad` `e` on((`m`.`ID_Especialidad` = `e`.`ID_Especialidad`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `horariomedico`
--

/*!50001 DROP VIEW IF EXISTS `horariomedico`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `horariomedico` AS (select `m`.`ID_Medico` AS `ID_Medico`,`m`.`Nombres` AS `Nombres`,`m`.`Apellidos` AS `Apellidos`,`e`.`Nombre` AS `Nombre`,`d`.`Dia` AS `Dia`,`h`.`Hora_Inicial` AS `Hora_Inicial`,`h`.`Hora_Final` AS `Hora_Final`,`m`.`Estado` AS `Estado` from (((`medico` `m` join `dia_medico` `d` on((`m`.`ID_Medico` = `d`.`ID_Medico`))) join `hora_medico` `h` on((`d`.`ID_Dia_Medico` = `h`.`ID_Dia_Medico`))) join `especialidad` `e` on((`m`.`ID_Especialidad` = `e`.`ID_Especialidad`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `horariov`
--

/*!50001 DROP VIEW IF EXISTS `horariov`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `horariov` AS (select `dm`.`ID_Medico` AS `ID_Medico`,`dm`.`ID_Dia_Medico` AS `ID_Dia_Medico`,`hm`.`ID_Hora_Medico` AS `ID_Hora_Medico`,`dm`.`Dia` AS `Dia`,`hm`.`Hora_Inicial` AS `Hora_Inicial`,`hm`.`Hora_Final` AS `Hora_Final` from (`dia_medico` `dm` join `hora_medico` `hm` on((`dm`.`ID_Dia_Medico` = `hm`.`ID_Dia_Medico`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `medicov`
--

/*!50001 DROP VIEW IF EXISTS `medicov`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `medicov` AS (select `m`.`ID_Medico` AS `ID_Medico`,`m`.`Nombres` AS `Nombres`,`m`.`Apellidos` AS `Apellidos`,`e`.`Nombre` AS `Nombre`,`m`.`Estado` AS `Estado` from (`medico` `m` join `especialidad` `e` on((`m`.`ID_Especialidad` = `e`.`ID_Especialidad`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `recetav`
--

/*!50001 DROP VIEW IF EXISTS `recetav`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `recetav` AS (select `c`.`ID_Consulta` AS `ID_Consulta`,`cc`.`ID_Cita` AS `ID_Cita`,`cc`.`Fecha_Cita` AS `Fecha_Cita`,`m`.`Nombres` AS `NombresMed`,`m`.`Apellidos` AS `ApellidosMed`,`e`.`Nombre` AS `NombreEsp`,`p`.`Nombres` AS `Nombres`,`p`.`Apellidos` AS `Apellidos`,`c`.`Receta` AS `Receta` from ((((`consulta` `c` join `cita` `cc` on((`c`.`ID_Cita` = `cc`.`ID_Cita`))) join `medico` `m` on((`cc`.`ID_Medico` = `m`.`ID_Medico`))) join `paciente` `p` on((`cc`.`ID_Paciente` = `p`.`ID_Paciente`))) join `especialidad` `e` on((`m`.`ID_Especialidad` = `e`.`ID_Especialidad`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-01  1:23:32
