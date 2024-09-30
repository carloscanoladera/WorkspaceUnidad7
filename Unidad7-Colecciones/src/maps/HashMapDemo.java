package maps;

import java.util.*;

class HashMapDemo {
	public static void main(String args[]) {
// Creando un Hash Map
		HashMap<String, Double> hm = new HashMap<String, Double>();
		HashMap<String, Double> hm2 = null;
		HashMap<String, Double> hm3 = null;
// añadiendo elementos al Map
		hm.put("John Doe", 3434.34);
		hm.put("Tom Smith", 123.22);
		hm.put("Jane Baker", 1378.00);
		hm.put("Tod Hall", 99.22);
		hm.put("Ralph Smith", -19.08);
		
		
		hm.put("Tom Smith", 133.22);
		
		System.out.println(" HashMap tras insertar " + hm);
		
		hm.remove("Ralph Smith");
		
		hm.put("Ralph Smithy", 19.08);
		
		hm.replace("Tod Hall", 1209.22);
		
		hm.put("Tod Hall", 1203.22);
		
	
		hm2 = new HashMap<String,Double> (hm);
		
		System.out.println("map hm2 a partir de hm1 con el constructor: " + hm2);
		
		hm3 = new HashMap<String,Double> ();
		
		
		hm3.putAll(hm2);
		
		System.out.println("map hm3 a partir de hm1 con el método putAll: " + hm3);
		
		// Recoge un SEt de entradas


// Deposito de 1000 para John Doe's .
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);
		
		hm.putIfAbsent("Lenny", 100.3);
		
		System.out.println("HashMap hm tras modificar, borrar y reemplazar " +hm);
		
		Double valor = hm.getOrDefault("Johny", 2001.3);
		
			
		if (hm2.isEmpty() ) {
			
			
			System.out.println(" hm2 está vació ");
		} else {
			
		
			System.out.println("El tamaño de hm2 es: " + hm2.size());
		}

	
		hm.replaceAll((key,deposito)-> deposito+50);
		
		System.out.println("HashMap hm tras sumar 50 a todos con replaceAll " +hm);
		
		
		
	}
	
	
}
		