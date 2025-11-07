import java.util.ArrayList;

public class Pez extends Animal implements Oviparo{

    public Pez(Integer id, String nombre, Integer edad) {
        super(id, nombre, edad);
    }

    @Override
    public void ponerHuevos() {

    }
}
