import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Libro comic = new Libro("El eternauta","Hector German Oesterheld",2,4000.0,6000.0,"c",10056789);
        Libro infantil= new Libro ("Caperucita y el Lobo","Charles Perrault", 50,1000.0,4000.0,"b",10045678);


        //COMISION AUTOR
        System.out.println("La comision del autor (5%) es de: $" +comic.calcularComisionAutor());

        //STOCK MINIMO
        System.out.println("Hay stock?: " + comic.hayStockDisponible() + " Se necesita reponer?: " + comic.reponerStock());

        //SET DE STOCK MINIMO
        Libro.setStockMinimo(8);

        //GET SET
        System.out.println(infantil.getTitulo());
        infantil.setTitulo ("Caperucita Roja");
        System.out.println(infantil.getTitulo());

        System.out.println(infantil.getAutor());
        infantil.setAutor("Pepe lopez");
        System.out.println(infantil.getAutor());

        //CONSULTA STOCK
        System.out.println("¿Hay stock? "+ infantil.hayStockDisponible());

        //DESCUENTO PRECIO FINAL
        System.out.println("Descuento: " + infantil.calcularPrecioFinal());

        //ARRAY
        Libro[] Libros = new Libro[3];
        Libros[0] = infantil;
        Libros[1] = comic;
        Libros[2] = ingresarLibro();

        for (Libro libro1: Libros) {
            System.out.println(
                    "info del libro: \n Titulo: "+libro1.getTitulo()
                    + "\n Autor: "+libro1.getAutor()
                    +"\n Calcular ganancia: " + libro1.calcularGanancia()
                    +"\n Código: "+ libro1.getparteCodigo()
                    +"\n Precio Final c/ descuento: "+libro1.calcularPrecioFinal())
                    ;}


    }

public static Libro ingresarLibro(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("ingresa los datos del libro: " +
            "Titulo, autor, stock, precio de costo, precio de venta, sector y codigo: ");

    String tituloIngresado = scanner.nextLine();
    String autorIngresado = scanner.nextLine();
    int stockIngresado = scanner.nextInt();
    Double precioCosto = scanner.nextDouble();
    Double precioVenta = scanner.nextDouble();
    scanner.nextLine();
    String sectorIngresado = scanner.nextLine();
    //scanner.nextLine();
    int codigoIngresado = scanner.nextInt();

    Libro libroIngresado = new Libro (tituloIngresado,autorIngresado,stockIngresado,precioCosto,precioVenta,sectorIngresado,codigoIngresado);

    return libroIngresado;

    }

}

