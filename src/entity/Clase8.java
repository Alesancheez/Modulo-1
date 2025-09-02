package entity;

import java.util.Arrays;
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {

      /* Necesitamos una función que reciba dos cadenas de texto, cada una debe tener dos lugares turisticos separados
        por una coma.
        1. Utilizar Scanner.
        2. Debe retornar la que tenga mayor cantidad de caracteres.
        3. Debe generar un array de cuatro elementos para guardar los cuatro lugares turisticos,
        ordenarlas e imprimirlas.*/

        Scanner scanner  =new Scanner (System.in);
        System.out.println("Ingresar dos textos que contengan dos lugares turisticos separados por coma");
        String lugarTuristico1=scanner.nextLine();
        String lugarTuristico2 =scanner.nextLine();

        CompStringCrearArray(lugarTuristico1, lugarTuristico2);

    }

    public static String CompStringCrearArray (String lugarTuristico1,String lugarturistico2 ) {

        String[] lugaresIngresados = new String[4];
        String[] lugaresSeparados1 = lugarTuristico1.split(",");
        String[] lugaresSeparados2 = lugarturistico2.split(",");

        lugaresIngresados[0] = lugaresSeparados1[0];
        lugaresIngresados[1] = lugaresSeparados1[1];
        lugaresIngresados[2] = lugaresSeparados2[0];
        lugaresIngresados[3] = lugaresSeparados2[1];

        Arrays.sort(lugaresIngresados,String.CASE_INSENSITIVE_ORDER);
        for (String lugarTuri:lugaresIngresados){
            System.out.println(lugarTuri);
        }

        if (lugarTuristico1.length() > lugarturistico2.length()){
        return lugarTuristico1;}
        else if (lugarTuristico1.length() == lugarturistico2.length()){
        return "tienen la misma cantidad de caracteres";
        } else {
            return lugarturistico2;}

    }

    /*  Utilizar la clase Scanner:

        1.Debemos desarrollar una funcionalidad para una entidad de préstamos que indique si la persona está habilitada
        a obtener uno en base a que el monto solicitado no supere el 35% de su sueldo.
        2.Escribir una función para calcular la cantidad de faltas disponibles de acuerdo a un porcentaje de asistencia y
        cantidad de encuentros determinado¿Cuál es el resultado para una cursada de 23 encuentros que requiere un 75%
        de asistencia? ¿Y para el caso de este módulo?
        3.En una jornada escolar se dictan varias materias.Todas tienen la misma duración en minutos. Además, hay recreos
        de 15 minutos entre cada una. Si se dictan cierta cantidad de materias, ¿cuánto dura la jornada completa?*/

}
