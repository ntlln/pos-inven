-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 05, 2023 at 02:24 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pos-inven`
--
CREATE DATABASE IF NOT EXISTS `pos-inven` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `pos-inven`;

-- --------------------------------------------------------

--
-- Table structure for table `accountsTable`
--

CREATE TABLE `accountsTable` (
  `ID` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Username` text NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `actionTable`
--

CREATE TABLE `actionTable` (
  `ID` int(11) NOT NULL,
  `Product` text NOT NULL,
  `Developer` text NOT NULL,
  `Quantity` text NOT NULL,
  `Price` text NOT NULL,
  `Date and Time Sold` text NOT NULL,
  `Action` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `invenTable`
--

CREATE TABLE `invenTable` (
  `ID` int(11) NOT NULL,
  `Product` text NOT NULL,
  `Developer` text NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `salesTable`
--

CREATE TABLE `salesTable` (
  `ID` int(11) NOT NULL,
  `Product` text NOT NULL,
  `Developer` text NOT NULL,
  `Quantity` text NOT NULL,
  `Sold` text NOT NULL,
  `Date and Time Sold` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accountsTable`
--
ALTER TABLE `accountsTable`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `invenTable`
--
ALTER TABLE `invenTable`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
