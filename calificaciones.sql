-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 30-01-2024 a las 12:38:04
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `estudiantes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificaciones`
--

CREATE TABLE `calificaciones` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Cedula` varchar(10) NOT NULL,
  `Calificacion1` float NOT NULL,
  `Calificacion2` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `calificaciones`
--

INSERT INTO `calificaciones` (`ID`, `Nombre`, `Cedula`, `Calificacion1`, `Calificacion2`) VALUES
(1, 'por favor funciona', '15500', 20, 20),
(123, 'Joel', '1725577388', 15.9, 15),
(456, 'Jesy', '147852369', 18.9, 15.2),
(99999, 'Yo:(', '010101010', 15.5, 12.5),
(159951, 'Isabel', '8888888', 18, 18),
(190403, 'Dustin', '1725577389', 16.8, 12.6),
(333333, 'Isabelxd', '2222222', 18, 10),
(444444, 'Por', '11111', 19, 17),
(516192, 'Alejandro Quiroz', '789', 7, 9),
(999888, 'Potente xd', '456456', 13, 16.5),
(8080808, 'me quiero morir', '156474', 15.3, 12.6),
(8989898, 'Jesyxd', '77777777', 19, 20),
(10001100, 'Johnxd', '15555544', 1, 0),
(56481231, 'Alejandro Quiroz', '123', 7, 9),
(789789789, 'Dus', '1725577389', 15, 15),
(2147483647, 'Pepe xd', '1726409876', 5, 7);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `calificaciones`
--
ALTER TABLE `calificaciones`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `calificaciones`
--
ALTER TABLE `calificaciones`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2147483647;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
