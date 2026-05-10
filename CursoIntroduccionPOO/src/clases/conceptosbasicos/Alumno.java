package clases.conceptosbasicos;

public class Alumno {
    /*
     * Definicion de atributos de un Alumno
     * */
    int id;
    String nombre;
    String apellido;

    /*
     * Metodos contructores de un Alumno:
     * Se tiene el constructor vacio y el constructor con atributos.
     * */
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /*
     * Metodos Getters y Setters para recuperacion y asignacion de datos de un Alumno.
     * */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
