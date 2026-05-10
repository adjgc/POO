package clases.interfaces;

public class Circulo  implements Figura, Rotacion, Dibujable{

    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un circulo");
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el circulo");
    }
}
