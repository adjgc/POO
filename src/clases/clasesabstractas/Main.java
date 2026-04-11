package clases.clasesabstractas;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

        circulo.setRadio(20);
        cuadrado.setLado(5);

        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());

    }
}
