package ClaseEditorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Edicion{
    private Integer numeroEdicion;
    private LocalDate fechaPublicacion;
    private Double precioBase;
    private static final Double COMISION_FIJA = 0.10;

    //CONSTRUCTOR
    public Edicion(Integer numeroEdicion, LocalDate fechaPublicacion, Double precioBase) {
        this.numeroEdicion = numeroEdicion;
        this.fechaPublicacion = fechaPublicacion;
        this.precioBase = precioBase;
    }

    //GET PRECIO BASE
    public Double getPrecioBase() {
        return precioBase;
    }

    //SET PRECIO BASE
    public Double setPrecioBase(Double nuevoPrecioBase){
        precioBase = nuevoPrecioBase;
        return precioBase;
    }




}
