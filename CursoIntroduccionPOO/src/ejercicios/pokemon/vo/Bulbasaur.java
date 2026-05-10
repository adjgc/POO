package ejercicios.pokemon.vo;

import ejercicios.pokemon.abstracts.Pokemon;
import ejercicios.pokemon.interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {
    public Bulbasaur() {
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
    public void atacarParalizar() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Latigo cepa");
    }
}
