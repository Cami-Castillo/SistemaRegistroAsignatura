package sistemaregistroasignatura;

/**
 *
 * @author aleja
 */
public class Estudiante {
    //Atributos
    private String rut;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    
    //Constructor con parametros
    
    public Estudiante() {
    }

    public Estudiante(String rut, String nombre, int edad, String fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Getter

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    //Setter

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodos
}
