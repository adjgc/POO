package ejercicios.flora.vo;

import ejercicios.flora.abstracts.Planta;

public class Arbusto extends Planta {

    private Double anchoArbusto;
    private Boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private Boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(double altoTallo, String clima, boolean tieneHojas, String nombre, Double anchoArbusto, String colorDeHojas, Boolean esDomestico, Boolean sePoda, String variedadArbusto) {
        super(altoTallo, clima, tieneHojas, nombre);
        this.anchoArbusto = anchoArbusto;
        this.colorDeHojas = colorDeHojas;
        this.esDomestico = esDomestico;
        this.sePoda = sePoda;
        this.variedadArbusto = variedadArbusto;
    }

    public Double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(Double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public Boolean getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(Boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public Boolean getSePoda() {
        return sePoda;
    }

    public void setSePoda(Boolean sePoda) {
        this.sePoda = sePoda;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    @Override
    public void soy() {
        System.out.println("Hola, soy un arbusto.");
    }
}
