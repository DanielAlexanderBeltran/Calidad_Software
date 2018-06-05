-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
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
-- Table structure for table `auditoria`
--

DROP TABLE IF EXISTS `auditoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auditoria` (
  `fecha` datetime DEFAULT NULL,
  `operacion` varchar(10) DEFAULT NULL,
  `nombre_table` varchar(30) DEFAULT NULL,
  `anterior` varchar(400) DEFAULT NULL,
  `nuevo` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditoria`
--

LOCK TABLES `auditoria` WRITE;
/*!40000 ALTER TABLE `auditoria` DISABLE KEYS */;
INSERT INTO `auditoria` VALUES ('2018-06-05 03:50:47','borrar','cita','4 //2018-06-11 //8:00 A.M //Lunes //24 //7 //4 //Atendida',''),('2018-06-05 03:50:47','borrar','cita','1 //2018-06-04 //8:00 A.M //Lunes //23 //3 //4 //Atendida',''),('2018-06-05 03:50:47','borrar','cita','2 //2018-06-05 //10:00 A.M //Martes //23 //3 //4 //Pendiente',''),('2018-06-05 03:50:47','borrar','cita','3 //2018-06-05 //9:00 A.M //Martes //23 //3 //4 //Pendiente',''),('2018-06-05 03:52:17','borrar','dia_medico','6 //2 //L //1',''),('2018-06-05 03:52:17','borrar','dia_medico','7 //3 //L //1',''),('2018-06-05 03:52:17','borrar','dia_medico','8 //3 //M //1',''),('2018-06-05 03:52:17','borrar','dia_medico','9 //3 //X //1',''),('2018-06-05 03:52:17','borrar','dia_medico','10 //3 //J //1',''),('2018-06-05 03:52:17','borrar','dia_medico','11 //3 //V //1',''),('2018-06-05 03:52:17','borrar','dia_medico','12 //3 //S //1',''),('2018-06-05 03:52:17','borrar','dia_medico','13 //3 //D //1',''),('2018-06-05 03:52:17','borrar','dia_medico','14 //4 //L //1',''),('2018-06-05 03:52:17','borrar','dia_medico','15 //4 //M //1',''),('2018-06-05 03:52:17','borrar','dia_medico','16 //5 //L //1',''),('2018-06-05 03:52:17','borrar','dia_medico','17 //5 //M //1',''),('2018-06-05 03:52:17','borrar','dia_medico','18 //5 //X //1',''),('2018-06-05 03:52:17','borrar','dia_medico','19 //5 //J //1',''),('2018-06-05 03:52:17','borrar','dia_medico','20 //6 //L //1',''),('2018-06-05 03:52:17','borrar','dia_medico','21 //6 //M //1',''),('2018-06-05 03:52:17','borrar','dia_medico','22 //6 //X //1',''),('2018-06-05 03:52:17','borrar','dia_medico','23 //7 //L //1',''),('2018-06-05 03:54:09','borrar','medico','2 //PERICO //DE LOS PALOTES //2 //5 //1',''),('2018-06-05 03:54:09','borrar','medico','3 //Leonardo Francisco //Venegas //3 //6 //1',''),('2018-06-05 03:54:09','borrar','medico','4 //Juan //Pablo //2 //7 //1',''),('2018-06-05 03:54:09','borrar','medico','5 //Pepe //De las Mercedes //2 //8 //1',''),('2018-06-05 03:54:09','borrar','medico','6 //Susana //Venegas Yánez //4 //10 //1',''),('2018-06-05 03:54:09','borrar','medico','7 //Medico //Medico //5 //11 //1',''),('2018-06-05 03:55:30','borrar','paciente','2 //perico paciente //de los palotes //23 //1.23 //23 //0996-8875 //ninguna //infarto //O+ //1 //jose@mail.com //M //1720192523 //la chingada',''),('2018-06-05 03:55:30','borrar','paciente','3 //perico paciente //de los palotes //23 //2 //18 //0996-8875 //ninguna //infarto //O+ //1 //jose@mail.com //M //1720192523 //la chingada',''),('2018-06-05 03:55:30','borrar','paciente','4 //Daniel //Beltran //150 //1.7 //28 //2655-4189 //Ninguna //hipertension //A+ //1 //litomh@yahoo.es //M //1720524204 //La Forestal',''),('2018-06-05 03:55:30','borrar','paciente','5 //perico tres //d elos aplotes tres //12 //12 //23 //1233-3233 //asdfd //asds //O- //1 //mail@perico.com //M //1720192523 //las casas',''),('2018-06-05 03:56:05','borrar','especialidad','2 //PROCTOLOGIA //ASD FG F  D FG HFG F //1',''),('2018-06-05 03:56:05','borrar','especialidad','3 //Cardiologia //Estudio del sistema Cardiovascular //1',''),('2018-06-05 03:56:05','borrar','especialidad','4 //Geriatria //especialidad para adultos mayores //1',''),('2018-06-05 03:56:05','borrar','especialidad','5 //oftalmologia //Revision de la Vision //1',''),('2018-06-05 03:56:49','borrar','usuario','4 //secre //secre //Recepcionista //1',''),('2018-06-05 03:56:49','borrar','usuario','5 //perico2 //1234 //Medico //1',''),('2018-06-05 03:56:49','borrar','usuario','6 //leonardofrancisco3 //1234 //Medico //1',''),('2018-06-05 03:56:49','borrar','usuario','7 //juan4 //1234 //Medico //1',''),('2018-06-05 03:56:49','borrar','usuario','8 //pepe5 //1234 //Medico //1',''),('2018-06-05 03:56:49','borrar','usuario','9 //carlos //A6xnQhbz4Vx2HuGl4lXwZ5U2I8iziLRFnhP5eNfIRvQ= //Admin //1',''),('2018-06-05 03:56:49','borrar','usuario','10 //SusyV //A6xnQhbz4Vx2HuGl4lXwZ5U2I8iziLRFnhP5eNfIRvQ= //Medico //1',''),('2018-06-05 03:56:49','borrar','usuario','11 //medico7 //A6xnQhbz4Vx2HuGl4lXwZ5U2I8iziLRFnhP5eNfIRvQ= //Medico //1','');
/*!40000 ALTER TABLE `auditoria` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerCit2 BEFORE insert ON cita
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','cita',"",
    concat(NEW.id_cita,' //',NEW.fecha_cita,' //',NEW.hora_cita,' //',NEW.dia_cita,' //',NEW.semana_cita,' //',NEW.id_medico,' //',NEW.id_paciente,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerCit1 BEFORE UPDATE ON cita
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','cita',
    concat(OLD.id_cita,' //',OLD.fecha_cita,' //',OLD.hora_cita,' //',OLD.dia_cita,' //',OLD.semana_cita,' //',OLD.id_medico,' //',OLD.id_paciente,' //',OLd.estado),
    concat(NEW.id_cita,' //',NEW.fecha_cita,' //',NEW.hora_cita,' //',NEW.dia_cita,' //',NEW.semana_cita,' //',NEW.id_medico,' //',NEW.id_paciente,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerCit3 BEFORE delete ON cita
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','cita',
    concat(OLD.id_cita,' //',OLD.fecha_cita,' //',OLD.hora_cita,' //',OLD.dia_cita,' //',OLD.semana_cita,' //',OLD.id_medico,' //',OLD.id_paciente,' //',OLd.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerCon2 BEFORE insert ON consulta
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','consulta',"",
    concat(NEW.id_consulta,' //',NEW.id_cita,' //',NEW.descripcion_consulta,' //',NEW.diagnostico,' //',NEW.receta,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerCon1 BEFORE UPDATE ON consulta
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','consulta',
    concat(OLD.id_consulta,' //',OLD.id_cita,' //',OLD.descripcion_consulta,' //',OLD.diagnostico,' //',OLD.receta,' //',OLD.estado),
    concat(NEW.id_consulta,' //',NEW.id_cita,' //',NEW.descripcion_consulta,' //',NEW.diagnostico,' //',NEW.receta,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerCon3 BEFORE delete ON consulta
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','consulta',
    concat(OLD.id_consulta,' //',OLD.id_cita,' //',OLD.descripcion_consulta,' //',OLD.diagnostico,' //',OLD.receta,' //',OLD.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dia_medico`
--

LOCK TABLES `dia_medico` WRITE;
/*!40000 ALTER TABLE `dia_medico` DISABLE KEYS */;
/*!40000 ALTER TABLE `dia_medico` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerDMed2 BEFORE insert ON dia_medico
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','dia_medico',"",
    concat(NEW.id_dia_medico,' //',NEW.id_medico,' //',NEW.dia,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerDMed1 BEFORE UPDATE ON dia_medico
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','dia_medico',
    concat(OLD.id_dia_medico,' //',OLD.id_medico,' //',OLD.dia,' //',OLD.estado),
    concat(NEW.id_dia_medico,' //',NEW.id_medico,' //',NEW.dia,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerDMed3 BEFORE delete ON dia_medico
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','dia_medico',
    concat(OLD.id_dia_medico,' //',OLD.id_medico,' //',OLD.dia,' //',OLD.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerEsp2 BEFORE insert ON especialidad
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','especialidad',"",
    concat(NEW.id_especialidad,' //',NEW.nombre,' //',NEW.descripcion,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerEsp1 BEFORE UPDATE ON especialidad
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','especialidad',
    concat(OLD.id_especialidad,' //',OLD.nombre,' //',OLD.descripcion,' //',OLD.estado),
    concat(NEW.id_especialidad,' //',NEW.nombre,' //',NEW.descripcion,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerEsp3 BEFORE delete ON especialidad
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','especialidad',
    concat(OLD.id_especialidad,' //',OLD.nombre,' //',OLD.descripcion,' //',OLD.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hora_medico`
--

LOCK TABLES `hora_medico` WRITE;
/*!40000 ALTER TABLE `hora_medico` DISABLE KEYS */;
/*!40000 ALTER TABLE `hora_medico` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerHMed2 BEFORE insert ON hora_medico
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','hora_medico',"",
    concat(NEW.id_hora_medico,' //',NEW.id_dia_medico,' //',NEW.hora_inicial,' //',NEW.hora_final,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerHMed1 BEFORE UPDATE ON hora_medico
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','hora_medico',
    concat(OLD.id_hora_medico,' //',OLD.id_dia_medico,' //',OLD.hora_inicial,' //',OLD.hora_final,' //',OLD.estado),
    concat(NEW.id_hora_medico,' //',NEW.id_dia_medico,' //',NEW.hora_inicial,' //',NEW.hora_final,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerHMed3 BEFORE delete ON hora_medico
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','hora_medico',
    concat(OLD.id_hora_medico,' //',OLD.id_dia_medico,' //',OLD.hora_inicial,' //',OLD.hora_final,' //',OLD.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
  `cedula` varchar(10) NOT NULL,
  PRIMARY KEY (`ID_Medico`),
  UNIQUE KEY `ID_Medico` (`ID_Medico`),
  KEY `ID_Especialidad` (`ID_Especialidad`),
  CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`ID_Especialidad`) REFERENCES `especialidad` (`ID_Especialidad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerMed2 BEFORE insert ON medico
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','medico',"",
    concat(NEW.id_medico,' //',NEW.nombres,' //',NEW.apellidos,' //',NEW.id_especialidad,' //',NEW.id_usuario,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerMed1 BEFORE UPDATE ON medico
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','medico',
    concat(OLD.id_medico,' //',OLD.nombres,' //',OLD.apellidos,' //',OLD.id_especialidad,' //',OLD.id_usuario,' //',OLD.estado),
    concat(NEW.id_medico,' //',NEW.nombres,' //',NEW.apellidos,' //',NEW.id_especialidad,' //',NEW.id_usuario,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerMed3 BEFORE delete ON medico
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','medico',
    concat(OLD.id_medico,' //',OLD.nombres,' //',OLD.apellidos,' //',OLD.id_especialidad,' //',OLD.id_usuario,' //',OLD.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
 1 AS `Estado`,
 1 AS `cedula`*/;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerPac2 BEFORE insert ON paciente
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','paciente',"",
    concat(NEW.id_paciente,' //',NEW.nombres,' //',NEW.apellidos,' //',NEW.peso,' //',NEW.altura,' //',NEW.edad,' //',NEW.telefono,' //',NEW.alergias,' //',NEW.enfermedades,' //',NEW.tipo_sangre,' //',NEW.estado,' //',NEW.mail,' //',NEW.genero,' //',NEW.cedula,' //',NEW.direccion));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerPac1 BEFORE UPDATE ON paciente
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','paciente',
    concat(OLD.id_paciente,' //',OLD.nombres,' //',OLD.apellidos,' //',OLD.peso,' //',OLD.altura,' //',OLD.edad,' //',OLD.telefono,' //',OLD.alergias,' //',OLD.enfermedades,' //',OLD.tipo_sangre,' //',OLD.estado,' //',OLD.mail,' //',OLD.genero,' //',OLD.cedula,' //',OLD.direccion),
    concat(NEW.id_paciente,' //',NEW.nombres,' //',NEW.apellidos,' //',NEW.peso,' //',NEW.altura,' //',NEW.edad,' //',NEW.telefono,' //',NEW.alergias,' //',NEW.enfermedades,' //',NEW.tipo_sangre,' //',NEW.estado,' //',NEW.mail,' //',NEW.genero,' //',NEW.cedula,' //',NEW.direccion));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerPac3 BEFORE delete ON paciente
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','paciente',
    concat(OLD.id_paciente,' //',OLD.nombres,' //',OLD.apellidos,' //',OLD.peso,' //',OLD.altura,' //',OLD.edad,' //',OLD.telefono,' //',OLD.alergias,' //',OLD.enfermedades,' //',OLD.tipo_sangre,' //',OLD.estado,' //',OLD.mail,' //',OLD.genero,' //',OLD.cedula,' //',OLD.direccion),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
  `Contrasena_Usuario` varchar(44) CHARACTER SET utf8 NOT NULL,
  `Rol_Usuario` varchar(20) CHARACTER SET utf8 NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_Usuario`),
  UNIQUE KEY `ID_Usuario` (`ID_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (3,'Admin','A6xnQhbz4Vx2HuGl4lXwZ5U2I8iziLRFnhP5eNfIRvQ=','Admin',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerUsr2 BEFORE insert ON usuario
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'insertar','usuario',"",
    concat(NEW.id_usuario,' //',NEW.nombre_usuario,' //',NEW.contrasena_usuario,' //',NEW.rol_usuario,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerUsr1 BEFORE UPDATE ON usuario
  FOR EACH ROW BEGIN

    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'actualizar','usuario',
    concat(OLD.id_usuario,' //',OLD.nombre_usuario,' //',OLD.contrasena_usuario,' //',OLD.rol_usuario,' //',OLD.estado),
    concat(NEW.id_usuario,' //',NEW.nombre_usuario,' //',NEW.contrasena_usuario,' //',NEW.rol_usuario,' //',NEW.estado));
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER testtriggerUsr3 BEFORE delete ON usuario
  FOR EACH ROW BEGIN
    INSERT INTO auditoria(fecha,operacion,nombre_Table,anterior, nuevo) VALUES (NOW(),'borrar','usuario',
    concat(OLD.id_usuario,' //',OLD.nombre_usuario,' //',OLD.contrasena_usuario,' //',OLD.rol_usuario,' //',OLD.estado),"");
  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'clinica'
--

--
-- Dumping routines for database 'clinica'
--
/*!50003 DROP PROCEDURE IF EXISTS `Activar_Consulta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Activar_Consulta`(
IN ID int
)
Update Consulta
Set Estado = true
Where ID_Consulta = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Activar_Especialidad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Activar_Especialidad`(
IN ID int
)
Update Especialidad
Set Estado = true
Where ID_Especialidad = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Activar_Medico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Activar_Medico`(
IN ID int
)
Update Medico
Set Estado = true
Where ID_Medico = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Activar_Paciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Activar_Paciente`(
IN ID int
)
Update Paciente
Set Estado = true
Where ID_Paciente = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Activar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Activar_Usuario`(
IN ID int
)
Update Usuario
Set Estado = true
Where ID_Usuario = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarCita` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarCita`(
IN Fecha_Cita date, IN Hora_Cita nvarchar(15), IN ID_Medico int, IN ID_Paciente int,
IN Estado nvarchar(15), IN Dia_Semana nvarchar(15), IN Semana_Cita int
)
Insert Into Cita
(Fecha_Cita,
Hora_Cita,
ID_Medico,
ID_Paciente,
Estado,
Dia_Cita, 
Semana_Cita
)
Values(Fecha_Cita, Hora_Cita, ID_Medico, ID_Paciente, Estado, Dia_Semana, Semana_Cita) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarConsulta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarConsulta`(
IN ID_Cita int, IN Consulta Nvarchar (200), IN Diagnostico nvarchar(200),
IN Receta nvarchar(500)
)
Insert Into Consulta
(ID_Cita,
Descripcion_Consulta,
Diagnostico,
Receta
)
Values(ID_Cita, Consulta, Diagnostico, Receta) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarDia_Medico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarDia_Medico`(
IN ID_MedicoD int, IN DiaM Nvarchar (1)
)
Insert Into Dia_Medico
(ID_Medico,
Dia
)
Values(ID_MedicoD, DiaM) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarEspecialidad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarEspecialidad`(
IN Nombre Nvarchar (50), IN Descripcion Nvarchar (150)
)
Insert Into Especialidad
(Nombre,
Descripcion
)
Values(Nombre, Descripcion) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarHora_Medico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarHora_Medico`(
IN ID_Dia_MedicoD int, IN HoraInicioM Nvarchar (15), IN HoraFinalM Nvarchar (15)
)
Insert Into Hora_Medico
(ID_Dia_Medico,
Hora_Inicial,
Hora_Final
)
Values(ID_Dia_MedicoD, HoraInicioM, HoraFinalM) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarMedico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarMedico`(
IN Nombres Nvarchar (100), IN Apellidos Nvarchar (100), IN ID_Especialidad int, IN cedula Nvarchar (10)
)
Insert Into Medico
(Nombres,
Apellidos,
ID_Especialidad,
cedula
)
Values(Nombres, Apellidos, ID_Especialidad,cedula) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarPaciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarPaciente`(
IN Nombres Nvarchar (100), IN Apellidos Nvarchar (100), IN Peso Float,
IN Altura Float, IN Edad Int, IN Alergias Nvarchar(200), IN Enfermedades Nvarchar(200),
IN Tipo_Sangre Nvarchar(5), IN Telefono nvarchar(9), 
IN Mail Nvarchar(500), IN Genero Nvarchar(1),
IN Cedula Nvarchar(10), IN Direccion Nvarchar(255)
)
Insert Into Paciente
(Nombres,
Apellidos,
Peso,
Altura,
Edad,
Alergias,
Enfermedades,
Tipo_Sangre, 
Telefono, 
Mail,
Genero, 
Cedula,
Direccion
)
Values(Nombres, Apellidos, Peso, Altura, Edad, Alergias, Enfermedades, Tipo_Sangre,
Telefono, Mail, Genero, Cedula, Direccion) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarUsuario`(
IN Nombre nvarchar(50), IN Contrasena nvarchar(100),
IN Rol nvarchar(20)
)
Insert Into Usuario
(Nombre_Usuario,
Contrasena_Usuario,
Rol_Usuario
)
Values(Nombre, Contrasena, Rol) ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Cancelar_Cita` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Cancelar_Cita`(
IN ID int
)
Update Cita
Set Estado = "Cancelada"
Where ID_Cita = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `CitaAtendida` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CitaAtendida`(IN ID int unsigned)
Update Cita
Set Estado = "Atendida"
Where ID_Cita = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Desactivar_Consulta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Desactivar_Consulta`(
IN ID int
)
Update Consulta
Set Estado = false
Where ID_Consulta = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Desactivar_Especialidad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Desactivar_Especialidad`(
IN ID int
)
Update Especialidad
Set Estado = false
Where ID_Especialidad = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Desactivar_Medico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Desactivar_Medico`(
IN ID int
)
Update Medico
Set Estado = false
Where ID_Medico = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Desactivar_Paciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Desactivar_Paciente`(
IN ID int
)
Update Paciente
Set Estado = false
Where ID_Paciente = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Desactivar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Desactivar_Usuario`(
IN ID int
)
Update Usuario
Set Estado = false
Where ID_Usuario = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarDia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarDia`(IN ID int unsigned)
Delete from Dia_Medico Where ID_Medico = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarHora` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarHora`(IN ID int unsigned)
Delete from Hora_Medico Where ID_Dia_Medico = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarConsulta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarConsulta`(
IN ID int, IN Consulta Nvarchar (200), IN Diagnostico nvarchar(200),
IN Receta nvarchar(500)
)
Update Consulta
Set Descripcion_Consulta = Consulta,
Diagnostico = Diagnostico,
Receta = Receta
Where ID_Consulta = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarEspecialidad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarEspecialidad`(
IN ID int, IN Nombre Nvarchar (50), IN Descripcion Nvarchar (150)
)
Update Especialidad
Set Nombre = Nombre,
Descripcion = Descripcion
Where ID_Especialidad = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarMedico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarMedico`(
IN ID int, IN Nombres Nvarchar (100), IN Apellidos Nvarchar (100), IN ID_Especialidad int, IN cedula Nvarchar (10)
)
Update Medico
Set Nombres = Nombres,
Apellidos = Apellidos,
ID_Especialidad = ID_Especialidad,
cedula = cedula
Where ID_Medico = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarPaciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarPaciente`(
IN ID int, IN Nombres Nvarchar (100), IN Apellidos Nvarchar (100), IN Peso Float,
IN Altura Float, IN Edad Int, IN Alergias Nvarchar(200), IN Enfermedades Nvarchar(200),
IN Tipo_Sangre Nvarchar(5), IN Telefono nvarchar(9), 
IN Mail Nvarchar(500), IN Genero Nvarchar(1),
IN Cedula Nvarchar(10), IN Direccion Nvarchar(255)
)
Update Paciente
Set Nombres = Nombres,
Apellidos = Apellidos,
Peso = Peso,
Altura = Altura,
Edad = Edad,
Alergias = Alergias,
Enfermedades = Enfermedades,
Tipo_Sangre = Tipo_Sangre,
Telefono = Telefono,
Mail=Mail,
Genero=Genero, 
Cedula=Cedula,
Direccion=Direccion
Where ID_Paciente = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarUsuario`(
IN ID int, IN Nombre nvarchar(50), IN Contrasena nvarchar(100),
IN Rol nvarchar(20)
)
Update Usuario
Set Nombre_Usuario = Nombre,
Contrasena_Usuario = Contrasena,
Rol_Usuario = Rol
Where ID_Usuario = ID ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `UsuarioMedico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,STRICT_ALL_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ALLOW_INVALID_DATES,ERROR_FOR_DIVISION_BY_ZERO,TRADITIONAL,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `UsuarioMedico`(IN ID_M int unsigned, IN ID_U int unsigned)
Update Medico
Set ID_Usuario = ID_U
Where ID_Medico = ID_M ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
/*!50001 VIEW `medicov` AS (select `m`.`ID_Medico` AS `ID_Medico`,`m`.`Nombres` AS `Nombres`,`m`.`Apellidos` AS `Apellidos`,`e`.`Nombre` AS `Nombre`,`m`.`Estado` AS `Estado`,`m`.`cedula` AS `cedula` from (`medico` `m` join `especialidad` `e` on((`m`.`ID_Especialidad` = `e`.`ID_Especialidad`)))) */;
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

-- Dump completed on 2018-06-05 10:42:30
