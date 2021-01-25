/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : common_mapper

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-08-31 11:21:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `table_emp`
-- ----------------------------
DROP TABLE IF EXISTS `table_emp`;
CREATE TABLE `table_emp` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(500) DEFAULT NULL,
  `emp_salary_apple` double(15,5) DEFAULT NULL,
  `emp_age` int(11) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_emp
-- ----------------------------
INSERT INTO `table_emp` VALUES ('1', 'tom', '1254.37000', '27');
INSERT INTO `table_emp` VALUES ('2', 'jerry', '6635.42000', '38');
INSERT INTO `table_emp` VALUES ('3', 'bob', '5560.11000', '40');
INSERT INTO `table_emp` VALUES ('4', 'kate', '2209.11000', '22');
INSERT INTO `table_emp` VALUES ('6', 'emp01', '1000.00000', '23');
INSERT INTO `table_emp` VALUES ('8', 'emp02', '3000.00000', '23');

-- ----------------------------
-- Table structure for `table_user`
-- ----------------------------
DROP TABLE IF EXISTS `table_user`;
CREATE TABLE `table_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `season` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_user
-- ----------------------------
INSERT INTO `table_user` VALUES ('1', 'justin', 'aaa,bbb,ccc', 'WINTER');
