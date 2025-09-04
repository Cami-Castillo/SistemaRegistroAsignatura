
package sistemaregistroasignatura;

import java.util.Scanner;
/**
 *
 * @author clcas
 */
public class SistemaRegistroAsignatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        int numero;
        String ingresar;

        //Estudiante(String rut, String nombre, int edad, String fechaNacimiento)

        Estudiante alumno = new Estudiante();
        Estudiante alumno1 = new Estudiante();

        //Docente(String nombreDocente, int rut, int nroDocente, String fechaIngreso)

        Docente profesor = new Docente();
        Docente profesor1 = new Docente();

        //Asignatura(String nombreAsignatura, int codigo, String nombreEstudiante, String nombreProfesor, double nota1, double nota2, double nota3)

        Asignatura 

        

        do{
            System.out.println("------------------------")
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
                    //Falta objeto Estudiante?
                    System.out.print("-- INGRESO DE ESTUDIANTE --");
                    System.out.println("Ingrese RUT del estudiante: ");
                    numero = leer.nextInt();

                    //VALIDAR QUE NOMBRE NO ESTË VACIO
                    
                    System.out.print("Ingrese nombre del estudiante");
                    ingresar = leer.next();
                    
                    System.out.print("Ingrese edad del estudiante: ");
                    numero = leer.nextInt();
                    
                    System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                    ingresar = leer.next();
                    
                    System.out.println("Estudiante ingresado con éxito");
                    
                case 2:
                    //considerar rut, nro_docente, nombre, fecha de ingreso y sede en la que trabaja (Se considera que puede impartir clases solo en una sede). De la Sede, se interesa almacenar el nro único de la sede, su nombre y comuna
                    System.out.print("-- INGRESO DE DOCENTE --");
                    System.out.println("Ingrese RUT del docente: ");
                    numero = leer.nextInt();
                    
                    //VALIDAR QUE NOMBRE NO ESTË VACIO
                    
                    System.out.print("Ingrese numero del docente: ");
                    numero = leer.nextInt();
                    
                    System.out.print("Ingrese nombre del docente: ");
                    ingresar = leer.next();
                    
                    System.out.print("Ingrese fecha de ingreso (AAAA-MM-DD): ");
                    ingresar = leer.next();
                    //La fecha de ingreso del docente no puede ser posterior a hoy.
                    
                    System.out.println("Ingrese sede en la que trabaja: ");
                    ingresar = leer.next();

                    //se interesa almacenar el nro único de la sede, su nombre y comuna

                    
                case 3:

                    System.out.print("-- INGRESO DE ASIGNATURA --");
                    System.out.println("Ingrese el codigo unico de la asignatura: ");
                    numero = leer.nextInt();
                    
                    System.out.print("Ingrese nombre de la asignatura: ");
                    ingresar = leer.next();
                    
                    System.out.print("Ingrese nombre del estudiante: ");
                    ingresar = leer.next();
                    //VALIDACION?
                    
                    System.out.print("Docente que imparte la asignatura: ");
                    ingresar = leer.next();
                    
                    System.out.println("Ingrese sede en la que trabaja: ");
                    ingresar = leer.next();

                    System.out.print("Ingrese nota 1: ")
                    numero = leer.nextDouble();  
                     System.out.print("Ingrese nota 2: ")
                    numero = leer.nextDouble();    
                     System.out.print("Ingrese nota 3: ")
                    numero = leer.nextDouble();    

                    

                    
                case 4: 
                    //llamar metodo
                    System.out.println("Nota de presentacion de estudiante: ");

                    System.out.pritnln("Ingrese la nota final del estudiante: ");
                    
                case 5:
                    Sytem.out.println("Saliendo del sistema...");
                default:
                    System.out.println("Error: Ingrese una opción válida.");
                    

                    
        
    }
    
}while(opcion !=5);
        leer.close();
    }
        
