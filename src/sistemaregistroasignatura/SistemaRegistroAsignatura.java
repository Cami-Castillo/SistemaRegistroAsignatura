package sistemaregistroasignatura;  // Definición del paquete

import java.util.Scanner;  // Importación de la clase Scanner para leer entradas del usuario

public class SistemaRegistroAsignatura {  // Declaración de la clase principal

    public static void main(String[] args) {  // Método principal donde se ejecuta el programa

        // Instanciamos un objeto Scanner para leer entradas desde la consola
        Scanner leer = new Scanner(System.in);

        int opcion;  // Variable para almacenar la opción seleccionada por el usuario
        int numero;  // Variable para almacenar números enteros
        String linea;  // Variable para almacenar cadenas de texto
        double nota;  // Variable para almacenar las notas de tipo doble (decimales)

        // Creación de instancias de objetos de las clases Estudiante, Docente, Asignatura y Sede
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        Docente docente1 = new Docente();
        Docente docente2 = new Docente();

        Asignatura asig1 = new Asignatura();
        Asignatura asig2 = new Asignatura();

        Sede sede1 = new Sede();
        Sede sede2 = new Sede();

        // Menú en bucle que permite al usuario seleccionar una opción
        do {
            System.out.println("------------------------");
            System.out.println(" SISTEMA DE REGISTRO");  // Título del sistema
            System.out.println("------------------------");
            System.out.println("1.- Ingresar Estudiante ");
            System.out.println("2.- Ingresar Docente");
            System.out.println("3.- Ingresar Asignatura");
            System.out.println("4.- Calcular Resultados");
            System.out.println("5.- Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();  // Se lee la opción ingresada por el usuario

            // Estructura de control switch para ejecutar una acción según la opción seleccionada
            switch (opcion) {
                case 1:
                    // INGRESO DE ESTUDIANTE
                    System.out.println("-- INGRESO DE ESTUDIANTE --");

                    System.out.print("Ingrese RUT del estudiante: ");
                    leer.nextLine();  // Limpiar el buffer de entrada antes de leer un String
                    linea = leer.nextLine();  // Leer el RUT del estudiante
                    estudiante1.setRut(linea);  // Establecer el RUT del estudiante

                    do {
                        System.out.print("Ingrese nombre del estudiante: ");
                        linea = leer.nextLine();  // Leer el nombre del estudiante
                        if (linea.equals("")) {  // Validar que el nombre no esté vacío
                            System.out.println("Error: El nombre no puede estar vacío.");
                        }
                    } while (linea.equals(""));  // Repetir mientras el nombre esté vacío

                    estudiante1.setNombre(linea);  // Establecer el nombre del estudiante

                    do {
                        System.out.print("Ingrese edad del estudiante: ");
                        numero = leer.nextInt();  // Leer la edad del estudiante
                        leer.nextLine();  // Limpiar el buffer
                        if (numero < 18 || numero >= 100) {  // Validar que la edad esté entre 18 y 99 años
                            System.out.println("Error: La edad debe ser entre 18 y 99 años.");
                        }
                    } while (numero < 18 || numero >= 100);  // Repetir mientras la edad no sea válida

                    estudiante1.setEdad(numero);  // Establecer la edad del estudiante

                    System.out.print("Ingrese fecha de nacimiento (dd/mm/aa): ");
                    linea = leer.nextLine();  // Leer la fecha de nacimiento
                    estudiante1.setFechaNacimiento(linea);  // Establecer la fecha de nacimiento del estudiante

                    System.out.println("Estudiante ingresado con éxito");  // Confirmar que el estudiante fue ingresado correctamente
                    System.out.println("------------------------------------");
                    // Mostrar los datos del estudiante ingresado
                    System.out.println("RUT: " + estudiante1.getRut());
                    System.out.println("Nombre: " + estudiante1.getNombre());
                    System.out.println("Edad: " + estudiante1.getEdad());
                    System.out.println("Fecha de nacimiento: " + estudiante1.getFechaNacimiento());
                    break;

                case 2:
                    // INGRESO DE DOCENTE
                    System.out.println("-- INGRESO DE DOCENTE --");

                    leer.nextLine();  // Limpiar el buffer antes de leer un String
                    System.out.print("Ingrese RUT del docente: ");
                    linea = leer.nextLine();  // Leer el RUT del docente
                    docente1.setRut(linea);  // Establecer el RUT del docente

                    System.out.print("Ingrese numero del docente: ");
                    numero = leer.nextInt();  // Leer el número del docente
                    leer.nextLine();  // Limpiar el buffer
                    docente1.setNroDocente(numero);  // Establecer el número del docente

                    do {
                        System.out.print("Ingrese nombre del docente: ");
                        linea = leer.nextLine();  // Leer el nombre del docente
                        if (linea.equals("")) {  // Validar que el nombre no esté vacío
                            System.out.println("Error: El nombre no puede estar vacío.");
                        }
                    } while (linea.equals(""));  // Repetir mientras el nombre esté vacío

                    docente1.nombreDocente(linea);  // Establecer el nombre del docente

                    String fechaMax = "05/09/2025";  // Definir la fecha máxima de ingreso para los docentes
                    do {
                        System.out.print("Ingrese fecha de ingreso del docente (dd/MM/yyyy): ");
                        linea = leer.nextLine();  // Leer la fecha de ingreso
                        if (linea.compareTo(fechaMax) > 0) {  // Validar que la fecha no sea posterior a la fecha máxima
                            System.out.println("Error: La fecha de ingreso no puede ser posterior a " + fechaMax);
                        }
                    } while (linea.compareTo(fechaMax) > 0);  // Repetir mientras la fecha sea posterior

                    docente1.setfechaIngreso(linea);  // Establecer la fecha de ingreso del docente

                    System.out.print("Ingrese sede en la que trabaja: ");
                    linea = leer.nextLine();  // Leer la sede en la que trabaja el docente
                    docente1.setSede(linea);  // Establecer la sede

                    break;

                case 3:
                    // INGRESO DE ASIGNATURA
                    System.out.println("-- INGRESO DE ASIGNATURA --");
                    leer.nextLine();  // Limpiar el buffer antes de leer un String
                    System.out.print("Ingrese el codigo unico de la asignatura: ");
                    linea = leer.nextLine();  // Leer el código de la asignatura
                    asig1.setCodigo(linea);  // Establecer el código de la asignatura

                    System.out.print("Ingrese nombre de la asignatura: ");
                    linea = leer.nextLine();  // Leer el nombre de la asignatura
                    asig1.setNombreAsignatura(linea);  // Establecer el nombre de la asignatura

                    System.out.print("Ingrese nombre del estudiante: ");
                    linea = leer.nextLine();  // Leer el nombre del estudiante
                    asig1.setNombreEstudiante(linea);  // Establecer el nombre del estudiante

                    System.out.print("Docente que imparte la asignatura: ");
                    linea = leer.nextLine();  // Leer el nombre del docente
                    asig1.setNombreProfesor(linea);  // Establecer el nombre del docente

                    System.out.print("Ingrese nota 1: ");
                    nota = leer.nextDouble();  // Leer la primera nota
                    asig1.setNota1(nota);  // Establecer la primera nota

                    System.out.print("Ingrese nota 2: ");
                    nota = leer.nextDouble();  // Leer la segunda nota
                    asig1.setNota2(nota);  // Establecer la segunda nota

                    System.out.print("Ingrese nota 3: ");
                    nota = leer.nextDouble();  // Leer la tercera nota
                    asig1.setNota3(nota);  // Establecer la tercera nota

                    System.out.print("Ingrese nota examen: ");
                    nota = leer.nextDouble();  // Leer la nota del examen
                    asig1.setNotaExamen(nota);  // Establecer la nota del examen

                    break;

                case 4:
                    // CALCULAR RESULTADOS
                    System.out.println("Nota de presentación de estudiante: " + asig1.notaPresentacion());  // Calcular la nota de presentación
                    System.out.println("Nota Final: " + asig1.notaFinal(asig1.getNotaExamen()));  // Calcular la nota final
                    if (asig1.aprobado()) {  // Verificar si el estudiante aprobó
                        System.out.println("Estudiante aprobado");
                    } else {
                        System.out.println("Estudiante no aprobado");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");  // Mensaje al salir del sistema
                    break;

                default:
                    System.out.println("Error: Ingrese una opción válida.");  // Mensaje en caso de que el usuario ingrese una opción inválida
                    break;
            }

        } while (opcion != 5);  // El bucle se repite hasta que la opción seleccionada sea 5 (salir)

        leer.close();  // Cerrar el Scanner
    }
}


    
        
