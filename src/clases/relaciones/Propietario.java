package clases.relaciones;

public class Propietario {
    int idPropietrio;
    String nombre;
    int edad;

    public Propietario() {
    }

    public Propietario(int idPropietrio, String nombre, int edad) {
        this.edad = edad;
        this.idPropietrio = idPropietrio;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPropietrio() {
        return idPropietrio;
    }

    public void setIdPropietrio(int idPropietrio) {
        this.idPropietrio = idPropietrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "edad=" + edad +
                ", idPropietrio=" + idPropietrio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
