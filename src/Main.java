import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();

        Felino felino1 =new Felino(501,"Gato",2,0);
        Canino canino1 = new Canino(502,"Perro",4,4);
        Ornitorrinco orni1 = new Ornitorrinco(503,"Perry",5,10);
        Elefante elefante1 = new Elefante(504,"Dumbo",13,0);
        Puma puma1 = new Puma(505,"Coco",6,4);
        Ornitorrinco orni2 = new Ornitorrinco(506,"Lala",1,0);
        Ornitorrinco orni3 = new Ornitorrinco(507,"Jason",10,5);
        Ave ave1 = new Ave(508,"Loro",5,true);
        Ave ave2 =new Ave(509,"Pinguino",6,false);
        Ave ave3 = new Ave(510,"Avestruz",2,false);

        animales.add(felino1);
        animales.add(canino1);
        animales.add(orni1);
        animales.add(orni2);
        animales.add(orni3);
        animales.add(elefante1);
        animales.add(puma1);
        animales.add(ave1);
        animales.add(ave2);
        animales.add(ave3);

        System.out.println("Lista animales: ");
        for (Animal a : animales){
            System.out.println("ID: " + a.getId() + " "+"Nombre: "+a.getNombre()+ " "+"Edad: "+a.getEdad());
        }


        //Lista Animales (no pueden repetirse elementos)
        Set<Animal> animalesIrrepetibles= new HashSet<>();
        animalesIrrepetibles.add(felino1);
        animalesIrrepetibles.add(canino1);
        animalesIrrepetibles.add(elefante1);
        animalesIrrepetibles.add(puma1);

        //Lista ornitorrinco (lista ordenada)
        List<Animal> ordenarOrnitorrinco= new ArrayList<>();
        ordenarOrnitorrinco.addAll(Arrays.asList(orni2,orni1,orni3));
        Collections.sort(ordenarOrnitorrinco);
        System.out.println(ordenarOrnitorrinco);

        //Lista Aves (buscar con ID)
        HashMap<Integer,Ave> aves = new HashMap<>();
        aves.put(ave1.getId(), ave1);
        aves.put(ave2.getId(), ave2);
        aves.put(ave3.getId(), ave3);

        aves.forEach((clave, valor)->{
            System.out.println(aves.get(clave));
        });
        System.out.println("ver claves disponibles:"+ aves.keySet());

        for (Integer id : aves.keySet()){
            System.out.println(aves.get(id));
        }
//        for (Integer clave: aves.keySet()){
//            if (Ave.get(clave).getNombre().charAt(0)=="A"){
//                aves.remove(clave);
//            }
//        }

        aves.entrySet().removeIf(elemento->
                elemento.getValue().getNombre().toLowerCase().charAt(0) == 'A');
        System.out.println("Map despues: " + aves.values());



    }

}

