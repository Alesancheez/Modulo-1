package entity;

public class PaqueteSimple extends PaqueteTuristico {

    private final double codigoDescuento = 0.25;
    private String tieneCodigoDescuento;


    public PaqueteSimple(Integer identificador, Integer cantidadDias, Double valorBase, Double valorAdicional,
                         String titulo,Guia guia, String tieneCodigoDescuento) {
        super(identificador, cantidadDias, valorBase, valorAdicional, titulo, guia);
        this.tieneCodigoDescuento = tieneCodigoDescuento;
    }
    public String getTieneCodigoDescuento() { return tieneCodigoDescuento; }

    @Override
    public String toString() {
        return super.toString() + "Paquete Simple {descuento=" + (codigoDescuento * 100) + "%}";
    }

    @Override
    public Double calcularPrecioFinal() {

        Double adicional = getPrecioBase() * getValorAdicional() * getExcursiones();
        Double precio = getPrecioBase() + adicional;

        if (getTieneCodigoDescuento().equalsIgnoreCase("si")) {
            return precio * 0.75;
        } else {
            return precio;
        }
    }
}
