package sistemaregistroasignatura;

/**
 *
 * @author aleja
 */
public class Sede {
    //Atributo
    private String nroSede;
    private String nombre;
    private String comuna;
    
    //Constructor con parametros
    public Sede(String nroSede, String nombre, String comuna) {
        this.nroSede = nroSede;
        this.nombre = nombre;
        this.comuna = comuna;
    }
    
    //Getter
    public String getNroSede() {
        return nroSede;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }
    
    //Setter
    public void setNroSede(String nroSede) {
        this.nroSede = nroSede;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
}
