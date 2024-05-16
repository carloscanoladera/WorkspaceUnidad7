package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TraversalHashMapExample {

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

		System.out.println("Traversal of entryset with an iterator");

		Map.Entry<String, Double> entry = null;

		while (it.hasNext()) {

			entry = it.next();
			System.out.print(entry.getKey() + ": ");
			System.out.println(entry.getValue());

		}

		System.out.println("Traversal of an entryset with a foreach loop");
		// Recoge un SEt de entradas
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		// recorre el SET.
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		System.out.println("Traversal of an entryset with a forEach lambda");

		hm.entrySet().forEach((entryl) -> {
			System.out.print(entryl.getKey() + ": ");
			System.out.println(entryl.getValue());
		});

		System.out.println();

		System.out.println("The bank balance of John Doe: " + hm.get("John Doe"));

		System.out.println("Traversal of an entryset with a forEach lambda");

		hm.entrySet()
				.forEach((e) -> System.out.println("Entry with Key: " + e.getKey() + " and Value : " + e.getValue()));

		System.out.println("Traversal of the value collection with the foreach loop: ");

		for (Double value : hm.values()) {

			System.out.print(value + ", ");
			System.out.flush();

		}

		System.out.println("\nTraversal of the value collection with the forEach lambda");
		hm.values().forEach(v -> {
			System.out.print(v + ", ");
			System.out.flush();
		});

		System.out.println("\nTraversal of the KeySet with the foreach loop: ");

		for (String key : hm.keySet()) {

			System.out.print(key + ", ");
			System.out.flush();

		}

		System.out.println("\nTraversal of the KeySet with the ForEach lambda");

		hm.keySet().forEach(k -> {
			System.out.print(k + ", ");
			System.out.flush();
		});
	}

}
