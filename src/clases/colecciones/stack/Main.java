package clases.colecciones.stack;

import clases.colecciones.vo.Persona;

import java.util.Stack;

public class Main {
    static void main() {
        Stack<Persona> pilaPersonas = new Stack<>();

        System.out.println("Elementos de la pila: " + pilaPersonas);
        System.out.println("¿La pila es vacia?: " + pilaPersonas.isEmpty());

        //Agregar elementos
        pilaPersonas.push(new Persona(1, "Jill Valentine", 28));
        pilaPersonas.push(new Persona(2, "Leon Kennedy", 23));
        pilaPersonas.push(new Persona(3, "Ada Wong", 25));
        pilaPersonas.push(new Persona(4, "Albert Wesker", 36));

        //Recorrido
        for(Persona persona : pilaPersonas){
            System.out.println("Nombre: " + persona.getNombre());
        }

        System.out.println("Elementos de la pila: " + pilaPersonas);
        System.out.println("¿La pila es vacia?: " + pilaPersonas.isEmpty());

        //Eliminar ultimo registro agregadp
        pilaPersonas.pop();

        //Buscar un elemento en la pila
        System.out.print("¿Existe Leon Kennedy? ");
        for(Persona persona : pilaPersonas){
            if(persona.getNombre().equals("Leon Kennedy")){
                System.out.println(pilaPersonas.search(persona));
            }
        }

        //Ultimo elemento agregado
        System.out.println("Ultimo elemento agregado: " + pilaPersonas.peek());
    }
}
