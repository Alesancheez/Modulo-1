package entity;

public class PaqueteSimple extends PaqueteTuristico {

    private final double codigoDescuento = 0.25;
    private String tieneCodigoDescuento;


    public PaqueteSimple(Integer identificador, Integer cantidadDias, Double valorBase, Double valorAdicional, String titulo, String tieneCodigoDescuento) {
        super(identificador, cantidadDias, valorBase, valorAdicional, titulo);
        this.tieneCodigoDescuento = tieneCodigoDescuento;
    }

    public String getTieneCodigoDescuento() { return tieneCodigoDescuento; }

    @Override
    public String toString() {
        return super.toString() + "Paquete Simple {descuento=" + (codigoDescuento * 100) + "%}";
    }

    @Override
    public Double calcularPrecioFinal(){
        Double adicional = getPrecioBase() * getValorAdicional() * getExcursiones();

        if (getTieneCodigoDescuento().toLowerCase() == "si"){
            System.out.println("Descuento aplicado. Precio Final: " + (getPrecioBase() + adicional - codigoDescuento));
            return (getPrecioBase() + adicional - codigoDescuento);
        }else {
            System.out.println("Sin descuento. Precio Final: " + (getPrecioBase() + getValorAdicional()));
            return (getPrecioBase() + adicional);
        }
    }
}
