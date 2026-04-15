package clases.enums;

public class MainEnum {
    public static void main(String[] args) {
        for(Color color : Color.values()){
            System.out.println("Color: " + color);
        }

        Color negro = Color.NEGRO;
        System.out.println(negro.name());
        System.out.println(negro.ordinal());

        String colorBuscar = "AZUL";

        try {
            negro = Color.valueOf(colorBuscar);
            System.out.println("Encontré el color " + colorBuscar + " : " + negro);
        }catch (Exception e){
            System.out.println("No se encontró el color: " + colorBuscar);
        }
    }
}
