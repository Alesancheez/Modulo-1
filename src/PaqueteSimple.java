public class PaqueteSimple extends PaqueteTuristico {

    private final double codigoDescuento = 0.25;


    public PaqueteSimple(Integer identificador, Integer cantidadDias, Double valorBase, Double valorAdicional, String titulo) {
        super(identificador, cantidadDias, valorBase, valorAdicional, titulo);
    }
}
