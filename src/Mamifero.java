import java.util.ArrayList;

public class Mamifero extends Animal{
    private Integer cantidadCrias;

    public Mamifero(Integer id, String nombre, Integer edad, Integer cantidadCrias) {
        super(id, nombre, edad);
        this.cantidadCrias = cantidadCrias;
    }


    public boolean amamantarMamifero(){
        System.out.println(getNombre() + " " + getId() + " está amamantando a sus crías");
        return true;
        }

    //GETTER Y SETTERS
    public Integer getCantidadCrias() {
        return cantidadCrias;
    }

    public void setCantidadCrias(Integer cantidadCrias) {
        this.cantidadCrias = cantidadCrias;
    }
}
