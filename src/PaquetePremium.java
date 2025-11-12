public class PaquetePremium extends PaqueteTuristico {

    private String voucherDescuento;
    private Double puntosAcumulados;


    public PaquetePremium(Integer identificador, Integer cantidadDias, Double valorBase, Double valorAdicional, String titulo, String voucherDescuento, Double puntosAcumulados) {
        super(identificador, cantidadDias, valorBase, valorAdicional, titulo);
        this.voucherDescuento = voucherDescuento;
        this.puntosAcumulados = puntosAcumulados;
    }
}
