-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-07-2026 a las 17:25:02
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `suma_algebraica_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operaciones`
--

CREATE TABLE `operaciones` (
  `id` int(11) NOT NULL,
  `termino1` double DEFAULT NULL,
  `termino2` double DEFAULT NULL,
  `termino3` double DEFAULT NULL,
  `termino4` double DEFAULT NULL,
  `termino5` double DEFAULT NULL,
  `termino6` double DEFAULT NULL,
  `termino7` double DEFAULT NULL,
  `termino8` double DEFAULT NULL,
  `termino9` double DEFAULT NULL,
  `termino10` double DEFAULT NULL,
  `termino11` double DEFAULT NULL,
  `termino12` double DEFAULT NULL,
  `termino13` double DEFAULT NULL,
  `termino14` double DEFAULT NULL,
  `termino15` double DEFAULT NULL,
  `termino16` double DEFAULT NULL,
  `termino17` double DEFAULT NULL,
  `termino18` double DEFAULT NULL,
  `termino19` double DEFAULT NULL,
  `termino20` double DEFAULT NULL,
  `termino21` double DEFAULT NULL,
  `termino22` double DEFAULT NULL,
  `termino23` double DEFAULT NULL,
  `resultado` double DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `operaciones`
--
ALTER TABLE `operaciones`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `operaciones`
--
ALTER TABLE `operaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
