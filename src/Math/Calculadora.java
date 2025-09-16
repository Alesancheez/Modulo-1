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
        Double numeroAleatorio = Math.random()*10;
        Double numeroRedondeado = (double) Math.round (numeroAleatorio);
        System.out.println(numeroRedondeado);
        System.out.println("Ingrese un numero: ");

        Scanner scanner = new Scanner (System.in);
        Double numeroIngresado = scanner.nextDouble();
        if (numeroIngresado.equals(numeroRedondeado)){
            return "Adivinaste el numero, " + numeroRedondeado;
        } else System.out.println("No adivinaste, tenes 2 oportunidades mas");

        numeroIngresado = scanner.nextDouble();
        if (numeroIngresado.equals(numeroRedondeado)){
            return "Adivinaste el numero, " + numeroRedondeado;
        }else System.out.println("No adivinaste, tenes 1 oportunidad mas");

        numeroIngresado = scanner.nextDouble();
        if(numeroIngresado.equals(numeroRedondeado)){
            return "Adivinaste el numero, " + numeroRedondeado;
        }else return "No adivinaste el numero era: " + numeroRedondeado;
    }
}
