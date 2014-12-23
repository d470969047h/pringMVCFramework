/*
Navicat MySQL Data Transfer

Source Server         : MyDATABASE
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2014-10-08 17:21:30
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `t_about`
-- ----------------------------
DROP TABLE IF EXISTS `t_about`;
CREATE TABLE `t_about` (
  `about_id` int(11) NOT NULL AUTO_INCREMENT,
  `about_content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`about_id`),
  KEY `Index_1` (`about_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_about
-- ----------------------------
INSERT INTO `t_about` VALUES ('1', '松岛枫松岛枫松岛枫 松岛枫松岛枫松岛枫');

-- ----------------------------
-- Table structure for `t_articles`
-- ----------------------------
DROP TABLE IF EXISTS `t_articles`;
CREATE TABLE `t_articles` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_Id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `label_id` int(11) DEFAULT NULL,
  `article_title` varchar(50) DEFAULT NULL,
  `article_content` varchar(5000) DEFAULT NULL,
  `article_post_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`article_id`),
  KEY `Index_1` (`article_id`),
  KEY `FK_Reference_10` (`label_id`),
  KEY `FK_Reference_8` (`user_Id`),
  KEY `FK_Reference_9` (`category_id`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`label_id`) REFERENCES `t_label` (`label_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`user_Id`) REFERENCES `t_userinfo` (`user_Id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`category_id`) REFERENCES `t_articles_category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_articles
-- ----------------------------
INSERT INTO `t_articles` VALUES ('1', '1', '1', '1', 'Dreamweaver CS4中使用CSS3属性提示', 'Dreamweaver CS4中使用CSS3属性提示\r\n在使用Dreamweaver CS4 编写css的时候,是否有想使用下css3的新特性呢?是否还在为某一个css3特性而去翻google呢? 现在出了专门为Dreamweaver而做的扩展 Dreamweaver Style Sheets,下载它是需要登录到adobe官方网站的,如果你嫌麻烦,我这里贡献下链接地址:点击这里,需要注意的一点是:下载下来的扩展是需要Dreamweaver的扩展管理器进行安装的,所以你的Dreamweaver必须得是安装版的才行.', '2014-10-06 13:59:22');
INSERT INTO `t_articles` VALUES ('2', '2', '2', '2', 'CSS 3.0 参考手册API', 'css 3.0 中文手册API\r\nCSS 3.0 参考手册 (中文版) CSS 是 Cascading Style Sheet 的缩写。译作「层叠样式表」。是用于(增强)控制网页样式并允许将样式信息与网页内容分离的一种标记性语言。手册难点 中文资料少，对英文翻译功底要求较高； 基础语法要求字斟句酌，避免产生歧义.', '2014-10-06 13:59:53');
INSERT INTO `t_articles` VALUES ('3', '3', '3', '3', '再推荐一本css的书', '再推荐一本css的书\r\n上上篇日志中我推荐了css禅意花园,想必大家都看到了其简介的语言与循序渐进的内容,这次再推荐一本,我下的是中文版pdf的电子书,大家可以上gougou.com上面去搜一下,注意挑中文版哦,这个书翻译的还不错,至少没有让人不知所云的词句.就是有一些概念,我们不那么叫而已.例如我们说”盒子模型”,而不是”框模型”. 看了这本书,你会更加的憎恶ie6了,因为其在讲述每个知识点的时候就穿插进了ie6对于此知识点是如何的表现的.这本书适合于知道css是什么以及怎么写的的同学,不是很高深,但全部看下来,你自己会有相当多的感悟.虽然话语有些教条,但不是中国那么刻板.此书有助于我们建立书写css时的技巧性语句.', '2014-10-06 14:01:45');
INSERT INTO `t_articles` VALUES ('4', '4', '4', '4', '登录KingCMS 注册KingCM', '登录KingCMS 注册KingCMS\r\n通过上一次的研究，我们的kingcms应该已经安装完毕了，为了便于我们研究，那些配置文件里面的内容我都保持的默认状态。这时可以看到，根目录下面多了一个文件夹：db，就是数据库文件夹。', '2014-10-06 14:02:29');
INSERT INTO `t_articles` VALUES ('5', '5', '5', '2', '数据结构', '这个是一本数据结构书，请大家细细品味', '2014-10-22 14:44:21');

-- ----------------------------
-- Table structure for `t_articles_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_articles_category`;
CREATE TABLE `t_articles_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  KEY `Index_1` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_articles_category
-- ----------------------------
INSERT INTO `t_articles_category` VALUES ('1', 'DOTNET');
INSERT INTO `t_articles_category` VALUES ('2', 'JAVA');
INSERT INTO `t_articles_category` VALUES ('3', '美工实习');
INSERT INTO `t_articles_category` VALUES ('4', 'java实习');
INSERT INTO `t_articles_category` VALUES ('5', '.NET精华');
INSERT INTO `t_articles_category` VALUES ('6', '企业运维');

-- ----------------------------
-- Table structure for `t_friends`
-- ----------------------------
DROP TABLE IF EXISTS `t_friends`;
CREATE TABLE `t_friends` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_Id` int(11) DEFAULT NULL,
  `friend_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Index_1` (`id`),
  KEY `FK_Reference_2` (`user_Id`),
  KEY `FK_Reference_3` (`friend_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`user_Id`) REFERENCES `t_userinfo` (`user_Id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`friend_id`) REFERENCES `t_userinfo` (`user_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_friends
-- ----------------------------
INSERT INTO `t_friends` VALUES ('1', '1', '2');
INSERT INTO `t_friends` VALUES ('2', '2', '3');
INSERT INTO `t_friends` VALUES ('3', '3', '1');
INSERT INTO `t_friends` VALUES ('4', '3', '4');
INSERT INTO `t_friends` VALUES ('5', '4', '1');

-- ----------------------------
-- Table structure for `t_label`
-- ----------------------------
DROP TABLE IF EXISTS `t_label`;
CREATE TABLE `t_label` (
  `label_id` int(11) NOT NULL AUTO_INCREMENT,
  `label_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`label_id`),
  KEY `Index_1` (`label_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_label
-- ----------------------------
INSERT INTO `t_label` VALUES ('1', 'CSS');
INSERT INTO `t_label` VALUES ('2', 'java');
INSERT INTO `t_label` VALUES ('3', '.net');
INSERT INTO `t_label` VALUES ('4', 'PHP');

-- ----------------------------
-- Table structure for `t_message`
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) DEFAULT NULL,
  `message_cont` varchar(2500) DEFAULT NULL,
  PRIMARY KEY (`message_id`),
  KEY `Index_1` (`message_id`),
  KEY `FK_Reference_11` (`id`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`id`) REFERENCES `t_friends` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_message
-- ----------------------------
INSERT INTO `t_message` VALUES ('1', '1', '呵呵呵呵呵呵呵呵呵呵呵呵');
INSERT INTO `t_message` VALUES ('2', '2', '松岛枫松岛枫');
INSERT INTO `t_message` VALUES ('3', '3', '大时代说的');
INSERT INTO `t_message` VALUES ('4', '4', '5大时代阿萨德');

-- ----------------------------
-- Table structure for `t_photo_album`
-- ----------------------------
DROP TABLE IF EXISTS `t_photo_album`;
CREATE TABLE `t_photo_album` (
  `photo_album_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_Id` int(11) DEFAULT NULL,
  `photo_album_name` varchar(50) DEFAULT NULL,
  `album_info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`photo_album_id`),
  KEY `Index_1` (`photo_album_id`),
  KEY `FK_Reference_4` (`user_Id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`user_Id`) REFERENCES `t_userinfo` (`user_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_photo_album
-- ----------------------------

-- ----------------------------
-- Table structure for `t_photos`
-- ----------------------------
DROP TABLE IF EXISTS `t_photos`;
CREATE TABLE `t_photos` (
  `photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_album_id` int(11) DEFAULT NULL,
  `photo_name` varchar(50) NOT NULL,
  `store_path` varchar(100) DEFAULT NULL,
  `photo_info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`photo_id`),
  KEY `Index_1` (`photo_id`),
  KEY `FK_Reference_12` (`photo_album_id`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`photo_album_id`) REFERENCES `t_photo_album` (`photo_album_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_photos
-- ----------------------------

-- ----------------------------
-- Table structure for `t_school`
-- ----------------------------
DROP TABLE IF EXISTS `t_school`;
CREATE TABLE `t_school` (
  `school_ID` int(11) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`school_ID`),
  KEY `Index_1` (`school_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_school
-- ----------------------------
INSERT INTO `t_school` VALUES ('1', '河北联合大学');
INSERT INTO `t_school` VALUES ('2', '唐山学院');
INSERT INTO `t_school` VALUES ('3', '轻工学院');
INSERT INTO `t_school` VALUES ('4', '能源职业技术学院');
INSERT INTO `t_school` VALUES ('5', '工业职业技术学院');
INSERT INTO `t_school` VALUES ('6', '科技职业技术学院');

-- ----------------------------
-- Table structure for `t_sex`
-- ----------------------------
DROP TABLE IF EXISTS `t_sex`;
CREATE TABLE `t_sex` (
  `code` int(11) NOT NULL,
  `sex_name` char(4) DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `Index_1` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sex
-- ----------------------------
INSERT INTO `t_sex` VALUES ('1', '男');
INSERT INTO `t_sex` VALUES ('2', '女');

-- ----------------------------
-- Table structure for `t_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `t_userinfo`;
CREATE TABLE `t_userinfo` (
  `user_Id` int(11) NOT NULL AUTO_INCREMENT,
  `code` int(11) DEFAULT NULL,
  `school_ID` int(11) DEFAULT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(20) NOT NULL,
  `user_pass_que` varchar(200) DEFAULT NULL,
  `user_pass_ans` varchar(200) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `user_photo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`user_Id`),
  KEY `Index_1` (`user_Id`),
  KEY `FK_Reference_6` (`code`),
  KEY `FK_Reference_7` (`school_ID`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`code`) REFERENCES `t_sex` (`code`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`school_ID`) REFERENCES `t_school` (`school_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_userinfo
-- ----------------------------
INSERT INTO `t_userinfo` VALUES ('1', '1', '4', '123', '123', '123', '123', '2014-10-08', '123', '123@qq.com', '123', '/upload/1412572546349.jpg');
INSERT INTO `t_userinfo` VALUES ('2', '1', '4', 'a', 'a', 'a', 'a', '2014-10-08', 'a', 'a', 'a', '/upload/1412574459886.jpeg');
INSERT INTO `t_userinfo` VALUES ('3', '1', '6', 'b', 'b', 'b', 'b', '2014-10-08', 'ab', 'a', 'a', '/upload/1412574487558.jpg');
INSERT INTO `t_userinfo` VALUES ('4', '1', '2', 'u', 'u', 'u', 'u', '2014-10-14', 'u', 'u', 'u', '/upload/1412574517766.JPG');
INSERT INTO `t_userinfo` VALUES ('5', '2', '5', 'ui', 'ui', 'ui', 'ui', '2014-10-14', '4', 'uaaa', 'u', '/upload/1412574550256.JPG');
INSERT INTO `t_userinfo` VALUES ('6', '1', '5', 'ui3', '12', 'ui', 'ui', '2014-10-14', '4', 'uaaa', 'u', null);
INSERT INTO `t_userinfo` VALUES ('7', '1', '3', 'admin', 'admin', 'amdin', 'admin', '2014-10-22', 'beijing', 'ddd@qq.com', 'beijing', '/upload/1412578994031.jpg');
INSERT INTO `t_userinfo` VALUES ('8', '1', '6', 'gg', 'gg', 'gg', 'gg', '2014-10-16', 'gg', 'gggg', 'gg', '/upload/1412592747042.JPG');
INSERT INTO `t_userinfo` VALUES ('9', '1', '3', 't', 't', 't', 't', '2014-10-14', 't', 't', 't', '/upload/1412600978633.JPG');
INSERT INTO `t_userinfo` VALUES ('10', '1', '3', '5', '5', '5', '5', '2014-10-14', '5', '2', '5', '/upload/1412690142171.jpg');
INSERT INTO `t_userinfo` VALUES ('11', '1', '6', '654', '1', '654', '1', '2014-10-22', '1', '123@qq.com', '1', null);
INSERT INTO `t_userinfo` VALUES ('12', '1', '4', 'yoyo1', '1', '1', '1', '2014-11-06', '2', '555', '2', '/upload/1412697672827.jpg');
INSERT INTO `t_userinfo` VALUES ('13', '1', '2', 'success', '1', '1', '1', '2014-10-29', '2', '123@qq.com', '2', null);
INSERT INTO `t_userinfo` VALUES ('14', '1', '3', '戴晖', '123', '123', '123', '2014-10-30', '123', '470969043@qq.com', '123', '/upload/1412743698861.JPG');
INSERT INTO `t_userinfo` VALUES ('15', '1', '3', '戴晖123123', '123', '123', '123', '2014-10-30', '123', '470969043@qq.com', '123', null);
INSERT INTO `t_userinfo` VALUES ('16', '1', '3', '王艳红', '123', '123', '1', '2014-10-18', '123', '1', '123', '/upload/1412744467386.JPG');
