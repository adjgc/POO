package clases.interfaces;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

        circulo.setRadio(12);
        cuadrado.setLado(25);

        circulo.dibujar();
        circulo.rotar();
        System.out.println("Area del circulo: " + circulo.calcularArea());

        cuadrado.dibujar();
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
