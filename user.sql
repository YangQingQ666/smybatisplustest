/*
Navicat MySQL Data Transfer

Source Server         : localhostread1
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2021-06-26 16:06:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(225) DEFAULT NULL,
  `usertel` varchar(225) DEFAULT NULL,
  `usersex` varchar(225) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'smith', '1234567489', '1', '27d165e1f978ab3a670bf8123e25ca1b', 'c19c39a4a0a42d29bf65d1234d55cae7');
INSERT INTO `user` VALUES ('2', ' danny', '1245', '2', '27d165e1f978ab3a670bf8123e25ca1b', 'c19c39a4a0a42d29bf65d1234d55cae7');
