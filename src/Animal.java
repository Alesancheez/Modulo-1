import java.util.ArrayList;

public abstract class Animal {
    private Integer id;
    private String nombre;
    private Integer edad;
    private ArrayList<Animal> animales= new ArrayList<>();

    public Animal(Integer id, String nombre, Integer edad, ArrayList<Animal> animales) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.animales = animales;
    }
}
