package clases.colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Declaracion
        Map<Integer, String> mapaEmpleados = new HashMap<>();

        //Agregar elementos
        mapaEmpleados.put(1, "Jake el perro");
        mapaEmpleados.put(2, "Finn el humano");
        mapaEmpleados.put(3, "Dulce princesa");

        //Buscar por valor
        String nombreBuscar = "Jake el perro";
        //String nombreBuscar = "Princesa grumsa";
        boolean existe = mapaEmpleados.containsValue(nombreBuscar);
        if(existe){
            System.out.println(String.format("%s existe en el mapa", nombreBuscar));
        }else{
            System.out.println(String.format("%s NO existe en el mapa", nombreBuscar));
        }

        //Buscar por clave
        int keyBuscar = 5;
        existe = mapaEmpleados.containsKey(keyBuscar);
        if(existe){
            //Obtener elemento por clave
            System.out.println("El valor " + keyBuscar + " existe y corresponde a: " + mapaEmpleados.get(keyBuscar));
        }else{
            System.out.println("El valor " + keyBuscar + " no existe.");
        }

        //Todos los valores en el mapa
        System.out.println(mapaEmpleados.values());

        //Todas las claves en el mapa
        System.out.println(mapaEmpleados.keySet());

        System.out.println(mapaEmpleados.entrySet());
        //Eliminacion
        mapaEmpleados.remove(3);
        System.out.println(mapaEmpleados.entrySet());
    }
}
