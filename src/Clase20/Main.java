package Clase20;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       // Empleado jose  = new Empleado ("Jose","Lopez",44541214,1100123456,800000.0);

        //ARRAYLIST EMPLEADOS
        ArrayList <Empleado> empleados = new ArrayList<>();

        //AGREGAR EMPLEADOS A LA LISTA
        empleados.add(new LimpiezaGeneral("Clark","Kent",49658214,1101234567,800000.0));
        empleados.add(new LimpiezaGeneral("Bruce","Wayne",46521478,1134567890,80000.0));
        empleados.add(new LimpiezaVajilla("Peter","Parker",44414214,1100012345,800000.0));

        //VISUALIZAR LISTA
        for (Empleado e : empleados){
            System.out.println(e);
        }


        //CASTING
        Empleado empleadoGeneral1 =new LimpiezaGeneral("Peter","Parker",44414214,1100012345,800000.0);
        Empleado empleadoGeneral2 =new LimpiezaGeneral("Bruce","Wayne",46521478,1134567890,80000.0);
        Empleado empleadoVajilla1 =new LimpiezaVajilla("Clark","Kent",49658214,1101234567,800000.0);
        Empleado empleadoVajilla2 =new LimpiezaVajilla("Jose","Lopez",44541214,1100123456,800000.0);



        ((LimpiezaGeneral)empleadoGeneral1).realizarHorasExtra(4);
        System.out.println(empleadoGeneral1.calcularSueldoMensual());

        empleadoGeneral1= new LimpiezaVajilla("Peter","Parker",44414214,1100012345,800000.0);
        ((LimpiezaVajilla) empleadoGeneral1).actualizarVajillaRota(4);
        System.out.println(((LimpiezaVajilla) empleadoGeneral1).calcularDescuentoVajillaRota());
        System.out.println(empleadoGeneral1.calcularSueldoMensual());

        empleados.add(empleadoGeneral1);
        empleados.add(empleadoGeneral2);
        empleados.add(empleadoVajilla1);
        empleados.add(empleadoVajilla2);


        //REGISTRAR ENTRADA
        System.out.println(empleadoGeneral2.registrarEntrada("8:30"));

        //REGISTRAR SALIDA
        System.out.println(empleadoGeneral2.registrarSalida("16:30"));

        //COMPARAR EMPLEADOS
        System.out.println(empleadoGeneral1.equals(empleadoGeneral2));

        //CORROBORAR QUE EL EMPLEADO ESTE EN LA LISTA
        verificarEmpleado(empleados,empleadoVajilla2);

        //VER LA INFORMACION DEL EMPLEADO (HASH)
        System.out.println(empleadoVajilla1);


    }
    public static void verificarEmpleado (ArrayList <Empleado> lista, Empleado empleadoX){

        //VERIFICAR QUE EL EMPLEADO INGRESADO ESTE EN LA LISTA
        System.out.println(lista.contains(empleadoX));

}

}

