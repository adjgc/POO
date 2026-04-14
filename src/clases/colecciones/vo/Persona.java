package clases.colecciones.vo;

public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, int edad) {
        this.edad = edad;
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Este es " + nombre + " y tiene " + edad + " años de edad.";
    }
}
