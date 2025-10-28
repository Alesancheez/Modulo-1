import java.util.ArrayList;

public class Pez extends Animal implements Oviparo{
    public Pez(Integer id, String nombre, Integer edad, ArrayList<Animal> animales) {
        super(id, nombre, edad, animales);
    }
}
