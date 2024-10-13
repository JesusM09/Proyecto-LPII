create database VentaMuebles;
use VentaMuebles;
DROP TABLE inmueble ;

--
-- Estructura de tabla para la tabla `cliente`
--
CREATE TABLE `cliente` (
`RFC` int(11) NOT NULL,
`NOMBRE` varchar(100) DEFAULT NULL,
`APELLIDO` varchar(100) DEFAULT NULL,
`FN` varchar(20) DEFAULT NULL,
`TEL` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
--
-- Volcado de datos para la tabla `cliente`
--
INSERT INTO `cliente` (`RFC`, `NOMBRE`, `APELLIDO`, `FN`, `TEL`) VALUES
(20251, 'Juan', 'Perez', 'fn', '96582354'),
(20252, 'Maria', 'Zea', 'fn', '9653525');

-- Estructura de tabla para la tabla `cliente_producto`
--

CREATE TABLE `cliente_producto` (
  `CODIGO` int(11) NOT NULL,
  `RFC_CLIENTE` int(11) DEFAULT NULL,
  `CODIGO_PRODUCTO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente_producto`
--

INSERT INTO `cliente_producto` (`CODIGO`, `RFC_CLIENTE`, `CODIGO_PRODUCTO`) VALUES
(1, 20252, 1),
(2, 20252, 2);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `CODIGO` int(11) NOT NULL,
  `NOMBRE` varchar(100) DEFAULT NULL,
  `PRECIO` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`CODIGO`, `NOMBRE`, `PRECIO`) VALUES
(1, 'Cocacola 1l', 2.50),
(2, 'Inkacola 1l', 2.50);
--
-- Índices para tablas volcadas
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`RFC`);

--
-- Indices de la tabla `cliente_producto`
--
ALTER TABLE `cliente_producto`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `RFC_CLIENTE` (`RFC_CLIENTE`),
  ADD KEY `CODIGO_PRODUCTO` (`CODIGO_PRODUCTO`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`CODIGO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente_producto`
--
ALTER TABLE `cliente_producto`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
  
  --
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente_producto`
--
ALTER TABLE `cliente_producto`
  ADD CONSTRAINT `cliente_producto_ibfk_1` FOREIGN KEY (`RFC_CLIENTE`) REFERENCES `cliente` (`RFC`),
  ADD CONSTRAINT `cliente_producto_ibfk_2` FOREIGN KEY (`CODIGO_PRODUCTO`) REFERENCES `producto` (`CODIGO`);
COMMIT;

















