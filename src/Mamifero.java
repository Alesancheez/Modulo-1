import java.util.ArrayList;

public class Mamifero extends Animal{
    private Integer cantidadCrias;

    public Mamifero(Integer id, String nombre, Integer edad, ArrayList<Animal> animales, Integer cantidadCrias) {
        super(id, nombre, edad, animales);
        this.cantidadCrias = cantidadCrias;
    }

    public boolean amamantarMamifero(){

    }
}
