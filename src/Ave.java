import java.util.ArrayList;

public class Ave extends Animal implements Oviparo{

    private boolean volar;

    public Ave(Integer id, String nombre, Integer edad, Boolean volar) {
        super(id, nombre, edad);
        this.volar = volar;
    }

    public boolean romperCascaron(){
        System.out.println("Se ha roto el cascaron");
        return true;
    }

    @Override
    public void ponerHuevos() {
        System.out.println(getNombre()+ " " + getId()+ " ha puesto un huevo");
    }

    public boolean puedeVolar(){
        return volar;
    }


}
