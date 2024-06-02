-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4306
-- Generation Time: May 30, 2024 at 08:35 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbbjcraft`
--

-- --------------------------------------------------------

--
-- Table structure for table `buket`
--

CREATE TABLE `buket` (
  `id_buket` int(11) NOT NULL,
  `nama_buket` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `status` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buket`
--

INSERT INTO `buket` (`id_buket`, `nama_buket`, `harga`, `status`) VALUES
(1, 'Buket Bunga Lili', 25000, 'Tersedia'),
(2, 'Buket Beng Beng', 35000, 'Tersedia'),
(3, 'Buket Boneka', 75000, 'Tersedia'),
(4, 'Buket Snack', 25000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `id_buket` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `nama_buket` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah_beli` int(11) NOT NULL,
  `total_bayar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `nama_pelanggan`, `id_buket`, `tanggal`, `nama_buket`, `harga`, `jumlah_beli`, `total_bayar`) VALUES
(1, 'Afif', 3, '2024-05-30', 'Buket Boneka', 75000, 3, 225000),
(2, 'Mafa', 3, '2024-05-30', 'Buket Boneka', 75000, 4, 300000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `id_level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama_user`, `id_level`) VALUES
(1, 'administrator', 'adm123', 'Fatimah Az Zahra', 1),
(3, 'pelanggan', 'pe123', 'pelanggan', 3),
(4, 'owner', 'own123', 'owner', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buket`
--
ALTER TABLE `buket`
  ADD PRIMARY KEY (`id_buket`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_buket` (`id_buket`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buket`
--
ALTER TABLE `buket`
  MODIFY `id_buket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_buket`) REFERENCES `buket` (`id_buket`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
