package clases.conversiones;

public class Main {
    public static void main(String[] args) {
        double numDouble = 3.141594;

        //Cast to int
        int numInt = (int) numDouble;

        //Cast to long
        long numLong = (long) numDouble;

        System.out.println("double: " + numDouble);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);

        String cantidad = "15";
        String precio = "3.99";

        //Parsing de String a numerico
        int cantidadEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);

        System.out.println("El valor total de la suscripciones es: $"+(cantidadEntero*precioDouble));

        int edad = 29;
        double estatura = 1.74;

        //Parsing de numerico a String
        String edadStr = String.valueOf(edad);
        String estaturaStr = String.valueOf(estatura);

        System.out.println("Edad: " + edadStr);
        System.out.println("Estatura: " + estaturaStr);
    }
}
