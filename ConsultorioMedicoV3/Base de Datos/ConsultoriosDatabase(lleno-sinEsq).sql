-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: prg2consultorios
-- ------------------------------------------------------
-- Server version	5.6.25-log

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
-- Table structure for table `atencionmedica`
--

DROP TABLE IF EXISTS `atencionmedica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atencionmedica` (
  `idAtencionMedica` int(11) NOT NULL AUTO_INCREMENT,
  `diagnosticoDescriptivoAte` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `estdoAte` varchar(15) COLLATE latin1_spanish_ci NOT NULL,
  `examenesPedidosAte` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `fechaAte` date NOT NULL,
  `horaAte` int(11) NOT NULL,
  `prescripcripcionAte` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `sintomasAte` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `signosvitalesAte` varchar(30) COLLATE latin1_spanish_ci DEFAULT NULL,
  `idMedicoAte` int(11) NOT NULL,
  `idRecepcionistaAte` int(11) NOT NULL,
  `idEnfermeroAte` int(11) NOT NULL,
  `idHIstClinica` int(11) NOT NULL,
  PRIMARY KEY (`idAtencionMedica`),
  KEY `idMedico_idx` (`idMedicoAte`),
  KEY `idPersonalAdministrativo_idx` (`idRecepcionistaAte`,`idEnfermeroAte`),
  KEY `idEnfermero_idx` (`idEnfermeroAte`),
  KEY `idHistCli_idx` (`idHIstClinica`),
  CONSTRAINT `idEnfermero` FOREIGN KEY (`idEnfermeroAte`) REFERENCES `personaladministrativo` (`idPersonalAdministrativo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idHistCli` FOREIGN KEY (`idHIstClinica`) REFERENCES `paciente` (`idHistClinica`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idMedico` FOREIGN KEY (`idMedicoAte`) REFERENCES `medico` (`idMedico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idRecepcionista` FOREIGN KEY (`idRecepcionistaAte`) REFERENCES `personaladministrativo` (`idPersonalAdministrativo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atencionmedica`
--

LOCK TABLES `atencionmedica` WRITE;
/*!40000 ALTER TABLE `atencionmedica` DISABLE KEYS */;
INSERT INTO `atencionmedica` VALUES (1,NULL,'Signos Vitales',NULL,'2015-03-04',8,NULL,NULL,NULL,2,16,15,1),(2,NULL,'Asignado',NULL,'2015-04-02',9,NULL,NULL,NULL,5,16,15,2),(3,NULL,'Signos Vitales',NULL,'2015-05-05',15,NULL,NULL,NULL,7,16,15,3),(4,NULL,'Asignado',NULL,'2014-12-31',22,NULL,NULL,NULL,3,16,15,4);
/*!40000 ALTER TABLE `atencionmedica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cie`
--

DROP TABLE IF EXISTS `cie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cie` (
  `idCie` int(11) NOT NULL AUTO_INCREMENT,
  `codigoCie` varchar(4) COLLATE latin1_spanish_ci NOT NULL,
  `descripcionCie` varchar(80) COLLATE latin1_spanish_ci NOT NULL,
  `idCiePadre` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCie`),
  KEY `cie_padre_idx` (`idCiePadre`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cie`
--

LOCK TABLES `cie` WRITE;
/*!40000 ALTER TABLE `cie` DISABLE KEYS */;
INSERT INTO `cie` VALUES (1,'A00','CÓLERA',NULL),(2,'A000','Cólera debido a Vibrio cholarea 01, biotipo cholorrea',1),(3,'A001','Cólera debido a Vibrio cholorea 01, biotipo El Tor',1),(4,'A009','Cólera, no especifícado',1),(5,'A87','MENINGITIS VIRAL',NULL),(6,'A870','Meningitis enteroviral ',5),(7,'A872','Coriomeningitis linfocítica',5),(8,'A878','Otras meningitis virales',5),(9,'B30','CONJUNTIVITIS VIRAL',NULL),(10,'B302','Faringoconjuntivitis viral',9),(11,'B308','Otras conjuntivitis virales',9),(12,'B301','Conjuntivitis debido a adenovirus',9),(13,'E24','SÍNDROME DE CUSHING',NULL),(14,'E241','Síndrome de Nelson',13),(15,'E243','Síndrome de ACTH ectópico',13),(16,'E249','Síndrome de Cushing, no especificado',13),(17,'F91','TRASTORNOS DE LA CONDUCTA',NULL),(18,'F911','Trastorno de la conducta insociable',17),(19,'F913','Trastorno opositor desafiante',17),(20,'F918','Otros trastornos de la conducta',17);
/*!40000 ALTER TABLE `cie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosticoate`
--

DROP TABLE IF EXISTS `diagnosticoate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnosticoate` (
  `idDiagnosticoAte` int(11) NOT NULL AUTO_INCREMENT,
  `idCie` int(11) NOT NULL,
  `idAtencionMedica` int(11) NOT NULL,
  PRIMARY KEY (`idDiagnosticoAte`),
  KEY `idCie_idx` (`idCie`),
  KEY `idAtencionMedica_idx` (`idAtencionMedica`),
  CONSTRAINT `idAtencionMedica` FOREIGN KEY (`idAtencionMedica`) REFERENCES `atencionmedica` (`idAtencionMedica`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idCie` FOREIGN KEY (`idCie`) REFERENCES `cie` (`idCie`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnosticoate`
--

LOCK TABLES `diagnosticoate` WRITE;
/*!40000 ALTER TABLE `diagnosticoate` DISABLE KEYS */;
INSERT INTO `diagnosticoate` VALUES (1,4,1),(2,7,2),(3,11,3),(4,18,4),(5,19,1);
/*!40000 ALTER TABLE `diagnosticoate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialidad` (
  `idEspecialidad` int(11) NOT NULL AUTO_INCREMENT,
  `descripcionEspecialidad` varchar(25) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`idEspecialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` VALUES (1,'UROLOGÍA'),(2,'PEDIATRÍA'),(3,'TRAUMATOLOGÍA'),(4,'GINECOLOGÍA Y OBSTETRICÍA'),(5,'OFTALMOLOGÍA'),(6,'NEUMOLOGÍA'),(7,'DERMATOLOGÍA'),(8,'OTORRINOLARINGOLOGÍA'),(9,'PSIQUIATRÍA'),(10,'ONCOLOGÍA'),(11,'GASTROENTEROLOGÍA');
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lugargeo`
--

DROP TABLE IF EXISTS `lugargeo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lugargeo` (
  `idLugarGeo` int(11) NOT NULL AUTO_INCREMENT,
  `codigoLugarGeo` varchar(6) COLLATE latin1_spanish_ci NOT NULL,
  `descripcionLugarGeo` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `idLugarGeoPadre` int(11) DEFAULT NULL,
  PRIMARY KEY (`idLugarGeo`),
  KEY `lugarGeoPadre_idx` (`idLugarGeoPadre`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lugargeo`
--

LOCK TABLES `lugargeo` WRITE;
/*!40000 ALTER TABLE `lugargeo` DISABLE KEYS */;
INSERT INTO `lugargeo` VALUES (1,'01','AZUAY',NULL),(2,'0101','CUENCA',1),(3,'010101','BELLAVISTA',2),(4,'010112','SUCRE',2),(5,'010109','MONAY',2),(6,'0103','GUALACEO',1),(7,'010351','CHORDELEG',6),(8,'010353','JADAN',6),(9,'010357','SAN  JUAN',6),(10,'0104','NABÓN',1),(11,'010451','COCHAPATA',10),(12,'010452','EL PROGRESO',10),(13,'010453','LAS NIEVES',10),(14,'17','PICHINCHA',NULL),(15,'1701','QUITO',14),(16,'170104','CHAUPICRUZ',15),(17,'170156','CONOCOTO',15),(18,'170176','PINTAG',15),(19,'1703','MEJÍA',14),(20,'170351','ALOAG',19),(21,'170356','TAMBILLO',19),(22,'170353','CUTUGLAHUA',19),(23,'1705','RUMIÑAHUI',14),(24,'170501','SANGOLQUI',23),(25,'170503','SAN RAFAEL',23),(26,'170552','RUMIPAMBA',23),(27,'09','GUAYAS',NULL),(28,'0901','GUAYAQUIL',27),(29,'090101','AYACUCHO',28),(30,'090157','PUNA',28),(31,'090113','URDANETA',28),(32,'0906','DAULE',27),(33,'090602','LA AURORA',32),(34,'090653','LAUREL',32),(35,'090654','LIMONAL',32),(36,'0919','SALITRE',27),(37,'091901','BOCANA',36),(38,'091903','CENTRAL',36),(39,'091905','SAN MATEO',36);
/*!40000 ALTER TABLE `lugargeo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico` (
  `idMedico` int(11) NOT NULL AUTO_INCREMENT,
  `jornadaAtencionMedica` varchar(1) COLLATE latin1_spanish_ci NOT NULL,
  `idPersonaMed` int(11) NOT NULL,
  `idEspecialidadMed` int(11) NOT NULL,
  PRIMARY KEY (`idMedico`),
  KEY `idPersona_idx` (`idPersonaMed`),
  KEY `idEspecialidadMed_idx` (`idEspecialidadMed`),
  CONSTRAINT `IdEspecialidad` FOREIGN KEY (`idEspecialidadMed`) REFERENCES `especialidad` (`idEspecialidad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idPersonaMed` FOREIGN KEY (`idPersonaMed`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,'M',2,3),(2,'M',5,11),(3,'V',6,7),(4,'V',7,9),(5,'N',10,7),(6,'N',12,9),(7,'M',13,3),(8,'M',15,11);
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL AUTO_INCREMENT,
  `antecedentesFamSaludPac` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `antecedentesPerSaludPac` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `direccionPac` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `fechaNacPac` date NOT NULL,
  `idPersonaPac` int(11) NOT NULL,
  `idLugarGeoResid` int(11) NOT NULL,
  `idHistClinica` int(11) DEFAULT NULL,
  `sexo` varchar(1) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idPaciente`),
  KEY `paciente-persona_idx` (`idPersonaPac`),
  KEY `paciente-lugarresisd_idx` (`idLugarGeoResid`),
  KEY `pac-histClinica` (`idHistClinica`),
  CONSTRAINT `idLugarGeoResid` FOREIGN KEY (`idLugarGeoResid`) REFERENCES `lugargeo` (`idLugarGeo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idPersona` FOREIGN KEY (`idPersonaPac`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'','','BRUNING OE2-34 Y MONTALVO','1980-12-22',1,17,1,'M'),(9,'','','VIA SAMBORONDON OE-3 Y SANTA MARIANITA','1985-11-11',4,37,2,'M'),(10,'','','AV. LOJA E4-25 Y TUNGURAHUA','1990-06-02',11,4,3,'F'),(11,NULL,NULL,'Alfredo Escudero Oe4-45 y La Maná','2001-01-20',16,20,4,'F'),(13,'','','ABDÓN CALDERÓN S4-49 Y MIGUEL RIOFRÍO','1988-03-01',21,17,5,'M'),(14,'','','CALLE J #25 Y GALO PLAZA','1989-01-01',22,16,6,'F'),(15,'','','ORTEGA GALINDO OE3-45 Y JIPIJAPA','1989-12-03',23,34,7,'M');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `apellido1Per` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `apellido2Per` varchar(20) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre1Per` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `nombre2Per` varchar(20) COLLATE latin1_spanish_ci DEFAULT NULL,
  `cedulaPer` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `telefonoPer` varchar(10) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'LOPEZ','CAJAMARCA','ANDRÉS','SEBASTIÁN','1724543192','0996775622'),(2,'SALAZAR','LOPEZ','ANDREA','NOEMÍ','0125676734','0986223455'),(3,'ALVAREZ','NARANJO','EULALIA','ESTEFANÍA','1600573065','0990457689'),(4,'ACOSTA','RIVERA','ÁLVARO','GEOVANNY','1803515004','0995771112'),(5,'AMORES','ZURITA','DAYUMA','ELIZABETH','1500838642','0993145871'),(6,'ANAGUANO','SALAZAR','ALGENNIS','GABRIEL','1500830177','0996911704'),(7,'ARCOS','ALARCON','NATALY','ESTEFANÍA','1400625644','0995154926'),(10,'ARÉVALO','FUERES','NANCY','JANED','1900626092','0981831733'),(11,'CHICAIZA','MENDEZ','GILDA','ELIZABETH','1104013451','0995626038'),(12,'CHILUISA','FRANCO','SILVIA',NULL,'1206123497','0980296251'),(13,'CHILUISA',NULL,'DIEGO','ANDRES','1003086137','0983921047'),(14,'FRUTUS','DACTO','DIEGO','ANDRES','2000102166','0999951080'),(15,'GORDILLO','VINUEZA','RENÉ','MAURICIO','1804556544','0984410076'),(16,'HARO','BENITEZ','DIANA','VERONICA','0160076609','0991444102'),(17,'JATI','MORALES','LUIS','ANDRES','1804383584','0995215608'),(19,'CRIOLLO','RAMOS','JOSE','ANTONIO','1720192523','0996887511'),(21,'CRIOLLO','RAMOS','JUAN','ANTONIO','1720192523','0999787411'),(22,'VASCO','GUALOTUÑA','ELSA','SCARLETH','1720895984','0996887511'),(23,'ALVARADO','ANDY','FRANKLIN','JOSÉ','1500959364','0987387041');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personaladministrativo`
--

DROP TABLE IF EXISTS `personaladministrativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personaladministrativo` (
  `idPersonalAdministrativo` int(11) NOT NULL AUTO_INCREMENT,
  `cargoPersonalAdministrativo` varchar(15) COLLATE latin1_spanish_ci NOT NULL,
  `idPersonaPerAdm` int(11) NOT NULL,
  PRIMARY KEY (`idPersonalAdministrativo`),
  KEY `idPersona_idx` (`idPersonaPerAdm`),
  CONSTRAINT `idPersonaPA` FOREIGN KEY (`idPersonaPerAdm`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personaladministrativo`
--

LOCK TABLES `personaladministrativo` WRITE;
/*!40000 ALTER TABLE `personaladministrativo` DISABLE KEYS */;
INSERT INTO `personaladministrativo` VALUES (15,'ENFERMERÍA',17),(16,'RECEPCIÓN',3);
/*!40000 ALTER TABLE `personaladministrativo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-08 11:39:34
