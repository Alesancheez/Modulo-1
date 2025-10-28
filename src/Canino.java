import java.util.ArrayList;

public class Canino extends Mamifero implements Viviparo{
    public Canino(Integer id, String nombre, Integer edad, ArrayList<Animal> animales, Integer cantidadCrias) {
        super(id, nombre, edad, animales, cantidadCrias);
    }
}
