package Math;

public class Main {
    /*Crear una clase Calculadora con métodos estáticos que usen funciones de la clase Math.
    La calculadora además de tener como atributo el n° PI debe permitir:
    1- Elevar un número a una potencia.
    2- Permitir al usuario adivinar un número aleatorio del 1 al 10 teniendo la posibilidad de ingresar tres intentos.
    3- Obtener el mínimo entre dos números ingresados
    4- Calcular la circunferencia de un círculo (perímetro) al ingresar el radio. --> 2 * PI * radio.*/
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();


        //1
        Calculadora.numeroPotencia(2,3);

        //3
        Calculadora.numeroMinimo(9.0,6.0);

        //4
        System.out.println(Calculadora.calcularCircunferencia(5.0));

        //2
        System.out.println(Calculadora.adivinarNumero());
    }



}



