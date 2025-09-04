package sistemaregistroasignatura;
public class Docente {
  private String nombreDocente;
  private int rut;
  private int nroDocente;
  private String fechaIngreso;
  private String sede; // no se si sera tipo String o tipo Sede

  // Constructor
  public Docente(String nombreDocente, int rut, int nroDocente, String fechaIngreso) {
    this.nombreDocente = nombreDocente;
    this.rut = rut;
    this.nroDocente = nroDocente;
    this.fechaIngreso = fechaIngreso;
  }

  // Getters
  public String getnombreDocente() {
    return nombreDocente;
  }

  public int getRut() {
    return rut;
  }

  public int getnroDocente() {
    return nroDocente;
  }

  public String getfechaIngreso() {
    return fechaIngreso;
  }
  public String getSede() {
    return sede;
  }
  

  // Setters
  public void nombreDocente(String nombreDocente) {
    this.nombreDocente = nombreDocente;
  }

  public void setRut(int rut) {
    this.rut = rut;
  }

  public void setNroDocente(int nroDocente) {
    this.nroDocente = nroDocente;
  }

  public void setfechaIngreso(String fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }
public void setSede(String sede){
    this.sede = sede;
  }
  
  // Metodos de la clase

}
