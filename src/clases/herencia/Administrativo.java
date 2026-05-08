package clases.herencia;

public class Administrativo extends Trabajador{

    String cargo;

    public Administrativo() {
    }

    public Administrativo(String cargo) {
        super();
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
