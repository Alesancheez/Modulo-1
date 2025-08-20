package entity;

public class Clase1 {

    public static void main(String[] args) {
    /*1. Creando las primeras variables en Java. En este caso serán cinco: nombre, apellido,edad,peso y altura.
         Asignaremos un valor acorde a su tipo y se visualizará por consola.*/

        String nombre = "Alejandra";
        String apellido = "Sanchez";
        int edad = 24;
        double peso = 65.5;
        double altura = 1.67;

        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura);


    //2. Imprimir por consola el nombre completo de la persona.

        System.out.println(nombre + " " + apellido);

    /* 3. En este caso necesitamos calcular el IMC de la persona( peso/altura^2), almacenar
        el resultado con decimales y que se visualice en consola como un entero.*/

        double imc = peso / (altura * altura);
        System.out.println("El IMC es: " + Math.round(imc));


    // 4. Utiliza una estructura if para comprobar si la edad es par y múltiplo de 4.

        if (edad % 4 == 0) {
            System.out.println(edad + " es par y es multiplo de 4");
        }


    // 5.Escribí un programa que multiplique todos los números divisibles por 3 en el rango del 1 al 20.

        int i = 1;
        int multiplicar =1;

        while (i <= 20) {
            if (i % 3 == 0) {
                multiplicar = multiplicar * i;
                System.out.println( i);
            }
            i++;
        }

        System.out.println(multiplicar);


    /* 6.Crea un programa que cuente cuántos números entre el 1 y el 32 son múltiplos de
        3 y que al finalizar imprima el total.*/









    /* 7. Crea un programa que retorna un número de piso al ingresar un determinado sector .
        El sector a corresponde al 2°, el b al 4° y el c al 10°.*/

        String sector="A";

        switch  (sector){
            case "A":
                System.out.println("2°");
            break;
            case "B":
                System.out.println("4°");
            break;
            case "C":
                System.out.println("10°");
            default:
                System.out.println("Sector no valido");
        }

    /* 8. Adapta el punto 6 de la práctica en vivo utilizando el nombre, buscando todas las vocales.
        (Crea un programa que cuente cuantas letras tiene el trayecto y que al finalizar imprima el total.
        Actualizarlo para que retorne la cantidad del carácter ‘a’.) */



    }

}

