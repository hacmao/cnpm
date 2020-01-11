-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cnpm
-- ------------------------------------------------------
-- Server version	5.5.62-log

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
-- Table structure for table `product_detail`
--

DROP TABLE IF EXISTS `product_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_detail` (
  `product_id` int(11) NOT NULL,
  `information` varchar(1000) NOT NULL,
  `image1` varchar(255) DEFAULT NULL,
  `image2` varchar(255) DEFAULT NULL,
  `image3` varchar(255) DEFAULT NULL,
  `image4` varchar(255) DEFAULT NULL,
  `image5` varchar(255) DEFAULT NULL,
  `accessories` varchar(2000) DEFAULT 'abc',
  `guaranty` varchar(2000) DEFAULT NULL,
  `quantity` int(11) DEFAULT '1000',
  `numSelled` int(11) DEFAULT '0',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail`
--

LOCK TABLES `product_detail` WRITE;
/*!40000 ALTER TABLE `product_detail` DISABLE KEYS */;
INSERT INTO `product_detail` VALUES (2,'MacBook Pro 16\"<br><br> * 16-inch Retina display<br> * Up to 8-core Intel Core i9 processor<br> * Up to 64GB memory, Up to 8TB storage<br> * Up to 11 hours battery life<br> * Touch Bar and Touch ID, Backlit Magic Keyboard','lab-macbookpro16.jpg','lab-macbookpro161.jpg','lab-macbookpro162.jpg','lab-macbookpro163.jpg','lab-macbookpro164.jpg',NULL,'6 months',993,31),(3,'Apple TV 4K <br><br> * Bluetooth 4.0 wireless technology <br> * HDMI 2.0a3 802.11ac Wi-Fi with MIMO simultaneous dual band (2.4GHz and 5GHz), Gigabit EthernetBluetooth 5.0 wireless technology <br> * Requires 4K and HDR TV for 4K and HDR streaming <br> * H.264 Baseline Profile level 3.0 or lower with AAC-LC audio up to 160 Kbps per channel, 48kHz, stereo audio in .m4v, .mp4, and .mov file formats','lab-tvapple4k.jpg','lab-tvapple4k1.jpg','lab-tvapple4k2.jpg',NULL,NULL,NULL,'6 months',998,30),(4,'                                    Apple Watch Series 5 <br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz* \r\n                                ','lab-watchseries5.png','lab-applewatchseries5_1.jpg','lab-applewatchseries5_2.jpg','lab-applewatchseries5_3.jpg','lab-applewatchseries5_5.jpg',NULL,'6 months',0,10031),(5,'iPad Pro 2019<br><br> * Connect on the go with fast Wi-Fi and Gigabit-class LTE, two great cameras equipped with Smart HDR<br> * A 12MP camera for stunning photos, 4K video, document scanning, and AR experiences, Smart Keyboard Folio,A12X Bionic delivers 2x faster graphics.','lab-ipad.png','lab-ipad1.png','lab-ipad2.png','lab-ipad3.png','lab-ipad4.png',NULL,'6 months',-9000,10030),(6,'Mac Pro 2019<br><br> * 8-core, 16 threads, 3.5GHz, 4.0GHz TB, 24.5MB cache, up to 1TB 2666MHz memory.','lab-macpro2019.jpg','lab-macpro_1.jpg','lab-macpro_2.jpg',NULL,NULL,NULL,'6 months',996,4),(7,'iPad Air 2019<br><br> * PROCESSOR. Apple A12 Bionic APL1W81. <br> * RAM. 2 GB.<br> * STORAGE. 64 GB, 256 GB.<br> * DISPLAY. 10.5 in, IPS, 2224 x 1668 pixels, 24 bit.<br> * CAMERA. 3264 x 2448 pixels, 1920 x 1080 pixels, 30 fps.<br> * BATTERY. Li-Ion.','lab-ipadair.png','lab-ipadair_2.png','lab-ipadair_3.png','lab-ipadair_4.png','lab-ipadair_5.png',NULL,'6 months',998,2),(8,'iPhone 8<br><br> * Retina HD display 4.7-inch (diagonal) widescreen LCD Multi-Touch display with IPS technology 1334-by-750-pixel resolution at 326 ppi 1400:1 contrast ratio (typical)<br> * Retina HD display 4.7-inch (diagonal) widescreen LCD Multi-Touch display with IPS technology 1334-by-750-pixel resolution at 326 ppi 1400:1 contrast ratio (typical)','lab-iphone8.png','lab-iphone8_1.jpg','lab-iphone8_2.png','lab-iphone8_3.jpg',NULL,NULL,'6 months',1000,0),(9,'iPhoneX<br><br> * Capacity 256Gb<br> * 5.8-inch (diagonal) all-screen OLED Multi-Touch display<br> * 2436-by-1125-pixel resolution at 458 ppi<br> * 12MP wide-angle and telephoto cameras','lab-iphonex.png','lab-iphonex_1.jpg','lab-iphonex_2.jpg','lab-iphonex_3.jpg',NULL,NULL,'6 months',997,3),(10,'iPhone 11 Pro<br><br> * Liquid Retina HD display 6.1-inch (diagonal) all-screen LCD Multi-Touch display with IPS technology 1792 by 828 pixel resolution at 326 ppi<br> * Dual 12MP Ultra Wide and Wide cameras <br> * 4K video recording at 24 fps, 30 fps, or 60 fps','lab-iphone.png','lab-iphone11_5.png','lab-iphone11_4.png','lab-iphone11_6.png',NULL,NULL,'6 months',1000,0),(11,'iPhone 11<br><br> * Super Retina XDR display5.8 inch (diagonal) all screen OLED Multi Touch display HDR display 2436 by 1125-pixel resolution at 458 ppi 2,000,000:1 contrast ratio (typical)<br> * Triple 12MP Ultra Wide, Wide, and Telephoto cameras<br> * 4K video recording at 24 fps, 30 fps, or 60 fps','lab-iphone11.jpg','lab-iphone11_2.png','lab-iphone11_3.png','lab-iphone11_1.png',NULL,NULL,'6 months',1000,0),(12,'iPad Mini 2019<br><br> * Retina display. 7.9-inch (diagonal) LED-backlit Multi-Touch display 2048-by-1536 resolution at 326 pixels per inch (ppi)<br> * Fingerprint-resistant oleophobic coating, fully laminated display, antireflective coating.','lab-ipadmini.jpg','lab-ipadmini_1.jpg','lab-ipadmini_2.jpg','lab-ipadmini_3.jpg',NULL,NULL,'6 months',1000,0),(13,'MacBook air 2019<br><br> * 13.3-inch Retina display, 2-core Intel Core i5 processor<br> * Up to 16GB memory, Up to 1TB storage2<br> * Up to 12 hours battery life3, Touch ID, Backlit keyboard','lab-macbookair2019.jpg','lab-macbookair20191.jpg','lab-macbookair20192.jpg','lab-macbookair20193.jpg',NULL,NULL,'6 months',1000,0),(14,'Apple Watch Series 4 <br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz','lab-watchseries4.png','lab-applewatchseries4_1.jpg','lab-applewatchseries4_2.jpg','lab-applewatchseries4_4.jpg','lab-applewatchseries4_5.jpg',NULL,'6 months',991,9),(15,'Apple Watch Nike<br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz','lab-watchnike.png','lab-applewatchnike_1.jpg','lab-applewatchnike_3.jpg','lab-applewatchnike_2.jpg',NULL,NULL,'6 months',999,1),(16,'Apple Watch Edition<br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz','lab-watchedition.jpg','lab-applewatchedition_1.jpg','lab-applewatchedition_2.jpg','lab-applewatchedition_3.jpg','lab-applewatchedition_4.jpg',NULL,'6 months',999,1),(17,'iPhone 6s/6s plus<br><br> * Retina HD display<br> * Single 12MP Wide camera, 5MP camera with 720p HD video recording at 30 fps<br> * Memory 32GB/128GB, 1920-by-1080-pixel resolution at 401 ppi<br> * 3D Touch','lab-iphone6s.jpg','lab-iphone6s1.jpg','lab-iphone6s2.jpg',NULL,NULL,NULL,'6 months',1000,0),(18,'Apple TV HD<br><br> * Bluetooth 4.0 wireless technology <br> * HDMI 2.0a3 802.11ac Wi-Fi with MIMO simultaneous dual band (2.4GHz and 5GHz), Gigabit EthernetBluetooth 5.0 wireless technology <br> * Requires 4K and HDR TV for 4K and HDR streaming <br> * H.264 Baseline Profile level 3.0 or lower with AAC-LC audio up to 160 Kbps per channel, 48kHz, stereo audio in .m4v, .mp4, and .mov file formats','lab-tvapplehd.jpg','lab-appletvhd_2.jpg','lab-appletvhd_1.jpg',NULL,NULL,NULL,'6 months',998,2),(19,'AirPlay<br><br> * Now AirPlay can automatically play movies and shows in the places you’re most likely to watch them. Over time, AirPlay learns where you prefer to watch TV, and can start playing to the TV in that room with just a tap.','lab-airplay.jpg',NULL,NULL,NULL,NULL,NULL,'6 months',999,1),(24,'lol','meo8.jpg','meo13.jpg','meo22.jpg',NULL,NULL,NULL,'12 months',1000,0),(29,'                                                                        test\r\n                                \r\n                                ','meo2.jpg','meo1.jpg',NULL,NULL,NULL,NULL,'12 months',998,2),(30,'test','meo38.jpg','meo44.jpg',NULL,NULL,NULL,NULL,'12 months',999,1),(31,'lol','meo26.jpg','meo55.jpg',NULL,NULL,NULL,NULL,'12 months',1000,0);
/*!40000 ALTER TABLE `product_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-11 16:15:04
