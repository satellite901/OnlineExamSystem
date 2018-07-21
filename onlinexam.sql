/*
Navicat MySQL Data Transfer

Source Server         : onlinexam
Source Server Version : 50623
Source Host           : 192.168.20.237:3306
Source Database       : onlinexam

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2018-07-21 18:05:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(40) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '语文');
INSERT INTO `course` VALUES ('2', '数学');
INSERT INTO `course` VALUES ('3', '物理');
INSERT INTO `course` VALUES ('4', '英语');
INSERT INTO `course` VALUES ('5', '英语');
INSERT INTO `course` VALUES ('6', '英语');
INSERT INTO `course` VALUES ('7', '英语');
INSERT INTO `course` VALUES ('8', '英语');
INSERT INTO `course` VALUES ('9', '英语');
INSERT INTO `course` VALUES ('10', '英语');
INSERT INTO `course` VALUES ('11', '英语');
INSERT INTO `course` VALUES ('12', '英语');
INSERT INTO `course` VALUES ('13', '英语');
INSERT INTO `course` VALUES ('14', '英语');
INSERT INTO `course` VALUES ('15', '英语');
INSERT INTO `course` VALUES ('16', '英语');
INSERT INTO `course` VALUES ('17', '英语');
INSERT INTO `course` VALUES ('18', '英语');
INSERT INTO `course` VALUES ('19', '英语');
INSERT INTO `course` VALUES ('20', '英语');
INSERT INTO `course` VALUES ('21', '英语');
INSERT INTO `course` VALUES ('22', '英语');
INSERT INTO `course` VALUES ('23', '英语');

-- ----------------------------
-- Table structure for `exam`
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `jud_list` varchar(100) COLLATE utf8_bin NOT NULL,
  `sch_list` varchar(100) COLLATE utf8_bin NOT NULL,
  `mch_list` varchar(100) COLLATE utf8_bin NOT NULL,
  `exam_time` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ex_fk_cid` (`course_id`),
  KEY `ex_fk_tid` (`teacher_id`),
  CONSTRAINT `ex_fk_cid` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  CONSTRAINT `ex_fk_tid` FOREIGN KEY (`teacher_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('5', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('6', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('7', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('8', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('9', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('10', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('11', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('12', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('13', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('14', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('15', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('16', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('17', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('18', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('19', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('20', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('21', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('22', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('23', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('24', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('25', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('26', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('27', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('28', '1', '1', '1,1,1,1,0', 'A,A,A,A,A,A', 'ABC,ADE,ABC,DEF', '2018-7-11');
INSERT INTO `exam` VALUES ('29', '1', '2', '57 26 52 56 53 35 86 71 31 77 49 37 84 93 29 9 25 19 76 41 ', '13 16 22 26 8 20 23 2 27 6 17 5 7 18 3 24 12 9 10 14 ', '58 32 78 24 66 26 44 23 22 74 86 46 60 81 13 35 9 76 51 89 ', '120分钟');

-- ----------------------------
-- Table structure for `identity`
-- ----------------------------
DROP TABLE IF EXISTS `identity`;
CREATE TABLE `identity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of identity
-- ----------------------------
INSERT INTO `identity` VALUES ('1', '管理员');
INSERT INTO `identity` VALUES ('2', '老师');
INSERT INTO `identity` VALUES ('3', '学生');

-- ----------------------------
-- Table structure for `judge`
-- ----------------------------
DROP TABLE IF EXISTS `judge`;
CREATE TABLE `judge` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) COLLATE utf8_bin NOT NULL,
  `deff_degree` double(4,0) NOT NULL,
  `answer` int(1) NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `jud_fk_cid` (`course_id`),
  CONSTRAINT `jud_fk_cid` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of judge
-- ----------------------------
INSERT INTO `judge` VALUES ('2', '2', '2', '2', '2');
INSERT INTO `judge` VALUES ('3', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('4', '十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('5', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('6', '社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('7', '全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('8', '建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('9', '农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('10', ' 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('11', '我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('12', '.为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('13', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('14', '十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('15', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('16', '社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('17', '全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('18', '建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('19', '农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('20', ' 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('21', '我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('22', '.为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('23', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('24', '十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('25', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('26', '社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('27', '全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('28', '建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('29', '农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('30', ' 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('31', '我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('32', '.为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('33', ' 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('34', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('35', '十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('36', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('37', '社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('38', '全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('39', '建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('40', '农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('41', ' 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('42', '我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('43', '..为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('44', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('45', '.十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('46', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('47', '.社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('48', '.全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('49', '.建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('50', '.农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('51', '. 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('52', '.我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('53', '..为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('54', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('55', '.十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('56', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('57', '.社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('58', '.全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('59', '.建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('60', '.农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('61', '. 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('62', '.我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('63', '..为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('64', '. 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('65', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('66', '十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('67', '党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('68', '社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('69', '全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('70', '建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('71', '农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('72', ' 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('73', '我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('74', '..为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('75', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('76', '.十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('77', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('78', '.社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('79', '.全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('80', '.建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('81', '.农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('82', '. 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('83', '.我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('84', '..为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('85', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('86', '.十九大报告明确，党是最高政治领导力量。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('87', '.党的十八大以来，国内外形势变化和我国各项事业发展提出的一个重大时代课题是必须从理论和实践结合上系统回答新时代坚持和发展什么样的中国特色社会主义、怎样坚持和发展中国特色社会主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('88', '.社会主义政治发展的必然要求是坚持党的的领导、人民当家作主、依法治国有机统一', '3', '1', '1');
INSERT INTO `judge` VALUES ('89', '.全面建成小康社会决胜期指的是从现在到二〇二一年。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('90', '.建设现代化经济体系，必须把发展经济的着力点放在虚拟经济上。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('91', '.农业农村农民问题是关系国计民生的基础性问题。', '3', '0', '1');
INSERT INTO `judge` VALUES ('92', '. 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');
INSERT INTO `judge` VALUES ('93', '.我们在长期的革命、建设和改革中总结出只有社会主义才能救中国，只有改革开放才能发展中国、发展社会主义、发展马克思主义。  ', '3', '1', '1');
INSERT INTO `judge` VALUES ('94', '..为贯彻十八大精神，党中央召开六次全会，分别就政府机构改革和职能转变、全面深化改革、全面推进依法治国、制定“十三五”规划、全面从严治党等重大问题作出决定和部署。  ', '3', '0', '1');
INSERT INTO `judge` VALUES ('95', '. 保持土地承包关系稳定并长久不变，第二轮土地承包到期后再延长二十年。', '3', '0', '1');

-- ----------------------------
-- Table structure for `multiplechoice`
-- ----------------------------
DROP TABLE IF EXISTS `multiplechoice`;
CREATE TABLE `multiplechoice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) COLLATE utf8_bin NOT NULL,
  `option_a` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_b` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_c` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_d` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_e` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_f` varchar(100) COLLATE utf8_bin NOT NULL,
  `deff_degree` double(4,0) NOT NULL,
  `answer` varchar(20) COLLATE utf8_bin NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mch_fk_cid` (`course_id`),
  CONSTRAINT `mch_fk_cid` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of multiplechoice
-- ----------------------------
INSERT INTO `multiplechoice` VALUES ('2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2');
INSERT INTO `multiplechoice` VALUES ('9', '各项工作都要把（ ），作为总的出发点和检验标准，尊重劳动、尊重知识、尊重人才、尊重创造，做到发展为了人民、发展依靠人民、发展成果由人民共享。', '有利于发展社会主义社会的生产力', '有利于增强社会主义国家的综合国力', '有利于改善社会主义生产关系', '有利于提高人民的生活水平', 'empty', 'empty', '3', 'ABD', '1');
INSERT INTO `multiplechoice` VALUES ('10', '新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('11', '要抓紧时机，加快发展，实施（ ），充分发挥科学技术作为第一生产力的作用，依靠科技进步，提高劳动者素质，促进国民经济又好又快发展。', '创新发展战略', '科教兴国战略', '人才强国战略', '可持续发展战略', 'empty', 'empty', '3', 'BCD', '1');
INSERT INTO `multiplechoice` VALUES ('12', '下列属于四项基本原则的是（ ）。', '坚持社会主义道路', '坚持中国共产党的领导', '坚持马克思列宁主义毛泽东思想', '坚持国家专政', 'empty', 'empty', '3', 'ABC', '1');
INSERT INTO `multiplechoice` VALUES ('13', '只有改革开放，才能（ ）。', '发展中国', '发展生产力', '发展社会主义', '发展马克思主义', 'empty', 'empty', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('14', '中国共产党领导人民发展社会主义市场经济，毫不动摇地巩固和发展公有制经济，毫不动摇地（）非公有制经济发展。', '鼓励', '增加', '支持', '引导', 'empty', 'empty', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('15', '统筹城乡发展、（ ），调整经济结构，转变经济发展方式。', '区域发展', '经济社会发展', '人与自然和谐发展', '国内发展和对外开放', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('16', '促进（ ）同步发展，建设社会主义新农村，走中国特色新型工业化道路，建设创新型国家。', '工业化', '信息化', '城镇化', '农业现代化', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('17', '坚持（ ）有机统一，走中国特色社会主义政治发展道路，扩大社会主义民主，健全社会主义法制，建设社会主义法治国家，巩固人民民主专政，建设社会主义政治文明。', '党的领导', '人民当家作主', '依法治国', '从严治党', 'empty', 'empty', '3', 'ABC', '1');
INSERT INTO `multiplechoice` VALUES ('18', '.中国共产党领导人民发展社会主义民主政治，坚持和完善（ ）。', '人民代表大会制度', '中国共产党领导的多党合作和政治协商制度', '民族区域自治制度', '基层群众自治制度', '啊啊啊啊无人机挖矿斐林试剂阿斯利康撒控件放拉数据反馈了', '昂屎风口浪尖埃里克附加赛了请我日我家热巧克力加速飞就卡萨', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('19', '.发展（ ）的人民民主，切实保障人民管理国家事务和社会事务、管理经济和文化事业的权利。', '更加广泛', '更加合理', '更加充分', '更加健全', '啊啊啊啊无人机挖矿斐林试剂阿斯利康撒控件放拉数据反馈了', '昂屎风口浪尖埃里克附加赛了请我日我家热巧克力加速飞就卡萨', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('20', '.广开言路，建立健全（ ）的制度和程序。', '民主选举', '民主决策', '民主管理', '民主监督', '案事发时控件放', 'ASFJQLWJAKSF撒风口浪尖爱上了', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('21', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('22', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('23', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('24', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('25', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('26', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('27', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('28', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('29', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('30', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('31', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('32', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('33', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('34', '由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('35', '设求解某问题的递归算法如下：F ( int n ){   if ( n= =1 ){      Move ( 1 ) ;   } else{      F ( n – 1 ) ;Move ( n ) ;F ( n – 1 ) ;   }}求解该算法的计算时间时，仅考虑算法Move 所做的计算为主要计算，且Move 为常数级算法。则算法F的计算时间T (n)的递推关系式为（   ）。', 'T(n)=T(n-1)+1', 'T(n)=2T(n+1)+1', 'T(n)=2T(n-1)+1', 'T(n)=2T(n-1)', 'empty', 'empty', '3', 'C', '1');
INSERT INTO `multiplechoice` VALUES ('36', '新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('37', '新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('38', '各项工作都要把（ ），作为总的出发点和检验标准，尊重劳动、尊重知识、尊重人才、尊重创造，做到发展为了人民、发展依靠人民、发展成果由人民共享。', '有利于发展社会主义社会的生产力', '有利于增强社会主义国家的综合国力', '有利于改善社会主义生产关系', '有利于提高人民的生活水平', 'empty', 'empty', '3', 'ABD', '1');
INSERT INTO `multiplechoice` VALUES ('39', '各项工作都要把（ ），作为总的出发点和检验标准，尊重劳动、尊重知识、尊重人才、尊重创造，做到发展为了人民、发展依靠人民、发展成果由人民共享。', '有利于发展社会主义社会的生产力', '有利于增强社会主义国家的综合国力', '有利于改善社会主义生产关系', '有利于提高人民的生活水平', 'empty', 'empty', '3', 'ABD', '1');
INSERT INTO `multiplechoice` VALUES ('40', '新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('41', '要抓紧时机，加快发展，实施（ ），充分发挥科学技术作为第一生产力的作用，依靠科技进步，提高劳动者素质，促进国民经济又好又快发展。', '创新发展战略', '科教兴国战略', '人才强国战略', '可持续发展战略', 'empty', 'empty', '3', 'BCD', '1');
INSERT INTO `multiplechoice` VALUES ('42', '下列属于四项基本原则的是（ ）。', '坚持社会主义道路', '坚持中国共产党的领导', '坚持马克思列宁主义毛泽东思想', '坚持国家专政', 'empty', 'empty', '3', 'ABC', '1');
INSERT INTO `multiplechoice` VALUES ('43', '只有改革开放，才能（ ）。', '发展中国', '发展生产力', '发展社会主义', '发展马克思主义', 'empty', 'empty', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('44', '中国共产党领导人民发展社会主义市场经济，毫不动摇地巩固和发展公有制经济，毫不动摇地（）非公有制经济发展。', '鼓励', '增加', '支持', '引导', 'empty', 'empty', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('45', '统筹城乡发展、（ ），调整经济结构，转变经济发展方式。', '区域发展', '经济社会发展', '人与自然和谐发展', '国内发展和对外开放', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('46', '促进（ ）同步发展，建设社会主义新农村，走中国特色新型工业化道路，建设创新型国家。', '工业化', '信息化', '城镇化', '农业现代化', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('47', '坚持（ ）有机统一，走中国特色社会主义政治发展道路，扩大社会主义民主，健全社会主义法制，建设社会主义法治国家，巩固人民民主专政，建设社会主义政治文明。', '党的领导', '人民当家作主', '依法治国', '从严治党', 'empty', 'empty', '3', 'ABC', '1');
INSERT INTO `multiplechoice` VALUES ('48', '..中国共产党领导人民发展社会主义民主政治，坚持和完善（ ）。', '人民代表大会制度', '中国共产党领导的多党合作和政治协商制度', '民族区域自治制度', '基层群众自治制度', '啊啊啊啊无人机挖矿斐林试剂阿斯利康撒控件放拉数据反馈了', '昂屎风口浪尖埃里克附加赛了请我日我家热巧克力加速飞就卡萨', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('49', '..发展（ ）的人民民主，切实保障人民管理国家事务和社会事务、管理经济和文化事业的权利。', '更加广泛', '更加合理', '更加充分', '更加健全', '啊啊啊啊无人机挖矿斐林试剂阿斯利康撒控件放拉数据反馈了', '昂屎风口浪尖埃里克附加赛了请我日我家热巧克力加速飞就卡萨', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('50', '..广开言路，建立健全（ ）的制度和程序。', '民主选举', '民主决策', '民主管理', '民主监督', '案事发时控件放', 'ASFJQLWJAKSF撒风口浪尖爱上了', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('51', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('52', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('53', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('54', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('55', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('56', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('57', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('58', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('59', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('60', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('61', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('62', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('63', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('64', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('65', '.设求解某问题的递归算法如下：F ( int n ){   if ( n= =1 ){      Move ( 1 ) ;   } else{      F ( n – 1 ) ;Move ( n ) ;F ( n – 1 ) ;   }}求解该算法的计算时间时，仅考虑算法Move 所做的计算为主要计算，且Move 为常数级算法。则算法F的计算时间T (n)的递推关系式为（   ）。', 'T(n)=T(n-1)+1', 'T(n)=2T(n+1)+1', 'T(n)=2T(n-1)+1', 'T(n)=2T(n-1)', 'empty', 'empty', '3', 'C', '1');
INSERT INTO `multiplechoice` VALUES ('66', '.新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('67', '.新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('68', '.各项工作都要把（ ），作为总的出发点和检验标准，尊重劳动、尊重知识、尊重人才、尊重创造，做到发展为了人民、发展依靠人民、发展成果由人民共享。', '有利于发展社会主义社会的生产力', '有利于增强社会主义国家的综合国力', '有利于改善社会主义生产关系', '有利于提高人民的生活水平', 'empty', 'empty', '3', 'ABD', '1');
INSERT INTO `multiplechoice` VALUES ('69', '各项工作都要把（ ），作为总的出发点和检验标准，尊重劳动、尊重知识、尊重人才、尊重创造，做到发展为了人民、发展依靠人民、发展成果由人民共享。', '有利于发展社会主义社会的生产力', '有利于增强社会主义国家的综合国力', '有利于改善社会主义生产关系', '有利于提高人民的生活水平', 'empty', 'empty', '3', 'ABD', '1');
INSERT INTO `multiplechoice` VALUES ('70', '新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('71', '要抓紧时机，加快发展，实施（ ），充分发挥科学技术作为第一生产力的作用，依靠科技进步，提高劳动者素质，促进国民经济又好又快发展。', '创新发展战略', '科教兴国战略', '人才强国战略', '可持续发展战略', 'empty', 'empty', '3', 'BCD', '1');
INSERT INTO `multiplechoice` VALUES ('72', '下列属于四项基本原则的是（ ）。', '坚持社会主义道路', '坚持中国共产党的领导', '坚持马克思列宁主义毛泽东思想', '坚持国家专政', 'empty', 'empty', '3', 'ABC', '1');
INSERT INTO `multiplechoice` VALUES ('73', '只有改革开放，才能（ ）。', '发展中国', '发展生产力', '发展社会主义', '发展马克思主义', 'empty', 'empty', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('74', '中国共产党领导人民发展社会主义市场经济，毫不动摇地巩固和发展公有制经济，毫不动摇地（）非公有制经济发展。', '鼓励', '增加', '支持', '引导', 'empty', 'empty', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('75', '统筹城乡发展、（ ），调整经济结构，转变经济发展方式。', '区域发展', '经济社会发展', '人与自然和谐发展', '国内发展和对外开放', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('76', '促进（ ）同步发展，建设社会主义新农村，走中国特色新型工业化道路，建设创新型国家。', '工业化', '信息化', '城镇化', '农业现代化', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('77', '坚持（ ）有机统一，走中国特色社会主义政治发展道路，扩大社会主义民主，健全社会主义法制，建设社会主义法治国家，巩固人民民主专政，建设社会主义政治文明。', '党的领导', '人民当家作主', '依法治国', '从严治党', 'empty', 'empty', '3', 'ABC', '1');
INSERT INTO `multiplechoice` VALUES ('78', '..中国共产党领导人民发展社会主义民主政治，坚持和完善（ ）。', '人民代表大会制度', '中国共产党领导的多党合作和政治协商制度', '民族区域自治制度', '基层群众自治制度', '啊啊啊啊无人机挖矿斐林试剂阿斯利康撒控件放拉数据反馈了', '昂屎风口浪尖埃里克附加赛了请我日我家热巧克力加速飞就卡萨', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('79', '..发展（ ）的人民民主，切实保障人民管理国家事务和社会事务、管理经济和文化事业的权利。', '更加广泛', '更加合理', '更加充分', '更加健全', '啊啊啊啊无人机挖矿斐林试剂阿斯利康撒控件放拉数据反馈了', '昂屎风口浪尖埃里克附加赛了请我日我家热巧克力加速飞就卡萨', '3', 'ACD', '1');
INSERT INTO `multiplechoice` VALUES ('80', '..广开言路，建立健全（ ）的制度和程序。', '民主选举', '民主决策', '民主管理', '民主监督', '案事发时控件放', 'ASFJQLWJAKSF撒风口浪尖爱上了', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('81', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('82', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('83', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('84', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('85', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('86', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('87', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('88', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('89', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('90', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('91', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('92', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('93', '.设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是（      ）。', '2', '3', '4', '5', 'empty', 'empty', '3', 'B', '1');
INSERT INTO `multiplechoice` VALUES ('94', '.由4个叶子结点构造一棵哈夫曼树，该树的总结点数是（       ）。', '4', '5', '6', '7', 'empty', 'empty', '3', 'D', '1');
INSERT INTO `multiplechoice` VALUES ('95', '.设求解某问题的递归算法如下：F ( int n ){   if ( n= =1 ){      Move ( 1 ) ;   } else{      F ( n – 1 ) ;Move ( n ) ;F ( n – 1 ) ;   }}求解该算法的计算时间时，仅考虑算法Move 所做的计算为主要计算，且Move 为常数级算法。则算法F的计算时间T (n)的递推关系式为（   ）。', 'T(n)=T(n-1)+1', 'T(n)=2T(n+1)+1', 'T(n)=2T(n-1)+1', 'T(n)=2T(n-1)', 'empty', 'empty', '3', 'C', '1');
INSERT INTO `multiplechoice` VALUES ('96', '.新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('97', '.新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');
INSERT INTO `multiplechoice` VALUES ('98', '.各项工作都要把（ ），作为总的出发点和检验标准，尊重劳动、尊重知识、尊重人才、尊重创造，做到发展为了人民、发展依靠人民、发展成果由人民共享。', '有利于发展社会主义社会的生产力', '有利于增强社会主义国家的综合国力', '有利于改善社会主义生产关系', '有利于提高人民的生活水平', 'empty', 'empty', '3', 'ABD', '1');
INSERT INTO `multiplechoice` VALUES ('99', '新的发展阶段必须按照中国特色社会主义事业总体布局，全面推进经济建设、（ ）。', '政治建设', '文化建设', '社会建设', '生态文明建设', 'empty', 'empty', '3', 'ABCD', '1');

-- ----------------------------
-- Table structure for `outpaper`
-- ----------------------------
DROP TABLE IF EXISTS `outpaper`;
CREATE TABLE `outpaper` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  `jud_number` int(10) NOT NULL,
  `sch_number` int(10) NOT NULL,
  `mch_number` int(10) NOT NULL,
  `deff` varchar(20) COLLATE utf8_bin NOT NULL,
  `exam_time` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `opa_fk_cid` (`course_id`),
  CONSTRAINT `opa_fk_cid` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of outpaper
-- ----------------------------
INSERT INTO `outpaper` VALUES ('3', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('4', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('5', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('6', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('7', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('8', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('9', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('10', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('11', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('12', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('13', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('14', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('15', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('16', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('17', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('18', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('19', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('20', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('21', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('22', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('23', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('24', '1', '30', '20', '10', '简单', '2018-7-19');
INSERT INTO `outpaper` VALUES ('25', '1', '30', '20', '10', '简单', '2018-7-19');

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `jud_ans` varchar(100) COLLATE utf8_bin NOT NULL,
  `sch_ans` varchar(100) COLLATE utf8_bin NOT NULL,
  `mch_ans` varchar(100) COLLATE utf8_bin NOT NULL,
  `difficult` varchar(20) COLLATE utf8_bin NOT NULL,
  `exam_time` varchar(20) COLLATE utf8_bin NOT NULL,
  `score` double(10,0) NOT NULL,
  `finish_time` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `red_fk_uid` (`user_id`),
  KEY `red_fk_eid` (`exam_id`),
  CONSTRAINT `red_fk_eid` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`id`),
  CONSTRAINT `red_fk_uid` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', '1', '5', '疯狂', 'JAVA', '讲义', '难', '90', '92', '180');
INSERT INTO `record` VALUES ('2', '2', '6', '颓废', 'Andy', '演讲', '简单', '80', '100', '170');
INSERT INTO `record` VALUES ('3', '3', '7', 'andy', '喜欢', '唱歌', '中等', '10', '85', '110');
INSERT INTO `record` VALUES ('4', '3', '7', 'andy', '喜欢', '唱歌', '中等', '10', '85', '110');
INSERT INTO `record` VALUES ('5', '3', '7', 'andy', '喜欢', '唱歌', '中等', '10', '85', '110');
INSERT INTO `record` VALUES ('6', '3', '7', 'andy', '喜欢', '唱歌', '中等', '10', '85', '110');
INSERT INTO `record` VALUES ('7', '3', '7', 'andy', '喜欢', '唱歌', '中等', '10', '85', '110');

-- ----------------------------
-- Table structure for `singlechoice`
-- ----------------------------
DROP TABLE IF EXISTS `singlechoice`;
CREATE TABLE `singlechoice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) COLLATE utf8_bin NOT NULL,
  `option_a` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_b` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_c` varchar(100) COLLATE utf8_bin NOT NULL,
  `option_d` varchar(100) COLLATE utf8_bin NOT NULL,
  `deff_degree` double(4,0) NOT NULL,
  `answer` varchar(4) COLLATE utf8_bin NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sch_fk_cid` (`course_id`),
  CONSTRAINT `sch_fk_cid` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of singlechoice
-- ----------------------------
INSERT INTO `singlechoice` VALUES ('2', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('3', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('4', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('5', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('6', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('7', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('8', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '3', 'B', '1');
INSERT INTO `singlechoice` VALUES ('9', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('10', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('11', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('12', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('13', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('14', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('15', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('16', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('17', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('18', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('19', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('20', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('21', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('22', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('23', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('24', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('25', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '3', 'B', '1');
INSERT INTO `singlechoice` VALUES ('26', '1．	设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()    ）。', '2', '3', '4', '6', '2', 'B', '1');
INSERT INTO `singlechoice` VALUES ('27', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '3', 'B', '1');
INSERT INTO `singlechoice` VALUES ('28', '设栈S和队列Q的初始状态为空，元素e1,e2,e3,e4,e5,e6依次通过栈S，一个元素出栈后即进入队列Q，若6个元素出队的顺序是e2,e4,e3,e6,e5,e1，则栈S的容量至少应该是()。', '2', '3', '4', '6', '2', 'B', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `sex` varchar(4) COLLATE utf8_bin NOT NULL,
  `user_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `password` varchar(10) COLLATE utf8_bin NOT NULL,
  `identity_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`user_name`),
  KEY `us_fk_idty` (`identity_id`),
  KEY `user_name` (`user_name`),
  KEY `id` (`id`),
  CONSTRAINT `us_fk_idty` FOREIGN KEY (`identity_id`) REFERENCES `identity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '李三', '女', '3112002222', '123456', '1');
INSERT INTO `user` VALUES ('2', '李四', '男', '3115001234', '123456', '2');
INSERT INTO `user` VALUES ('3', '王五', '男', '3113002545', '123456', '3');
INSERT INTO `user` VALUES ('8', '张二', '不详', '201710001', '147258', '2');
INSERT INTO `user` VALUES ('11', '李四', '男', '1001', '123456', '1');

-- ----------------------------
-- Table structure for `user_course`
-- ----------------------------
DROP TABLE IF EXISTS `user_course`;
CREATE TABLE `user_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uc_fk_un` (`user_name`),
  KEY `uc_fk_cid` (`course_id`),
  CONSTRAINT `uc_fk_cid` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  CONSTRAINT `uc_fk_un` FOREIGN KEY (`user_name`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user_course
-- ----------------------------
INSERT INTO `user_course` VALUES ('6', '3112002222', '1');
INSERT INTO `user_course` VALUES ('7', '3112002222', '1');
INSERT INTO `user_course` VALUES ('8', '3112002222', '1');
INSERT INTO `user_course` VALUES ('9', '3112002222', '1');
INSERT INTO `user_course` VALUES ('10', '3112002222', '1');
INSERT INTO `user_course` VALUES ('11', '3112002222', '1');
INSERT INTO `user_course` VALUES ('12', '3112002222', '1');
INSERT INTO `user_course` VALUES ('13', '3112002222', '1');
INSERT INTO `user_course` VALUES ('14', '3112002222', '1');
INSERT INTO `user_course` VALUES ('15', '3112002222', '1');
INSERT INTO `user_course` VALUES ('16', '3112002222', '1');
INSERT INTO `user_course` VALUES ('17', '3112002222', '1');
INSERT INTO `user_course` VALUES ('18', '3112002222', '1');
INSERT INTO `user_course` VALUES ('19', '3112002222', '1');
INSERT INTO `user_course` VALUES ('20', '3112002222', '1');
INSERT INTO `user_course` VALUES ('21', '3112002222', '1');
INSERT INTO `user_course` VALUES ('22', '3112002222', '1');
INSERT INTO `user_course` VALUES ('23', '3112002222', '1');
INSERT INTO `user_course` VALUES ('24', '3112002222', '1');
INSERT INTO `user_course` VALUES ('25', '3112002222', '1');
INSERT INTO `user_course` VALUES ('26', '3112002222', '1');
INSERT INTO `user_course` VALUES ('27', '3112002222', '1');
INSERT INTO `user_course` VALUES ('28', '3112002222', '1');
