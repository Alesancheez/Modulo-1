package ClaseEditorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Revista extends Publicacion{

    private ArrayList<Suscriptor> suscriptores;

    //CONSTRUCTOR
    public Revista(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, ArrayList<Suscriptor> suscriptores) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.suscriptores = suscriptores;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "suscriptores=" + suscriptores +
                '}';
    }


    //AGREGAR NUEVO SUSCRIPTOR POR CONSOLA


}
