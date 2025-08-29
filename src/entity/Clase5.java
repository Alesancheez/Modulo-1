package entity;

import java.time.LocalDate;

public class Clase5 {

    public static void main(String[] args) {
        //1. Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.Imprimir el resultado obtenido.

        Integer num1 = 5;
        Integer num2 = 6;

        int result = num1.compareTo(num2);
        if (result == 0) System.out.println("Los numero son iguales");
        else {
            if (result > 0)
                System.out.println(num1 + " es mayor que " + num2);
            else
                System.out.println(num2 + " es mayor que " + num1);
        }


        /*2.Crea una fecha de nacimiento y calcula la edad. Además imprimí por consola la edad, junto con la fecha formateada
        de esta forma “YY MM DD”. */


        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacim = LocalDate.of(2001, 7, 6);

        System.out.println("Edad: " + (fechaActual.getYear() - fechaNacim.getYear()) + " " + "Fecha de nacimiento: " + fechaNacim);


        //3. Convertir las variables Integer anteriores en String e imprimirlas por consola indicando su clase.

        String resultString = String.valueOf(num1 + num2);

        System.out.println(resultString + " " + resultString.getClass());


        //4. Crea una función que reciba un nombre y retorne la inicial del mismo. Debe contar la cantidad de veces que se repite dicho carácter.

        String nombre2 = "pepito";
        inicial(nombre2);

        //5. Crear una función que reciba un int, lo convierta a String y compare con otro String en caso de ser iguales debe incluirse un mensaje.

        converterString(100);

        //6. Crear una función que reciba un String y un número, y devuelva la letra que está en esa posición, junto con el largo total.
       posicion("manzana",3);
    }

    //4
    public static char inicial(String nombre) {

        char inicial;
        int contadorInicial = 0;

        inicial = nombre.charAt(0);

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == inicial) {
                contadorInicial++;
            }
        }
        System.out.println("La inicial es: " + inicial + " y se repite: " + contadorInicial);

        return inicial;
    }

    //5
    public static void converterString (int numeroA) {

        String resultado = String.valueOf(numeroA);
        String numeroB = "100";

        if (resultado.equals(numeroB)) System.out.println("Son iguales");
    }

    //6
    public static void posicion (String fruta,int posicionNum) {

        System.out.println("La letra de la posicion "+posicionNum+ " es: " +fruta.charAt(posicionNum) +
                " y la cantidad total de caracteres de " + fruta + " son de: " + fruta.length());

    }
}
