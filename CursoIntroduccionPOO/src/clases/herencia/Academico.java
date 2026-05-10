package clases.herencia;

public class Academico extends Trabajador{

    String departamento;
    String gradoAcademico;

    public Academico() {
    }

    public Academico(String departamento, String gradoAcademico) {
        super();
        this.departamento = departamento;
        this.gradoAcademico = gradoAcademico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

}
