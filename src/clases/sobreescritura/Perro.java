package clases.sobreescritura;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro: Woof");
    }
}
