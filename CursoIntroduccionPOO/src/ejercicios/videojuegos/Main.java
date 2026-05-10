package ejercicios.videojuegos;

import ejercicios.videojuegos.vo.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Crear una lista de al menos 5 videojuegos de diferentes consolas.
         * Para cada videojuego, mostrar en pantalla el nombre y la cantidad de jugadores que soporta.
         * Cambiar los datos de 2 videojuegos y mostrar los datos de toda la coleccion.
         * Agregar nuevos juegos a la coleccion.
         * De los videojuegos en la lista, mostrar solamente los que sean para Nintendo 64.
         */

        List<Videojuego> videojuegos = new ArrayList<>();
        videojuegos.add(new Videojuego(1, "Resident Evil: Requiem", "PS5", "Survivor horror", 1));
        videojuegos.add(new Videojuego(2, "Mario Kart", "Nintendo 64", "Racing", 4));
        videojuegos.add(new Videojuego(3, "The Legend of Zelda", "Nintendo 64", "RPG - Adventure", 1));
        videojuegos.add(new Videojuego(4, "Gears of War", "Xbox", "Shooter - FPS", 3));
        videojuegos.add(new Videojuego(5, "Bomberman", "Nintendo Switch 2", "Puzzle", 1));

        System.out.println("==========Coleccion inicial de videojuegos==========");
        for(Videojuego videojuego : videojuegos){
            System.out.println(videojuego.toString());
        }

        videojuegos.get(3).setTitulo("Pokemon");
        videojuegos.get(3).setCantidadJugadores(2);

        videojuegos.get(4).setTitulo("Apex Legends");
        videojuegos.get(4).setCantidadJugadores(4);

        System.out.println("==========Coleccion modificada de videojuegos==========");
        for (Videojuego videojuego : videojuegos){
            System.out.println("Titulo: " + videojuego.getTitulo());
            System.out.println("Cantidad de jugadores: " + videojuego.getCantidadJugadores());
        }

        videojuegos.add(new Videojuego(6, "The Last of Us", "PS5", "Survivor horror", 1));
        videojuegos.add(new Videojuego(7, "Fortnite", "PC", "Shooter - FPS", 4));
        videojuegos.add(new Videojuego(8, "Donky kong", "Nintendo 64", "RPG - Adventure", 1));

        System.out.println("==========Coleccion extendida de videojuegos==========");
        for (Videojuego videojuego : videojuegos){
            System.out.println(videojuego.toString());
        }

        System.out.println("==========Coleccion de videojuegos para Nintendo 64==========");
        for(Videojuego videojuego : videojuegos){
            if(videojuego.getConsola().equals("Nintendo 64")){
                System.out.println(videojuego);
            }
        }
    }
}
