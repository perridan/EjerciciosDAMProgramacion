create table EMPLEADO(
    -> idEmp int(11) not null Primary key Auto_increment,
    -> nombreEmp varchar(25) not null,
    -> ApellidoEmp varchar(25) not null,
    -> oficioEmp varchar(25) not null,
    -> sueldoEmp int(11) not null,
    -> idHotel int(11) not null,
    -> foreign key (idHotel) references hotel(idHotel)) Engine = innoDB CHARSET=utf8mb4 collate=utf8mb4_spanish_ci;

    INSERT INTO empleado 
VALUES
(1, 'Pedro', 'Gómez', 'Conserje', 1000, 1),
(2, 'Pablo', 'Redondo', 'Director', 850, 2),
(3, 'Jorge', 'Escobar', 'Pintor', 900, 1),
(4, 'Pilar', 'Llull', 'Directora', 900, 2),
(5, 'David', 'Martín', 'Camarero', 800, 1),
(6, 'Francisco', 'Moya', 'Fontanero', 1000, 1),
(7, 'Antonio', 'Sainz', 'Conserje', 888, 2),
(8, 'Luis', 'Merino', 'Recepcionista', 234, 4),
(9, 'Lorena', 'Escudero', 'Gobernanta', 444, 4),
(10, 'Manuel', 'Robledo', 'Camarero', 900, 2),
(11, 'Bernardo', 'Álvarez', 'Conductor', 654, 8);