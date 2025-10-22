package ClaseEditorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList <Suscriptor> suscriptores = new ArrayList<>();
        suscriptores.add(new Suscriptor("Jose","Calle 123",1122334455));
        suscriptores.add(new Suscriptor("Viviana","Calle 345",1122344458));

        Boletin boletin1 = new Boletin("Boletin Lala","Mensual",101,1);
        Boletin boletin2 = new Boletin("Boletin pepe","Semanal",102,1);


        Revista revista1 = new Revista("revista Lolo","mensual",201,suscriptores);
        Revista revista2= new Revista("Revista Manuelita","Semanal",202,suscriptores);
        Revista revista3= new Revista("Revista Rosita","Mensual",202,suscriptores);


        //COMPARAR PUBLICACION
        System.out.println(boletin1.equals(revista1)); //Son diferentes
        System.out.println(revista2.equals(revista3)); //Son iguales


        //PRECIO FINAL EDICION
        Edicion edicion1 = new Edicion(1, LocalDate.of(2025, 10, 21), 1000.0);
        System.out.println("Precio final de la edicion es de: $" + edicion1.calcularPrecioFinal());

        //VISUALIZAR INFORMACION REVISTA  (ToString)
        System.out.println(revista2);

        //VISUALIZAR INFORMACION BOLETIN (ToString)
        System.out.println(boletin1);


        //AGREGAR SUSCRIPTORES
        revista1.agregarSuscriptor();

        //MOSTRAR TODOS LOS SUSCRIPTORES AGREGADOS
        revista1.mostrarSuscriptores();

        //Eliminar suscriptor
        //Consultar Suscriptores
    }


}
