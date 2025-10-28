import java.util.ArrayList;

public class Ave extends Animal implements Oviparo{

    private String volar;

    public Ave(Integer id, String nombre, Integer edad, ArrayList<Animal> animales, String volar) {
        super(id, nombre, edad, animales);
        this.volar = volar;
    }

    public boolean romperCascaron(){

    }
}
