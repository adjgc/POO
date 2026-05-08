package clases.herencia;

public class Trabajador extends Persona{

    String numeroEconomico;
    int salario;
    Boolean esSindicalizado;

    public Trabajador() {
    }

    public Trabajador(String numeroEconomico, int salario, Boolean esSindicalizado) {
        super();
        this.numeroEconomico = numeroEconomico;
        this.salario = salario;
        this.esSindicalizado = esSindicalizado;
    }

    public String getNumeroEconomico() {
        return numeroEconomico;
    }

    public void setNumeroEconomico(String numeroEconomico) {
        this.numeroEconomico = numeroEconomico;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Boolean getEsSindicalizado() {
        return esSindicalizado;
    }

    public void setEsSindicalizado(Boolean esSindicalizado) {
        this.esSindicalizado = esSindicalizado;
    }

}
