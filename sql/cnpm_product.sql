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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(1000) NOT NULL,
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
INSERT INTO `product` VALUES (2,'MacBook Pro 16\"',2399,'Designed for those who defy limits and change the world, the new MacBook Pro is by far the most powerful notebook we’ve ever made. With an immersive 16-inch Retina display, superfast processors, next-generation graphics, the largest battery capacity ever in a MacBook Pro, a new Magic Keyboard, and massive storage, it’s the ultimate pro notebook for the ultimate user.','MacBook Pro','slide2.jpg','slide2.jpg','2019-09-14',1,2),(3,'Apple TV 4K',2499,'Apple TV 4K lets you watch movies and shows in amazing 4K HDR and with Dolby Atmos sound. It has great content from apps like Amazon Prime Video, Netflix, and ESPN2 — and streaming now, original shows and movies from Apple TV+. You can use Siri to control it all with just your voice. And Apple TV 4K is even easier to enjoy with a reimagined Home screen and new experiences designed to make TV more immersive and personal.','TV','slide3.jpg','slide3.jpg','2019-09-14',5,3),(4,'Apple Watch Series 5',499,'See even more band types. Try different case materials. Make your watch your way in the Apple Watch Studio. Only at Apple.','Watch','slide4.jpg','slide4.jpg','2019-09-14',4,4),(5,'iPad Pro 2019',799,'The all-screen design means iPad Pro is a magical piece of glass that does everything you need, any way you hold it.With intuitive gestures, getting around is simple.','iPad','slide5_2.jpg','slide5_2.jpg','2019-09-14',2,5),(6,'Mac Pro 2019',950,'Power to change everything. Say hello to a Mac that is extreme in every way. With the greatest performance, expansion, and configurability yet, it is a system created to let a wide range of professionals push the limits of what is possible.','Mac Pro','lab-macpro2019.jpg','lab-macpro2019.jpg','2019-09-14',1,6),(7,'iPad Air 2019',499,'iPad Air brings more of our most powerful technologies to more people than ever. The A12 Bionic chip with Neural Engine.A 10.5 inch Retina display with True Tone. Support for Apple Penciland the Smart Keyboard. And at just one pound and 6.1 mm thin, carrying all that power is effortless.','iPad','lab-ipadair.png','lab-ipadair.png','2019-09-14',2,7),(8,'iPhone 8',499,'Accessibility features help people with disabilities get the most out of their new iPhone 8. With built-in support for vision, hearing, mobility, and learning, you can fully enjoy the world’s most personal device.','iPhone','lab-iphone8.png','lab-iphone8.png','2019-09-14',3,8),(9,'iPhoneX',599,'The iPhone XR display has rounded corners that follow a beautiful curved design, and these corners are within a standard rectangle. When measured as a standard rectangular shape, the screen is 6.06 inches diagonally (actual viewable area is less).','iPhone','lab-iphonex.png','lab-iphonex.png','2019-09-14',3,9),(10,'iPhone 11 Pro',999,'A transformative triple-camera system that adds tons of capability without complexity. An unprecedented leap in battery life. And a mind-blowing chip that doubles down on machine learning and pushes the boundaries of what a smartphone can do. Welcome to the first iPhone powerful enough to be called Pro.','iPhone','lab-iphone.png','lab-iphone.png','2019-09-14',3,10),(11,'iPhone 11',699,'A new dual-camera system captures more of what you see and love. The fastest chip ever in a smartphone and all-day battery life let you do more and charge less. And the highest-quality video in a smartphone, so your memories look better than ever.','iPhone','lab-iphone11.jpg','lab-iphone11.jpg','2019-09-14',3,11),(12,'iPad Mini 2019',399,'iPad mini is beloved for its size and capability. And now there are even more reasons to love it. The A12 Bionic chip with Neural Engine. A 7.9-inch Retina display with True Tone. And Apple Pencil, so you can capture your biggest ideas wherever they come to you. It’s still iPad mini. There’s just more of it than ever.','iPad','lab-ipadmini.jpg','lab-ipadmini.jpg','2019-09-14',2,12),(13,'MacBook air 2019',1099,'The most loved Mac is about to make you fall in love all over again. Available in silver, space gray, and gold, the new thinner and lighter MacBook Air features a brilliant Retina display with True Tone technology, Touch ID, the latest-generation keyboard, and a Force Touch trackpad. The iconic wedge is created from 100 percent recycled aluminum, making it the greenest Mac ever.1 And with all-day battery life, MacBook Air is your perfectly portable, do-it-all notebook.','MacBook Air','lab-macbookair2019.jpg','lab-macbookair2019.jpg','2019-09-14',1,13),(14,'Apple Watch Series 4',449,'Monitor your health. Track your workouts. Get the motivation you need to achieve your fitness goals. And stay connected to the people and information you care about. With Apple Watch Series 4, you can do it all — right from your wrist.','Watch','lab-watchseries4.png','lab-watchseries4.png','2019-09-14',4,14),(15,'Apple Watch Nike',499,'Get connected through sport. Apple Watch Nike is the perfect running partner with the Nike Run Club app. Featuring a world of workouts, coaching, and motivation to help take your fitness to the next level. And with Apple Watch Series 5, every Nike watch face is optimized for the new Always-On Retina display.','Watch','lab-watchnike.png','lab-watchnike.png','2019-09-14',4,15),(16,'Apple Watch Edition',499,'Introducing titanium. Reintroducing ceramic. The most elegant expression of Apple Watch returns with two iconic materials — titanium and ceramic. Featuring all the innovations of Series 5 and the craftsmanship of traditional watchmaking. It’s as modern as can be and as classic as it gets.','Watch','lab-watchedition.jpg','lab-watchedition.jpg','2019-09-14',4,16),(17,'iPhone 6s/6s plus',399,'The iPhone 6S has a similar design to the iPhone 6 but includes updated hardware, including a strengthened chassis and upgraded system-on-chip, a 12-megapixel camera, improved fingerprint recognition sensor, LTE Advanced support, and \"Hey Siri\" capabilities without needing to be plugged in. The iPhone 6S also introduces a new hardware feature known as \"3D Touch\", which enables pressure-sensitive touch inputs.','iPhone6s','lab-iphone6s.jpg','lab-iphone6s.jpg','2019-09-14',3,17),(18,'Apple TV HD',149,'From TV shows, movies, and live sports to thousands of games and apps, it’s all available on Apple TV. Enjoy content from iTunes and apps like Amazon Prime Video, ESPN, Hulu, and Netflix — or use the Siri Remote to find just what you want. And with the Apple TV App, you can enjoy all your favorite content on iPhone, iPad, and Apple TV.','TV','lab-tvapplehd.jpg','lab-tvapplehd.jpg','2019-09-14',5,18),(19,'AirPlay',199,'Now AirPlay can automatically play movies and shows in the places you’re most likely to watch them. Over time, AirPlay learns where you prefer to watch TV, and can start playing to the TV in that room with just a tap.','TV','lab-airplay.jpg','lab-airplay.jpg','2019-09-14',5,19),(24,'test',999,'lol','        lol','meo1.jpg','meo1.jpg','2019-12-22',1,24),(29,'ok',9999,'test','        test','meo5.jpg','meo5.jpg','2019-12-22',2,29),(30,'test2',999,'test','        test','meo39.jpg','meo39.jpg','2019-12-22',1,30),(31,'test3',9999,'lol','        test','meo5.jpg','meo5.jpg','2019-12-23',1,31);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-11 16:14:57
