package Clase20_completar;

public class LimpiezaGeneral extends Empleado{

    private Integer cantidadHorasExtra;
    private static Double precioHorasExtra = 3500.0;
    private static final Integer CANTIDAD_HORAS_EXTRA_MAX =20 ;

    //CONSTRUCTOR
    public LimpiezaGeneral(String nombre, String apellido, Integer dni, Integer telefono, Double sueldoBase) {
        super(nombre, apellido, dni, telefono, sueldoBase);

        this.precioHorasExtra=precioHorasExtra;
        this.cantidadHorasExtra=cantidadHorasExtra;
    }

    //REALIZAR LAS HORAS EXTRA
    public void realizarHorasExtra (Integer horasNuevas){
        if ( 20 < cantidadHorasExtra + horasNuevas){
        System.out.println("No puede realizar mas horas extra");}
        else { cantidadHorasExtra = horasNuevas + cantidadHorasExtra; }
    }

    //CALCULAR PRECIO HORAS EXTRA
    public double calcularPrecioHorasExtra (){
        return precioHorasExtra * cantidadHorasExtra;
    }






}
