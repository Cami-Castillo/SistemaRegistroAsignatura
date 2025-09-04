package sistemaregistroasignatura;
public class Asignatura {
  private String nombreAsignatura;
  private int codigo;
  private String nombreEstudiante;
  private String nombreProfesor;
  private int nota1;
  private int nota2;
  private int nota3;

  // Constructor
  public Asignatura(String nombreAsignatura, int codigo, String nombreEstudiante, String nombreProfesor, int nota1, int nota2, int nota3) {
    this.nombreAsignatura = nombreAsignatura;
    this.codigo = codigo;
    this.nombreEstudiante = nombreEstudiante;
    this.nombreProfesor = nombreProfesor;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  // Getters
  public String getNombreAsignatura() {
    return nombreAsignatura;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getNombreEstudiante() {
    return nombreEstudiante;
  }

  public String getNombreProfesor() {
    return nombreProfesor;
  }

  public int getNota1() {
    return codigo;
  }

  public int getNota2() {
    return codigo;
  }

  public int getNota3() {
    return codigo;
  }

  // Setters
  public void setNombreAsignatura(String nombreAsignatura) {
    this.nombreAsignatura = nombreAsignatura;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void setNombreEstudiante(String nombreEstudiante) {
    this.nombreEstudiante = nombreEstudiante;
  }

  public void setNombreProfesor(String nombreProfesor) {
    this.nombreProfesor = nombreProfesor;
  }

  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }

  public void setNota2(int nota2) {
    this.nota1 = nota2;
  }

  public void setNota3(int nota3) {
    this.nota1 = nota3;
  }

  // Metodos de la clase
  

}
