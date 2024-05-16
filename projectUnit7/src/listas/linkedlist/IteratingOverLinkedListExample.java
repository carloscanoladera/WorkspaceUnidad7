package listas.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingOverLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> humanSpecies = new LinkedList<>();

        humanSpecies.add("Homo Sapiens");
        humanSpecies.add("Homo Neanderthalensis");
        humanSpecies.add("Homo Erectus");
        humanSpecies.add("Home Habilis");        
        humanSpecies.add("Homo antecessor");
        humanSpecies.add("Homo heidelbergensis");
        humanSpecies.add("Homo floresiensis");        
        
        System.out.println("=== Iterating with lambda ===");
        humanSpecies.forEach(name -> {
            System.out.println(name);
        });


        System.out.println("\n=== Iterating with ===");
        Iterator<String> humanSpeciesIterator = humanSpecies.iterator();
        while (humanSpeciesIterator.hasNext()) {
            String especie = humanSpeciesIterator.next();
            System.out.println(especie);
        }

        System.out.println("\n=== Iterating with Java 8 forEachRemaining() and lambdas===");
        humanSpeciesIterator = humanSpecies.iterator();
        humanSpeciesIterator.forEachRemaining(speciesName -> {
            System.out.println(speciesName);
        });

        System.out.println("\n=== Iterating with descendingIterator() From the end to the beginning");
        Iterator<String> humanSpeciesDescIterator = humanSpecies.descendingIterator();
        while (humanSpeciesDescIterator.hasNext()) {
            String especie = humanSpeciesDescIterator.next();
            System.out.println(especie);
        }


        System.out.println("\n=== Iterating with listIterator() which can go both direcctions");
        // ListIterator can be used to iterate forward or backward
        // In the example we go backwards
        ListIterator<String> humanSpeciesListIterator = humanSpecies.listIterator(humanSpecies.size());
        while (humanSpeciesListIterator.hasPrevious()) {
            String especie = humanSpeciesListIterator.previous();
            System.out.println(especie);
        }

        System.out.println("\n===Iterando with a foreach loop===");
        for(String specie: humanSpecies) {
            System.out.println(specie);
        }
    }
}