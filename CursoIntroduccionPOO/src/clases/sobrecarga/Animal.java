package clases.sobrecarga;

public class Animal {

    int id_animal;
    String nombre;

    public Animal() {
    }

    public Animal(int id_animal, String nombre) {
        this.id_animal = id_animal;
        this.nombre = nombre;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos con sobrecarga

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal "+nombreAnimal+" hace un sonido");
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal "+nombreAnimal+" hace un sonido de tipo "+tipoSonido);
    }

}
