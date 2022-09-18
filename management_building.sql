-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Des 2021 pada 06.29
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `management_building`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `user` varchar(20) NOT NULL,
  `password` char(8) DEFAULT NULL,
  `status` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`user`, `password`, `status`) VALUES
('Achmad Zakariya', '29102002', 'Admin'),
('Alfian Feriyanto', '30112000', 'Admin'),
('Febriyanto', '05021999', 'Admin'),
('Spongebob', '12345', 'Admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(30) DEFAULT NULL,
  `kategori` varchar(30) DEFAULT NULL,
  `brand` varchar(30) DEFAULT NULL,
  `stok` varchar(5) DEFAULT NULL,
  `harga_beli` varchar(8) DEFAULT NULL,
  `harga_jual` varchar(8) DEFAULT NULL,
  `satuan` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `kategori`, `brand`, `stok`, `harga_beli`, `harga_jual`, `satuan`) VALUES
('BRG00001', 'Semen Putih', 'Semen', 'Tiga Roda', '305', '58000', '68000', 'Pick up'),
('BRG00002', 'Semen Biasa', 'Semen', 'Semen Gresik', '650', '250000', '350000', 'Pick up'),
('BRG00003', 'Batu Bata Belanda', 'Batu', 'Netherlands', '988', '500000', '800000', 'Buah'),
('BRG00004', 'Bata Ringan', 'Batu', 'Hebel', '1250', '730000', '750000', 'm3'),
('BRG00005', 'Kayu Meranti 2 x 3 ', 'Kayu', 'Super', '800', '7500', '8500', 'Batang'),
('BRG00006', 'Kayu Meranti 3x4 cm', 'Kayu', 'Super', '800', '15750', '16500', 'Batang'),
('BRG00007', 'Cat Tembok', 'Material', 'Paragon', '105', '15000', '22500', 'Kg');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_pembelian`
--

CREATE TABLE `detail_pembelian` (
  `id_pembelian` char(10) DEFAULT NULL,
  `id_barang` char(10) DEFAULT NULL,
  `harga` int(7) DEFAULT NULL,
  `qty` int(3) DEFAULT NULL,
  `grand_total` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `detail_pembelian`
--

INSERT INTO `detail_pembelian` (`id_pembelian`, `id_barang`, `harga`, `qty`, `grand_total`) VALUES
('001', '000000PALU', 25000, 5, 25000),
('T02001', '000000PAKU', 5000, 1, 5000),
('TR010054', 'B01002', 5000, 1, 5000),
('TR010054', 'B01002', 5000, 5, 25000),
('TR001232', 'B01004', 60000, 100, 6000000),
('TR001232', 'B01004', 60000, 100, 6000000),
('TRB10055', 'BRG00001', 58000, 50, 2900000),
('TRB10056', 'BRG00001', 58000, 50, 2900000),
('TRB10057', 'BRG00004', 730000, 750, 547500000),
('TRB10058', 'BRG00001', 58000, 100, 5800000),
('TRB10059', 'BRG00001', 58000, 50, 2900000),
('TRB10060', 'BRG00001', 58000, 10, 580000),
('TRB10060', 'BRG00006', 15750, 50, 787500),
('TRB10061', 'BRG00007', 15000, 100, 1500000),
('TRB10062', 'BRG00001', 58000, 50, 2900000),
('TRB10062', 'BRG00007', 15000, 5, 75000);

--
-- Trigger `detail_pembelian`
--
DELIMITER $$
CREATE TRIGGER `penambahan stok` AFTER INSERT ON `detail_pembelian` FOR EACH ROW BEGIN UPDATE barang SET stok = stok + new.qty WHERE id_barang = new.id_barang;END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_penjualan`
--

