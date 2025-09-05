CASO: 
Implementación de un Sistema de Registro de Asignaturas para un Instituto

Contexto:
Un instituto moderniza los registros de las asignaturas que los alumnos cursan durante el semestre, por lo que ha contratado sus servicios para desarrollar un sistema que permita almacenar la información de las notas registradas por sus estudiantes durante el semestre y poder calcular la situación final del alumno. Para calcular la nota final, se requiere información básica del estudiante, asignatura y docente que la imparte.
Requerimiento Inicial: El sistema deberá registrar la información esencial de cada Estudiante, como su rut, nombre, edad y fecha de nacimiento. De cada Docente, considerar rut, nro_docente, nombre, fecha de ingreso y sede en la que trabaja (Se considera que puede impartir clases solo en una sede). De la Sede, se interesa almacenar el nro único de la sede, su nombre y comuna. Respecto a la Asignatura, almacenar el código único de la asignatura, el nombre de la asignatura, el nombre del estudiante y docente que la dicta, además de las notas parciales (nota1, nota2 y nota3).

Una vez creadas las clases con sus atributos y métodos (constructores, getters y setters), se deben implementar las siguientes reglas de negocio:
♦	Un método que calcule la nota de presentación a examen considerando que las notas ponderan: 
o	nota1 (30%), 
o	nota2 (30%) y, 
o	nota3 (40%)
♦	Un método que calcule, dado la nota de presentación, si el estudiante está eximido. Considerar nota de eximición si es mayor o igual 5.0.
♦	Construir un método que, ingresada la nota del examen, calcular la nota final y si está “aprobado” o reprobado”. Hay que considerar que la nota de presentación corresponde a un 60% y el examen un 40%.
♦	La nota de aprobación debe ser mayor o igual a 4.0

Validaciones
♦	El nombre del estudiante y docente no puede estar no debe estar vacío
♦	La edad del estudiante debe ser mayor o igual a 18 y menor que 100
♦	La fecha de ingreso del docente no puede ser posterior a hoy.

Pruebas de funcionamiento
♦	En el método principal, generar un menú inicial donde se puedan ejecutar las funciones requeridas (las validaciones, se deben ejecutar en el momento que se ingresa el dato). 
♦	Tener en cuenta que para el ingreso de una asignatura debe estar previamente ingresar el estudiante y el docente.

Ejemplo de menú: 
=== SISTEMA DE REGISTRO DE ASIGNATURAS ===
1. Ingresar Estudiante
2. Ingresar Docente
3. Ingresar Asignatura
4. Calcular Resultados
5. Salir
Seleccione una opción: 1
 
--- INGRESO DE ESTUDIANTE ---
Ingrese RUT del estudiante: 18.456.789-5
Ingrese nombre del estudiante: Amalia Muñoz
Ingrese edad del estudiante: 20
Ingrese fecha de nacimiento (AAAA-MM-DD): 2005-01-11
Estudiante registrado con éxito.
 
Presione Enter para continuar...
