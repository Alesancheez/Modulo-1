public class Cuenta {


    private String  nombre;
    private Integer dni;
    private Double saldo;
    private Integer numeroDeCuenta;
    private static final Double COMISION_FIJA = 0.05;
    private static Double limiteExtraccion= 50.000;

    public static void cuenta1(String nombre,Integer dni,Double saldo,Integer numeroDeCuenta){

    }

    public double retirarMonto(Double num){
        if (num >= saldo && num <= limiteExtraccion);
            this.saldo = this.saldo - num;
            return "Retiro exitoso, tu saldo actual es de: " + saldo;
        } else
                return "No se pudo realizar el retiro, intente nuevamente con otro monto"
    {



}
