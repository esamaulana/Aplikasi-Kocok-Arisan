-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 05, 2018 at 06:05 AM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `arisanyuk`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `Email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`, `Email`) VALUES
('asuS', 'faldia', 'faldi'),
('faldi', 'fdfd', 'faldi@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `admin_kelompok`
--

CREATE TABLE `admin_kelompok` (
  `Username` varchar(30) NOT NULL,
  `Id_KelompokArisan` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_kelompok`
--

INSERT INTO `admin_kelompok` (`Username`, `Id_KelompokArisan`) VALUES
('asuS', 1);

-- --------------------------------------------------------

--
-- Table structure for table `anggota_arisan`
--

CREATE TABLE `anggota_arisan` (
  `Id_Anggota` int(3) NOT NULL,
  `Nama_Anggota` varchar(50) NOT NULL,
  `Alamat` varchar(150) DEFAULT NULL,
  `Ikut_Arisan` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota_arisan`
--

INSERT INTO `anggota_arisan` (`Id_Anggota`, `Nama_Anggota`, `Alamat`, `Ikut_Arisan`) VALUES
(1, 'Faldi', 'Donondfadfdfadf', 2),
(2, 'AnjingGblok', 'anskoakos', 2);

-- --------------------------------------------------------

--
-- Table structure for table `kelompok_anggota`
--

CREATE TABLE `kelompok_anggota` (
  `Id_KelompokArisan` int(3) NOT NULL,
  `Id_Anggota` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok_anggota`
--

INSERT INTO `kelompok_anggota` (`Id_KelompokArisan`, `Id_Anggota`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `kelompok_arisan`
--

CREATE TABLE `kelompok_arisan` (
  `Id_Kelompok` int(3) NOT NULL,
  `Nama_Kelompok` varchar(60) NOT NULL,
  `Tanggal_Mulai_Arisan` date NOT NULL,
  `Jumlah_Anggota` int(3) NOT NULL,
  `Jumlah_Setoran` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok_arisan`
--

INSERT INTO `kelompok_arisan` (`Id_Kelompok`, `Nama_Kelompok`, `Tanggal_Mulai_Arisan`, `Jumlah_Anggota`, `Jumlah_Setoran`) VALUES
(1, 'Kontlo', '2018-02-03', 12, 120000),
(2, 'asu', '2018-02-04', 10, 12000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Username`,`Email`);

--
-- Indexes for table `admin_kelompok`
--
ALTER TABLE `admin_kelompok`
  ADD UNIQUE KEY `Username` (`Username`),
  ADD UNIQUE KEY `Id_KelompokArisan` (`Id_KelompokArisan`);

--
-- Indexes for table `anggota_arisan`
--
ALTER TABLE `anggota_arisan`
  ADD PRIMARY KEY (`Id_Anggota`);

--
-- Indexes for table `kelompok_anggota`
--
ALTER TABLE `kelompok_anggota`
  ADD UNIQUE KEY `Id_KelompokArisan` (`Id_KelompokArisan`),
  ADD UNIQUE KEY `Id_Anggota` (`Id_Anggota`);

--
-- Indexes for table `kelompok_arisan`
--
ALTER TABLE `kelompok_arisan`
  ADD PRIMARY KEY (`Id_Kelompok`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota_arisan`
--
ALTER TABLE `anggota_arisan`
  MODIFY `Id_Anggota` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `kelompok_arisan`
--
ALTER TABLE `kelompok_arisan`
  MODIFY `Id_Kelompok` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin_kelompok`
--
ALTER TABLE `admin_kelompok`
  ADD CONSTRAINT `admin_kelompok_ibfk_1` FOREIGN KEY (`Username`) REFERENCES `admin` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `admin_kelompok_ibfk_2` FOREIGN KEY (`Id_KelompokArisan`) REFERENCES `kelompok_arisan` (`Id_Kelompok`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `kelompok_anggota`
--
ALTER TABLE `kelompok_anggota`
  ADD CONSTRAINT `kelompok_anggota_ibfk_1` FOREIGN KEY (`Id_KelompokArisan`) REFERENCES `kelompok_arisan` (`Id_Kelompok`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kelompok_anggota_ibfk_2` FOREIGN KEY (`Id_Anggota`) REFERENCES `anggota_arisan` (`Id_Anggota`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
