package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RecorridosHashMapEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creando un Hash Map
				HashMap<String, Double> hm = new HashMap<String, Double>();
		// añadiendo elementos al Map
				hm.put("John Doe", 3434.34);
				hm.put("Tom Smith", 123.22);
				hm.put("Jane Baker", 1378.00);
				hm.put("Tod Hall", 99.22);
				hm.put("Ralph Smith", -19.08);
				
				
				
				Iterator<Map.Entry<String, Double>> it = hm.entrySet().iterator();

				System.out.println("Recorrido de un Set de entradas iterador");
				
				Map.Entry<String, Double> entry=null;
				
				while (it.hasNext()) {
					
					
					entry=it.next();
					System.out.print(entry.getKey() + ": ");
					System.out.println(entry.getValue());
					
				}
				
				
				System.out.println("Recorrido de un Set de entradas bucle for");
				// Recoge un SEt de entradas
				Set<Map.Entry<String, Double>> set = hm.entrySet();
		// recorre el SET.
				for (Map.Entry<String, Double> me : set) {
					System.out.print(me.getKey() + ": ");
					System.out.println(me.getValue());
				}
				
				
				System.out.println("Recorrido de un Set de entradas bucle foreach lambda");
				
				
				 hm.entrySet().forEach((entryl) -> {System.out.print(entryl.getKey() + ": ");
					System.out.println(entryl.getValue());} );
				
				System.out.println();

				System.out.println("El balance en el banco de John Doe: " + hm.get("John Doe"));
				
				System.out.println("Recorrido de un Set de entradas con ForEach y lambdas");
				
				hm.entrySet().forEach((e) -> System.out.println("Entrada con clave: " + e.getKey() + " y Valor : " + e.getValue()) );
				
				System.out.println("Recorrido de la coleccion de valores con bucle: ");
				
				for (Double value: hm.values()) {
					
					System.out.print(value + ", " ); 
					System.out.flush();
					
				}
				
				
				System.out.println("\nRecorrido de la coleccion de valores con método ForEach y lambdas");
				hm.values().forEach(v -> {System.out.print(v+", " ); System.out.flush(); } );
				
				
				System.out.println("\nRecorrido del conjunto de claves con bucle: ");
				
				for (String clave: hm.keySet()) {
					
					System.out.print(clave + ", " ); 
					System.out.flush();
					
				}
				
				System.out.println("\nRecorrido del conjunto claves con método ForEach y lambdas");
				
				hm.keySet().forEach(k -> {System.out.print(k+", " ); System.out.flush(); } );
	}

}
