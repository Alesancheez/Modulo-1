import java.util.ArrayList;

public class Ornitorrinco extends Mamifero implements Oviparo{

    public Ornitorrinco(Integer id, String nombre, Integer edad, Integer cantidadCrias) {
        super(id, nombre, edad, cantidadCrias);
    }

    @Override
    public void ponerHuevos() {
        System.out.println(getNombre() + "  ha puesto un huevo");
    }
}
