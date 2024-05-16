package lists;

import java.util.*;

class ArrayListExample1 {
	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>(20);

		al.ensureCapacity(30);

		System.out.println("initial arraylist al size:  " + al.size());

		al.trimToSize();

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Size after adding elements: " + al.size());

		System.out.println("arraylist content " + al);

		al.remove("F");
		al.remove(2);
		System.out.println("arraylist size after removing: " + al.size());

		System.out.println("arraylist content after removing: " + al);
		al.add("As");
		if (al.removeIf((s) -> s.startsWith("A"))) {

			System.out.println("Only remove string elements that start with A");
		}

		ArrayList<String> al2 = new ArrayList(al);

		al2.add("X");
		System.out.println("al appended to al2: " + al2);

		if (al2.contains("X")) {

			System.out.println("al2 contains X");

		}

		ArrayList<String> al3 = new ArrayList();

		al3.addAll(al2);

		al3.add("Y");

		System.out.println("contents of array al3, after copying al2 and adding Y " + al3);

		System.out.println("entry at position 3 to in al3: " + al3.get(2));
		al3.set(2, "VV");
		System.out.println("value of position 2 after being modified: " + al3.get(2));
		System.out.println("Index value for element X: " + al3.indexOf("X"));

		al3.clear();

		System.out.println("the clear method empties the arraylist al3" + al3);

	}

}