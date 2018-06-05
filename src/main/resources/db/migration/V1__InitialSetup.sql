CREATE TABLE `phoneresponse` (
  `customerId` BIGINT(20) NOT NULL,
  `loanId` BIGINT(20) NOT NULL,
  `authCode` VARCHAR(256) NULL,
  `phonenumber` VARCHAR(11) NOT NULL unique ,
  PRIMARY KEY (`loanId`));


INSERT INTO `phoneresponse` (`customerId`, `loanId`, `authCode`, `phonenumber`) VALUES ('664668', '483940', 'A897786209', '416123123');
INSERT INTO `phoneresponse` (`customerId`, `loanId`, `authCode`, `phonenumber`) VALUES ('671821', '479199', 'A783985672', '416456456');
INSERT INTO `phoneresponse` (`customerId`, `loanId`, `authCode`, `phonenumber`) VALUES ('671802', '479167', 'A094672985', '416789789');
