package ejercicios.pokemon;

import ejercicios.pokemon.vo.Bulbasaur;
import ejercicios.pokemon.vo.Charmander;
import ejercicios.pokemon.vo.Pikachu;
import ejercicios.pokemon.vo.Squirtle;

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        charmander.atacarMordisco();
        squirtle.atacarMordisco();
        bulbasaur.atacarMordisco();
        pikachu.atacarMordisco();

        charmander.atacarAscuas();
        squirtle.atacarHidrobomba();
        bulbasaur.atacarHojaAfilada();
        pikachu.atacarImpactrueno();

    }
}
