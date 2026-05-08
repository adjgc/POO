package clases.herencia;

public class Main {
    public static void main(String[] args) {
        /**
         * Ejercicios: Herencia
         */

        /**
         * En las clases previamente definidas, relacionar de forma jerarquica como sigue:
         * Cualquier Persona puede ser Trabajador
         * Dentro de la UAM existen trabajoderes de tipo Administrativo y Academico
         *
         * TIP: La palabra reservada `super` nos ayuda a con la asignacion de atributos en los constructores
         */

        //Instanciar con el constructor vacia a un trabajador de tipo administrativo y colocar todos sus atributos
        Administrativo administrativo = new Administrativo();
        administrativo.setNombre("Leon");
        administrativo.setApellido("Kennedy");
        administrativo.setEdad(51);
        administrativo.setGenero("Masculino");
        administrativo.setCurp("ASDFGHJKLÑ01");
        administrativo.setEsSindicalizado(Boolean.FALSE);
        administrativo.setNumeroEconomico("123456");
        administrativo.setSalario(9999);
        administrativo.setCargo("Chef");

        System.out.println("Nombre: " + administrativo.getNombre());
        System.out.println("Apellido: " + administrativo.getApellido());
        System.out.println("Edad: " + administrativo.getEdad());
        System.out.println("Genero: " + administrativo.getGenero());
        System.out.println("CURP: " + administrativo.getCurp());
        System.out.println("Num. Economico: " + administrativo.getNumeroEconomico());
        System.out.println("Salario: " + administrativo.getSalario());
        System.out.println("Sindicalizado: " + administrativo.getEsSindicalizado());
        System.out.println("Cargo: " + administrativo.getCargo());

        System.out.println("-------------------------------------------------------");
        Persona persona = new Persona();
        persona.setNombre("Fulanita");
        persona.setApellido("De tal");
        persona.setEdad(45);
        persona.setGenero("Femenino");
        persona.setCurp("QWERTYUIOP98");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Genero: " + persona.getGenero());
        System.out.println("CURP: " + persona.getCurp());

    }
}
