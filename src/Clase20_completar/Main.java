package Clase20_completar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Empleado jose  = new Empleado ("Jose","Lopez",44541214,1100123456,800000.0);

        //REGISTRAR ENTRADA
        jose.registrarEntrada();
        //REGISTRAR SALIDA
        jose.registrarSalida();

        //ARRAYLIST EMPLEADOS
        ArrayList <Empleado> empleados = new ArrayList<>();

        //AGREGAR EMPLEADOS A LA LISTA
        empleados.add(new Empleado("Clark","Kent",49658214,1101234567,800000.0));
        empleados.add(new Empleado("Bruce","Wayne",46521478,1134567890,80000.0));
        empleados.add(new Empleado("Peter","Parker",44414214,1100012345,800000.0));

        //VISUALIZAR LISTA
        for (Empleado e : empleados){
            System.out.println(e);
        }

        //CASTING
        Empleado emp1 =new LimpiezaGeneral("Peter","Parker",44414214,1100012345,800000.0);


    }
}

