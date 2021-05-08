-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: lol
-- ------------------------------------------------------
-- Server version	5.5.62

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
-- Table structure for table `champions`
--

DROP TABLE IF EXISTS `champions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `champions` (
  `name` varchar(100) NOT NULL,
  `image` varchar(100) DEFAULT NULL,
  `lane` varchar(100) DEFAULT NULL,
  `winrate` double DEFAULT NULL,
  `pickrate` double DEFAULT NULL,
  `tier` int(10) DEFAULT NULL,
  `characteristic` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `champions`
--

LOCK TABLES `champions` WRITE;
/*!40000 ALTER TABLE `champions` DISABLE KEYS */;
INSERT INTO `champions` VALUES ('Aatrox','Aatrox.png','top',47.13,6.7,5,'전사, 탱커, 띄우기, 탈출, 치유, 둔화'),('Ahri','Ahri.png','mid',47.31,7.1,5,'마법사, 암살자, 탈출, 치유, 도발'),('Akali','Akali.png','mid',47.44,8.4,5,'암살자, 둔화, 은신'),('Alistar','Alistar.png','sup',51.12,2.6,4,'탱커, 띄우기, 치유, 밀치기'),('Anivia','Anivia.png','mid',47.46,6.8,5,'마법사, 서포터, 둔화, 기절'),('Annie','Annie.png','mid',47.55,8.5,5,'마법사, 기절, 보호막'),('Aphelios','Aphelios.png','bot',47.61,8.2,5,'암살자, 원거리, 치유, 보호막, 둔화, 속박'),('Ashe','Ashe.png','bot',47.62,7.2,5,'원거리, 정찰, 둔화, 기절'),('AurelionSol','AurelionSol.png','mid',47.64,7,5,'마법사, 밀치기, 둔화, 기절'),('Azir','Azir.png','mid',47.66,6.9,5,'마법사, 원거리, 둔화, 밀치기'),('Bard','Bard.png','sup',47.67,7.3,5,'서포터, 치유, 둔화, 기절'),('Blitzcrank','Blitzcrank.png','sup',47.67,8.1,5,'탱커, 전사, 띄우기, 보호막, 침묵'),('Brand','Brand.png','sup',47.67,8.6,5,'마법사, 기절'),('Braum','Braum.png','sup',47.73,11.9,5,'서포터, 탱커, 띄우기, 둔화, 기절'),('Caitlyn','Caitlyn.png','bot',47.87,7.4,5,'원거리, 탈출, 둔화, 속박'),('Camille','Camille.png','top',47.88,7.5,5,'전사, 탱커, 밀치기, 보호막, 둔화, 기절'),('Cassiopeia','Cassiopeia.png','mid',47.89,7.6,5,'마법사, 둔화, 기절, 정찰'),('Cho\'Gath','Chogath.png','top',47.96,7.7,5,'탱커, 마법사, 띄우기, 침묵, 둔화'),('Corki','Corki.png','mid',48.11,5.7,5,'원거리, 탈출, 정찰, 밀치기, 둔화'),('Darius','Darius.png','top',48.14,11.7,5,'전사, 탱커, 둔화'),('Diana','Diana.png','mid',48.21,5.3,5,'전사, 마법사, 띄우기, 보호막'),('Draven','Draven.png','bot',48.36,5.8,5,'원거리, 밀치기, 둔화'),('Ekko','Ekko.png','mid',48.47,11.8,5,'암살자, 마법사, 치유, 둔화, 기절, 보호막, 탈출'),('Elise','Elise.png','jg',48.63,5.4,5,'마법사, 전사, 기절, 치유'),('Evelynn','Evelynn.png','jg',48.64,6,5,'암살자, 마법사, 둔화, 은신, 보호막'),('Ezreal','Ezreal.png','bot',48.64,8.7,5,'원거리, 마법사, 탈출'),('Fiddlesticks','Fiddlesticks.png','jg',48.71,6.2,4,'마법사, 서포터, 공포, 침묵, 치유'),('Fiora','Fiora.png','top',48.76,5.9,4,'전사, 암살자, 치유, 둔화, 기절'),('Fizz','Fizz.png','mid',48.96,6.5,4,'암살자, 전사, 탈출, 둔화, 밀치기'),('Galio','Galio.png','mid',48.97,6.1,4,'탱커, 마법사, 둔화, 보호막, 도발, 띄우기'),('Gangplank','Gangplank.png','top',48.97,6.4,4,'전사, 서포터, 치유, 둔화'),('Garen','Garen.png','top',48.99,6.3,4,'전사, 탱커, 침묵'),('Gnar','Gnar.png','top',49.11,4.7,4,'전사, 원거리, 둔화, 탈출, 밀치기, 기절'),('Gragas','Gragas.png','jg',49.13,4.6,4,'전사, 마법사, 탈출, 밀치기, 둔화, 기절'),('Graves','Graves.png','jg',49.13,8,4,'원거리, 탈출, 실명, 둔화'),('Hecarim','Hecarim.png','jg',49.21,8.8,4,'전사, 탱커, 밀치기, 공포, 탈출, 치유'),('Heimerdinger','Heimerdinger.png','top',49.27,0.6,4,'마법사, 서포터, 정찰, 둔화, 기절'),('Illaoi','Illaoi.png','top',49.31,11.5,4,'전사, 탱커, 둔화'),('Irelia','Irelia.png','top',49.34,11,4,'전사, 암살자, 치유, 둔화, 기절'),('Ivern','Ivern.png','jg',49.36,4.8,4,'탱커, 원거리, 서포터, 띄우기, 보호막, 둔화, 속박'),('Janna','Janna.png','sup',49.37,11.1,4,'서포터, 마법사, 띄우기, 치유, 밀치기, 보호막, 둔화'),('Jarvan IV','JarvanIV.png','jg',49.46,4.2,4,'전사, 탱커, 띄우기, 정찰, 보호막, 둔화, 탈출'),('Jax','Jax.png','top',49.46,11.4,4,'전사, 암살자, 탈출, 기절'),('Jayce','Jayce.png','top',49.47,4.1,4,'전사, 원거리, 밀치기, 둔화'),('Jhin','Jhin.png','bot',49.53,12,4,'원거리, 둔화, 속박'),('Jinx','Jinx.png','bot',49.54,0.5,4,'원거리, 둔화, 속박'),('Kai\'Sa','Kaisa.png','bot',49.55,4.3,4,'원거리, 보호막, 은신'),('Kalista','Kalista.png','bot',49.55,9.1,4,'원거리, 둔화, 밀치기, 띄우기, 정찰, 탈출'),('Karma','Karma.png','sup',49.58,4.1,4,'마법사, 서포터, 둔화, 속박, 치유, 보호막'),('Karthus','Karthus.png','jg',49.62,0.1,4,'마법사, 둔화'),('Kassadin','Kassadin.png','mid',49.64,0.7,3,'암살자, 마법사, 보호막, 둔화, 탈출'),('Katarina','Katarina.png','mid',49.66,4.5,3,'암살자, 마법사, 탈출'),('Kayle','Kayle.png','top',49.66,9,3,'전사, 치유, 둔화'),('Kayn','Kayn.png','jg',49.67,5,3,'전사, 탱커, 암살자, 띄우기, 둔화, 은신'),('Kennen','Kennen.png','top',49.67,9.2,3,'마법사, 원거리, 기절'),('Kha\'Zix','Khazix.png','jg',49.69,0.4,3,'암살자, 은신, 탈출, 치유, 둔화'),('Kindred','Kindred.png','jg',49.76,5.1,3,'원거리, 치유, 둔화, 탈출'),('Kled','Kled.png','top',49.77,0.3,3,'전사, 탱커, 띄우기, 밀치기, 둔화, 보호막, 탈출'),('LeBlanc','Leblanc.png','mid',49.87,0.2,3,'암살자, 마법사, 탈출, 둔화, 속박, 은신'),('Lee Sin','LeeSin.png','jg',49.88,5.2,3,'전사, 암살자, 탈출, 밀치기, 보호막, 둔화'),('Leona','Leona.png','sup',49.88,11.6,3,'탱커, 서포터, 둔화, 기절'),('Lillia','Lillia.png','jg',49.91,7.9,3,'마법사, 원거리, 둔화, 기절'),('Lissandra','Lissandra.png','mid',49.99,4.9,3,'마법사, 둔화, 속박, 기절, 탈출, 치유'),('Lucian','Lucian.png','bot',50.01,12.1,3,'원거리, 탈출'),('Lulu','Lulu.png','sup',50.02,12.2,3,'서포터, 마법사, 띄우기, 보호막, 둔화'),('Lux','Lux.png','sup',50.07,12.4,3,'마법사, 서포터, 정찰, 둔화, 속박, 보호막'),('Malphite','Malphite.png','top',50.09,12.5,3,'탱커, 전사, 띄우기, 보호막, 둔화, 탈출'),('Malzahar','Malzahar.png','mid',50.12,2.8,3,'마법사, 암살자, 침묵, 제압'),('Maokai','Maokai.png','top',50.12,0.8,3,'탱커, 마법사, 밀치기, 정찰, 보호막, 속박'),('Master Yi','MasterYi.png','jg',50.13,13.8,3,'암살자, 전사, 치유'),('Miss Fortune','MissFortune.png','bot',50.14,0.9,3,'원거리, 둔화'),('MonkeyKing','MonkeyKing.png','top',50.37,2.3,3,'전사, 탱커, 띄우기, 은신'),('Mordekaiser','Mordekaiser.png','top',50.19,13.2,3,'전사, 보호막'),('Morgana','Morgana.png','mid',50.34,2.3,3,'마법사, 서포터, 보호막, 둔화, 속박, 기절, 치유'),('Nami','Nami.png','sup',50.39,9.8,3,'서포터, 마법사, 띄우기, 기절, 치유, 둔화'),('Nasus','Nasus.png','top',50.47,4.8,2,'전사, 탱커, 둔화'),('Nautilus','Nautilus.png','sup',50.47,13.9,2,'탱커, 전사, 띄우기, 보호막, 둔화, 속박, 기절'),('Neeko','Neeko.png','mid',50.49,12.6,2,'마법사, 속박, 기절, 둔화, 보호막'),('Nidalee','Nidalee.png','jg',50.5,1.1,2,'암살자, 전사, 탈출, 치유, 정찰'),('Nocturne','Nocturne.png','jg',50.57,1.2,2,'암살자, 전사, 공포, 보호막'),('Nunu & Willump','Nunu.png','jg',50.58,1.3,2,'서포터, 전사, 치유, 둔화'),('Olaf','Olaf.png','jg',50.58,1.6,2,'전사, 탱커, 치유, 둔화'),('Orianna','Orianna.png','mid',50.63,12.9,2,'마법사, 서포터, 띄우기, 둔화, 정찰, 보호막'),('Ornn','Ornn.png','top',50.64,12.8,2,'전사, 탱커, 띄우기, 밀치기, 보호막'),('Pantheon','Pantheon.png','mid',50.66,9.3,2,'전사, 암살자, 기절, 둔화'),('Poppy','Poppy.png','top',50.67,9.4,2,'탱커, 전사, 밀치기, 기절, 보호막, 둔화, 띄우기'),('Pyke','Pyke.png','sup',50.69,9.6,2,'서포터, 암살자, 은신'),('Qiyana','Qiyana.png','mid',50.74,13.1,2,'암살자, 밀치기, 둔화, 속박, 은신, 기절'),('Quinn','Quinn.png','top',50.77,1.5,2,'원거리, 전사, 실명, 정찰, 둔화'),('Rakan','Rakan.png','sup',50.77,9.5,2,'서포터, 띄우기, 치유, 보호막, 도발'),('Rammus','Rammus.png','jg',50.79,1.4,2,'탱커, 전사, 둔화, 도발'),('Rek\'Sai','RekSai.png','jg',50.79,1.7,2,'전사, 치유, 띄우기, 정찰, 탈출'),('Rell','Rell.png','sup',50.79,9.7,2,'마법사, 서포터, 보호막, 속박, 기절'),('Renekton','Renekton.png','top',50.81,13.7,2,'전사, 탱커, 탈출, 치유, 기절'),('Rengar','Rengar.png','top',50.83,13.6,2,'암살자, 전사, 치유, 둔화, 속박, 은신'),('Riven','Riven.png','top',50.84,13.3,2,'전사, 암살자, 기절, 탈출, 보호막, 띄우기'),('Rumble','Rumble.png','top',50.86,13.4,2,'전사, 마법사, 보호막, 둔화'),('Ryze','Ryze.png','top',50.93,13,2,'마법사, 전사, 속박, 치유'),('Samira','Samira.png','bot',50.94,1.9,2,'원거리, 띄우기'),('Sejuani','Sejuani.png','jg',50.99,1.8,2,'탱커, 전사, 띄우기, 탈출, 둔화, 기절'),('Senna','Senna.png','sup',50.99,12.7,2,'원거리, 서포터, 치유, 보호막, 속박, 은신'),('Seraphine','Seraphine.png','sup',51.03,2.2,2,'마법사, 서포터, 보호막, 속박, 기절'),('Sett','Sett.png','top',51.03,2.3,2,'전사, 탱커, 띄우기, 치유, 보호막, 기절'),('Shaco','Shaco.png','jg',51.04,2.4,1,'암살자, 탈출, 공포, 둔화, 은신'),('Shen','Shen.png','top',51.1,2.2,1,'탱커, 전사, 치유, 탈출, 보호막, 도발'),('Shyvana','Shyvana.png','jg',51.11,2,1,'전사, 탱커, 탈출, 밀치기'),('Singed','Singed.png','top',51.74,2.7,1,'탱커, 전사, 둔화, 던지기, 치유, 속박'),('Sion','Sion.png','top',51.87,2.5,1,'전사, 탱커, 보호막, 기절, 둔화, 띄우기'),('Sivir','Sivir.png','bot',51.99,2.6,1,'원거리, 보호막'),('Skarner','Skarner.png','jg',52.03,2.8,1,'전사, 탱커, 보호막, 둔화, 제압, 기절'),('Sona','Sona.png','sup',52.19,10.7,1,'서포터, 마법사, 치유, 둔화, 기절, 보호막'),('Soraka','Soraka.png','sup',52.21,1.9,1,'서포터, 마법사, 치유, 침묵, 둔화, 속박'),('Swain','Swain.png','sup',52.46,2.9,1,'마법사, 전사, 치유, 둔화, 속박'),('Sylas','Sylas.png','top',52.47,3.4,1,'마법사, 띄우기, 기절, 보호막, 치유'),('Syndra','Syndra.png','mid',52.69,3.1,1,'마법사, 서포터, 기절, 둔화, 밀치기'),('Taliyah','Taliyah.png','jg',52.7,3,1,'마법사, 띄우기, 밀치기, 둔화'),('Talon','Talon.png','mid',52.78,3.3,1,'암살자, 전사, 둔화, 은신'),('Taric','Taric.png','sup',53.12,3.6,1,'탱커, 서포터, 치유, 기절'),('Teemo','Teemo.png','top',53.13,10.9,1,'원거리, 암살자, 실명, 정찰, 둔화, 은신'),('Thresh','Thresh.png','sup',53.44,3.7,1,'서포터, 전사, 밀치기, 둔화, 보호막, 기절, 정찰'),('Tristana','Tristana.png','bot',53.47,3.5,1,'원거리, 암살자, 탈출, 밀치기, 둔화'),('Tryndamere','Tryndamere.png','top',53.47,3.8,1,'전사, 암살자, 치유, 둔화, 탈출'),('Twisted Fate','TwistedFate.png','mid',53.47,10.8,1,'마법사, 정찰, 둔화, 기절, 탈출'),('Twitch','Twitch.png','bot',53.49,3.9,1,'원거리, 암살자, 둔화, 은신'),('Udyr','Udyr.png','jg',53.79,4,1,'전사, 탱커, 보호막, 치유, 기절'),('Urgot','Urgot.png','top',53.94,10.6,1,'전사, 원거리, 보호막, 둔화, 기절, 공포'),('Varus','Varus.png','bot',53.99,10.5,1,'원거리, 마법사, 둔화, 속박'),('Vayne','Vayne.png','bot',54.12,9.9,1,'원거리, 암살자, 탈출, 밀치기, 은신, 기절'),('Vel\'Koz','Velkoz.png','sup',54.13,10.1,1,'마법사, 띄우기, 둔화, 밀치기'),('Vi','Vi.png','jg',54.49,10.3,1,'전사, 암살자, 보호막, 제압, 탈출, 밀치기'),('Viego','Viego.png','top',54.77,10.2,1,'전사, 암살자, 밀치기, 은신, 기절'),('Viktor','Viktor.png','mid',54.93,10.4,1,'마법사, 보호막, 침묵, 기절, 둔화, 띄우기'),('Vladimir','Vladimir.png','top',50.12,5.2,3,'마법사, 탱커, 치유, 둔화'),('Volibear','Volibear.png','top',50.36,1.9,3,'전사, 탱커, 공포, 치유, 던지기, 둔화'),('Warwick','Warwick.png','jg',50.39,2.1,2,'전사, 탱커, 치유, 정찰, 제압'),('Xayah','Xayah.png','bot',50.99,1.1,2,'원거리, 속박'),('Xerath','Xerath.png','sup',50.14,0.3,3,'마법사, 암살자, 둔화, 기절'),('Xin Zhao','XinZhao.png','jg',49.12,0.2,4,'전사, 암살자, 띄우기, 치유, 둔화, 밀치기, 기절'),('Yasuo','Yasuo.png','mid',49.63,3.6,4,'전사, 암살자, 보호막, 띄우기, 제압'),('Yone','Yone.png','mid',49.97,5.4,3,'전사, 암살자, 띄우기, 보호막'),('Yorick','Yorick.png','top',49.62,1.1,4,'전사, 탱커, 밀치기, 둔화, 치유'),('Yuumi','Yuumi.png','sup',49.11,2.1,4,'서포터, 치유, 보호막, 둔화, 속박'),('Zac','Zac.png','jg',49.63,3.1,3,'탱커, 전사, 띄우기, 탈출, 둔화, 치유'),('Zed','Zed.png','mid',48.74,2.9,4,'암살자, 전사, 탈출, 둔화'),('Zilean','Zilean.png','sup',48.64,1.1,5,'서포터, 마법사, 둔화, 기절'),('Zoe','Zoe.png','mid',47.63,3.4,5,'마법사, 기절, 둔화'),('Zyra','Zyra.png','sup',49.36,2.6,4,'마법사, 서포터, 정찰, 둔화, 속박, 띄우기');
/*!40000 ALTER TABLE `champions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `items` (
  `name` varchar(100) NOT NULL,
  `img` varchar(100) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES ('B.F. 대검','image (13)','공격력 +40'),('가고일 돌갑옷','image (183)','방어력 +40 마법 저항력 +40'),('가시 갑옷','image (116)','체력 +250, 방어력 +80'),('가차없는 포격','image (276)','바다뱀 은화 500닢이 필요 포탄 세례가 시간이 갈수록 빠르게 발사'),('강철의 솔라리 왕관','image (218)','방어력 +45 마법 저항력 +75'),('강철의 솔라리 펜던트','image (181)','방어력 +30 마법 저항력 +60'),('강철의 영약','image (62)','9레벨 이상 구매 가능, 3분 동안 체력 +300, 강인함 25% 증가, 챔피언이 거대해지며, 강철의 길 효과'),('거대한 히드라','image (269)','체력 +450 공격력 +40 기본 체력 재생 +100%'),('거인의 허리띠','image (4)','체력 +380'),('고대 주화','image (193)','이동 속도 +5 재사용 대기시간 감소 +5% 10초당 골드 +2'),('고대유물 방패','image (194)','체력 +50 10초당 골드 +1'),('고속 연사포','image (130)','공격 속도 +30%, 치명타 확률 +30%, 이동 속도 +5%'),('곡괭이','image (12)','공격력 +25'),('곡궁','image (17)','공격 속도 +25%'),('공성 병기 반환','image (246)','구매한 모든 공성 병기를 반환하고 구매에 사용한 수정 파편을 돌려 받음'),('공성 시야 와드','image (251)','장신구 소지 개수는 1개로 제한 30초 동안 유지되는 투명 와드를 설치합니다. (재사용 대기시간 30초)'),('공성 투석기','image (238)','가장 가까이에 있는 포탑을 공격하는 투석기를 설치 투석기는 5초 후부터 가장 가까운 적 포탑을 공격해 막대한 피해를 입힘 대상 포탑이 파괴되면 투석기도 파괴'),('공허의 지팡이','image (156)','주문력 +70, 마법 관통력 +40%'),('광신도의 검','image (158)','공격 속도 +50%, 마법 저항력 +45, 재사용 대기시간 감소 +10%'),('광전사의 군화','image (76)','1개만 구입 가능, 공격 속도 +35%, 이동 속도 +45'),('광휘의 검','image (106)','마나 +250, 재사용 대기시간 감소 +10%'),('교활한 골드 주머니','image (65)','40 ~ 110골드'),('구원','image (140)','체력 +200, 기본 체력 재생 +50%, 기본 마나 재생 +150%, 재사용 대기시간 감소 +10%'),('구인수의 격노검','image (153)','공격력 +25, 주문력 +25, 공격 속도 +25%'),('군단의 방패','image (139)','방어력 +30, 마법 저항력 +30'),('굳건한 의지의 완전한 비스킷','image (39)','15초에 걸쳐 잃은 체력과 마나 + 15%'),('굶주린 히드라','image (115)','공격력 +80, 기본 체력 재생 +100%, 생명력 흡수 +12%'),('금지된 우상','image (147)','기본 마나 재생 +50%, 재사용 대기시간 감소 +5%, 회복 및 보호막 효과 +5%'),('기괴한 가면','image (157)','주문력 +35, 체력 +200'),('기동력의 장화','image (150)','1개만 구입 가능, 이동 속도가 +115 상승'),('기사의 맹세','image (142)','체력 +250, 방어력 +40, 재사용 대기시간 감소 +10%'),('꿰뚫어 보는 망원 와드','image (55)','와드 설치해 주변 지역을 드러냄, 최대 2000 유닛 범위까지 설치 가능'),('낡은 고대 주화','image (196)','이동 속도 +5 재사용 대기시간 감소 +5% 10초당 골드 +2'),('낡은 고대유물 방패','image (199)','체력 +50 10초당 골드 +2'),('낡은 산악 방벽','image (201)','체력 +350 기본 체력 재생 +100% 재사용 대기시간 감소 +10% 10초당 골드 +4'),('낡은 서리 여왕의 지배','image (204)','주문력 +60 재사용 대기시간 감소 +10% 10초당 골드 +2 기본 마나 재생 +50%'),('낡은 승천의 부적','image (198)','이동 속도 +10 방어력 +45 기본 체력 재생 +175% 재사용 대기시간 감소 +10% 10초당 골드 +2'),('낡은 얼음 송곳니','image (203)','주문력 +20 10초당 골드 +2 기본 마나 재생 +50% 재사용 대기시간 감소 +10%'),('낡은 유목민의 메달','image (197)','이동 속도 +10 기본 체력 재생 +50% 재사용 대기시간 감소 +10% 10초당 골드 +2'),('낡은 주문도둑의 검','image (202)','주문력 +10 10초당 골드 +2 기본 마나 재생 +25%'),('낡은 타곤산의 보호','image (200)','체력 +125 기본 체력 재생 +50% 10초당 골드 +4'),('내셔의 이빨','image (148)','공격 속도 +50%, 주문력 +80'),('넥서스 공성전: 공성 병기 장착 칸','image (243)','넥서스 공성전 중에는 소환사 주문이 공성 병기 장착 칸으로 바뀜. 상점에서 수정 파편을 이용해 공성 병기를 구매한 뒤 소환사 주문 키로 사용 가능'),('닌자의 신발','image (100)','1개만 구입 가능, 방어력 +20, 이동 속도 +45 기본 공격 피해량의 12% 방어'),('다이어트 포로 간식','image (52)','맛은 그대로, 칼로리는 절반! 몸매에도 건강에도 좋은 신제품입니다.'),('단검','image (16)','공격 속도 +12%'),('달빛 마법검','image (175)','주문력 +50, 방어력 +50, 마법 저항력 +50'),('대장간 불꽃 망토','image (213)','체력+625 방어력+90'),('대천사의 지팡이','image (74)','주문력 +50, 마나 +650, 재사용 대기시간 감소 +10%'),('대천사의 지팡이 (급속 충전)','image (77)','주문력 +50, 마나 +650, 재사용 대기시간 감소 +10%'),('대천사의 포옹','image (94)','주문력 +50, 마나 +1400, 재사용 대기시간 감소 +10%'),('덤불 조끼','image (117)','방어력 +35'),('도란의 검','image (22)','공격력 +8, 체력 +80, 생명력 흡수 +3%'),('도란의 반지','image (23)','체력 +60, 주문력 +15, 5초당 마나 재생 +5'),('도란의 방패','image (21)','체력 +80, 매 5초마다 체력 +6, 미니언에게 공격력 +5'),('도미닉 경의 인사','image (93)','공격력 +40, 방어구 관통력 +35%'),('드락사르의 황혼검','image (166)','공격력 +55, 재사용 대기시간 감소 +10%, 물리 관통력 +18'),('라바돈의 죽음모자','image (126)','주문력 +120, 주문력이 40% 상승'),('라바돈의 죽음왕관','image (214)','주문력 +175 주문력이 40% 상승'),('라일라이의 수정홀','image (149)','체력 +300, 주문력 +90'),('란두인의 예언','image (162)','체력 +400, 방어력 +60'),('롱소드','image (11)','공격력 +10'),('루난의 허리케인','image (123)','공격 속도 +40%, 치명타 확률 +30%, 이동 속도 +7%'),('루덴의 메아리','image (192)','주문력 +90 마나 +600 재사용 대기시간 감소 +10%'),('루비 수정','image (7)','체력 +150'),('리안드리의 고통','image (167)','주문력 +80, 체력 +300'),('리치베인','image (135)','주문력 +80, 이동 속도 +7%, 재사용 대기시간 감소 +10%, 마나 +250'),('마공학 핵 mk-1','image (185)','레벨당 주문력 +3 레벨당 마나 +15'),('마공학 핵 mk-2','image (186)','레벨당 주문력 +6 레벨당 마나 +20'),('마나 물약','image (37)','최대 5개 소지 가능, 15초에 걸쳐 마나 +100'),('마나무네','image (75)','공격력 +25, 마나 +250'),('마나무네 (급속 충전)','image (78)','공격력 +25, 마나 +250'),('마법 부여: 룬의 메아리','image (30)','주문력 +80, 재사용 대기시간 감소 +10%, 마나 +300'),('마법 부여: 용사','image (28)','공격력 +60, 재사용 대기시간 감소 +10%'),('마법 부여: 잿불거인','image (29)','체력 +300, 추가 체력 +15%'),('마법 부여: 피갈퀴손','image (34)','공격 속도 +50%'),('마법공학 GLP-800','image (89)','주문력 +80, 마나 +600, 재사용 대기시간 감소 +10%'),('마법공학 리볼버','image (164)','주문력 +40'),('마법공학 초기형 벨트-01','image (168)','체력 +300, 주문력 +60, 재사용 대기시간 감소 +10%'),('마법공학 총검','image (165)','공격력 +40, 주문력 +80'),('마법무효화의 망토','image (10)','마법 저항력 +25'),('마법사의 신발','image (81)','1개만 구입 가능, 마법 관통력 +18, 이동 속도 +45'),('마법사의 최후','image (128)','공격 속도 +40%, 마법 저항력 +40'),('마법의 영약','image (63)','9레벨 이상 구매 가능, 3분 동안 주문력 +50, 5초당 마나 재생량이 +15'),('망가진 초시계','image (69)','망가졌지만 업그레이드는 가능'),('망각의 구','image (281)','주문력 +25 체력 +200 죽음의 감촉: 마법 관통력 +15'),('망령 해적검 - 테스트 중','image (284)','공격력 +70 물리 관통력 +18 표식을 남긴 위치로 순간이동'),('망령의 두건','image (189)','체력 +250 마법 저항력 +25'),('망자의 갑옷','image (268)','체력 +425 방어력 +60'),('맬모셔스의 아귀','image (171)','공격력 +50, 마법 저항력 +50, 재사용 대기시간 감소 +10%'),('메자이의 영혼약탈자','image (95)','주문력 +20, 마나 +200'),('명석함의 아이오니아 장화','image (173)','1개만 구입 가능, 재사용 대기시간 감소 +10%, 이동 속도 +45'),('모렐로노미콘','image (174)','주문력 +80, 체력 +300'),('몰락한 왕의 검','image (169)','공격력 +40, 공격 속도 +25%, 생명력 흡수 +12%'),('무라마나','image (96)','공격력 +25, 마나 +1000'),('무지개 간식 파티 세트','image (259)','왕에게 먹이를: 왕이 적 뒤로 간식을 잔뜩 던져 포로들을 유인한 뒤 다시 자신에게 돌아오게함 포로와 부딪힌 적 챔피언은 앞으로 밀려나며 230~680의 물리 피해'),('무한의 대검','image (90)','공격력 +70, 치명타 확률이 두 배 증가, 치명타 피해량의 10% 고정 피해로 전환'),('무한의 용암대검','image (212)','공격력 +100  치명타 확률이 두 배 증가 치명타 피해량의 10%가 고정 피해로 전환'),('미니언 해체분석기','image (66)','대상 공격로 미니언 처치 (사거리 550, 재사용 대기시간 10초)'),('미카엘의 도가니','image (190)','마법 저항력 +40 재사용 대기시간 감소 +10% 기본 마나 재생 +100%'),('밀렵꾼의 단검','image (191)','공격력 +10'),('바미의 불씨','image (270)','체력 +200'),('반담 경의 철퇴','image (138)','체력 +300, 공격력 +50, 재사용 대기시간 +10%'),('밤의 끝자락','image (275)','체력 +250 공격력 +55 물리 관통력 +18'),('방출의 마법봉','image (5)','주문력 +40'),('밴시의 장막','image (137)','주문력 +75, 마법 저항력 +60, 재사용 대기시간 감소 +10%'),('별자리 망토','image (264)','별의 영혼: 쓰레쉬는 생성 시 대상으로 지정되지 않고 무적 상태가 되어 우주를 돌아다닐 수 있지만 스킬은 사용 불가, 안정된 지면에 내려서면 이 효과가 사라짐'),('보호막 토템','image (249)','지정한 위치에 보호막 토템을 설치 2초 후부터 토템이 활성화되어 근처의 모든 병기에 2(추가 보호막 토템 하나 당 +1)의 보호막'),('부패 물약','image (46)','한 번에 한 종류의 회복 물약만 소지 가능, 충전량 1회 소모시 12초 동안 체력 +125 마나 +75, 상점 방문시 충전량 +3회'),('분노의 영약','image (64)','9레벨 이상 구매 가능, 3분 동안 공격력이 +30'),('불타는 향로','image (231)','주문력 +60 재사용 대기시간 감소 +10% 기본 마나 재생 +50%'),('블랙홀 랜턴','image (261)','블랙홀 랜턴: 어둠의 통로 사용 시 자동으로 무력화된 아군을 보호 보호막 미생성'),('비전 탐지기','image (180)','체력 +225 마나 +250 방어력 +25 재사용 대기시간 감소 +20%'),('빌지워터 해적검','image (163)','공격력 +25, 생명력 흡수 +10%'),('빙하의 장막','image (83)','방어력 +20, 마나 +250'),('사기진작','image (278)','바다뱀 은화 500닢이 필요 포탄 세례 범위 안의 아군은 이제 2초간 이동 속도가 30% 상승'),('사냥꾼의 마체테','image (15)','몬스터 대상 생명력 흡수 +10%'),('사냥꾼의 물약','image (45)','한 번에 한 종류의 회복 물약만 소지 가능, 충전량 1회 소모시 8초 동안 체력 +60 마나 +35, 상점 방문시 충전량 +5회'),('사냥꾼의 부적','image (14)','몬스터 대상 생명력 흡수 +30 공경력 +60, 정글 또는 강에서 잃은 마나 비례 마나 회복 초당 최대 +8'),('사라진 양피지','image (273)','주문력 +40 마나 +300'),('사파이어 수정','image (6)','마나 +250'),('삼위일체','image (119)','체력 +250, 마나 +250, 공격력 +25, 공격 속도 +40%, 재사용 대기시간 감소 +20%, 이동 속도 +5%'),('상급 투명 감지 토템 (장신구)','image (209)','장신구 소지 개수는 1개로 제한, 업그레이드하려면 9레벨 이상, 파괴될 때까지 주변 지역과 투명한 유닛을 드러내 주는 불투명한 와드를 설치'),('상급 투명 토템 (장신구)','image (208)','장신구 소지 개수는 1개로 제한, 업그레이드 9레벨 이상,  충전량을 1 소모하여, 180초 동안 유지되며 주변을 드러내 주는 투명한 와드를 설치'),('생명선','image (283)','공격력 +20 물리 관통력 +8 표식을 남긴 위치로 순간이동'),('선봉대의 깃발','image (245)','지정한 위치에 선봉대의 깃발을 설치 2초 후부터 근처의 미니언에게 이로운 효과가 적용되어 범위 내에 있는 동안 공격력이 50%, 방어력이 50, 마법 저항력이 100 만큼 증가'),('성위의 유물','image (223)','체력 +350 기본 체력 재생 +200% 재사용 대기시간 감소 +10% 10초당 골드 +1'),('속도의 장화','image (1)','고유 지속 효과 - 이동 속도 향상: 이동 속도 +25'),('쇠사슬 조끼','image (9)','방어력 +40'),('수당','image (222)','골드!'),('수은 장식띠','image (160)','마법 저항력 +30'),('수정 팔 보호구','image (272)','체력 +200 기본 체력 재생 +50%'),('수호 천사','image (85)','공격력 +45, 방어력 +40'),('수호자의 망치','image (179)','체력 +150, 공격력 +20, 생명력 흡수 +10%'),('수호자의 보주','image (145)','체력 +150, 주문력 +35, 5초당 마나 재생 +10'),('수호자의 뿔피리','image (49)','체력 +150, 5초마다 체력 +20, 1개만 소유 가능'),('수호자의 유물','image (129)','체력 +200, 주문력 +35, 재사용 대기시간 감소 +10%, 10초당 골드 +2, 기본 마나 재생 +50%'),('수확의 낫','image (27)','공격력 +7, 적중 시 생명력 흡수 +3'),('숙련의 영약','image (40)','스킬 포인트 +1 획득'),('순간이동 장치','image (237)','사용 시: 이 장신구를 사용하면 팀의 순간이동 지점 중 하나로 순간이동 소환사의 제단에서만 사용 가능'),('순간이동 장치 (비활성)','image (250)',''),('순간이동 지점 생성기','image (241)','지정한 위치에 순간이동 지점을 생성 장치가 4초 후 가동을 시작하면 아군 팀이 기지에서 지점으로 순간이동 가능'),('슈렐리아의 몽상','image (61)','주문력 +40 체력 +200 기본 마나 재생 +100%'),('스태틱의 단검','image (125)','공격 속도 +35%, 치명타 확률 +30%, 이동 속도 +5%'),('스테락의 도전','image (104)','체력 +450, 기본 공격력의 50%를 추가 공격력, 5초 안에 400 ~ 1800 이상의 피해를 (레벨에 비례) 입으면 추가 체력의 75%에 해당하는 보호막 생성'),('슬쩍한 빨간 물약','image (60)','45초 동안 10 (레벨당 +1)의 적응형 능력치 상승'),('슬쩍한 체력 물약','image (59)','5초에 걸쳐 50의 체력을 회복'),('슬쩍한 투명 와드','image (54)','3개만 소지 가능 60 ~ 120초 동안 투명 와드 설치'),('승천의 유물','image (110)','체력 +200, 이동 속도 +10, 기본 체력 재생 +125%, 재사용 대기시간 감소 +10%, 10초당 골드 +2'),('시야석 (장신구)','image (248)','장신구 소지 개수는 1개로 제한 3초 동안 반경 1400 내의 작은 지역을 드러냅니다. 발각된 적 챔피언들은 5초 동안 위치가 드러남'),('신속의 장화','image (79)','1개만 구입 가능, 이동 속도 +55, '),('신의 구원','image (217)','체력 +300 기본 체력 재생 +150% 기본 마나 재생 +200% 재사용 대기시간 감소 +10%'),('심연의 가면','image (73)','체력 +350, 마나 +300, 마법 저항력 +55, 재사용 대기시간 감소 +10%'),('심연의 지옥불 가면','image (215)','체력 +550 마나 +300 마법 저항력 +90 재사용 대기시간 감소 +10%'),('싸움꾼의 장갑','image (18)','치명타 확률 +10%'),('쌍둥이 그림자','image (279)','주문력 +70 이동 속도 +7% 재사용 대기시간 감소 +10%'),('쐐기검','image (136)','공격 속도 +35%, 재사용 대기시간 감소 +10%'),('쓸데없이 큰 지팡이','image (25)','주문력 +60'),('아테나의 부정한 성배','image (176)','주문력 +30, 마법 저항력 +30, 재사용 대기시간 감소 +10%, 기본 마나 재생 +100%'),('악마의 마법서','image (141)','주문력 +35, 재사용 대기시간 감소 +10%'),('암흑 물질 낫','image (262)','암흑 물질 낫: 사슬 채찍의 기본 지속 효과 추가 피해가 매우 빠르게 증가 사슬 채찍 사용 시 적의 잃은 체력에 비례해 더 멀리 밀어냄'),('암흑의 별 인장','image (265)','별의 서약: 쓰레쉬는 다른 유닛을 직접 처치할 수 없음 암흑의 별이 모든 영혼과 경험치, 골드를 소유'),('암흑의 인장','image (26)','주문력 +15 물약 회복량 증가 +25% 마나 +100'),('약간 신비한 장화','image (70)','1개만 구입 가능, 이동 속도 향상: 이동 속도 +25'),('억겁의 카탈리스트','image (80)','체력 +225, 마나 +300'),('얼어붙은 건틀릿','image (84)','방어력 +65, 재사용 대기시간 감소 +20%, 마나 +500'),('얼어붙은 망치','image (82)','체력 +700, 공격력 +30'),('얼어붙은 심장','image (143)','방어력 +100, 재사용 대기시간 감소 +20%, 마나 +400'),('얼음 간식','image (256)','왕에게 먹이를: 왕이 미사일 다발을 멀리 발사해 중심부에 있는 적에게는 각각 213~775의 마법 피해를, 가장자리에 있는 적에게는 최저 85~310의 피해를 입힘'),('얼음 송곳니','image (134)','주문력 +20, 10초당 골드 +2, 기본 마나 재생 +50%, 재사용 대기시간 감소 +10%'),('에테르 환영','image (146)','수호자 아이템은 1개만 소유 가능, 주문력 +30, 이동 속도 +5%'),('여신의 눈물','image (111)','마나 +250'),('여신의 눈물 (급속 충전)','image (114)','마나 +250'),('여행용 강철의 영약','image (56)','레벨에 따라 45 ~ 90초 동안 체력 +150, 강인함 25% 증가, 챔피언이 거대해지며, 강철의 길 효과'),('여행용 마법의 영약','image (57)','레벨에 따라 45 ~ 90초 동안 주문력 +25, 5초당 마나 재생량이 +7.5 오르며 마법 효과'),('여행용 분노의 영약','image (58)','레벨에 따라 45 ~ 90초 동안 공격력 +15 상승'),('열정의 검','image (124)','공격 속도 +15%, 치명타 확률 +15%'),('영겁의 지팡이','image (86)','체력 +300, 마나 +300, 주문력 +60'),('영겁의 지팡이 (급속 충전)','image (88)','체력 +300, 마나 +300, 주문력 +60'),('영혼의 닻 (장신구)','image (206)','장신구 소지 개수는 1개로 제한, 충전량을 1회 소모하여 소환사의 제단에서 챔피언을 즉시 부활시키며 이동 속도가 125% 상승한 후 12초에 걸쳐 정상으로 돌아옴'),('예언석 (장신구)','image (230)','장신구 소지 개수는 1개로 제한 3초 동안 반경 2500 내의 작은 지역을 드러냅니다. 발각된 적 챔피언들은 5초 동안 위치가 드러남'),('예언자의 렌즈','image (211)','장신구 소지 개수는 1개로 제한 10초 동안 근처를 수색해 숨어있는 적 유닛에게 경고를 보내며 주변의 투명한 덫과 와드를 드러내고, 추가로 와드를 무력화'),('예언자의 추출액','image (47)','5분 동안 주위의 투명하거나 보이지 않는 유닛 감지'),('와드 토템 (장신구)','image (205)','장신구 소지 개수는 1개로 제한, 충전량을 1회 소모하여 90 ~ 180초 동안 주변을 드러내 주는 보이지 않는 투명 와드를 설치'),('완성형 마공학 핵','image (187)','레벨당 주문력 +10 레벨당 마나 +25'),('요림의 주먹','image (103)','공격력 +15, 체력 +200'),('요우무의 유령검','image (161)','공격력 +55, 재사용 대기시간 감소 +10%, 물리 관통력 +18, 이동 속도 +40'),('요정의 부적','image (2)','기본 마나 재생 +25%'),('우글렛의 마녀 모자','image (127)','주문력 +100, 방어력 +45'),('우글렛의 마녀 왕관','image (220)','주문력 +155 방어력 +45'),('우주의 족쇄','image (260)','우주의 족쇄: 사형 선고가 대상의 잃은 체력에 비례해 더 먼 거리에서 끌어당김 블랙홀을 통과하면 더 큰 피해를 입힐 수 있음'),('워모그의 갑옷','image (121)','체력 +800, 기본 체력 재생 +200%'),('원기 회복의 구슬','image (3)','기본 체력 재생 +50%'),('원기회복의 완전한 비스킷','image (38)','10초에 걸쳐 체력 + 80,  마나 +50'),('유령 무희','image (99)','공격 속도 +45%, 치명타 확률 +30%, 이동 속도 +5%'),('유령 장화 (근접 전용)','image (282)','1개만 구입 가능 유령이 되어 6초 동안 지형지물과의 충돌을 무시 이동 속도 +45'),('유령 포로','image (235)','유령 포로가 수풀에 머물도록 명령 자신 또는 자신이 소환한 유령 포로가 적진에 있을 경우 추가 능력치'),('유목민의 메달','image (132)','이동 속도 +10, 기본 체력 재생 +50%, 재사용 대기시간 감소 +10%, 10초당 골드 +2'),('음전자 망토','image (24)','마법 저항력 +40, 미니언에게 공격력 +5'),('저항 공성기','image (105)','체력 +300, 방어력 +50, 기본 체력 재생 +150%, 재사용 대기시간 감소 +10%'),('적응형 투구','image (184)','체력 +350 마법 저항력 +55 기본 체력 재생 +100% 재사용 대기시간 감소 +10%'),('전령의 눈','image (234)','공허의 자취:?전령의 눈을 획득하면 귀환이 강화'),('점멸 지대','image (244)','5초 동안 유지되는 마법 지대를 생성 아군 팀은 지대 안으로 들어오면 모두 소환사 주문이 점멸로 바뀌고, 지대 안에서는 계속해서 점멸을 사용 가능'),('점화석','image (108)','체력 +200'),('정당한 영광','image (271)','체력 +400 마나 +300 방어력 +30 기본 체력 재생 +100% 재사용 대기시간 감소 +10%'),('정령의 형상','image (107)','체력 +450, 마법 저항력 +55, 기본 체력 재생 +100%, 재사용 대기시간 감소 +10%'),('정수 약탈자','image (232)','공격력 +75 재사용 대기시간 감소 +20% 마나 +300'),('제어 와드','image (53)','3개만 소지 가능, 주변지역 와드 설치, 맵당 1개 제함'),('조화의 성배','image (87)','마법 저항력 +30, 기본 마나 재생 +50%'),('존야의 모래시계','image (172)','주문력 +75, 방어력 +45, 재사용 대기시간 감소 +10%'),('존야의 역설','image (221)','주문력 +100 방어력 +60 재사용 대기시간 감소 +10%'),('주문도둑의 검','image (195)','주문력 +10 10초당 골드 +2 기본 마나 재생 +25%'),('주문매듭 구슬','image (280)','주문력 +120 이동 속도 +10%'),('주문포식자','image (170)','공격력 +20, 마법 저항력 +35'),('죽음의 무도','image (274)','공격력 +80 재사용 대기시간 감소 +10%'),('죽음의 여신','image (277)','바다뱀 은화 500닢이 필요 포탄 세례가 범위 중앙에 추가로 대형 포탄을 하나 발사하여 300%의 고정 피해를 입히고 1.5초간 60% 둔화를 적용  '),('중력의 장화','image (263)','질량 변환:?쓰레쉬의 체력에 따라 적을 끌어당기고 밀어내는 거리가 달라짐 체력이 낮으면 낮을수록 그 거리가 더 길어짐'),('즈롯 차원문','image (233)','방어력 +55 마법 저항력 +55 기본 체력 재생 +125%'),('증폭의 고서','image (19)','주문력 +20'),('지배자의 피갑옷','image (122)','체력 +800, 기본 체력 재생 +100%'),('지크의 융합','image (102)','방어력 +60, 마법 저항력 +30, 마나 +250, 재사용 대기시간 감소 +10%'),('진 삼위일체','image (219)','체력 +350 마나 +350 공격력 +35 공격 속도 +50% 재사용 대기시간 감소 +20% 이동 속도 +8%'),('처형인의 대검','image (152)','공격력 +15'),('척후병의 사브르','image (267)','골드 획득 아이템이나 정글 아이템은 1개로 소지가 제한 몬스터 대상 생명력 흡수 +10%'),('천 갑옷','image (8)','방어력 +15'),('체력 물약','image (36)','최대 5개 소지 가능, 15초에 걸쳐 체력 +150'),('초시계','image (68)','경직:?챔피언이 2.5초 동안 아무런 행동도 취할 수 없는 대신 공격도 받지 않는 무적 상태 (단 1회 사용 가능)'),('초시계 키트','image (67)','8분 후 초시계로 변경, 상위 아이템을 구매할 때 250골드만큼 기여'),('최후의 속삭임','image (92)','공격력 +10, 방어구 관통력?+10%'),('추적자의 검','image (266)','골드 획득 아이템이나 정글 아이템은 1개로 소지가 제한 몬스터 대상 생명력 흡수 +10%'),('추적자의 팔목 보호대','image (182)','방어력 +30 주문력 +20'),('충전형 물약','image (44)','한 번에 한 종류의 회복 물약만 소지 가능, 충전량 1회 소모시 12초 동안 체력 +125, 상점 방문시 충전량 +2회'),('칠흑의 양날 도끼','image (112)','체력 +400, 공격력 +40, 재사용 대기시간 감소 +20%'),('칠흑의 창','image (236)','?아군에게 이 게임 동안 결속되는 계약을 제의 계약이 수락되면 해당 아군과 가까이 있을 때 둘이 모두 강화'),('카직스의 머리','image (177)','뼈이빨 토템:?180초 동안 유지되는 투명 와드를 설치, 투명 와드의 수는 3개로 제한'),('칼날부리의 망토','image (51)','방어력 +30, 기본 체력 재생 +125%'),('콜필드의 전투 망치','image (154)','공격력 +25, 재사용 대기시간 감소 +10%'),('키르히아이스의 파편','image (43)','공격 속도 +15%'),('타곤산의 보호','image (133)','체력 +125, 기본 체력 재생 +50%, 10초당 골드 +1'),('탐식의 망치','image (98)','체력 +200, 공격력 +15'),('탐험가의 와드','image (48)','주변 지역을 60초 동안 드러내주는 투명한 와드 설치'),('태양불꽃 망토','image (109)','체력 +425, 방어력 +60'),('톱날 단검','image (155)','공격력 +25, 물리 관통력?+10'),('티아맷','image (118)','공격력 +25, 기본 체력 재생 +50%'),('파수꾼의 갑옷','image (120)','방어력 +40'),('포로 간식','image (50)','영양 만점 요리'),('포탑: 파멸 광선','image (240)','포탑에 장착한 후 다시 사용하면 마우스 커서 방향으로 파멸 광선을 발사해 큰 피해를 입힘'),('포탑: 폭풍 방벽','image (242)','포탑을 무적 상태로 만든 뒤 화염, 포탑을 6초 동안 무적 상태 지속 시간 종료 2초 전, 화염이 발사되며 남은 시간 동안 근처의 모든 적에게 2600의 고정 피해'),('폭풍갈퀴','image (131)','공격력 +65, 공격 속도 +25%'),('프로토타입 마공학 핵','image (188)','레벨당 주문력 +1 레벨당 마나 +10'),('피바라기','image (113)','공격력 +80, 생명력 흡수 +20%'),('필멸자의 운명','image (91)','공격력 +40, 방어구 관통력?+25%'),('핏빛 장막','image (285)','주문력 +75 체력 +350 죽음의 감촉:?마법 관통력?+15'),('핏빛 칼날','image (178)','공격력 +45, 생명력 흡수 +10%'),('헤르메스의 발걸음','image (144)','1개만 구입 가능, 마법 저항력 +25'),('헤르메스의 시미터','image (159)','공격력 +50, 마법 저항력 +35, 생명력 흡수 +10%'),('화르륵 매운맛 간식','image (257)','왕에게 먹이를:?왕이 원뿔형으로 불을 내뿜어 4초 동안 적에게?705~1479의 고정 피해를 포탑에게는 560의 고정 피해를 입힘'),('황금 초월 장치','image (228)','사용 시:?이 장신구를 사용해 전투 제단 중 하나로 순간 이동 소환사의 제단에서만 사용'),('황금 초월 장치 (비활성화)','image (229)','사용 시:?이 장신구를 사용해 전투 제단 중 하나로 순간 이동합니다. 소환사의 제단에서만 사용할 수 있습니다.'),('훔친 예언자의 추출액','image (42)','레벨에 따라 15 ~ 40초간 투명 유닛 감지 능력'),('훔친 원기회복의 완전한 비스킷','image (41)','15초에 걸쳐 잃은 체력과 마나 + 15%'),('흉악한 손도끼','image (151)','공격력 +20, 치명타 확률 +10%'),('흑요석 양날 도끼','image (216)','체력 +550 공격력 +60 재사용 대기시간 감소 +20%'),('흡혈의 낫','image (20)','공격력 +15 생명력 흡수 +10%');
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `join_membership`
--

DROP TABLE IF EXISTS `join_membership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `join_membership` (
  `id` varchar(100) NOT NULL,
  `pw` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `birthdate` varchar(100) NOT NULL,
  `tel` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `join_membership`
--

LOCK TABLES `join_membership` WRITE;
/*!40000 ALTER TABLE `join_membership` DISABLE KEYS */;
INSERT INTO `join_membership` VALUES ('abc','1357','가나다','881212','01012345678'),('bu7183','1234','한부민','940701','01044545562'),('def','151515','마바사','760508','01098765432'),('qwerty1','121314','김철수','960607','');
/*!40000 ALTER TABLE `join_membership` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tier_distribution_plot`
--

DROP TABLE IF EXISTS `tier_distribution_plot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tier_distribution_plot` (
  `tier` varchar(100) NOT NULL,
  `rate` varchar(100) NOT NULL,
  `accumulation_rate` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tier_distribution_plot`
--

LOCK TABLES `tier_distribution_plot` WRITE;
/*!40000 ALTER TABLE `tier_distribution_plot` DISABLE KEYS */;
INSERT INTO `tier_distribution_plot` VALUES ('Challenger I','(0.0085%)','(0.0085%)'),('Grandmaster I','(0.02%)','(0.02%)'),('Master I','(0.04%)','(0.06%)'),('Diamond I','(0.12%)','(0.18%)'),('Diamond II','(0.18%)','(0.35%)'),('Diamond III','(0.29%)','(0.65%)'),('Diamond IV','(0.62%)','(1.26%)'),('Platinum I','(0.69%)','(1.95%)'),('Platinum II','(1.24%)','(3.19%)'),('Platinum III','(1.90%)','(5.09%)'),('Platinum IV','(3.96%)','(9.05%)'),('Gold I','(3.64%)','(12.7%)'),('Gold II','(5.75%)','(18.4%)'),('Gold III','(7.11%)','(25.5%)'),('Gold IV','(11.7%)','(37%)'),('Silver I','(9.32%)','(47%)'),('Silver II','(10.8%)','(57%)'),('Silver III','(9.32%)','(67%)'),('Silver IV','(10.4%)','(77%)'),('Bronze I','(7.47%)','(85%)'),('Bronze II','(6.18%)','(91%)'),('Bronze III','(4.03%)','(95%)'),('Bronze IV','(3.05%)','(98%)'),('Iron I','(1.28%)','(99%)'),('Iron II','(0.65%)','(100%)'),('Iron III','(0.23%)','(100%)'),('Iron IV','(0.07%)','(100%)');
/*!40000 ALTER TABLE `tier_distribution_plot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'lol'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-25 11:05:00
