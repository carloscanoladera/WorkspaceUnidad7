package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetOperacionesConjuntos {
	
	
	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();

		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		System.out.println("Conjunto A: " + a);

		Set<Integer> b = new HashSet<Integer>();

		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0 }));

		System.out.println("Conjunto B: " + b);

		if (a.isEmpty()) {

			System.out.println("Conjunto A vacio");
		} else {

			System.out.println("Conjunto A con elementos, no vacío");
		}

		if (b.contains(1)) {

			System.out.println("Conjunto B contiene 1, o 1  pertenece al set b");

		} else {

			System.out.println("Conjunto B no contiene 1, o 1 no pertenece al set b");
		}
		
		
		if (b.containsAll(Arrays.asList(1,2))) {

			System.out.println("Conjunto B contiene 1,2, o 1 y 2  pertenece al set b");

		} else {

			System.out.println("Conjunto B no contiene 1,2, o 1 y 2 no pertenece al set b");
		}

		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union de los dos Conjuntos");
		System.out.println(union);

		Set<Integer> interseccion = new HashSet<Integer>(a);
		interseccion.retainAll(b);
		System.out.print("Intersección de los dos conjuntos");
		System.out.println(interseccion);

		// To find the symmetric difference
		Set<Integer> diferencia = new HashSet<Integer>(a);
		diferencia.removeAll(b);
		System.out.print("Diferencia entre dos conjuntos");
		System.out.println(diferencia);

	}

}
