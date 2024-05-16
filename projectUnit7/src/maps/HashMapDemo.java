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

		System.out.println(" HashMap after inserting " + hm);

		hm.remove("Ralph Smith");

		hm.put("Ralph Smithy", 19.08);

		hm.replace("Tod Hall", 1209.22);

		hm2 = new HashMap<String, Double>(hm);

		System.out.println("map hm2 from the hm1 map passed as a parameter to the constructor " + hm2);

		hm3 = new HashMap<String, Double>();

		hm3.putAll(hm2);

		System.out.println("map hm3  from hm2 passed as a parameter to putAll: " + hm3);

		// Collect a set of entries

		// 1000 deposit for John Doe's .
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);

		hm.putIfAbsent("Lenny", 100.3);

		System.out.println("Hashmap ha after creating, inserting, modifying " + hm);

		Double value = hm.getOrDefault("Johny", 2001.3);

		if (hm2.isEmpty()) {

			System.out.println(" hm2 is empty ");
		} else {

			System.out.println("The size of hm2 to is: " + hm2.size());
		}

		hm.replaceAll((key, deposit) -> deposit + 50);

		System.out.println("HashMap hm after adding 50 to every value in the entry with the method replaceAll " + hm);

	}

}
