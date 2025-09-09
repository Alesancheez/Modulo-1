//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
    Libro infantil= new Libro ("Caperucita y el Lobo","Charles Perrault", 50,1000,4000,"b",10045678);

        System.out.println(infantil.getTitulo());
        infantil.setTitulo ("Caperucita Roja");
        System.out.println(infantil.getTitulo());

        System.out.println(infantil.getAutor());
        infantil.setAutor("Pepe lopez");
        System.out.println(infantil.getAutor());


        System.out.println("¿Hay stock? \n"+ infantil.hayStockDisponible()+
                "\n la ganancia obtenida es de: "+ infantil.calcularGanancia());


    }
}
