package ClaseEditorial;

public class Boletin extends Publicacion{
    private Integer sectorOrganizacion;


    //CONSTRUCTOR
    public Boletin(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, Integer sectorOrganizacion) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.sectorOrganizacion = sectorOrganizacion;
    }

    //GET SECTOR
    public Integer getSectorOrganizacion() {
        return sectorOrganizacion;
    }

    //SET SECTOR
    public Integer setSectorOrganizacion(Integer nuevoSector){
        sectorOrganizacion = nuevoSector;
        return sectorOrganizacion;
    }

    //Visualizar la información como texto (ToString)
    @Override
    public String toString() {
        return "Boletin{" +
                "sectorOrganizacion=" + sectorOrganizacion +
                '}';
    }
}

