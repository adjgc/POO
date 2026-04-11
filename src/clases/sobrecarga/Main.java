package clases.sobrecarga;

import clases.sobrecarga.Animal;

public class Main {
    public static void main(String[] args) {

        /**
         * Crear al menos 3 metodos con el mismo nombre pero diferentes cantidad de atributos, o diferente tipo
         * Implementar diferentes comportamientos en cada meotod y observar el resultado
         */
        Animal animal = new Animal();
        animal.hacerSonido();
        animal.hacerSonido("Pluto");
        animal.hacerSonido("Pato Donald", "Graznido");
    }
}
