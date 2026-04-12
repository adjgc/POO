package ejercicios.pokemon.vo;

import ejercicios.pokemon.abstracts.Pokemon;
import ejercicios.pokemon.interfaces.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu() {
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
    public void atacarImpactrueno() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Impactrueno");
    }

    @Override
    public void atacarGolpeTrueno() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Golpe trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(this.getClass().getSimpleName() + " ha usado: Rayo carga");
    }
}
