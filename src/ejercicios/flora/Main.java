package ejercicios.flora;

import ejercicios.flora.vo.Arbol;
import ejercicios.flora.vo.Arbusto;
import ejercicios.flora.vo.Flor;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Flor flor = new Flor();
        Arbusto arbusto = new Arbusto();

        arbol.soy();
        flor.soy();
        arbusto.soy();

    }
}
