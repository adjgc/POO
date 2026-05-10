package ejercicios.videojuegos.vo;

public class Videojuego {

    private int codigo;
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoria;

    public Videojuego() {
    }

    public Videojuego(int codigo, String titulo, String consola, String categoria, int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
        this.categoria = categoria;
        this.codigo = codigo;
        this.consola = consola;
        this.titulo = titulo;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return String.format("%s del género %s está dirigido a consolas %s y es para %s jugadores",
                titulo, categoria, consola, cantidadJugadores);
    }
}
