
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
                case 2:
                case 3:
                case 4: 
                case 5:
                default:
                    

                    
        
    }
    
}while(opcion !=5);
