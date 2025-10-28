import java.util.ArrayList;

public class Felino extends Mamifero implements Viviparo{
    public Felino(Integer id, String nombre, Integer edad, ArrayList<Animal> animales, Integer cantidadCrias) {
        super(id, nombre, edad, animales, cantidadCrias);
    }
}
