package clases.colecciones.linkedlist;

import clases.colecciones.vo.Persona;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main() {
        //Declaracion
        List<Persona> listaPersonas = new LinkedList<>();

        //Insercion
        listaPersonas.add(new Persona(1, "Mario Mario", 34));
        listaPersonas.add(new Persona(2, "Luigi Mario", 31));
        listaPersonas.add(new Persona(3, "Princesa Peach", 29));
        listaPersonas.add(new Persona(4, "Donky Kong", 16));

        //Recorrido
        System.out.println("==========PRE: For each==========");
        for(Persona persona : listaPersonas){
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        }

        //Insercion al inicio
        listaPersonas.add(0, new Persona(5, "Mario Galaxy", 40));

        System.out.println("==========POST: For each==========");
        for(Persona persona : listaPersonas){
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        }

        //Eliminacion por indice
        listaPersonas.remove(1);

        //Eliminacion por objeto
        String nombreEliminar = "Donky Kong";
        for(Persona persona : listaPersonas){
            if(persona.getNombre().equals(nombreEliminar)){
                listaPersonas.remove(persona);
                break;
            }
        }

        System.out.println("==========Eliminacion: For each==========");
        for(Persona persona : listaPersonas){
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        }

        //Tamaño de lista
        System.out.println("La lista tiene " + listaPersonas.size() + " elementos");

        //Obtener primer y ultimo elemento (solo LinkedList)
        System.out.println("Primer elemento: " + listaPersonas.getFirst().toString());
        System.out.println("Ultimo elemento: " + listaPersonas.getLast().toString());

        //Vaciar lista
        listaPersonas.clear();

        //Comprobar si la lista es vacia
        System.out.println("¿La lista es vacia?: " + listaPersonas.isEmpty());

    }
}
