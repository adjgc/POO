package ejercicios.flora.vo;

import ejercicios.flora.abstracts.Planta;

public class Flor extends Planta {

    private String colorDePetalos;
    private Integer cantidadPromedioDePetalos;
    private String colorDePistilo;
    private String colorDePetalo;
    private String variedadDeFlor;
    private String estacionQueFlorece;

    public Flor() {
    }

    public Flor(double altoTallo, String clima, boolean tieneHojas, String nombre, Integer cantidadPromedioDePetalos, String colorDePetalo, String colorDePetalos, String colorDePistilo, String estacionQueFlorece, String variedadDeFlor) {
        super(altoTallo, clima, tieneHojas, nombre);
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDePetalo = colorDePetalo;
        this.colorDePetalos = colorDePetalos;
        this.colorDePistilo = colorDePistilo;
        this.estacionQueFlorece = estacionQueFlorece;
        this.variedadDeFlor = variedadDeFlor;
    }

    public Integer getCantidadPromedioDePetalos() {
        return cantidadPromedioDePetalos;
    }

    public void setCantidadPromedioDePetalos(Integer cantidadPromedioDePetalos) {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public String getColorDePetalo() {
        return colorDePetalo;
    }

    public void setColorDePetalo(String colorDePetalo) {
        this.colorDePetalo = colorDePetalo;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public String getColorDePistilo() {
        return colorDePistilo;
    }

    public void setColorDePistilo(String colorDePistilo) {
        this.colorDePistilo = colorDePistilo;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    @Override
    public void soy() {
        System.out.println("Hola, soy una flor.");
    }
}
