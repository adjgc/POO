package clases.sobreescritura;

public abstract class Animal {

    int id_animal;
    String nombreAnimal;

    public Animal() {
    }

    public Animal(int id_animal, String nombreAnimal) {
        this.id_animal = id_animal;
        this.nombreAnimal = nombreAnimal;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    //Metodo abstracto que se va a sobre-escribir en las clases que hereden de Animal
    public abstract void hacerSonido();

}
