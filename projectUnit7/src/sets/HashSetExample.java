package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		// Creating object of Set and declaring String type
		Set<String> hs = new HashSet<String>();

		// Adding elements to Set
		// using add() method

		// Custom input elements
		hs.add("A");
		hs.add("B");
		hs.add("C");

		if (!hs.add("B")) {

			System.out.println("The B Element still belongs to the set and cannot be inserted again");

		}
		hs.add("D");
		hs.add("E");

		System.out.println();

		hs.remove("A");
		if (!hs.remove("X")) {

			System.out.println("The X element  is not in the set and cannot be erased");

		}

		Object[] convertToArray = hs.toArray();

		System.out.println(Arrays.toString(convertToArray));

		System.out.println("Set traversal with iterator");
		Iterator<String> it = hs.iterator();

		for (; it.hasNext();) {

			System.out.print(it.next() + ", ");
			System.out.flush();
		}

		System.out.println("\nSet traversal with for each");

		// Iterating through the Set
		// via for-each loop
		for (String value : hs) {
			// Printing all the values inside the object
			System.out.print(value + ", ");

		}

		System.out.println("\nSet traversal with forEach and lambda");
		hs.forEach((elem) -> System.out.print(elem + ", "));

	}

}
