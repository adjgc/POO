package ejercicios.pokemon.vo;

import ejercicios.pokemon.abstracts.Pokemon;
import ejercicios.pokemon.interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego {
    public Charmander() {
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
    public void atacarGolpeFuego() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Golpe fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Lanzallamas");
    }
}
