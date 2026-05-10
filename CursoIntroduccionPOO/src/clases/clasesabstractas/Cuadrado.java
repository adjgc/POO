package clases.clasesabstractas;

public class Cuadrado extends Figura{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
