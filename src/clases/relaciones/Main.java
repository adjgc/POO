package clases.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        Auto auto = new Auto();
        auto.setIdAuto(1);
        auto.setMarca("Ford");
        auto.setModelo("F-150");

        List<Propietario> propietarioList = new ArrayList<>();
        propietarioList.add(new Propietario(1, "Leonard H.", 29));
        propietarioList.add(new Propietario(2, "Penny H.", 26));

        auto.setPropietarios(propietarioList);

        auto.getPropietarios().add( new Propietario(3, "Sheldon C.", 25));

        System.out.println("La " + auto.getModelo() + " marca " + auto.getMarca() + " tiene a los siguientes propietarios: ");
        System.out.println(auto.getPropietarios().toString());

    }
}
