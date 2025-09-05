package sistemaregistroasignatura;
import java.util.Scanner;

public class SistemaRegistroAsignatura {
        //Asignatura asignatura1 = new Asignatura("POO", 1, "Pepito", "Pepito2", 7.0, 4.0, 7.0);
        //double notaEje = asignatura1.notaPresentacion();
        //System.out.println("Nota presentacion " + notaEje);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        int numero;
        String linea;
        double nota;
        //Estudiante(String rut, String nombre, int edad, String fechaNacimiento)

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        //Docente(String nombreDocente, int rut, int nroDocente, String fechaIngreso)

        Docente docente1 = new Docente();
        Docente docente2 = new Docente();

        //Asignatura(String nombreAsignatura, int codigo, String nombreEstudiante, String nombreProfesor, double nota1, double nota2, double nota3)

        Asignatura asig1 = new Asignatura();
        Asignatura asig2 = new Asignatura();

        //Sede(String nroSede, String nombre, String comuna)

        Sede sede1 = new Sede();
        Sede sede2 = new Sede();
        
        do{
            System.out.println("------------------------");
            System.out.println(" SISTEMA DE REGISTRO");
            System.out.println("------------------------");
            System.out.println("1.- Ingresar Estudiante ");
            System.out.println("2.- Ingresar Docente");
            System.out.println("3.- Ingresar Asignatura");
            System.out.println("4.- Calcular Resultados");
            System.out.println("5.- Salir");
            opcion = leer.nextInt();

            switch(opcion){
    case 1:
        // INGRESO DE ESTUDIANTE
        System.out.println("-- INGRESO DE ESTUDIANTE --");

        System.out.print("Ingrese RUT del estudiante: ");
        leer.nextLine(); // limpiar buffer antes de leer String
        linea = leer.nextLine();
        estudiante1.setRut(linea);

        System.out.print("Ingrese nombre del estudiante: ");
        linea = leer.nextLine();
        estudiante1.setNombre(linea);

        System.out.print("Ingrese edad del estudiante: ");
        numero = leer.nextInt();
        leer.nextLine(); // limpiar buffer
        estudiante1.setEdad(numero);

        System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
        linea = leer.nextLine();
        estudiante1.setFechaNacimiento(linea);

        System.out.println("Estudiante ingresado con éxito");
        System.out.println("------------------------------------");
        System.out.println("RUT: "+estudiante1.getRut());
        System.out.println("Nombre: "+estudiante1.getNombre());
        System.out.println("Edad: "+estudiante1.getEdad());
        System.out.println("Fecha de nacimiento: "+estudiante1.getFechaNacimiento());
        break;

    case 2:
        // INGRESO DE DOCENTE
        System.out.println("-- INGRESO DE DOCENTE --");

        leer.nextLine(); // limpiar buffer antes de leer String
        System.out.print("Ingrese RUT del docente: ");
        linea = leer.nextLine();
        docente1.setRut(linea);

        System.out.print("Ingrese numero del docente: ");
        numero = leer.nextInt();
        leer.nextLine(); // limpiar buffer
        docente1.setNroDocente(numero);

        System.out.print("Ingrese nombre del docente: ");
        linea = leer.nextLine();
        docente1.nombreDocente(linea);

        System.out.print("Ingrese fecha de ingreso (AAAA-MM-DD): ");
        linea = leer.nextLine();
        docente1.setfechaIngreso(linea);

        System.out.print("Ingrese sede en la que trabaja: ");
        linea = leer.nextLine();
        docente1.setSede(linea);

        break;

    case 3:
        // INGRESO DE ASIGNATURA
        System.out.println("-- INGRESO DE ASIGNATURA --");

        System.out.print("Ingrese el codigo unico de la asignatura: ");
        numero = leer.nextInt();
        leer.nextLine(); // limpiar buffer
        asig1.setCodigo(numero);

        System.out.print("Ingrese nombre de la asignatura: ");
        linea = leer.nextLine();
        asig1.setNombreAsignatura(linea);

        System.out.print("Ingrese nombre del estudiante: ");
        linea = leer.nextLine();
        asig1.setNombreEstudiante(linea);

        System.out.print("Docente que imparte la asignatura: ");
        linea = leer.nextLine();
        asig1.setNombreProfesor(linea);

        System.out.print("Ingrese nota 1: ");
        nota = leer.nextDouble();
        //leer.nextLine(); // limpiar buffer
        asig1.setNota1(nota);

        System.out.print("Ingrese nota 2: ");
        nota = leer.nextDouble();
        //leer.nextLine(); // limpiar buffer
        asig1.setNota2(nota);

        System.out.print("Ingrese nota 3: ");
        nota = leer.nextDouble();
        //leer.nextLine(); // limpiar buffer
        asig1.setNota3(nota);

        System.out.print("Ingrese nota examen: ");
        nota = leer.nextDouble();
        //leer.nextLine(); // limpiar buffer
        asig1.setNotaExamen(nota);

        break;

    case 4:
        // CALCULAR RESULTADOS
        System.out.println("Nota de presentación de estudiante: " + asig1.notaPresentacion());
        System.out.println("Nota Final: " + asig1.notaFinal(asig1.getNotaExamen()));
        if (asig1.aprobado()){
            System.out.println("Estudiante aprobado");
        }
        else{
            System.out.println("Estudiante no aprobado");
        }
        break;

    case 5:
        System.out.println("Saliendo del sistema...");
        break;

    default:
        System.out.println("Error: Ingrese una opción válida.");
        break;
}
    
}while(opcion !=5);
        leer.close();
        
    }
    
}



    
        
