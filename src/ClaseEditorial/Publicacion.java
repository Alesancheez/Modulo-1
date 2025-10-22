package ClaseEditorial;

import java.util.Objects;

public class Publicacion {
    private String nombrePublicacion;
    private String frecuenciaPublicacion;
    private Integer codigoUnico;

    //CONSTRUCTOR
    public Publicacion (String nombrePublicacion,String frecuenciaPublicacion, Integer codigoUnico){
        this.nombrePublicacion = nombrePublicacion;
        this.frecuenciaPublicacion = frecuenciaPublicacion;
        this.codigoUnico = codigoUnico;
    }

    //GET NOMBRE DE LA PUBLICACION
    public String getnombrePublicacion() {
        return nombrePublicacion;
    }

    //SET NOMBRE DE LA PUBLICACION
    public String setnombrePublicacion(String nuevoNombrePublicacion){
        nombrePublicacion = nuevoNombrePublicacion;
        return nombrePublicacion;
    }

    //GET FRECUENCIA DE PUBLICACION
    public String getFrecuenciaPublicacion() {
        return frecuenciaPublicacion;
    }

    //SET FRECUENCIA DE PUBLICACION
    public String setFrecuenciaPublicacion(String nuevoFrecuenciaPublicacion) {
        frecuenciaPublicacion = nuevoFrecuenciaPublicacion;
        return frecuenciaPublicacion;
    }
    //Visualizar si dos publicaciones son iguales (EQUALS)

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return Objects.equals (codigoUnico, that.codigoUnico);
    }


}
