package entity;

public class Clase4 {

    public static void main(String[] args) {

// STRINGS EJERCICIOS

//1. Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.

        String texto= "hola a todos";
        String texto1= "Hola a todos";

        System.out.println("Los strings son: " + texto.equals(texto1));

//2. Imprimir por consola la cantidad de caracteres de la primer frase.

        System.out.println("La primer frase tiene " + texto.length() + " caracteres");

/*3. Crea una función en la que tengas que ingresar tu nombre y apellido por separado, a partir de los
     mismos obtener tus iniciales en mayúscula.*/

        mayuscula("alejandra","sanchez");
    }
    public static void mayuscula (String nombre,String apellido){

        nombre = nombre.toUpperCase();
        apellido = apellido.toUpperCase();

        System.out.println(nombre.charAt(0) + " " + apellido.charAt(0));

    }

}
