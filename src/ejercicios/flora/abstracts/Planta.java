package ejercicios.flora.abstracts;

public abstract class Planta {

    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String clima;

    public Planta() {
    }

    public Planta(double altoTallo, String clima, boolean tieneHojas, String nombre) {
        this.altoTallo = altoTallo;
        this.clima = clima;
        this.tieneHojas = tieneHojas;
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void soy();
}
