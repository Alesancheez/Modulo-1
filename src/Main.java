import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta ("Pablo",45620074,8000.0,92333378);
        Cuenta cuenta2 = new Cuenta("Bart",43629843,4000.0,92334566);

        //VER LIMITE EXTRACCION
        System.out.println(cuenta1.getLimiteExtraccion());

        //CONSULTA NUMERO DE CUENTA
        System.out.println(cuenta1.getNumeroDeCuenta());

        //CONSULTA SALDO
        System.out.println(cuenta1.saldoActual());

        //RETIRAR SALDO
        System.out.println(cuenta1.retirarSaldo(2000.0));

        //RECIBIR TRANSFERENCIA
        System.out.println(cuenta1.recibirSaldo(500.0));

        //TRANSFERIR SALDO
        System.out.println(cuenta1.transferirSaldo(9000.0,92334566));

        //ARRAY - AGREGAR CUENTA
        agregarCuenta(cuenta1);
    }

    //ARRAY
    static ArrayList<Cuenta> cuentas= new ArrayList<>();

    public static void agregarCuenta(Cuenta cuentas){
        cuentas.add(Cuenta);
        if(cuentas.size() == 5){
            System.out.println("exedio limite perrmitido de cuentas creadas");
        }else cuentas.add(Cuenta);

    }

}

