import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      1. Escribir un programa que solicite dos números al usuario e intente dividir el primer
//        número por el segundo.
//        Utiliza un bloque try-catch para manejar la excepción ArithmeticException,ocurre si
//        el segundo número es igual a cero.
//        Muestra un mensaje de error apropiado en caso de división por cero.

        System.out.println("Ingresar el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresar el segundo numero: ");
        int num2 = scanner.nextInt();

        try{
            int resultado = (num1/num2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e){
            System.out.println("ERROR - No se puede dividir por cero ");
        }

//      2. Escribir un programa que solicite al usuario ingresar un número como una cadena y luego
//        intente convertir esa cadena a un número entero.
//        Utiliza un bloque try-catch para manejar la excepción NumberFormatException.
//        Ocurre si el usuario ingresa una cadena que no es un número válido.
//        Debe mostrar un mensaje de error en caso de que la conversión falle.

        System.out.println("Ingresar el primer numero: ");
        String numeroString = scanner.nextLine();

        try{
            int numero = Integer.parseInt(numeroString);
            System.out.println("El numero es: " + numero);
        } catch (NumberFormatException e ){
            System.out.println("ERROR - El numero no es valido");
        }
//      3. Agrega una excepción personalizada al ejercicio de la clase anterior o crea una
//        nueva lista ¿Qué pasa si buscamos un index fuera del rango en la colección List?


    }
}


