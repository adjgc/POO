package clases.polimorfismo;

import clases.herencia.Academico;
import clases.herencia.Administrativo;
import clases.herencia.Persona;
import clases.herencia.Trabajador;

public class Main {
    public static void main(String[] args) {

        /**
         * Con el ejercicio de herencia realizar:
         * Crear un vector de personas (longitud 5)
         * Instanciar diferentes tipos de personas sobre el vector
         * Instanciar una cadena en el ultimo espacio del vector
         */

        Persona[] personas = new Persona[5];

        personas[0] = new Persona();
        personas[1] = new Trabajador();
        personas[2] = new Academico();
        personas[3] = new Administrativo();
        //personas[4] = "Hola mundo!"; //Al descomentar se genera un error.

    }
}
