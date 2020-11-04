-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2020 at 04:26 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.1.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clothingdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `cartID` int(255) NOT NULL,
  `customer` int(255) NOT NULL,
  `productName` varchar(255) NOT NULL,
  `size` varchar(100) NOT NULL,
  `color` varchar(100) NOT NULL,
  `amount` int(255) NOT NULL,
  `price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`cartID`, `customer`, `productName`, `size`, `color`, `amount`, `price`) VALUES
(3, 14, 'Only Check Shirt', 'Size L', 'White', 3, '13500.0'),
(4, 3, 'Esprit Ruffle Shirt', 'Size M', 'Blue', 1, '1650.0'),
(5, 3, 'Esprit Ruffle Shirt', 'Size M', 'Blue', 1, '1650.0'),
(6, 14, 'Only Check Shirt', 'Size M', 'Blue', 1, '4500.0'),
(8, 0, 'Only Check Shirt', 'Size L', 'Blue', 1, '4500.0'),
(9, 0, 'Esprit Ruffle Shirt', 'Size S', 'Blue', 1, '1650.0'),
(10, 15, 'Esprit Ruffle Shirt', 'Size S', 'Blue', 1, '1650.0'),
(14, 7, 'Esprit Ruffle Shirt', 'Size M', 'Red', 1, '1650.0'),
(26, 14, 'Lauren White Blouse', 'Size M', 'White', 1, '3450.0');

-- --------------------------------------------------------

--
-- Table structure for table `customerdetails`
--

CREATE TABLE `customerdetails` (
  `CustomerID` int(255) NOT NULL,
  `FullName` varchar(255) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DOB` varchar(50) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `ConfirmPass` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerdetails`
--

INSERT INTO `customerdetails` (`CustomerID`, `FullName`, `Gender`, `DOB`, `Username`, `Password`, `ConfirmPass`, `Email`) VALUES
(1, 'niru dal', 'Female', '08/10/2020', 'nirus', '1234', '1234', 'nirupink58@gmail.com'),
(2, 'sandu mapatuna', 'Female', '08/10/1997', 'sandu', 'sandu', 'sandu', 'sandu@gmail.com'),
(3, 'sandu mapatuna', 'Female', '08/10/1997', 'sandu', 'sandu', 'sandu', 'sandu@gmail.com'),
(4, 'sula bole', 'Male', '01/10/2020', 'sulaa', '1234', '1234', 'nipah84226@tashjw.com'),
(5, 'sula bole', 'Male', '01/10/2020', 'sulaa', '1234', '1234', 'nipah84226@tashjw.com'),
(6, 'sula bole', 'Male', '01/10/2020', 'sulaa', '1234', '1234', 'nipah84226@tashjw.com'),
(7, 'lara', 'Female', '1998/07/06', 'laa', '12', '12', 'laa@c'),
(8, 'piu pooh', 'Female', '12/10/1994', 'pooh', '123', '123', 'pooh@d'),
(9, 'piu pooh', 'Female', '12/10/1994', 'pooh', '123', '123', 'pooh@d'),
(10, 'ddc', 'Other', '08/10/2020', 'dcsd', '123', '123', 'amilad@millenniumitesp.com'),
(11, 'ddc', 'Other', '08/10/2020', 'dcsd', '123', '123', 'amilad@millenniumitesp.com'),
(12, 'cv', 'Female', '06/10/2020', 'cv', 'cv', 'cv', 'cv@1'),
(13, 'v', 'Female', '08/10/2020', 'v', 'v', 'v', 'v@1'),
(14, 'a', 'Female', '05/10/2020', 's', 'a', 'a', 's@12'),
(15, 'nn', 'Female', '12/10/2020', 'v', 'v', 'v', 'v@1'),
(1001, 'meme', 'female', '07/07/1998', 'mehh', '1231', '1231', 'g@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ID` int(255) NOT NULL,
  `productName` varchar(100) NOT NULL,
  `category` varchar(100) NOT NULL,
  `price` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ID`, `productName`, `category`, `price`) VALUES
(1, 'Lauren white blouse', 'women', '3450.00'),
(2, 'Esprit Ruffle Shirt', 'women', '1650.00'),
(3, 'Only Check Shirt', 'men', '4500.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`cartID`);

--
-- Indexes for table `customerdetails`
--
ALTER TABLE `customerdetails`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
