package clases.enums;

public class Main {
    enum Color {
        ROJO, AZUL, VERDE, AMARILLO, NEGRO, ANARANJADO, BLANCO
    }

    public static void main(String[] args) {
        Color amarillo = Color.AMARILLO;
        System.out.println("El color es: " + amarillo);

        for(Color color : Color.values()){
            System.out.println("Color: " + color);
        }
    }
}
