package clases.clasesabstractas;

public abstract class Figura {

    private int ejeX;
    private int ejeY;

    public Figura() {
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }

    //Metodo abtracto
    public abstract double calcularArea();

}
