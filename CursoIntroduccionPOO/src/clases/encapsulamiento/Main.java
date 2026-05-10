package clases.encapsulamiento;

import clases.conceptosbasicos.Alumno;

public class Main {
    public static void main(String[] args) {

        /**
         * Asignar a todos los atributos un encapsulamiento privado
         * Jugar con los modificadores de acceso de los metodos de Alumno
         */
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(1, "Jill", "Valentine");

        System.out.println("Id: " + alumno2.getId());
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());

    }
}
