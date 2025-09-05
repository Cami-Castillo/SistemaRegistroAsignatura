package sistemaregistroasignatura;
public class Asignatura {
  private String nombreAsignatura;
  private int codigo;
  private String nombreEstudiante;
  private String nombreProfesor;
  private double nota1;
  private double nota2;
  private double nota3;
  private double notaExamen;

  // Constructor

    public Asignatura() {
    }
  
  
  public Asignatura(String nombreAsignatura, int codigo, String nombreEstudiante, String nombreProfesor, double nota1, double nota2, double nota3) {
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

  public double getNota1() {
    return nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public double getNota3() {
    return nota3;
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

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public void setNota2(double nota2) {
    this.nota1 = nota2;
  }

  public void setNota3(double nota3) {
    this.nota1 = nota3;
  }

  // Metodos de la clase
  
  public double notaPresentacion(){
      double notaPre = nota1*0.3 + nota2*0.3 + nota3*0.4;
      return notaPre;
  }
      
  public boolean eximido(){
     return notaPresentacion() >= 5.0;
  }
  
  public double notaFinal(double notaExamen){
      double notaFin = notaPresentacion()*0.6 + notaExamen*0.4;
      return notaFin;
  }
  
  public boolean aprobado(){
     return notaFinal(notaExamen) >= 4.0;
  }

}
