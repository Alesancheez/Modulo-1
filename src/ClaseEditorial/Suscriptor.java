package ClaseEditorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Suscriptor {
    private String nombreSuscriptor;
    private Integer telefonoSuscriptor;
    private String direccionSuscriptor;


    //CONSTRUCTOR
    public Suscriptor(String nombreSuscriptor, String direccionSuscriptor, Integer telefonoSuscriptor) {
        this.nombreSuscriptor = nombreSuscriptor;
        this.direccionSuscriptor = direccionSuscriptor;
        this.telefonoSuscriptor = telefonoSuscriptor;
    }


    //GET NOMBRE DEL SUSCRIPTOR
    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    //SET NOMBRE DEL SUSCRIPTOR
    public String setNombreSuscriptor(String nuevoNombreSuscriptor){
        nombreSuscriptor = nuevoNombreSuscriptor;
        return nombreSuscriptor;
    }

    //GET TELEFONO DEL SUSCRIPTOR
    public Integer getTelefonoSuscriptor() {
        return telefonoSuscriptor;
    }

    //SET TELEFONO DEL SUSCRIPTOR
    public Integer setTelefonoSuscriptor(Integer nuevoTelefonoSuscriptor){
        telefonoSuscriptor = nuevoTelefonoSuscriptor;
        return telefonoSuscriptor;
    }

    //GET DIRECCION DEL SUSCRIPTOR
    public String getDireccionSuscriptor() {
        return direccionSuscriptor;
    }

    //SET TELEFONO DEL SUSCRIPTOR
    public String setDireccionSuscriptor(String nuevoDireccionSuscriptor){
        direccionSuscriptor = nuevoDireccionSuscriptor;
        return direccionSuscriptor;
    }




}
