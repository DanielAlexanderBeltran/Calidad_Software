-- MySQL Script generated by MySQL Workbench
-- 07/08/15 11:37:29
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema prg2Consultorios
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `prg2Consultorios` ;

-- -----------------------------------------------------
-- Schema prg2Consultorios
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `prg2Consultorios` DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci ;
USE `prg2Consultorios` ;

-- -----------------------------------------------------
-- Table `prg2Consultorios`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`Persona` (
  `idPersona` INT(11) NOT NULL AUTO_INCREMENT,
  `apellido1Per` VARCHAR(20) NOT NULL,
  `apellido2Per` VARCHAR(20) NOT NULL,
  `nombre1Per` VARCHAR(20) NOT NULL,
  `nombre2Per` VARCHAR(20) NOT NULL,
  `cedulaPer` VARCHAR(10) NOT NULL,
  `telefonoPer` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idPersona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`LugarGeo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`LugarGeo` (
  `idLugarGeo` INT(11) NOT NULL AUTO_INCREMENT,
  `codigoLugarGeo` VARCHAR(6) NOT NULL,
  `descripcionLugarGeo` VARCHAR(20) NOT NULL,
  `idLugarGeoPadre` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idLugarGeo`))
ENGINE = InnoDB;

CREATE INDEX `lugarGeoPadre_idx` ON `prg2Consultorios`.`LugarGeo` (`idLugarGeoPadre` ASC);


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`Paciente` (
  `idPaciente` INT(11) NOT NULL AUTO_INCREMENT,
  `antecedentesFamSaludPac` VARCHAR(100) NULL,
  `antecedentesPerSaludPac` VARCHAR(100) NULL,
  `direccionPac` VARCHAR(100) NOT NULL,
  `fechaNacPac` DATE NOT NULL,
  `idPersonaPac` INT(11) NOT NULL,
  `idLugarGeoResid` INT(11) NOT NULL,
  `idHistClinica` INT(11) NULL,
  `sexo` VARCHAR(1) NULL,
  PRIMARY KEY (`idPaciente`),
  CONSTRAINT `idLugarGeoResid`
    FOREIGN KEY (`idLugarGeoResid`)
    REFERENCES `prg2Consultorios`.`LugarGeo` (`idLugarGeo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idPersona`
    FOREIGN KEY (`idPersonaPac`)
    REFERENCES `prg2Consultorios`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `paciente-persona_idx` ON `prg2Consultorios`.`Paciente` (`idPersonaPac` ASC);

CREATE INDEX `paciente-lugarresisd_idx` ON `prg2Consultorios`.`Paciente` (`idLugarGeoResid` ASC);

CREATE INDEX `pac-histClinica` ON `prg2Consultorios`.`Paciente` (`idHistClinica` ASC);


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`PersonalAdministrativo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`PersonalAdministrativo` (
  `idPersonalAdministrativo` INT(11) NOT NULL AUTO_INCREMENT,
  `cargoPersonalAdministrativo` VARCHAR(15) NOT NULL,
  `idPersonaPerAdm` INT(11) NOT NULL,
  PRIMARY KEY (`idPersonalAdministrativo`),
  CONSTRAINT `idPersonaPA`
    FOREIGN KEY (`idPersonaPerAdm`)
    REFERENCES `prg2Consultorios`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `idPersona_idx` ON `prg2Consultorios`.`PersonalAdministrativo` (`idPersonaPerAdm` ASC);


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`Especialidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`Especialidad` (
  `idEspecialidad` INT(11) NOT NULL,
  `descripcionEspecialidad` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`idEspecialidad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`Medico` (
  `idMedico` INT(11) NOT NULL AUTO_INCREMENT,
  `jornadaAtencionMedica` VARCHAR(1) NOT NULL,
  `idPersonaMed` INT(11) NOT NULL,
  `idEspecialidadMed` INT(11) NOT NULL,
  PRIMARY KEY (`idMedico`),
  CONSTRAINT `idPersonaMed`
    FOREIGN KEY (`idPersonaMed`)
    REFERENCES `prg2Consultorios`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idEspecialidadMed`
    FOREIGN KEY (`idEspecialidadMed`)
    REFERENCES `prg2Consultorios`.`Especialidad` (`idEspecialidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `idPersona_idx` ON `prg2Consultorios`.`Medico` (`idPersonaMed` ASC);

CREATE INDEX `idEspecialidadMed_idx` ON `prg2Consultorios`.`Medico` (`idEspecialidadMed` ASC);


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`AtencionMedica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`AtencionMedica` (
  `idAtencionMedica` INT(11) NOT NULL AUTO_INCREMENT,
  `diagnosticoDescriptivoAte` VARCHAR(100) NULL,
  `estdoAte` VARCHAR(15) NOT NULL,
  `examenesPedidosAte` VARCHAR(50) NULL,
  `fechaAte` DATE NOT NULL,
  `horaAte` INT(11) NOT NULL,
  `prescripcripcionAte` VARCHAR(100) NULL,
  `sintomasAte` VARCHAR(100) NULL,
  `signosvitalesAte` VARCHAR(30) NULL,
  `idMedicoAte` INT(11) NOT NULL,
  `idRecepcionistaAte` INT(11) NOT NULL,
  `idEnfermeroAte` INT(11) NOT NULL,
  `idHIstClinica` INT(11) NOT NULL,
  PRIMARY KEY (`idAtencionMedica`),
  CONSTRAINT `idMedico`
    FOREIGN KEY (`idMedicoAte`)
    REFERENCES `prg2Consultorios`.`Medico` (`idMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idRecepcionista`
    FOREIGN KEY (`idRecepcionistaAte`)
    REFERENCES `prg2Consultorios`.`PersonalAdministrativo` (`idPersonalAdministrativo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idEnfermero`
    FOREIGN KEY (`idEnfermeroAte`)
    REFERENCES `prg2Consultorios`.`PersonalAdministrativo` (`idPersonalAdministrativo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idHistCli`
    FOREIGN KEY (`idHIstClinica`)
    REFERENCES `prg2Consultorios`.`Paciente` (`idHistClinica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `idMedico_idx` ON `prg2Consultorios`.`AtencionMedica` (`idMedicoAte` ASC);

CREATE INDEX `idPersonalAdministrativo_idx` ON `prg2Consultorios`.`AtencionMedica` (`idRecepcionistaAte` ASC, `idEnfermeroAte` ASC);

CREATE INDEX `idEnfermero_idx` ON `prg2Consultorios`.`AtencionMedica` (`idEnfermeroAte` ASC);

CREATE INDEX `idHistCli_idx` ON `prg2Consultorios`.`AtencionMedica` (`idHIstClinica` ASC);


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`Cie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`Cie` (
  `idCie` INT(11) NOT NULL AUTO_INCREMENT,
  `codigoCie` VARCHAR(4) NOT NULL,
  `descripcionCie` VARCHAR(80) NOT NULL,
  `idCiePadre` INT(11) NULL,
  PRIMARY KEY (`idCie`))
ENGINE = InnoDB;

CREATE INDEX `cie_padre_idx` ON `prg2Consultorios`.`Cie` (`idCiePadre` ASC);


-- -----------------------------------------------------
-- Table `prg2Consultorios`.`DiagnosticoAte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prg2Consultorios`.`DiagnosticoAte` (
  `idDiagnosticoAte` INT(11) NOT NULL AUTO_INCREMENT,
  `idCie` INT(11) NOT NULL,
  `idAtencionMedica` INT(11) NOT NULL,
  PRIMARY KEY (`idDiagnosticoAte`),
  CONSTRAINT `idCie`
    FOREIGN KEY (`idCie`)
    REFERENCES `prg2Consultorios`.`Cie` (`idCie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idAtencionMedica`
    FOREIGN KEY (`idAtencionMedica`)
    REFERENCES `prg2Consultorios`.`AtencionMedica` (`idAtencionMedica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `idCie_idx` ON `prg2Consultorios`.`DiagnosticoAte` (`idCie` ASC);

CREATE INDEX `idAtencionMedica_idx` ON `prg2Consultorios`.`DiagnosticoAte` (`idAtencionMedica` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;