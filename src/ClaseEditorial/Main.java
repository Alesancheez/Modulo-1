package ClaseEditorial;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList <Suscriptor> suscriptores = new ArrayList<>();
        suscriptores.add(new Suscriptor("Jose","Calle 123",1122334455));

        Boletin boletin1 = new Boletin("Boletin Lala","Mensual",001,1);


        Revista revista1 = new Revista("revista Lolo","mensual",00001,suscriptores);

        System.out.println(boletin1.equals(revista1));
    }
}
