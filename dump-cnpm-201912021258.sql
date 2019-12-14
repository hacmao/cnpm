-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
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
-- Table structure for table `category`
--
create database lab8;
use lab8;
DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `image` varchar(255) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES 
(1,'Mac','lab-mac.jpg'),
(2,'iPad','lab-ipad.png'),
(3,'iPhone','lab-iphone.png'),
(4,'Watch','lab-watch.jpg'),
(5,'TV','lab-tv.jpg');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city_region` varchar(255) NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'HACMAO','hacmao@email',123456789,'hacmao, vietnam','hanoi');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_order` (
  `order_id` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `date_created` date NOT NULL,
  `confirmation_number` int(11) NOT NULL,
  `Customercustomer_id` int(11) NOT NULL,
  `ordered_productorder_id` int(11) DEFAULT NULL,
  `ordered_productproduct_id` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `Customercustomer_id` (`Customercustomer_id`),
  KEY `ordered_productorder_id` (`ordered_productorder_id`),
  KEY `ordered_productproduct_id` (`ordered_productproduct_id`),
  CONSTRAINT `customer_order_ibfk_1` FOREIGN KEY (`Customercustomer_id`) REFERENCES `customer` (`customer_id`),
  CONSTRAINT `customer_order_ibfk_2` FOREIGN KEY (`ordered_productorder_id`) REFERENCES `ordered_product` (`order_id`),
  CONSTRAINT `customer_order_ibfk_3` FOREIGN KEY (`ordered_productproduct_id`) REFERENCES `ordered_product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_order`
--

LOCK TABLES `customer_order` WRITE;
/*!40000 ALTER TABLE `customer_order` DISABLE KEYS */;
INSERT INTO `customer_order` VALUES (1,12,'2019-11-10',1,1,1,1);
/*!40000 ALTER TABLE `customer_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordered_product`
--

DROP TABLE IF EXISTS `ordered_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordered_product` (
  `order_id` int(11) NOT NULL DEFAULT '0',
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordered_product`
--

LOCK TABLES `ordered_product` WRITE;
/*!40000 ALTER TABLE `ordered_product` DISABLE KEYS */;
INSERT INTO `ordered_product` VALUES (1,1,12),(2,2,12),(3,3,12),(4,4,12),(5,5,12);
/*!40000 ALTER TABLE `ordered_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(255) NOT NULL,
  `description_detail` varchar(1000) NOT NULL,
  `image` varchar(255) NOT NULL,
  `thumb_image` varchar(255) NOT NULL,
  `last_update` date NOT NULL,
  `Categorycategory_id` int(11) DEFAULT NULL,
  `product_detailproduct_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `Categorycategory_id` (`Categorycategory_id`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`Categorycategory_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES 
(1,'MacBook Pro 13"',1299,'The 13-inch MacBook Pro features powerful integrated graphics with 128MB of embedded DRAM — twice as much as the previous generation — which accelerates graphics tasks. That means more time for what matters most: creating amazing work.With an eighth-generation quad-core Intel processor, the 13-inch MacBook Pro is ready to take on even the toughest tasks.','MacBook Pro','slide1.jpg','slide1.jpg','2019-9-14',1,1),
(2,'MacBook Pro 16"',2399,'Designed for those who defy limits and change the world, the new MacBook Pro is by far the most powerful notebook we’ve ever made. With an immersive 16-inch Retina display, superfast processors, next-generation graphics, the largest battery capacity ever in a MacBook Pro, a new Magic Keyboard, and massive storage, it’s the ultimate pro notebook for the ultimate user.','MacBook Pro','slide2.jpg','slide2.jpg','2019-9-14',1,2),
(3,'Apple TV 4K',2499,'Apple TV 4K lets you watch movies and shows in amazing 4K HDR and with Dolby Atmos sound. It has great content from apps like Amazon Prime Video, Netflix, and ESPN2 — and streaming now, original shows and movies from Apple TV+. You can use Siri to control it all with just your voice. And Apple TV 4K is even easier to enjoy with a reimagined Home screen and new experiences designed to make TV more immersive and personal.','TV','slide3.jpg','slide3.jpg','2019-9-14',5,3),
(4,'Apple Watch Series 5',499,'See even more band types. Try different case materials. Make your watch your way in the Apple Watch Studio. Only at Apple.','Watch','slide4.jpg','slide4.jpg','2019-9-14',4,4), 
(5,'iPad Pro 2019',799,'The all-screen design means iPad Pro is a magical piece of glass that does everything you need, any way you hold it.With intuitive gestures, getting around is simple.','iPad','slide5_2.jpg','slide5_2.jpg','2019-9-14',2,5),
(6,'Mac Pro 2019',950,'Power to change everything. Say hello to a Mac that is extreme in every way. With the greatest performance, expansion, and configurability yet, it is a system created to let a wide range of professionals push the limits of what is possible.','Mac Pro','lab-macpro2019.jpg','lab-macpro2019.jpg','2019-9-14',1,6),
(7,'iPad Air 2019',499,'iPad Air brings more of our most powerful technologies to more people than ever. The A12 Bionic chip with Neural Engine.A 10.5 inch Retina display with True Tone. Support for Apple Penciland the Smart Keyboard. And at just one pound and 6.1 mm thin, carrying all that power is effortless.','iPad','lab-ipadair.png','lab-ipadair.png','2019-9-14',2,7),
(8,'iPhone 8',499,'Accessibility features help people with disabilities get the most out of their new iPhone 8. With built-in support for vision, hearing, mobility, and learning, you can fully enjoy the world’s most personal device.','iPhone','lab-iphone8.png','lab-iphone8.png','2019-9-14',3,8),
(9,'iPhoneX',599,'The iPhone XR display has rounded corners that follow a beautiful curved design, and these corners are within a standard rectangle. When measured as a standard rectangular shape, the screen is 6.06 inches diagonally (actual viewable area is less).','iPhone','lab-iphonex.png','lab-iphonex.png','2019-9-14',3,9),
(10,'iPhone 11 Pro',999,'A transformative triple‑camera system that adds tons of capability without complexity. An unprecedented leap in battery life. And a mind‑blowing chip that doubles down on machine learning and pushes the boundaries of what a smartphone can do. Welcome to the first iPhone powerful enough to be called Pro.','iPhone','lab-iphone.png','lab-iphone.png','2019-9-14',3,10),
(11,'iPhone 11',699,'A new dual‑camera system captures more of what you see and love. The fastest chip ever in a smartphone and all‑day battery life let you do more and charge less. And the highest‑quality video in a smartphone, so your memories look better than ever.','iPhone','lab-iphone11.jpg','lab-iphone11.jpg','2019-9-14',3,11),
(12,'iPad Mini 2019',399,'iPad mini is beloved for its size and capability. And now there are even more reasons to love it. The A12 Bionic chip with Neural Engine. A 7.9‑inch Retina display with True Tone. And Apple Pencil, so you can capture your biggest ideas wherever they come to you. It’s still iPad mini. There’s just more of it than ever.','iPad','lab-ipadmini.jpg','lab-ipadmini.jpg','2019-9-14',2,12),
(13,'MacBook air 2019',1099,'The most loved Mac is about to make you fall in love all over again. Available in silver, space gray, and gold, the new thinner and lighter MacBook Air features a brilliant Retina display with True Tone technology, Touch ID, the latest-generation keyboard, and a Force Touch trackpad. The iconic wedge is created from 100 percent recycled aluminum, making it the greenest Mac ever.1 And with all-day battery life, MacBook Air is your perfectly portable, do-it-all notebook.','MacBook Air','lab-macbookair2019.jpg','lab-macbookair2019.jpg','2019-9-14',1,13),
(14,'Apple Watch Series 4',449,'Monitor your health. Track your workouts. Get the motivation you need to achieve your fitness goals. And stay connected to the people and information you care about. With Apple Watch Series 4, you can do it all — right from your wrist.','Watch','lab-watchseries4.png','lab-watchseries4.png','2019-9-14',4,14),
(15,'Apple Watch Nike',499,'Get connected through sport. Apple Watch Nike is the perfect running partner with the Nike Run Club app. Featuring a world of workouts, coaching, and motivation to help take your fitness to the next level. And with Apple Watch Series 5, every Nike watch face is optimized for the new Always-On Retina display.','Watch','lab-watchnike.png','lab-watchnike.png','2019-9-14',4,15),
(16,'Apple Watch Edition',499,'Introducing titanium. Reintroducing ceramic. The most elegant expression of Apple Watch returns with two iconic materials — titanium and ceramic. Featuring all the innovations of Series 5 and the craftsmanship of traditional watchmaking. It’s as modern as can be and as classic as it gets.','Watch','lab-watchedition.jpg','lab-watchedition.jpg','2019-9-14',4,16),
(17,'iPhone 6s/6s plus',399,'The iPhone 6S has a similar design to the iPhone 6 but includes updated hardware, including a strengthened chassis and upgraded system-on-chip, a 12-megapixel camera, improved fingerprint recognition sensor, LTE Advanced support, and "Hey Siri" capabilities without needing to be plugged in. The iPhone 6S also introduces a new hardware feature known as "3D Touch", which enables pressure-sensitive touch inputs.','iPhone6s','lab-iphone6s.jpg','lab-iphone6s.jpg','2019-9-14',3,17),
(18,'Apple TV HD',149,'From TV shows, movies, and live sports to thousands of games and apps, it’s all available on Apple TV. Enjoy content from iTunes and apps like Amazon Prime Video, ESPN, Hulu, and Netflix — or use the Siri Remote to find just what you want. And with the Apple TV App, you can enjoy all your favorite content on iPhone, iPad, and Apple TV.','TV','lab-tvapplehd.jpg','lab-tvapplehd.jpg','2019-9-14',5,18),
(19,'AirPlay',199,'Now AirPlay can automatically play movies and shows in the places you’re most likely to watch them. Over time, AirPlay learns where you prefer to watch TV, and can start playing to the TV in that room with just a tap.','TV','lab-airplay.jpg','lab-airplay.jpg','2019-9-14',5,19);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_detail`
--

DROP TABLE IF EXISTS `product_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_detail` (
  `product_id` int(11) NOT NULL,
  `information` varchar(1000) NOT NULL,
  `image1` varchar(255) NOT NULL,
  `image2` varchar(255) NOT NULL,
  `image3` varchar(255) NOT NULL,
  `image4` varchar(255) NOT NULL,
  `image5` varchar(255) NOT NULL,
  `accessories` varchar(2000) NOT NULL,
  `guaranty` varchar(2000) NOT NULL,
  `ordered_productorder_id` int(11) DEFAULT NULL,
  `ordered_productproduct_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `ordered_productorder_id` (`ordered_productorder_id`),
  CONSTRAINT `product_detail_ibfk_1` FOREIGN KEY (`ordered_productorder_id`) REFERENCES `ordered_product` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail`
--

LOCK TABLES `product_detail` WRITE;
/*!40000 ALTER TABLE `product_detail` DISABLE KEYS */;
INSERT INTO `product_detail` VALUES 
(1,'MacBook Pro 13"<br><br> * 13.3-inch Retina display<br> * Up to 4-core Intel Core i7 processor<br> * Up to 16GB memory, Up to 2TB storage<br> * Up to 10 hours battery life<br> * Touch Bar and Touch ID, Backlit keyboard.','lab-macbookpro13.jpg','lab-macbookpro131.jpg','lab-macbookpro132.jpg','lab-macbookpro133.jpg','lab-macbookpro134.jpg','','6 months',1,1),
(2,'MacBook Pro 16"<br><br> * 16-inch Retina display<br> * Up to 8-core Intel Core i9 processor<br> * Up to 64GB memory, Up to 8TB storage<br> * Up to 11 hours battery life<br> * Touch Bar and Touch ID, Backlit Magic Keyboard','lab-macbookpro16.jpg', 'lab-macbookpro161.jpg', 'lab-macbookpro162.jpg','lab-macbookpro163.jpg','lab-macbookpro164.jpg','','6 months',1,2),
(3,'Apple TV 4K <br><br> * Bluetooth 4.0 wireless technology <br> * HDMI 2.0a3 802.11ac Wi‑Fi with MIMO simultaneous dual band (2.4GHz and 5GHz), Gigabit EthernetBluetooth 5.0 wireless technology <br> * Requires 4K and HDR TV for 4K and HDR streaming <br> * H.264 Baseline Profile level 3.0 or lower with AAC-LC audio up to 160 Kbps per channel, 48kHz, stereo audio in .m4v, .mp4, and .mov file formats','lab-tvapple4k.jpg','lab-tvapple4k1.jpg','lab-tvapple4k2.jpg','','','','6 months',5,3),
(4,'Apple Watch Series 5 <br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz* ','lab-watchseries5.png','lab-applewatchseries5_1.jpg','lab-applewatchseries5_2.jpg','lab-applewatchseries5_3.jpg','lab-applewatchseries5_5.jpg','','6 months',4,4),
(5,'iPad Pro 2019<br><br> * Connect on the go with fast Wi-Fi and Gigabit-class LTE, two great cameras equipped with Smart HDR<br> * A 12MP camera for stunning photos, 4K video, document scanning, and AR experiences, Smart Keyboard Folio,A12X Bionic delivers 2x faster graphics.','lab-ipad.png','lab-ipad1.png', 'lab-ipad2.png','lab-ipad3.png','lab-ipad4.png','','6 months',2,5),
(6,'Mac Pro 2019<br><br> * 8-core, 16 threads, 3.5GHz, 4.0GHz TB, 24.5MB cache, up to 1TB 2666MHz memory.','lab-macpro2019.jpg','lab-macpro_1.jpg','lab-macpro_2.jpg','','','','6 months',1,6),
(7,'iPad Air 2019<br><br> * PROCESSOR. Apple A12 Bionic APL1W81. <br> * RAM. 2 GB.<br> * STORAGE. 64 GB, 256 GB.<br> * DISPLAY. 10.5 in, IPS, 2224 x 1668 pixels, 24 bit.<br> * CAMERA. 3264 x 2448 pixels, 1920 x 1080 pixels, 30 fps.<br> * BATTERY. Li-Ion.','lab-ipadair.png','lab-ipadair_2.png','lab-ipadair_3.png','lab-ipadair_4.png','lab-ipadair_5.png','','6 months',2,7),
(8,'iPhone 8<br><br> * Retina HD display 4.7-inch (diagonal) widescreen LCD Multi-Touch display with IPS technology 1334-by-750-pixel resolution at 326 ppi 1400:1 contrast ratio (typical)<br> * Retina HD display 4.7-inch (diagonal) widescreen LCD Multi-Touch display with IPS technology 1334-by-750-pixel resolution at 326 ppi 1400:1 contrast ratio (typical)','lab-iphone8.png','lab-iphone8_1.jpg','lab-iphone8_2.png','lab-iphone8_3.jpg','','','6 months',3,8),
(9,'iPhoneX<br><br> * Capacity 256Gb<br> * 5.8-inch (diagonal) all-screen OLED Multi-Touch display<br> * 2436-by-1125-pixel resolution at 458 ppi<br> * 12MP wide-angle and telephoto cameras','lab-iphonex.png','lab-iphonex_1.jpg','lab-iphonex_2.jpg','lab-iphonex_3.jpg','','','6 months',3,9),
(10,'iPhone 11 Pro<br><br> * Liquid Retina HD display 6.1‑inch (diagonal) all-screen LCD Multi-Touch display with IPS technology 1792 by 828 pixel resolution at 326 ppi<br> * Dual 12MP Ultra Wide and Wide cameras <br> * 4K video recording at 24 fps, 30 fps, or 60 fps','lab-iphone.png','lab-iphone11_5.png','lab-iphone11_4.png','lab-iphone11_6.png','','','6 months',3,10),
(11,'iPhone 11<br><br> * Super Retina XDR display5.8 inch (diagonal) all screen OLED Multi Touch display HDR display 2436 by 1125-pixel resolution at 458 ppi 2,000,000:1 contrast ratio (typical)<br> * Triple 12MP Ultra Wide, Wide, and Telephoto cameras<br> * 4K video recording at 24 fps, 30 fps, or 60 fps','lab-iphone11.jpg','lab-iphone11_2.png','lab-iphone11_3.png','lab-iphone11_1.png','','','6 months',3,11),
(12,'iPad Mini 2019<br><br> * Retina display. 7.9-inch (diagonal) LED-backlit Multi-Touch display 2048-by-1536 resolution at 326 pixels per inch (ppi)<br> * Fingerprint-resistant oleophobic coating, fully laminated display, antireflective coating.','lab-ipadmini.jpg','lab-ipadmini_1.jpg','lab-ipadmini_2.jpg','lab-ipadmini_3.jpg','','','6 months',2,12),
(13,'MacBook air 2019<br><br> * 13.3-inch Retina display, 2-core Intel Core i5 processor<br> * Up to 16GB memory, Up to 1TB storage2<br> * Up to 12 hours battery life3, Touch ID, Backlit keyboard','lab-macbookair2019.jpg','lab-macbookair20191.jpg','lab-macbookair20192.jpg','lab-macbookair20193.jpg','','','6 months',1,4),
(14,'Apple Watch Series 4 <br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz','lab-watchseries4.png','lab-applewatchseries4_1.jpg','lab-applewatchseries4_2.jpg','lab-applewatchseries4_4.jpg','lab-applewatchseries4_5.jpg','','6 months',4,14),
(15,'Apple Watch Nike<br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz','lab-watchnike.png','lab-applewatchnike_1.jpg','lab-applewatchnike_3.jpg','lab-applewatchnike_2.jpg','','','6 months',4,15),
(16,'Apple Watch Edition<br><br> * Color: siler, gray, gold <br> * GPS, GLONASS, Galileo, and QZSS<br> * 368 by 448 pixels, 977 sq mm display area, over 30% larger display than Series 3<br> * S5 with 64-bit dual-core processor<br> * Wifi 802.11b/g/n 2.4GHz','lab-watchedition.jpg','lab-applewatchedition_1.jpg','lab-applewatchedition_2.jpg','lab-applewatchedition_3.jpg','lab-applewatchedition_4.jpg','','6 months',4,16),
(17,'iPhone 6s/6s plus<br><br> * Retina HD display<br> * Single 12MP Wide camera, 5MP camera with 720p HD video recording at 30 fps<br> * Memory 32GB/128GB, 1920-by-1080-pixel resolution at 401 ppi<br> * 3D Touch','lab-iphone6s.jpg','lab-iphone6s1.jpg','lab-iphone6s2.jpg','','','','6 months',3,3),
(18,'Apple TV HD<br><br> * Bluetooth 4.0 wireless technology <br> * HDMI 2.0a3 802.11ac Wi‑Fi with MIMO simultaneous dual band (2.4GHz and 5GHz), Gigabit EthernetBluetooth 5.0 wireless technology <br> * Requires 4K and HDR TV for 4K and HDR streaming <br> * H.264 Baseline Profile level 3.0 or lower with AAC-LC audio up to 160 Kbps per channel, 48kHz, stereo audio in .m4v, .mp4, and .mov file formats','lab-tvapplehd.jpg','lab-appletvhd_2.jpg','lab-appletvhd_1.jpg','','','','6 months',5,18),
(19,'AirPlay<br><br> * Now AirPlay can automatically play movies and shows in the places you’re most likely to watch them. Over time, AirPlay learns where you prefer to watch TV, and can start playing to the TV in that room with just a tap.','lab-airplay.jpg','','','','','','6 months',5,19);
/*!40000 ALTER TABLE `product_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reader`
--

DROP TABLE IF EXISTS `reader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reader` (
  `user` varchar(50) NOT NULL,
  `pwd` varchar(50) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reader`
--

LOCK TABLES `reader` WRITE;
/*!40000 ALTER TABLE `reader` DISABLE KEYS */;
INSERT INTO `reader` VALUES ('123','456'),('hacmao','12345'),('hacmao2','123'),('hacmao3','123456'),('hacmao4','123456');
/*!40000 ALTER TABLE `reader` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Nguyen','Long','Dong da','123456789','long@gmail.com','123456'),(2,'Nguyen','Hien','Thanh Xuan','987654321','hien@gmail.com','654321'),(3,'Pham','Lien','Hoang Mai','12312313','Lien@gmail.com','1'),(4,'Dao','Giang','Hoang Mai','0987654321','Mai@gmail.com','2'),(5,'Pham','Huong','Kim Hoa','0987878787','Huong@gmail.com','4'),(6,'Le','Diep','Nguyen Trai','0987687873','Diep@gmail.com','123');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`name`)  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping routines for database 'cnpm'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-02 12:58:48
