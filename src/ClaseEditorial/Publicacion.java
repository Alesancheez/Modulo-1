package ClaseEditorial;

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



}
