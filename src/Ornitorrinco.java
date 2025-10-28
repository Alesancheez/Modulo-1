import java.util.ArrayList;

public class Ornitorrinco extends Mamifero implements Oviparo{
    public Ornitorrinco(Integer id, String nombre, Integer edad, ArrayList<Animal> animales, Integer cantidadCrias) {
        super(id, nombre, edad, animales, cantidadCrias);
    }
}
