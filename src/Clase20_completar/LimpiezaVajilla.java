package Clase20_completar;

public class LimpiezaVajilla extends Empleado{

    private Integer contadorVajillaRota;
    private Double precioVajillaRota = 2000.0;

    public LimpiezaVajilla(String nombre, String apellido, Integer dni, Integer telefono, Double sueldoBase) {
        super(nombre, apellido, dni, telefono, sueldoBase);

        this.contadorVajillaRota=contadorVajillaRota;
        this.precioVajillaRota=precioVajillaRota;
    }

    //ACTUALIZAR VAJILLA ROTA
    public void actualizarVajillaRota(Integer vajillaRota){
        contadorVajillaRota = contadorVajillaRota + vajillaRota;
    }

    //CALCULAR DESCUENTO VAJILA ROTA
    public Double calcularDescuentoVajillaRota(){
        if(1 < contadorVajillaRota){
            System.out.println("La cantidad de vajilla rota es: " + contadorVajillaRota + "El total a pagar es de: " + (precioVajillaRota*(contadorVajillaRota-1)));
            return (precioVajillaRota*(contadorVajillaRota-1));
        }else{
            System.out.println("No hay descuento");
            return 0.0;}
    }



}
