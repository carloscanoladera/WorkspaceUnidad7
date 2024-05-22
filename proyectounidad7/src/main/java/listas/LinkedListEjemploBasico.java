package listas;
import java.util.LinkedList;

public class LinkedListEjemploBasico {
	
	 public static void main(String[] args) {
		 
		LinkedList<String> linkedlista = new LinkedList<String>();

		linkedlista.add("F");
		linkedlista.add("B");
		linkedlista.add("D");
		linkedlista.add("E");
		linkedlista.add("C");
		linkedlista.add("E2");
		linkedlista.addLast("Z");
		linkedlista.addFirst("A");
		linkedlista.add(1, "A2");
		System.out.println("l: " + linkedlista);
		
		linkedlista.remove("F");
		linkedlista.remove(2);
		System.out.println("Contents despues de borrar: "
		+ linkedlista);
		// Remove first and last elements.
		linkedlista.removeFirst();
		linkedlista.removeLast();
		System.out.println("ll despues de borrar primero y ultimo: "
		+ linkedlista);
		
		
		if (linkedlista.offerLast("S")) {
			
		System.out.println("La inserción de S se hizo bien");		
		}
		linkedlista.addLast("R");
		linkedlista.addFirst("M");
		
		
		if (linkedlista.offerFirst("X")) {
			
			System.out.println("La inserción de X se hizo bien");	
			
		}
		
		System.out.println("ll despues añadir "
				+ linkedlista);
		
		System.out.println( "Primero: " + linkedlista.getFirst() + " último: " + linkedlista.getLast());
		
		
		System.out.println("Index of A2: " + linkedlista.indexOf("A2"));
		
		
		if (linkedlista.removeIf((s)-> s.startsWith("E"))) {
			
			System.out.println("Hay un elemento que empiezar por E y lo borra");
		}
		
	 }

}
