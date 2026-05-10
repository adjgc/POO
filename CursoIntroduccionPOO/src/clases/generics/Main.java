package clases.generics;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaStr = new Caja<>();
        cajaStr.ponerAlgo("Hola mundo!!!");
        String contenido = cajaStr.obtenerAlgo();

        System.out.println("Contenido de cajaStr: " + contenido);

        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.ponerAlgo(29);
        Integer edad = cajaInt.obtenerAlgo();

        System.out.println("Contenido de cajaInt: " + edad);
    }
}
