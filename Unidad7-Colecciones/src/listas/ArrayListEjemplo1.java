package listas;
import java.util.*;

class ArrayListEjemplo1 {
	public static void main(String []args) {
		
	
		
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

		al.remove("F");
		al.remove(2);
		System.out.println("Tamaño del arraylist al: " +
				al.size());

		System.out.println("contenidos del arraylist al: " + al);
		


		if (al.removeIf((s)-> s.startsWith("A"))) {
			
		System.out.println("Solo borra si el elemento empieza por A, cumple el predicate");
		}

		
		ArrayList<String> al2 = new ArrayList(al);
		
		
		al2.add("X");
		System.out.println("contenidos del arraylist al2 tras copiar de al y añadir X: " + al2);
		
		if (al2.contains("X")) {
			
			System.out.println("al2 contiene X");
			
		}
		
		ArrayList<String> al3 = new ArrayList();
				
		al3.addAll(al2);

		al3.add("Y");
		
		System.out.println("contenidos del arraylist al3 tras copiado de al2 y añadido Y" + al3);
		
		System.out.println("Posición 2 del arraylist al3 es el elemento: " +  al3.get(2));
		al3.set(2, "VV");
		System.out.println("Posición 2 del arraylist al3 modificado: " +  al3.get(2));
		System.out.println("Para el elemento X el indice es: " +  al3.indexOf("X"));
		
		al3.clear();
		
		System.out.println("al3 vacio con clear() se borran todos los elementos de la colección"+ al3);
		
		
	}
		
}