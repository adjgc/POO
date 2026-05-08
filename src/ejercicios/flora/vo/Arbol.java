package ejercicios.flora.vo;

import ejercicios.flora.abstracts.Planta;

public class Arbol extends Planta {

    private String variedad;
    private String tipoDeTronco;
    private Double radioDeTronco;
    private String color;
    private String tipoDeHojas;

    public Arbol() {
    }

    public Arbol(double altoTallo, String clima, boolean tieneHojas, String nombre, String color, Double radioDeTronco, String tipoDeHojas, String tipoDeTronco, String variedad) {
        super(altoTallo, clima, tieneHojas, nombre);
        this.color = color;
        this.radioDeTronco = radioDeTronco;
        this.tipoDeHojas = tipoDeHojas;
        this.tipoDeTronco = tipoDeTronco;
        this.variedad = variedad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(Double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public void soy() {
        System.out.println("Hola, soy un árbol.");
    }
}
