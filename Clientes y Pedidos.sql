insert into clientes (idClientes, Nombre, Direccion, Telefono)
values (001, "Leonardo Rosales", "Av. Riesco 332", 935528123);
insert into clientes (idClientes, Nombre, Direccion, Telefono)
values (002, "Rafael Salgado", "Av. Manuel 567", 937281920);
insert into clientes (idClientes, Nombre, Direccion, Telefono)
values (003, "Sebastian Gonzales", "Teresa 299", 956281927);
insert into clientes (idClientes, Nombre, Direccion, Telefono)
values (004, "Fernando Fitzgerald", "Rodriguez 1023", 926327182);
insert into clientes (idClientes, Nombre, Direccion, Telefono)
values (005, "Martin Fuentes", "Terragona 2003", 937263881);

insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (001, "2025-10-22", 123.99, 003);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (002, "2024-06-12", 55.20, 002);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (003, "2023-11-09", 35.45, 001);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (004, "2025-09-22", 459.38, 001);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (005, "2025-03-13", 123.99, 003);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (006, "2025-12-25", 76.20, 005);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (007, "2023-04-17", 178.45, 005);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (008, "2025-02-15", 230, 004);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (009, "2023-01-19", 43.10, 004);
insert into pedidos (idPedidos, Fecha, Total, Clientes_idClientes)
values (010, "2025-05-23", 665, 001);

SELECT c.*, p.*
FROM clientes c
LEFT JOIN pedidos p ON c.idClientes = p.Clientes_idClientes;

SELECT *
FROM pedidos
WHERE Clientes_idClientes = 5;

SELECT 
    Clientes_idClientes,
    SUM(Total) AS Total_Pedidos
FROM pedidos
GROUP BY Clientes_idClientes;

DELETE FROM pedidos 
WHERE Clientes_idClientes = 3;
DELETE FROM clientes 
WHERE idClientes = 3;

SELECT 
    c.idClientes,
    c.Nombre AS Cliente,
    COUNT(p.idPedidos) AS Cantidad_Pedidos
FROM clientes c
INNER JOIN pedidos p ON c.idClientes = p.Clientes_idClientes
GROUP BY c.idClientes, c.Nombre
ORDER BY Cantidad_Pedidos DESC
LIMIT 3;