package lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMasOperaciones {
	
public static void main(String args[]) {
		
		ArrayList<String> al = new ArrayList<String>(20);
		
		al.ensureCapacity(30);
		
		System.out.println("tamaño inicial: " +
				al.size());
		
		al.trimToSize();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Tamaño despues de añadir los elementos: " +
				al.size());
	
		System.out.println("contenido del arraylist " + al);

			
		Collections.sort(al);
		
		System.out.println("contendios del arraylist al2 tras ordenar: " + al);
		
		Collections.sort(al, (s1,s2) -> (s1.compareTo(s2)*-1));
		
		
	
		
		System.out.println("contenido del arraylist " + al);
	}

}
