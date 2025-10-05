insert into estudiantes
value (001, "Alex Fernandez", 23);
insert into estudiantes
value (002, "Sebastian Riquelme", 21);
insert into estudiantes
value (003, "Alicia Cuevas", 25);
insert into estudiantes
value (004, "Fernanda Sotomayor", 21);
insert into estudiantes
value (005, "Alex Fernandez", 23);

insert into cursos
value (001, "Algebra 1", "26 semanas");
insert into cursos
value (002, "Quimica General 1", "20 semanas");
insert into cursos
value (003, "Calculo 2", "16 semanas");
insert into cursos
value (004, "Ley Romana", "22 semanas");

insert into inscripciones value (001, 001);
insert into inscripciones value (003, 001);
insert into inscripciones value (002, 002);
insert into inscripciones value (005, 002);
insert into inscripciones value (001, 003);
insert into inscripciones value (002, 003);
insert into inscripciones value (004, 004);
insert into inscripciones value (002, 004);

SELECT 
    e.idEstudiantes,
    e.Nombre,
    c.Nombre,
    c.Duracion
FROM estudiantes e
INNER JOIN inscripciones i ON e.idEstudiantes = i.Estudiantes_idEstudiantes
INNER JOIN cursos c ON i.Cursos_idCursos = c.idCursos
ORDER BY e.Nombre, c.Nombre;

SELECT 
    e.idEstudiantes,
    e.nombre,
    e.edad
FROM estudiantes e
INNER JOIN inscripciones i ON e.idEstudiantes = i.Estudiantes_idEstudiantes
INNER JOIN cursos c ON i.Cursos_idCursos = c.idCursos
WHERE c.nombre = 'Algebra 1';

SELECT 
    c.idCursos,
    c.nombre as nombre_curso,
    c.duracion
FROM cursos c
INNER JOIN inscripciones i ON c.idCursos = i.Cursos_idCursos
INNER JOIN estudiantes e ON i.Estudiantes_idEstudiantes = e.idEstudiantes
WHERE e.nombre = 'Alex Fernandez';

SELECT 
    c.nombre as nombre_curso,
    COUNT(i.Estudiantes_idEstudiantes) as numero_estudiantes
FROM cursos c
LEFT JOIN inscripciones i ON c.idCursos = i.Cursos_idCursos
GROUP BY c.idCursos, c.nombre
ORDER BY numero_estudiantes DESC;

SELECT 
    e.idEstudiantes,
    e.nombre,
    e.edad
FROM estudiantes e
LEFT JOIN inscripciones i ON e.idEstudiantes = i.Estudiantes_idEstudiantes
WHERE i.Estudiantes_idEstudiantes IS NULL;