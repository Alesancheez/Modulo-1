import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

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

        //ARRAY
        agregarCuenta(cuenta1);
        agregarCuenta(cuenta2);

        //SCANNER
       agregarCuentaScanner();
    }

    static ArrayList<Cuenta> cuentas= new ArrayList<>();

    //ARRAY - AGREGAR CUENTA
    public static void agregarCuenta(Cuenta cuenta){
        if(cuentas.size() == 5){
            System.out.println("Exedio el limite permitido de cuentas creadas.");
        }else cuentas.add(cuenta);

    }

    //ARRAY - ELIMINAR CUENTA
    public void eliminarCuenta (Cuenta cuenta){
        if (cuentas.contains(cuenta)) cuentas.remove(cuenta);
        else System.out.println("La cuenta no existe, ingrese una cuenta existente.");
    }

    //ARRAY - CONSULTAR
    public static void consultarCuenta(){
        for (Cuenta cuenta:cuentas){
            System.out.println(cuenta.toString());
        }
    }
    public static void agregarCuentaScanner() {
        boolean cargarDatos = true;

        Scanner scanner = new Scanner(System.in);

        while (cargarDatos){
            System.out.println("Ingresar los datos correspondientes para crear la cuenta: \n Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("DNI: ");
            Integer dni = scanner.nextInt();
            System.out.println("Saldo: ");
            Double saldo = scanner.nextDouble();
            System.out.println("Numero de cuenta: ");
            Integer numeroDeCuenta = scanner.nextInt();

            Cuenta nuevaCuenta = new Cuenta(nombre,dni,saldo,numeroDeCuenta);

            //cuentas.add(nuevaCuenta); //OTRO METODO

            agregarCuenta(nuevaCuenta);
            System.out.println("Su cuenta a sido creada con exito ¿Desea crear otra cuenta?");
            cargarDatos = scanner.nextBoolean();
            scanner.nextLine();
        }
        System.out.println("Visualizar lista de cuentas creadas: ");
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println(cuentas.get(i).toString());
        }
    }}

    /*Crear otro método que permita buscar los datos de una cuenta ingresando el dni y consultar si se quiere actualizar el saldo, ingresar el nuevo valor en
                    caso de que se confirme.*/





