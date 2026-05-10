package ejercicios.pokemon.abstracts;

public abstract class Pokemon {

    private int idPokedex;
    private String nombre;
    private double peso;
    private String sexo;
    private int temporada;

    public abstract void atacarPlacaje();
    public abstract void atacarGarrazo();
    public abstract void atacarMordisco();

}
