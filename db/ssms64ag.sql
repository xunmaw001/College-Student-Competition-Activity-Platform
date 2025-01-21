-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssms64ag
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssms64ag`
--

/*!40000 DROP DATABASE IF EXISTS `ssms64ag`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssms64ag` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssms64ag`;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='在线咨询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (181,'2022-04-26 07:07:47',1,1,'提问1','回复1',1),(182,'2022-04-26 07:07:47',2,2,'提问2','回复2',2),(183,'2022-04-26 07:07:47',3,3,'提问3','回复3',3),(184,'2022-04-26 07:07:47',4,4,'提问4','回复4',4),(185,'2022-04-26 07:07:47',5,5,'提问5','回复5',5),(186,'2022-04-26 07:07:47',6,6,'提问6','回复6',6);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuangxinchuangye`
--

DROP TABLE IF EXISTS `chuangxinchuangye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chuangxinchuangye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `chuangyeleixing` varchar(200) DEFAULT NULL COMMENT '创业类型',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  `bisaiyaoqiu` longtext COMMENT '比赛要求',
  `bisaineirong` longtext COMMENT '比赛内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='创新创业';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuangxinchuangye`
--

LOCK TABLES `chuangxinchuangye` WRITE;
/*!40000 ALTER TABLE `chuangxinchuangye` DISABLE KEYS */;
INSERT INTO `chuangxinchuangye` VALUES (61,'2022-04-26 07:07:47','比赛名称1','创业类型1','upload/chuangxinchuangye_fengmian1.jpg',1,'2022-04-26','比赛要求1','比赛内容1'),(62,'2022-04-26 07:07:47','比赛名称2','创业类型2','upload/chuangxinchuangye_fengmian2.jpg',2,'2022-04-26','比赛要求2','比赛内容2'),(63,'2022-04-26 07:07:47','比赛名称3','创业类型3','upload/chuangxinchuangye_fengmian3.jpg',3,'2022-04-26','比赛要求3','比赛内容3'),(64,'2022-04-26 07:07:47','比赛名称4','创业类型4','upload/chuangxinchuangye_fengmian4.jpg',4,'2022-04-26','比赛要求4','比赛内容4'),(65,'2022-04-26 07:07:47','比赛名称5','创业类型5','upload/chuangxinchuangye_fengmian5.jpg',5,'2022-04-26','比赛要求5','比赛内容5'),(66,'2022-04-26 07:07:47','比赛名称6','创业类型6','upload/chuangxinchuangye_fengmian6.jpg',6,'2022-04-26','比赛要求6','比赛内容6');
/*!40000 ALTER TABLE `chuangxinchuangye` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuangyeleixing`
--

DROP TABLE IF EXISTS `chuangyeleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chuangyeleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangyeleixing` varchar(200) NOT NULL COMMENT '创业类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `chuangyeleixing` (`chuangyeleixing`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='创业类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuangyeleixing`
--

LOCK TABLES `chuangyeleixing` WRITE;
/*!40000 ALTER TABLE `chuangyeleixing` DISABLE KEYS */;
INSERT INTO `chuangyeleixing` VALUES (51,'2022-04-26 07:07:47','创业类型1'),(52,'2022-04-26 07:07:47','创业类型2'),(53,'2022-04-26 07:07:47','创业类型3'),(54,'2022-04-26 07:07:47','创业类型4'),(55,'2022-04-26 07:07:47','创业类型5'),(56,'2022-04-26 07:07:47','创业类型6');
/*!40000 ALTER TABLE `chuangyeleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjingsaixinwen`
--

DROP TABLE IF EXISTS `discussjingsaixinwen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjingsaixinwen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='竞赛新闻评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjingsaixinwen`
--

LOCK TABLES `discussjingsaixinwen` WRITE;
/*!40000 ALTER TABLE `discussjingsaixinwen` DISABLE KEYS */;
INSERT INTO `discussjingsaixinwen` VALUES (211,'2022-04-26 07:07:47',1,1,'用户名1','评论内容1','回复内容1'),(212,'2022-04-26 07:07:47',2,2,'用户名2','评论内容2','回复内容2'),(213,'2022-04-26 07:07:47',3,3,'用户名3','评论内容3','回复内容3'),(214,'2022-04-26 07:07:47',4,4,'用户名4','评论内容4','回复内容4'),(215,'2022-04-26 07:07:47',5,5,'用户名5','评论内容5','回复内容5'),(216,'2022-04-26 07:07:47',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjingsaixinwen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusszhiyuanzhezhaomu`
--

DROP TABLE IF EXISTS `discusszhiyuanzhezhaomu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusszhiyuanzhezhaomu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8 COMMENT='志愿者招募评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusszhiyuanzhezhaomu`
--

LOCK TABLES `discusszhiyuanzhezhaomu` WRITE;
/*!40000 ALTER TABLE `discusszhiyuanzhezhaomu` DISABLE KEYS */;
INSERT INTO `discusszhiyuanzhezhaomu` VALUES (201,'2022-04-26 07:07:47',1,1,'用户名1','评论内容1','回复内容1'),(202,'2022-04-26 07:07:47',2,2,'用户名2','评论内容2','回复内容2'),(203,'2022-04-26 07:07:47',3,3,'用户名3','评论内容3','回复内容3'),(204,'2022-04-26 07:07:47',4,4,'用户名4','评论内容4','回复内容4'),(205,'2022-04-26 07:07:47',5,5,'用户名5','评论内容5','回复内容5'),(206,'2022-04-26 07:07:47',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusszhiyuanzhezhaomu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gudianwenxue`
--

DROP TABLE IF EXISTS `gudianwenxue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gudianwenxue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `wenxueleixing` varchar(200) DEFAULT NULL COMMENT '文学类型',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  `bisaiyaoqiu` longtext COMMENT '比赛要求',
  `bisaineirong` longtext COMMENT '比赛内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='古典文学';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gudianwenxue`
--

LOCK TABLES `gudianwenxue` WRITE;
/*!40000 ALTER TABLE `gudianwenxue` DISABLE KEYS */;
INSERT INTO `gudianwenxue` VALUES (121,'2022-04-26 07:07:47','比赛名称1','文学类型1','upload/gudianwenxue_fengmian1.jpg',1,'2022-04-26','比赛要求1','比赛内容1'),(122,'2022-04-26 07:07:47','比赛名称2','文学类型2','upload/gudianwenxue_fengmian2.jpg',2,'2022-04-26','比赛要求2','比赛内容2'),(123,'2022-04-26 07:07:47','比赛名称3','文学类型3','upload/gudianwenxue_fengmian3.jpg',3,'2022-04-26','比赛要求3','比赛内容3'),(124,'2022-04-26 07:07:47','比赛名称4','文学类型4','upload/gudianwenxue_fengmian4.jpg',4,'2022-04-26','比赛要求4','比赛内容4'),(125,'2022-04-26 07:07:47','比赛名称5','文学类型5','upload/gudianwenxue_fengmian5.jpg',5,'2022-04-26','比赛要求5','比赛内容5'),(126,'2022-04-26 07:07:47','比赛名称6','文学类型6','upload/gudianwenxue_fengmian6.jpg',6,'2022-04-26','比赛要求6','比赛内容6');
/*!40000 ALTER TABLE `gudianwenxue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingjibisai`
--

DROP TABLE IF EXISTS `jingjibisai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingjibisai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `jingjileixing` varchar(200) DEFAULT NULL COMMENT '竞技类型',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  `bisaiyaoqiu` longtext COMMENT '比赛要求',
  `bisaineirong` longtext COMMENT '比赛内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='竞技比赛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingjibisai`
--

LOCK TABLES `jingjibisai` WRITE;
/*!40000 ALTER TABLE `jingjibisai` DISABLE KEYS */;
INSERT INTO `jingjibisai` VALUES (141,'2022-04-26 07:07:47','比赛名称1','竞技类型1','upload/jingjibisai_fengmian1.jpg',1,'2022-04-26','比赛要求1','比赛内容1'),(142,'2022-04-26 07:07:47','比赛名称2','竞技类型2','upload/jingjibisai_fengmian2.jpg',2,'2022-04-26','比赛要求2','比赛内容2'),(143,'2022-04-26 07:07:47','比赛名称3','竞技类型3','upload/jingjibisai_fengmian3.jpg',3,'2022-04-26','比赛要求3','比赛内容3'),(144,'2022-04-26 07:07:47','比赛名称4','竞技类型4','upload/jingjibisai_fengmian4.jpg',4,'2022-04-26','比赛要求4','比赛内容4'),(145,'2022-04-26 07:07:47','比赛名称5','竞技类型5','upload/jingjibisai_fengmian5.jpg',5,'2022-04-26','比赛要求5','比赛内容5'),(146,'2022-04-26 07:07:47','比赛名称6','竞技类型6','upload/jingjibisai_fengmian6.jpg',6,'2022-04-26','比赛要求6','比赛内容6');
/*!40000 ALTER TABLE `jingjibisai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingjileixing`
--

DROP TABLE IF EXISTS `jingjileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingjileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jingjileixing` varchar(200) NOT NULL COMMENT '竞技类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jingjileixing` (`jingjileixing`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='竞技类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingjileixing`
--

LOCK TABLES `jingjileixing` WRITE;
/*!40000 ALTER TABLE `jingjileixing` DISABLE KEYS */;
INSERT INTO `jingjileixing` VALUES (131,'2022-04-26 07:07:47','竞技类型1'),(132,'2022-04-26 07:07:47','竞技类型2'),(133,'2022-04-26 07:07:47','竞技类型3'),(134,'2022-04-26 07:07:47','竞技类型4'),(135,'2022-04-26 07:07:47','竞技类型5'),(136,'2022-04-26 07:07:47','竞技类型6');
/*!40000 ALTER TABLE `jingjileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingsaibaoming`
--

DROP TABLE IF EXISTS `jingsaibaoming`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingsaibaoming` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `baomingbianhao` varchar(200) DEFAULT NULL COMMENT '报名编号',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` varchar(200) DEFAULT NULL COMMENT '开始日期',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `baomingshijian` datetime DEFAULT NULL COMMENT '报名时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `baomingbianhao` (`baomingbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='竞赛报名';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingsaibaoming`
--

LOCK TABLES `jingsaibaoming` WRITE;
/*!40000 ALTER TABLE `jingsaibaoming` DISABLE KEYS */;
INSERT INTO `jingsaibaoming` VALUES (171,'2022-04-26 07:07:47','1111111111','比赛名称1',1,'开始日期1','学号1','姓名1','手机1','学院1','专业1','2022-04-26 15:07:47','是',''),(172,'2022-04-26 07:07:47','2222222222','比赛名称2',2,'开始日期2','学号2','姓名2','手机2','学院2','专业2','2022-04-26 15:07:47','是',''),(173,'2022-04-26 07:07:47','3333333333','比赛名称3',3,'开始日期3','学号3','姓名3','手机3','学院3','专业3','2022-04-26 15:07:47','是',''),(174,'2022-04-26 07:07:47','4444444444','比赛名称4',4,'开始日期4','学号4','姓名4','手机4','学院4','专业4','2022-04-26 15:07:47','是',''),(175,'2022-04-26 07:07:47','5555555555','比赛名称5',5,'开始日期5','学号5','姓名5','手机5','学院5','专业5','2022-04-26 15:07:47','是',''),(176,'2022-04-26 07:07:47','6666666666','比赛名称6',6,'开始日期6','学号6','姓名6','手机6','学院6','专业6','2022-04-26 15:07:47','是','');
/*!40000 ALTER TABLE `jingsaibaoming` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingsaixinwen`
--

DROP TABLE IF EXISTS `jingsaixinwen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingsaixinwen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinwenbiaoti` varchar(200) DEFAULT NULL COMMENT '新闻标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `xinwenjianshu` longtext COMMENT '新闻简述',
  `jingsaineirong` longtext COMMENT '竞赛内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `laiyuan` varchar(200) DEFAULT NULL COMMENT '来源',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='竞赛新闻';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingsaixinwen`
--

LOCK TABLES `jingsaixinwen` WRITE;
/*!40000 ALTER TABLE `jingsaixinwen` DISABLE KEYS */;
INSERT INTO `jingsaixinwen` VALUES (41,'2022-04-26 07:07:47','新闻标题1','upload/jingsaixinwen_fengmian1.jpg','新闻简述1','竞赛内容1','2022-04-26','来源1',1,1),(42,'2022-04-26 07:07:47','新闻标题2','upload/jingsaixinwen_fengmian2.jpg','新闻简述2','竞赛内容2','2022-04-26','来源2',2,2),(43,'2022-04-26 07:07:47','新闻标题3','upload/jingsaixinwen_fengmian3.jpg','新闻简述3','竞赛内容3','2022-04-26','来源3',3,3),(44,'2022-04-26 07:07:47','新闻标题4','upload/jingsaixinwen_fengmian4.jpg','新闻简述4','竞赛内容4','2022-04-26','来源4',4,4),(45,'2022-04-26 07:07:47','新闻标题5','upload/jingsaixinwen_fengmian5.jpg','新闻简述5','竞赛内容5','2022-04-26','来源5',5,5),(46,'2022-04-26 07:07:47','新闻标题6','upload/jingsaixinwen_fengmian6.jpg','新闻简述6','竞赛内容6','2022-04-26','来源6',6,6);
/*!40000 ALTER TABLE `jingsaixinwen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kejichuangxin`
--

DROP TABLE IF EXISTS `kejichuangxin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kejichuangxin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `kejileixing` varchar(200) DEFAULT NULL COMMENT '科技类型',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  `bisaiyaoqiu` longtext COMMENT '比赛要求',
  `bisaineirong` longtext COMMENT '比赛内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='科技创新';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kejichuangxin`
--

LOCK TABLES `kejichuangxin` WRITE;
/*!40000 ALTER TABLE `kejichuangxin` DISABLE KEYS */;
INSERT INTO `kejichuangxin` VALUES (81,'2022-04-26 07:07:47','比赛名称1','科技类型1','upload/kejichuangxin_fengmian1.jpg',1,'2022-04-26','比赛要求1','比赛内容1'),(82,'2022-04-26 07:07:47','比赛名称2','科技类型2','upload/kejichuangxin_fengmian2.jpg',2,'2022-04-26','比赛要求2','比赛内容2'),(83,'2022-04-26 07:07:47','比赛名称3','科技类型3','upload/kejichuangxin_fengmian3.jpg',3,'2022-04-26','比赛要求3','比赛内容3'),(84,'2022-04-26 07:07:47','比赛名称4','科技类型4','upload/kejichuangxin_fengmian4.jpg',4,'2022-04-26','比赛要求4','比赛内容4'),(85,'2022-04-26 07:07:47','比赛名称5','科技类型5','upload/kejichuangxin_fengmian5.jpg',5,'2022-04-26','比赛要求5','比赛内容5'),(86,'2022-04-26 07:07:47','比赛名称6','科技类型6','upload/kejichuangxin_fengmian6.jpg',6,'2022-04-26','比赛要求6','比赛内容6');
/*!40000 ALTER TABLE `kejichuangxin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kejileixing`
--

DROP TABLE IF EXISTS `kejileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kejileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kejileixing` varchar(200) NOT NULL COMMENT '科技类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `kejileixing` (`kejileixing`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='科技类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kejileixing`
--

LOCK TABLES `kejileixing` WRITE;
/*!40000 ALTER TABLE `kejileixing` DISABLE KEYS */;
INSERT INTO `kejileixing` VALUES (71,'2022-04-26 07:07:47','科技类型1'),(72,'2022-04-26 07:07:47','科技类型2'),(73,'2022-04-26 07:07:47','科技类型3'),(74,'2022-04-26 07:07:47','科技类型4'),(75,'2022-04-26 07:07:47','科技类型5'),(76,'2022-04-26 07:07:47','科技类型6');
/*!40000 ALTER TABLE `kejileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leixing`
--

DROP TABLE IF EXISTS `leixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `leixing` varchar(200) NOT NULL COMMENT '类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `leixing` (`leixing`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leixing`
--

LOCK TABLES `leixing` WRITE;
/*!40000 ALTER TABLE `leixing` DISABLE KEYS */;
INSERT INTO `leixing` VALUES (91,'2022-04-26 07:07:47','类型1'),(92,'2022-04-26 07:07:47','类型2'),(93,'2022-04-26 07:07:47','类型3'),(94,'2022-04-26 07:07:47','类型4'),(95,'2022-04-26 07:07:47','类型5'),(96,'2022-04-26 07:07:47','类型6');
/*!40000 ALTER TABLE `leixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-26 07:07:47');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `waiyuyuyan`
--

DROP TABLE IF EXISTS `waiyuyuyan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `waiyuyuyan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  `bisaiyaoqiu` longtext COMMENT '比赛要求',
  `bisaineirong` longtext COMMENT '比赛内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='外语语言';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `waiyuyuyan`
--

LOCK TABLES `waiyuyuyan` WRITE;
/*!40000 ALTER TABLE `waiyuyuyan` DISABLE KEYS */;
INSERT INTO `waiyuyuyan` VALUES (101,'2022-04-26 07:07:47','比赛名称1','类型1','upload/waiyuyuyan_fengmian1.jpg',1,'2022-04-26','比赛要求1','比赛内容1'),(102,'2022-04-26 07:07:47','比赛名称2','类型2','upload/waiyuyuyan_fengmian2.jpg',2,'2022-04-26','比赛要求2','比赛内容2'),(103,'2022-04-26 07:07:47','比赛名称3','类型3','upload/waiyuyuyan_fengmian3.jpg',3,'2022-04-26','比赛要求3','比赛内容3'),(104,'2022-04-26 07:07:47','比赛名称4','类型4','upload/waiyuyuyan_fengmian4.jpg',4,'2022-04-26','比赛要求4','比赛内容4'),(105,'2022-04-26 07:07:47','比赛名称5','类型5','upload/waiyuyuyan_fengmian5.jpg',5,'2022-04-26','比赛要求5','比赛内容5'),(106,'2022-04-26 07:07:47','比赛名称6','类型6','upload/waiyuyuyan_fengmian6.jpg',6,'2022-04-26','比赛要求6','比赛内容6');
/*!40000 ALTER TABLE `waiyuyuyan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenxueleixing`
--

DROP TABLE IF EXISTS `wenxueleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenxueleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenxueleixing` varchar(200) NOT NULL COMMENT '文学类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `wenxueleixing` (`wenxueleixing`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='文学类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenxueleixing`
--

LOCK TABLES `wenxueleixing` WRITE;
/*!40000 ALTER TABLE `wenxueleixing` DISABLE KEYS */;
INSERT INTO `wenxueleixing` VALUES (111,'2022-04-26 07:07:47','文学类型1'),(112,'2022-04-26 07:07:47','文学类型2'),(113,'2022-04-26 07:07:47','文学类型3'),(114,'2022-04-26 07:07:47','文学类型4'),(115,'2022-04-26 07:07:47','文学类型5'),(116,'2022-04-26 07:07:47','文学类型6');
/*!40000 ALTER TABLE `wenxueleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenyileixing`
--

DROP TABLE IF EXISTS `wenyileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenyileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenyileixing` varchar(200) NOT NULL COMMENT '文艺类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `wenyileixing` (`wenyileixing`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='文艺类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenyileixing`
--

LOCK TABLES `wenyileixing` WRITE;
/*!40000 ALTER TABLE `wenyileixing` DISABLE KEYS */;
INSERT INTO `wenyileixing` VALUES (151,'2022-04-26 07:07:47','文艺类型1'),(152,'2022-04-26 07:07:47','文艺类型2'),(153,'2022-04-26 07:07:47','文艺类型3'),(154,'2022-04-26 07:07:47','文艺类型4'),(155,'2022-04-26 07:07:47','文艺类型5'),(156,'2022-04-26 07:07:47','文艺类型6');
/*!40000 ALTER TABLE `wenyileixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenyiwenyu`
--

DROP TABLE IF EXISTS `wenyiwenyu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenyiwenyu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bisaimingcheng` varchar(200) NOT NULL COMMENT '比赛名称',
  `wenyileixing` varchar(200) DEFAULT NULL COMMENT '文艺类型',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  `bisaiyaoqiu` longtext COMMENT '比赛要求',
  `bisaineirong` longtext COMMENT '比赛内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='文艺文娱';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenyiwenyu`
--

LOCK TABLES `wenyiwenyu` WRITE;
/*!40000 ALTER TABLE `wenyiwenyu` DISABLE KEYS */;
INSERT INTO `wenyiwenyu` VALUES (161,'2022-04-26 07:07:47','比赛名称1','文艺类型1','upload/wenyiwenyu_fengmian1.jpg',1,'2022-04-26','比赛要求1','比赛内容1'),(162,'2022-04-26 07:07:47','比赛名称2','文艺类型2','upload/wenyiwenyu_fengmian2.jpg',2,'2022-04-26','比赛要求2','比赛内容2'),(163,'2022-04-26 07:07:47','比赛名称3','文艺类型3','upload/wenyiwenyu_fengmian3.jpg',3,'2022-04-26','比赛要求3','比赛内容3'),(164,'2022-04-26 07:07:47','比赛名称4','文艺类型4','upload/wenyiwenyu_fengmian4.jpg',4,'2022-04-26','比赛要求4','比赛内容4'),(165,'2022-04-26 07:07:47','比赛名称5','文艺类型5','upload/wenyiwenyu_fengmian5.jpg',5,'2022-04-26','比赛要求5','比赛内容5'),(166,'2022-04-26 07:07:47','比赛名称6','文艺类型6','upload/wenyiwenyu_fengmian6.jpg',6,'2022-04-26','比赛要求6','比赛内容6');
/*!40000 ALTER TABLE `wenyiwenyu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2022-04-26 07:07:47','学号1','姓名1','123456','男',1,'13823888881','773890001@qq.com','学院1','专业1'),(12,'2022-04-26 07:07:47','学号2','姓名2','123456','男',2,'13823888882','773890002@qq.com','学院2','专业2'),(13,'2022-04-26 07:07:47','学号3','姓名3','123456','男',3,'13823888883','773890003@qq.com','学院3','专业3'),(14,'2022-04-26 07:07:47','学号4','姓名4','123456','男',4,'13823888884','773890004@qq.com','学院4','专业4'),(15,'2022-04-26 07:07:47','学号5','姓名5','123456','男',5,'13823888885','773890005@qq.com','学院5','专业5'),(16,'2022-04-26 07:07:47','学号6','姓名6','123456','男',6,'13823888886','773890006@qq.com','学院6','专业6');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzheshenqing`
--

DROP TABLE IF EXISTS `zhiyuanzheshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzheshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaomubianhao` varchar(200) DEFAULT NULL COMMENT '招募编号',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `gerenjianjie` varchar(200) NOT NULL COMMENT '个人简介',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='志愿者申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzheshenqing`
--

LOCK TABLES `zhiyuanzheshenqing` WRITE;
/*!40000 ALTER TABLE `zhiyuanzheshenqing` DISABLE KEYS */;
INSERT INTO `zhiyuanzheshenqing` VALUES (31,'2022-04-26 07:07:47','招募编号1','名称1',1,'学号1','姓名1','13823888881','','2022-04-26 15:07:47','是',''),(32,'2022-04-26 07:07:47','招募编号2','名称2',2,'学号2','姓名2','13823888882','','2022-04-26 15:07:47','是',''),(33,'2022-04-26 07:07:47','招募编号3','名称3',3,'学号3','姓名3','13823888883','','2022-04-26 15:07:47','是',''),(34,'2022-04-26 07:07:47','招募编号4','名称4',4,'学号4','姓名4','13823888884','','2022-04-26 15:07:47','是',''),(35,'2022-04-26 07:07:47','招募编号5','名称5',5,'学号5','姓名5','13823888885','','2022-04-26 15:07:47','是',''),(36,'2022-04-26 07:07:47','招募编号6','名称6',6,'学号6','姓名6','13823888886','','2022-04-26 15:07:47','是','');
/*!40000 ALTER TABLE `zhiyuanzheshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzhezhaomu`
--

DROP TABLE IF EXISTS `zhiyuanzhezhaomu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzhezhaomu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaomubianhao` varchar(200) DEFAULT NULL COMMENT '招募编号',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `didian` varchar(200) DEFAULT NULL COMMENT '地点',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `kaishishijian` date DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` date DEFAULT NULL COMMENT '结束时间',
  `huodongtupian` varchar(200) DEFAULT NULL COMMENT '活动图片',
  `fuwuneirong` longtext COMMENT '服务内容',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhaomubianhao` (`zhaomubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='志愿者招募';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzhezhaomu`
--

LOCK TABLES `zhiyuanzhezhaomu` WRITE;
/*!40000 ALTER TABLE `zhiyuanzhezhaomu` DISABLE KEYS */;
INSERT INTO `zhiyuanzhezhaomu` VALUES (21,'2022-04-26 07:07:47','1111111111','名称1','地点1',1,'2022-04-26','2022-04-26','upload/zhiyuanzhezhaomu_huodongtupian1.jpg','服务内容1',1),(22,'2022-04-26 07:07:47','2222222222','名称2','地点2',2,'2022-04-26','2022-04-26','upload/zhiyuanzhezhaomu_huodongtupian2.jpg','服务内容2',2),(23,'2022-04-26 07:07:47','3333333333','名称3','地点3',3,'2022-04-26','2022-04-26','upload/zhiyuanzhezhaomu_huodongtupian3.jpg','服务内容3',3),(24,'2022-04-26 07:07:47','4444444444','名称4','地点4',4,'2022-04-26','2022-04-26','upload/zhiyuanzhezhaomu_huodongtupian4.jpg','服务内容4',4),(25,'2022-04-26 07:07:47','5555555555','名称5','地点5',5,'2022-04-26','2022-04-26','upload/zhiyuanzhezhaomu_huodongtupian5.jpg','服务内容5',5),(26,'2022-04-26 07:07:47','6666666666','名称6','地点6',6,'2022-04-26','2022-04-26','upload/zhiyuanzhezhaomu_huodongtupian6.jpg','服务内容6',6);
/*!40000 ALTER TABLE `zhiyuanzhezhaomu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-27 15:10:32
