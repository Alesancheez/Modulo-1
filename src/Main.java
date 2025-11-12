import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Coleccion guias disponibles

        Guia guia1 = new Guia(10020, 40500444, "Jose");
        Guia guia2 = new Guia(10021, 40555444, "Luana");
        Guia guia3 = new Guia(10022, 40555888, "Josefa");


        Map<Integer, Guia> buscarguia = new HashMap<>();
        buscarguia.put(guia1.getDniGuia(), guia1);
        System.out.println(buscarguia.get(guia1.getDniGuia()));

        //Coleccion paquetes disponibles

        PaqueteTuristico paquete1 = new PaqueteSimple(2201, 15, 4000.0, 0.0, "Brasil");
        PaqueteTuristico paquete2 = new PaqueteSimple(2202, 10, 2000.0, 0.0, "Mendoza");
        PaqueteTuristico paquete3 = new PaquetePremium(3301, 20, 7000.0, 0.15, "Bariloche", "BARILOCHE123", 10.0);
        PaqueteTuristico paquete4 = new PaquetePremium(3302, 25, 10000.0, 0.15, "Cordoba", "CORDOBA120", 10.0);

        List<PaqueteTuristico> paqueteTuristicos = new ArrayList<>();
        paqueteTuristicos.add(paquete1);
        paqueteTuristicos.add(paquete2);
        paqueteTuristicos.add(paquete3);
        paqueteTuristicos.add(paquete4);

        paquete1.agregarExcursion("Cataratas");
        paquete2.agregarExcursion("Bodega Don jose");
        paquete3.agregarExcursion("Cerro tronador");
        paquete3.agregarExcursion("Isla Victoria");
        paquete3.eliminarExcursion("Isla Victoria");
        paquete4.agregarExcursion("Sierras");

        //Recorrer lista guia
        for (int i = 0; i < ; i++) {
        }




//        //Visualizar informacion paquetes disponibles
//        Scanner scanner = new Scanner(System.in);
//        try{
//            System.out.println( paqueteTuristicos.get(4) );}
//        catch (IndexOutOfBoundsException e){
//            System.err.println(e);
//        }

        //Visualizar informacion guias disponibles
//        try{
//            System.out.println( Guia.get(6) );}
//        catch (IndexOutOfBoundsException e){
//            System.err.println(e);
//        }


    }
}
