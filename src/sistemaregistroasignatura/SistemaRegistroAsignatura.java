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
        String ingresar;
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
                    //Falta objeto Estudiante?
                    System.out.print("-- INGRESO DE ESTUDIANTE --");
                    System.out.println("Ingrese RUT del estudiante: ");
                    String rut = leer.nextLine();
                    estudiante1.setRut(rut);
                    
                    //VALIDAR QUE NOMBRE NO ESTË VACIO
                    
                    System.out.print("Ingrese nombre del estudiante");
                    String nombre= leer.nextLine();
                    estudiante1.setNombre(nombre);
                    
                    System.out.print("Ingrese edad del estudiante: ");
                    int edad = leer.nextInt();
                    estudiante1.setEdad(edad);
                    
                    System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                    String fecha = leer.nextLine();
                    estudiante1.setFechaNacimiento(fecha);
                    
                    System.out.println("Estudiante ingresado con éxito");
                    break;
                    
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

                    System.out.print("Ingrese nota 1: ");
                    nota = leer.nextDouble();  
                    System.out.print("Ingrese nota 2: ");
                    nota = leer.nextDouble();    
                    System.out.print("Ingrese nota 3: ");
                    nota = leer.nextDouble();    

                    

                    
                case 4: 
                    //llamar metodo
                    System.out.println("Nota de presentacion de estudiante: ");

                    System.out.println("Ingrese la nota final del estudiante: ");
                    
                case 5:
                    System.out.println("Saliendo del sistema...");
                default:
                    System.out.println("Error: Ingrese una opción válida.");
                    

                    
        
    }
    
}while(opcion !=5);
        leer.close();
        
    }
    
}

    
}while(opcion !=5);
        leer.close();
    }
        