CREATE TABLE `detail_penjualan` (
  `id_penjualan` char(10) DEFAULT NULL,
  `id_barang` char(10) DEFAULT NULL,
  `harga` int(7) DEFAULT NULL,
  `qty` int(3) DEFAULT NULL,
  `grand_total` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `detail_penjualan`
--

INSERT INTO `detail_penjualan` (`id_penjualan`, `id_barang`, `harga`, `qty`, `grand_total`) VALUES
('0000000001', '000000PAKU', 5000, 5, 25000),
('0000000001', '000000PAKU', 5000, 3, 15000),
('0000000001', '000000PALU', 25000, 5, 125000),
('0000000001', '000000PAKU', 5000, 1, 5000),
('0000000001', '000000PAKU', 5000, 1, 5000),
('0000000001', '000000PAKU', 5000, 10, 50000),
('0000000001', '000000PAKU', 5000, 10, 50000),
('0000000001', '000000PAKU', 5000, 5, 25000),
('0000000001', '000000PAKU', 5000, 5, 25000),
('0000000001', '000000PAKU', 5000, 9, 45000),
('0000000001', '000000PAKU', 5000, 3, 15000),
('0000000001', '000000PAKU', 5000, 1, 5000),
('0000000001', 'B01001', 25000, 2, 50000),
('0000000001', 'B01001', 30000, 1, 30000),
('T01004', '000000PALU', 25000, 1, 25000),
('T01006', '000000PAKU', 25000, 1, 25000),
('T01009', '000000PALU', 25000, 1, 25000),
('TR000012', 'B01001', 30000, 5, 150000),
('TR00031', '000000PALU', 25000, 2, 50000),
('TR00015', 'B01001', 30000, 1, 30000),
('TR00015', '000000PALU', 30000, 5, 150000),
('TRJ00007', 'BRG00002', 0, 0, 0),
('TRJ00007', 'BRG00002', NULL, NULL, NULL),
('TRJ00008', 'BRG00002', 350000, 2, 700000),
('TRJ00009', 'BRG00002', 350000, 50, 17500000),
('TRJ00008', 'BRG00003', 800000, 2, 1600000),
('TRJ00009', 'BRG00003', 800000, 10, 8000000),
('TRJ00009', 'BRG00001', 68000, 5, 340000);

--
-- Trigger `detail_penjualan`
--
DELIMITER $$
CREATE TRIGGER `Pengurangan Stok` AFTER INSERT ON `detail_penjualan` FOR EACH ROW BEGIN UPDATE barang SET stok = stok - new.qty WHERE id_barang = new.id_barang;END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` char(10) NOT NULL,
  `nama_pegawai` varchar(30) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `no_telp` varchar(15) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `no_telp`, `user`) VALUES
('PG010001', 'Febriyanto', 'Pamekasan', '087642371342', 'Febriyanto'),
('PG010002', 'Achmad Zakariya', 'Pamekasan', '087863302407', 'Achmad Zakariya'),
('PG010003', 'Alfian Feriyanto', 'Pamekasan', '08764275285', 'Alfian Feriyanto'),
('PG010004', 'Spongebob Squarepants', 'Bikin Bottom', '0767546754326', 'Spongebob');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` varchar(20) NOT NULL,
  `nama_pembeli` varchar(30) DEFAULT NULL,
  `alamat` varchar(25) DEFAULT NULL,
  `no_telp` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembeli`
--

INSERT INTO `pembeli` (`id_pembeli`, `nama_pembeli`, `alamat`, `no_telp`) VALUES
('PBL00001', 'Rahmat', 'Pamekasan', '087876452090'),
('PBL00002', 'Toyo', 'Sukabumi', '08745326714'),
('PBL00003', 'Novi', 'Kreongan', '087421367432'),
('PBL00004', 'Luqi', 'Jakarta', '0473128432'),
('PBL00005', 'Ferli', 'Surabaya', '08786563212'),
('PBL00007', 'Alya', 'Pamekasan', '087863302407'),
('PBL00008', 'Ammar', 'Jember', '08432754345'),
('PBL00009', 'Alfet', 'Pamekasan', '074218532543'),
('PBL00010', 'Rahman', 'Probolinggo', '087537812432'),
('PBL00011', 'Parto', 'Sampang', '065327421132'),
('PBL00012', 'Suparman', 'Pamekasan', '0897632157'),
('PBL00013', 'Jon', 'Surabaya', '0467218498'),
('PBL00014', 'Tono', 'Sidoarjo', '08785624345'),
('PBL00020', 'popo', 'Bojonegoro', '08765372342'),
('PBL00021', 'didin', 'Pamekasan', '0875326742'),
('PBL00022', 'kaila', 'Malang', '0863424321'),
('PBL00023', 'Mat kato', 'Sidoarjo', '085432645732'),
('PBL00024', 'Bambang', 'Surabaya', '07864673283');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE `pembelian` (
  `id_pembelian` char(10) NOT NULL,
  `id_pegawai` char(10) DEFAULT NULL,
  `id_suplier` char(10) DEFAULT NULL,
  `jam` time DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembelian`
--

INSERT INTO `pembelian` (`id_pembelian`, `id_pegawai`, `id_suplier`, `jam`, `tanggal`) VALUES
('001', 'PG00000001', '0123456789', '08:00:00', '2021-11-25'),
('T02001', 'P00003', '000000002', '10:21:59', '2021-12-08'),
('TR001232', 'P01002', '000000002', '05:00:12', '2021-12-10'),
('TR010054', 'P01001', '0123456789', '04:26:31', '2021-12-10'),
('TRB10055', 'PG010002', 'SPL00003', '12:32:22', '2021-12-12'),
('TRB10056', 'PG010002', 'SPL00004', '12:35:53', '2021-12-12'),
('TRB10057', 'PG010002', 'SPL00005', '06:29:26', '2021-12-15'),
('TRB10058', 'PG010002', 'SPL00006', '07:39:07', '2021-12-15'),
('TRB10059', 'PG010002', 'SPL00007', '07:42:09', '2021-12-15'),
('TRB10060', 'PG010002', 'SPL00008', '07:43:48', '2021-12-15'),
('TRB10061', 'PG010004', 'SPL00009', '10:46:44', '2021-12-16'),
('TRB10062', 'PG010004', 'SPL00010', '10:57:20', '2021-12-16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` char(10) NOT NULL,
  `id_pegawai` char(10) DEFAULT NULL,
  `id_pembeli` char(10) DEFAULT NULL,
  `jam` time DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `id_pegawai`, `id_pembeli`, `jam`, `tanggal`) VALUES
('0000000001', 'PG00000002', '0000000001', '08:00:00', '2021-11-25'),
('T01004', 'P01001', 'PB01001', '09:46:41', '2021-12-08'),
('T01006', 'P01001', 'PB01001', '01:04:48', '2021-12-08'),
('T01009', 'P01001', 'PB01001', '02:54:43', '2021-12-08'),
('TR000012', 'P01001', 'PB01001', '02:58:20', '2021-12-08'),
('TR00015', 'P01002', 'PB010005', '02:28:16', '2021-12-09'),
('TR00031', 'P01001', 'PB01001', '04:35:00', '2021-12-08'),
('TRJ00001', 'PG010002', 'PBL00002', '08:00:00', '2021-12-11'),
('TRJ00005', 'PG010001', 'PBL00020', '10:20:38', '2021-12-12'),
('TRJ00006', 'PG010002', 'PBL00021', '10:31:23', '2021-12-12'),
('TRJ00007', 'PG010001', 'PBL00022', '10:38:33', '2021-12-12'),
('TRJ00008', 'PG010002', 'PBL00023', '02:06:41', '2021-12-12'),
('TRJ00009', 'PG010004', 'PBL00024', '10:51:55', '2021-12-16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `suplier`
--

CREATE TABLE `suplier` (
  `id_suplier` char(10) NOT NULL,
  `nama_suplier` varchar(50) DEFAULT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  `no_telp` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `suplier`
--

INSERT INTO `suplier` (`id_suplier`, `nama_suplier`, `alamat`, `no_telp`) VALUES
('000000002', 'Joko Kendil', 'Jember', '087866665555'),
('0123456789', 'Hartono', 'Pamekasan', '087863302407'),
('SPL00001', 'Sutrisno', 'Bojonegoro', '087812344321'),
('SPL00002', 'Mat Gondrong', 'Jombang', '08756431334'),
('SPL00003', 'Feli Jaya', 'Probolinggo', '0878532672'),
('SPL00004', 'Feli Jaya Kusuma', 'Situbondo', '08767432842'),
('SPL00005', 'Cahaya Berlian', 'Pamekasan', '08637254732'),
('SPL00006', 'Cahaya', 'Pamekasan', '08657425432'),
('SPL00007', 'Cahaya', 'Pamekasan', '0865745323214'),
('SPL00008', 'Cahaya Sinar', 'Pamekasan', '08785325623'),
('SPL00009', 'Hartono ', 'Malang', '078463278243'),
('SPL00010', 'Parto', '', '');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`user`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indeks untuk tabel `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  ADD KEY `id_pembelian` (`id_pembelian`);

--
-- Indeks untuk tabel `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  ADD KEY `id_penjualan` (`id_penjualan`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD KEY `user` (`user`);

--
-- Indeks untuk tabel `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indeks untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_pegawai` (`id_pegawai`),
  ADD KEY `id_suplier` (`id_suplier`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_pegawai` (`id_pegawai`),
  ADD KEY `id_pembeli` (`id_pembeli`);

--
-- Indeks untuk tabel `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`id_suplier`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  ADD CONSTRAINT `detail_pembelian_ibfk_1` FOREIGN KEY (`id_pembelian`) REFERENCES `pembelian` (`id_pembelian`),
  ADD CONSTRAINT `detail_pembelian_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`);

--
-- Ketidakleluasaan untuk tabel `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  ADD CONSTRAINT `detail_penjualan_ibfk_1` FOREIGN KEY (`id_penjualan`) REFERENCES `penjualan` (`id_penjualan`),
  ADD CONSTRAINT `detail_penjualan_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`);

--
-- Ketidakleluasaan untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`user`) REFERENCES `akun` (`user`);

--
-- Ketidakleluasaan untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`),
  ADD CONSTRAINT `pembelian_ibfk_2` FOREIGN KEY (`id_suplier`) REFERENCES `suplier` (`id_suplier`);

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `pembeli` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`) ON DELETE CASCADE,
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`),
  ADD CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`),
  ADD CONSTRAINT `penjualan_ibfk_3` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `penjualan_ibfk_4` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
