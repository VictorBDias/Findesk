-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema findesk
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `findesk` ;

-- -----------------------------------------------------
-- Schema findesk
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `findesk` DEFAULT CHARACTER SET latin1 ;
USE `findesk` ;

-- -----------------------------------------------------
-- Table `findesk`.`config`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`config` ;

CREATE TABLE IF NOT EXISTS `findesk`.`config` (
  `idConfig` INT(11) NOT NULL,
  `admIpConfig` VARCHAR(15) NOT NULL,
  `userIpConfig` VARCHAR(15) NOT NULL,
  `portaConfig` INT(11) NOT NULL,
  `bufferSizeConfig` INT(11) NOT NULL,
  PRIMARY KEY (`idConfig`),
  UNIQUE INDEX `idConfig_UNIQUE` (`idConfig` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`administrador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`administrador` ;

CREATE TABLE IF NOT EXISTS `findesk`.`administrador` (
  `idAdm` INT(11) NOT NULL,
  `idConfig` INT(11) NOT NULL,
  PRIMARY KEY (`idAdm`),
  INDEX `fk_Administrador_Config1_idx` (`idConfig` ASC) VISIBLE,
  CONSTRAINT `fk_idAdmConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`config` (`idConfig`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`categoria` ;

CREATE TABLE IF NOT EXISTS `findesk`.`categoria` (
  `idCategoria` CHAR(1) NOT NULL,
  `nomeCat` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`),
  UNIQUE INDEX `nomeCat_UNIQUE` (`nomeCat` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`cor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`cor` ;

CREATE TABLE IF NOT EXISTS `findesk`.`cor` (
  `idCor` VARCHAR(7) NOT NULL COMMENT 'contÃªm o valor hexadecimal da cor referenciada',
  `nomeCor` VARCHAR(45) NOT NULL COMMENT 'contÃªm o nome da cor',
  PRIMARY KEY (`idCor`),
  UNIQUE INDEX `idCor_UNIQUE` (`idCor` ASC) VISIBLE,
  UNIQUE INDEX `nomeCor_UNIQUE` (`nomeCor` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`nome`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`nome` ;

CREATE TABLE IF NOT EXISTS `findesk`.`nome` (
  `idNome` CHAR(10) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `idCategoria` CHAR(1) NOT NULL,
  PRIMARY KEY (`idNome`),
  INDEX `fk_Nome_Categoria1_idx` (`idCategoria` ASC) VISIBLE,
  CONSTRAINT `fk_idCategoria`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `findesk`.`categoria` (`idCategoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`ano`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`ano` ;

CREATE TABLE IF NOT EXISTS `findesk`.`ano` (
  `idAno` INT NOT NULL,
  PRIMARY KEY (`idAno`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`dia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`dia` ;

CREATE TABLE IF NOT EXISTS `findesk`.`dia` (
  `idDia` INT NOT NULL,
  PRIMARY KEY (`idDia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`mes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`mes` ;

CREATE TABLE IF NOT EXISTS `findesk`.`mes` (
  `idMes` INT NOT NULL,
  PRIMARY KEY (`idMes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`data`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`data` ;

CREATE TABLE IF NOT EXISTS `findesk`.`data` (
  `idData` INT NOT NULL,
  `idDia` INT NOT NULL,
  `idMes` INT NOT NULL,
  `idAno` INT NOT NULL,
  PRIMARY KEY (`idData`),
  INDEX `fk_data_ano1_idx` (`idAno` ASC) VISIBLE,
  INDEX `fk_data_dia1_idx` (`idDia` ASC) VISIBLE,
  INDEX `fk_data_mes1_idx` (`idMes` ASC) VISIBLE,
  CONSTRAINT `fk_data_ano1`
    FOREIGN KEY (`idAno`)
    REFERENCES `findesk`.`ano` (`idAno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_data_dia1`
    FOREIGN KEY (`idDia`)
    REFERENCES `findesk`.`dia` (`idDia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_data_mes1`
    FOREIGN KEY (`idMes`)
    REFERENCES `findesk`.`mes` (`idMes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`dataEntrada`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`dataEntrada` ;

CREATE TABLE IF NOT EXISTS `findesk`.`dataEntrada` (
  `idDataEntrada` INT NOT NULL,
  `idData` INT NOT NULL,
  PRIMARY KEY (`idDataEntrada`),
  INDEX `fk_dataEntrada_data1_idx` (`idData` ASC) VISIBLE,
  CONSTRAINT `fk_dataEntrada_data1`
    FOREIGN KEY (`idData`)
    REFERENCES `findesk`.`data` (`idData`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`dataSaida`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`dataSaida` ;

CREATE TABLE IF NOT EXISTS `findesk`.`dataSaida` (
  `idDataSaida` INT NOT NULL,
  `idData` INT NOT NULL,
  PRIMARY KEY (`idDataSaida`),
  INDEX `fk_dataSaida_data1_idx` (`idData` ASC) VISIBLE,
  CONSTRAINT `fk_dataSaida_data1`
    FOREIGN KEY (`idData`)
    REFERENCES `findesk`.`data` (`idData`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`item`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`item` ;

CREATE TABLE IF NOT EXISTS `findesk`.`item` (
  `idItem` INT(11) NOT NULL COMMENT 'Valor de idÃªntificaÃ§Ã£o do item',
  `idCor` VARCHAR(7) NOT NULL,
  `idNome` CHAR(10) NOT NULL,
  `idAdm` INT(11) NOT NULL,
  `idDataEntrada` INT NOT NULL,
  `idDataSaida` INT NOT NULL,
  `retiradoItem` TINYINT(4) NOT NULL DEFAULT '0' COMMENT 'Valor valendo 1 = foi retirado ou 0 = nÃ£o foi retirado',
  `fotoItem` BLOB NULL DEFAULT NULL COMMENT 'Atributo referente ao arquivo de imagem do item',
  `descricaoItem` VARCHAR(200) NULL DEFAULT NULL COMMENT 'descriÃ§Ã£o escrita pelo administrador no momento do cadastro',
  PRIMARY KEY (`idItem`),
  INDEX `fk_idItemCor` (`idCor` ASC) VISIBLE,
  INDEX `fk_Item_Nome1_idx` (`idNome` ASC) VISIBLE,
  INDEX `fk_Item_Administrador1_idx` (`idAdm` ASC) VISIBLE,
  INDEX `fk_item_dataEntrada1_idx` (`idDataEntrada` ASC) VISIBLE,
  INDEX `fk_item_dataSaida1_idx` (`idDataSaida` ASC) VISIBLE,
  CONSTRAINT `fk_idAdm`
    FOREIGN KEY (`idAdm`)
    REFERENCES `findesk`.`administrador` (`idAdm`),
  CONSTRAINT `fk_idItemCor`
    FOREIGN KEY (`idCor`)
    REFERENCES `findesk`.`cor` (`idCor`),
  CONSTRAINT `fk_idNome`
    FOREIGN KEY (`idNome`)
    REFERENCES `findesk`.`nome` (`idNome`),
  CONSTRAINT `fk_item_dataEntrada1`
    FOREIGN KEY (`idDataEntrada`)
    REFERENCES `findesk`.`dataEntrada` (`idDataEntrada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_dataSaida1`
    FOREIGN KEY (`idDataSaida`)
    REFERENCES `findesk`.`dataSaida` (`idDataSaida`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`usuario` ;

CREATE TABLE IF NOT EXISTS `findesk`.`usuario` (
  `idUsuario` INT(11) NOT NULL,
  `idConfig` INT(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Config1_idx` (`idConfig` ASC) VISIBLE,
  CONSTRAINT `fk_idUsuConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`config` (`idConfig`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `findesk`.`config`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`config` (`idConfig`, `admIpConfig`, `userIpConfig`, `portaConfig`, `bufferSizeConfig`) VALUES (1, '127.0.0.1', '127.0.0.1', 1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`categoria`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('a', 'Eletrônicos');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`nome`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`nome` (`idNome`, `nome`, `idCategoria`) VALUES ('1', 'Pendrive', 'a');
INSERT INTO `findesk`.`nome` (`idNome`, `nome`, `idCategoria`) VALUES ('2', 'Notebook', 'a');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`ano`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`ano` (`idAno`) VALUES (2018);
INSERT INTO `findesk`.`ano` (`idAno`) VALUES (2019);
INSERT INTO `findesk`.`ano` (`idAno`) VALUES (2020);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`dia`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (1);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (2);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (3);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`mes`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (1);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (2);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (3);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (4);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (5);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (6);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (7);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (8);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (9);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (10);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (11);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (12);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`data`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`data` (`idData`, `idDia`, `idMes`, `idAno`) VALUES (1, 1, 1, 2018);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`dataEntrada`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`dataEntrada` (`idDataEntrada`, `idData`) VALUES (1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`dataSaida`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`dataSaida` (`idDataSaida`, `idData`) VALUES (1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`item`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (1, '#000000', '1', 1, 1, 1, 1, NULL, 'Lindo pendrive ');

COMMIT;

