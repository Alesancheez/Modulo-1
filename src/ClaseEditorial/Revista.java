package ClaseEditorial;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Revista extends Publicacion{

    private ArrayList<Suscriptor> suscriptores;

    //CONSTRUCTOR
    public Revista(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, ArrayList<Suscriptor> suscriptores) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.suscriptores = suscriptores;
    }

    //Visualizar la información como texto (ToString)
    @Override
    public String toString() {
        return "Revista" +
                "suscriptores=" + suscriptores
                 + "Nombre Publicacion:" + getnombrePublicacion()
                + "Frecuencia de publicacion: " + getFrecuenciaPublicacion();
    }


    //AGREGAR NUEVO SUSCRIPTOR
//    public void agregarSuscriptor (Suscriptor nuevoSuscriptor ){
//        suscriptores.add(nuevoSuscriptor);
//        System.out.println("Se ha agregado un nuevo suscriptor " + nuevoSuscriptor.getNombreSuscriptor());
//    }

    public void agregarSuscriptor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre : ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Ingrese el teléfono: ");
        Integer telefono = sc.nextInt();

        Suscriptor nuevoSuscriptor = new Suscriptor(nombre, direccion, telefono);
        suscriptores.add(nuevoSuscriptor);

        System.out.println("Suscriptor agregado correctamente: " + nombre);
    }

    //LISTA DE SUSCRIPTORES
    public void mostrarSuscriptores() {
        if (suscriptores.isEmpty()) {
        System.out.println("No hay suscriptores registrados");
        } else {
               System.out.println("Lista de suscriptores:");
                  for (Suscriptor nuevoSuscriptor : suscriptores) {
                   System.out.println(nuevoSuscriptor.getNombreSuscriptor()
                      + " / Dirección: " + nuevoSuscriptor.getDireccionSuscriptor()
                        + " / Teléfono: " + nuevoSuscriptor.getTelefonoSuscriptor());
        }
    }
    }
}