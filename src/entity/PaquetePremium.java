package entity;

public class PaquetePremium extends PaqueteTuristico {

    private String voucherDescuento;
    private Double puntosAcumulados;


    public PaquetePremium(Integer identificador, Integer cantidadDias, Double valorBase, Double valorAdicional, String titulo,Guia guia, String voucherDescuento, Double puntosAcumulados) {
        super(identificador, cantidadDias, valorBase, valorAdicional, titulo,guia);
        this.voucherDescuento = voucherDescuento;
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getVoucherDescuento() {
        return voucherDescuento;
    }

    public Double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Double puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    @Override
    public Double calcularPrecioFinal() {
        Double adicional = getValorBase() * getValorAdicional() * getExcursiones();
        return getPrecioBase() + adicional;
    }

    @Override
    public String toString() {
        return "Paquete Premium{" +
                "Voucher Descuento='" + voucherDescuento + '\'' +
                ", Puntos Acumulados=" + puntosAcumulados +
                '}';
    }
}
