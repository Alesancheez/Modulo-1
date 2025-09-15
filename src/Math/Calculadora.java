package Math;

import java.util.Scanner;

public class Calculadora {

    private static final Double NUMERO_PI =Math.PI;

    public static double numeroPotencia(double num1, double potencia){
        Double resultadoPotencia = Math.pow(num1, potencia);
        System.out.println(num1 + " elevado a " + potencia + " es de: " + resultadoPotencia);
        return resultadoPotencia;
    }


    public static Double numeroMinimo(double num1, double num2){
    Double resultado = Math.min(num1,num2);
        System.out.println("El numero minimo de " + num1 + " y "+ num2+ " es: " + resultado);
        return
                resultado;
    }

    public static double calcularCircunferencia(Double radio){

        return NUMERO_PI * 2 * radio;

    }

    public static String adivinarNumero(){
        Double numeroAleatorio = Math.random() * 10;
        Scanner scanner = new Scanner(System.in);
        double numeroIngresado=scanner.nextDouble();
        boolean comparacion = numeroAleatorio == numeroIngresado;
        if (comparacion) return "Adivinaste" + numeroAleatorio;
        else return "no adivinaste" + numeroAleatorio;
    }


}
