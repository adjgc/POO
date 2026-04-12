package clases.interfaces;

public class Cuadrado implements Figura, Dibujable{

    private double lado;

    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un cuadrado");
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
