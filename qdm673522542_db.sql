/*
Navicat MySQL Data Transfer

Source Server         : 荣韬
Source Server Version : 50725
Source Host           : qdm673522542.my3w.com:3306
Source Database       : qdm673522542_db

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-02-10 09:53:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ao_user
-- ----------------------------
DROP TABLE IF EXISTS `ao_user`;
CREATE TABLE `ao_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ao_user
-- ----------------------------
INSERT INTO `ao_user` VALUES ('1001', 'genggeng', '123456');
INSERT INTO `ao_user` VALUES ('1002', 'aoao', '111111');
INSERT INTO `ao_user` VALUES ('1003', '', '');
