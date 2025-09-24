import java.util.ArrayList;
public class Cuenta {

    private String  nombre;
    private Integer dni;
    private Double saldo;
    private Integer numeroDeCuenta;
    private static final Double COMISION = 0.05;
    private static Double limiteExtraccion= 50000.0;

    public Cuenta (String nombre, Integer dni, Double saldo, Integer numeroDeCuenta){

        this.numeroDeCuenta=numeroDeCuenta;
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=saldo;
    }

    //CONSULTAR LIMITE EXTRACCION
    public Double getLimiteExtraccion() {return (Double) this.limiteExtraccion; }

    //CONSULTAR NUMERO DE CUENTA
    public Integer getNumeroDeCuenta(){
        return this.numeroDeCuenta;
    }

    //CONSULTAR SALDO
    public Double saldoActual(){
        return this.saldo;
    }

    //RETIRAR SALDO
    public String retirarSaldo (Double num){
        if (num <= saldo && num<=limiteExtraccion){
            this.saldo = (Double) (this.saldo - num);
            return "Retiro exitoso, tu saldo actual es de: " + saldo;
        }else return "Fondos insuficientes.";
    }

    //TRANSFERENCIA
    public String recibirSaldo ( Double monto ){
        this.saldo = (Double) (this.saldo + (monto-(monto*COMISION)));
        return "Saldo recibido: " + (monto-(monto*COMISION)) + " Saldo actual: " + this.saldo;
    }

    //TRANSFERIR
    public String transferirSaldo (Double num, Integer numeroDeCuenta){
        if (num <= saldo && num<=limiteExtraccion) {
            this.saldo = (Double) (this.saldo - num);
            return "Transferencia exitosa, tu saldo actual es de: " + saldo;
        }else return "Fondos insuficientes";
    }

    // CAMBIAR LIMITE EXTRACCION
    public static void setLimiteExtraccion(Double nuevoLimite){
        limiteExtraccion = nuevoLimite;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                " Nombre= " + nombre + ' ' +
                ", Dni= " + dni +
                ", Saldo= " + saldo +
                ", NumeroDeCuenta= " + numeroDeCuenta +
                '}';
    }
}
