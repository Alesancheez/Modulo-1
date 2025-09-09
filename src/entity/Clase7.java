package entity;

import java.util.Arrays;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {

//ARRAYS EJERCICIOS

     //1. Crea un array de cuatro películas e imprimirlas por orden alfabético utilizando for-each.

        String[] peliculas= {"Superman","Wicked","Batman","Fantastic 4","Lilo y stitch"};
        Arrays.sort(peliculas);
        for (String pelicula : peliculas){
            System.out.println(pelicula);
        }

     //2. Crea un nuevo array que contenga la lista de películas en mayúscula.

        String[] peliculasMayus = new String[peliculas.length];
        for (int i = 0; i < peliculas.length; i++) {
            String pelisM =peliculas[i].toUpperCase();
            peliculasMayus[i]=pelisM;
            System.out.println(peliculasMayus[i]);
        }

     /*3. Crea una variable que guardará la primera película que comience con “L”, se debe recorrer el array
          buscando el primer resultado.*/

        String peliculaLetraL=null;
        for (String pelicula :peliculas){
            if (pelicula.charAt(0) == 'l' || pelicula.charAt(0) == 'L' && peliculaLetraL == null ){
                peliculaLetraL=pelicula;
                }
            }
        System.out.println("Peliculas con la letra L: " + peliculaLetraL);

    /*4. Pedir 3 notas(Scanner), guardarlas en un array y calcular el promedio. A continuación mostrar el
        mayor y el menor.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar 3 notas para promediar:");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();

        int[] notas = {num1,num2,num3};
        Arrays.sort (notas);
        int promedio = (num1 +num2 + num3)/3;
        System.out.println("promedio" + promedio + "numero mayor: " + notas [2] + "numero menor: " + notas [0]);


//SCANNER EJERCICIOS

    /* 1. Debemos desarrollar una funcionalidad para una entidad de préstamos que indique si la persona está
        habilitada a obtener uno en base a que el monto solicitado no supere el 35% de su sueldo.*/

    /*2. Escribir una función para calcular la cantidad de faltas disponibles de acuerdo a un porcentaje
        de asistencia y cantidad de encuentros determinado¿Cuál es el resultado para una cursada de 23
        encuentros que requiere un 75% de asistencia? ¿Y para el caso de este módulo?*/


    /*3. En una jornada escolar se dictan varias materias.Todas tienen la misma duración en minutos.
        Además, hay recreos de 15 minutos entre cada una. Si se dictan cierta cantidad de materias,
        ¿cuánto dura la jornada completa?*/


    }



}
