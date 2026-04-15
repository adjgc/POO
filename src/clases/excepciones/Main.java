package clases.excepciones;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado = 3/0;
        }catch (Exception e){
            System.out.println("No se puede dividir por cero");
        }

        try {
            int edades[] = {25, 32, 39, 17};
            System.out.println("Edad en indice 5: " + edades[5]);
        }catch (Exception e){
            System.out.println("No se puede acceder a un indice mayor al tamaño de la lista");
        }
    }
}
