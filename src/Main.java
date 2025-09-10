import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("ingresa los datos del libro: " +
                "Titulo, autor, stock, precio de costo, precio de venta, sector y codigo: ");

        String tituloIngresado = scanner.nextLine();
        String autorIngresado = scanner.nextLine();
        int stockIngresado = scanner.nextInt();
        Double precioCosto = scanner.nextDouble();
        Double precioVenta = scanner.nextDouble();
        String sectorIngresado = scanner.nextLine();
        int codigoIngresado = scanner.nextInt();

        Libro libroIngresado = new Libro (tituloIngresado,autorIngresado,stockIngresado,precioCosto,precioVenta,sectorIngresado,codigoIngresado);

        Libro comic = new Libro("El eternauta","Hector German Oesterheld",10,4000,6000,"c",10056789);
        Libro infantil= new Libro ("Caperucita y el Lobo","Charles Perrault", 50,1000,4000,"b",10045678);

        System.out.println(infantil.getTitulo());
        infantil.setTitulo ("Caperucita Roja");
        System.out.println(infantil.getTitulo());

        System.out.println(infantil.getAutor());
        infantil.setAutor("Pepe lopez");
        System.out.println(infantil.getAutor());


        System.out.println("¿Hay stock? \n"+ infantil.hayStockDisponible()+
                "\n la ganancia obtenida es de: "+ infantil.calcularGanancia());

    //ARRAY

        Libro[] Libros = new Libro[3];
        Libros[0] = infantil;
        Libros[1] = comic;
        Libros[2] = libroIngresado;

        for (Libro libro1: Libros) {
            System.out.println(
                    "info del libro: \n Titulo: "+libro1.getTitulo()
                    +"\n calcular ganancia: " +
                    libro1.calcularGanancia() +
                    "\n ver código: "+ libro1.parteCodigo()
                    );}
}}
