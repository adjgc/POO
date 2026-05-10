package clases.relaciones;

import java.util.List;

public class Auto {

    private int idAuto;
    private String marca;
    private String modelo;

    //private Propietario propietario; //Relacion 1 a 1
    private List<Propietario> propietarios; //Relacion 1 a N

    public Auto() {
    }

    public Auto(int idAuto, String marca, String modelo, List<Propietario> propietarios) {
        this.idAuto = idAuto;
        this.marca = marca;
        this.modelo = modelo;
        this.propietarios = propietarios;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
}
