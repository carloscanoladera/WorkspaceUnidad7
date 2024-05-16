package listas.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterandoSobreLinkedListEjemplo {
    public static void main(String[] args) {
        LinkedList<String> especiesHumanas = new LinkedList<>();

        especiesHumanas.add("Homo Sapiens");
        especiesHumanas.add("Homo Neanderthalensis");
        especiesHumanas.add("Homo Erectus");
        especiesHumanas.add("Home Habilis");        
        especiesHumanas.add("Homo antecessor");
        especiesHumanas.add("Homo heidelbergensis");
        especiesHumanas.add("Homo floresiensis");
        
        
        System.out.println("=== Iterando con lambda ===");
        especiesHumanas.forEach(name -> {
            System.out.println(name);
        });


        System.out.println("\n=== Iterando con iterador ===");
        Iterator<String> especiesHumanasIterator = especiesHumanas.iterator();
        while (especiesHumanasIterator.hasNext()) {
            String especie = especiesHumanasIterator.next();
            System.out.println(especie);
        }

        System.out.println("\n=== Iterando utilizando Java 8 forEachRemaining() y lambdas===");
        especiesHumanasIterator = especiesHumanas.iterator();
        especiesHumanasIterator.forEachRemaining(speciesName -> {
            System.out.println(speciesName);
        });

        System.out.println("\n=== Iterando usando descendingIterator() que va de final a principio");
        Iterator<String> especiesHumanasDescIterator = especiesHumanas.descendingIterator();
        while (especiesHumanasDescIterator.hasNext()) {
            String especie = especiesHumanasDescIterator.next();
            System.out.println(especie);
        }


        System.out.println("\n=== Iterando  listIterator() que puede ir en la dos direcciones");
        // ListIterator puedes ser utilizado para iterar hacia delante o hacia atras
        // en el ejemplo recorremos hacia atras
        ListIterator<String> especiesHumanasListIterator = especiesHumanas.listIterator(especiesHumanas.size());
        while (especiesHumanasListIterator.hasPrevious()) {
            String especie = especiesHumanasListIterator.previous();
            System.out.println(especie);
        }

        System.out.println("\n===Iterando usando un bucle===");
        for(String especie: especiesHumanas) {
            System.out.println(especie);
        }
    }
}