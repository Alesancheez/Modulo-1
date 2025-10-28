import java.util.ArrayList;

public class Elefante extends Mamifero implements Viviparo{
    public Elefante(Integer id, String nombre, Integer edad, ArrayList<Animal> animales, Integer cantidadCrias) {
        super(id, nombre, edad, animales, cantidadCrias);
    }
}
