package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjemplosClaseCollections {
	
	
	

	public static void main(String args[]) {
		// Creating a list
		// Declaring object of string type
		List<String> items = new ArrayList<>();
		
		String array[]= {"Frutas", "Tebeos", "Helados", "Libretas", "Bicicletas","Lapices"};
		List<String> items2 = Arrays.asList(array);
		List<Integer> numeros = Arrays.asList(0,5,3,2,4,2,8,10);
      

		//añadiendo elementos a la lista items
		items.add("Tornillos");
		items.add("Tuercas");

		// añadiendo mas de uno a la vez
		Collections.addAll(items, "Frutas", "Verduras", "Carne");
		
	

		
		System.out.println("Coleccion: " + items.toString());
		
		
		   // Sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());
		
        System.out.println("Coleccion ordenada al reves: " + items.toString());
		
		// ordenando con el Comparable por defecto para String
        // usando  sort() 
        Collections.sort(items);
        
          
        
        
        Collections.sort(items);
		
		System.out.println("contenidos del items ordenado : " + items);
		
		
		Collections.sort(items2, (s1,s2) -> (s1.compareTo(s2)*-1));
		
		System.out.println("Coleccion ordenada: " + items.toString());
		
		
		System.out.println("contenidos del items2 tras ordenar inverso con lambda: " + items2);
		
        
		System.out.println("contenidos del items2 tras ordenar inverso con lambda: " + items2);
		
		System.out.println("contenidos del numeros sin ordenar : " + numeros);
		
		Collections.reverse(numeros);
        
		System.out.println("contenidos del numeros ordenado al reves : " + numeros);
 
     
        System.out.println("Para hacer una busqueda binaria primero hay que ordenar");
        
     // BinarySearch items
        System.out.println(
            "El indice para Frutas es "
            + Collections.binarySearch(items, "Frutas"));
 
        // BinarySearch 
        System.out.println(
            "El indice para Tuercas es "
            + Collections.binarySearch(items, "Tuercas"));
        
        
        System.out.println(
                "Items e items2 no tienen elementos en comun: " + Collections.disjoint(items, items2));

        
        
        System.out.println("Items2 antes de copiar items: " + items2.toString());
        
        Collections.copy(items2, items);
        
        
        System.out.println("Items2 después de copiar items: " + items2.toString());
        
        
        
        System.out.println("Máximo elemento de items:" + Collections.max(items));
     
        System.out.println("Mínimo elemento de numeros:" + Collections.min(numeros));
        
        
        System.out.println("Máximo elemento de items2 con Comparator:" + Collections.max(items, (item1,item2)-> item1.compareTo(item2)));
        
        System.out.println("Numeros antes de intercambiar: " + numeros );
        
        
        System.out.println("Indice de la sublista 3, 2 para números: "
        + Collections.indexOfSubList(numeros, Arrays.asList(3,2)));
        
        Collections.swap(numeros, 1, 3);
        
        System.out.println("Numeros intercambiados posicion 1 y 3: " + numeros );
        
        System.out.println("Frecuencia del numero 2 en números: " +Collections.frequency(numeros, 2));
        
        
        Collections.replaceAll(items,"Frutas", "Pizzas");
        
        System.out.println("Reemplazando en items Frutas por Pizzas: " + items );
        
       
        
	}

}
