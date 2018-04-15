-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema harmonogram_szkolen
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema harmonogram_szkolen
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `harmonogram_szkolen` DEFAULT CHARACTER SET utf8 ;
USE `harmonogram_szkolen` ;

-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`training`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`training` (
  `id_t` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `type` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `akronim` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `start_date` DATE NOT NULL,
  `l_days` INT(11) NOT NULL,
  PRIMARY KEY (`id_t`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`categories` (
  `id_cat` INT(11) NOT NULL AUTO_INCREMENT,
  `id_t` INT(11) NOT NULL,
  `cat_name` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  PRIMARY KEY (`id_cat`),
  INDEX `id_t_idx` (`id_t` ASC),
  CONSTRAINT `id_t`
    FOREIGN KEY (`id_t`)
    REFERENCES `harmonogram_szkolen`.`training` (`id_t`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`calendar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`calendar` (
  `id_cal` INT(11) NOT NULL,
  `id_cat` INT(11) NOT NULL,
  `date` DATE NOT NULL,
  PRIMARY KEY (`id_cal`),
  INDEX `id_cat_idx` (`id_cat` ASC),
  CONSTRAINT `id_cat`
    FOREIGN KEY (`id_cat`)
    REFERENCES `harmonogram_szkolen`.`categories` (`id_cat`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`role` (
  `id_role` INT(11) NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  PRIMARY KEY (`id_role`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`user` (
  `id_user` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `last_name` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `initials` VARCHAR(4) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `id_role` INT(11) NOT NULL DEFAULT '2',
  PRIMARY KEY (`id_user`),
  UNIQUE INDEX `initials_UNIQUE` (`initials` ASC),
  INDEX `id_role_idx` (`id_role` ASC),
  CONSTRAINT `id_role`
    FOREIGN KEY (`id_role`)
    REFERENCES `harmonogram_szkolen`.`role` (`id_role`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`login` (
  `id_log` INT(11) NOT NULL AUTO_INCREMENT,
  `id_user` INT(11) NOT NULL,
  `login` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  `password` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_polish_ci' NOT NULL,
  PRIMARY KEY (`id_log`),
  INDEX `id_user_idx` (`id_user` ASC),
  CONSTRAINT `login_ibfk_1`
    FOREIGN KEY (`id_user`)
    REFERENCES `harmonogram_szkolen`.`user` (`id_user`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


-- -----------------------------------------------------
-- Table `harmonogram_szkolen`.`training_couch`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `harmonogram_szkolen`.`training_couch` (
  `id_tc` INT(11) NOT NULL AUTO_INCREMENT,
  `id_cal` INT(11) NOT NULL,
  `id_user` INT(11) NOT NULL,
  PRIMARY KEY (`id_tc`),
  INDEX `id_cal_idx` (`id_cal` ASC),
  INDEX `id_user_idx` (`id_user` ASC),
  CONSTRAINT `id_cal`
    FOREIGN KEY (`id_cal`)
    REFERENCES `harmonogram_szkolen`.`calendar` (`id_cal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_user`
    FOREIGN KEY (`id_user`)
    REFERENCES `harmonogram_szkolen`.`user` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_polish_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
