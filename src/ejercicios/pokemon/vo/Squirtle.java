package ejercicios.pokemon.vo;

import ejercicios.pokemon.abstracts.Pokemon;
import ejercicios.pokemon.interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua {
    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Placaje");
    }

    @Override
    public void atacarGarrazo() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Garrazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Hidrobomba");
    }

    @Override
    public void atacarPistolaDeAgua() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Hidropulso");
    }
}
