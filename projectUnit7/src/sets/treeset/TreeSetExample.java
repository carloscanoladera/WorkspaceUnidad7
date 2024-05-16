package sets.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

class TreeSetExample {
	public static void main(String args[]) {
// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>();
// Add elements to the tree set.

		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		ts.add("H");
		ts.add("G");
		ts.add("");
		System.out.println(ts);

		// SortedSet

		String elCeiling = ts.ceiling("C");

		System.out.println("The ceiling of C is " + elCeiling);

		String elfloor = ts.floor("H");

		System.out.println("The floor of H is " + elfloor);

		SortedSet<String> head = ts.headSet("E");

		System.out.println("Subset with elements that are lower than 'E', or HEAD" + head);

		TreeSet<String> tail = (TreeSet<String>) ts.tailSet("D");

		System.out.println("Subset with elements that are higher than 'D', or TAIL" + tail);

		// Navigable Set

		String elPrimero = ts.pollFirst();

		System.out.println("After the pollFirst op the first element , empty String, is removed" + elPrimero
				+ " . The rest of the Tree remains like that " + ts);

		String elUltimo = ts.pollLast();

		System.out.println("After the pollLast op the last element is removed " + elUltimo + " The new Tree: " + ts);

		String elHigher = ts.higher("C");

		System.out.println("The element Higher of C is " + elHigher);

		String elLower = ts.lower("H");

		System.out.println("The eLement lower than H is  " + elLower);

		NavigableSet<String> headNav = ts.headSet("E", true);

		System.out.println("Subset with elements lower than 'E', or HEAD" + head);

		TreeSet<String> tailNav = (TreeSet<String>) ts.tailSet("D", true);

		System.out.println("Subset with elements higher than 'D', or TAIL" + tail);

		NavigableSet<String> subset = ts.subSet("B", true, "G", false);

		System.out.println("Subset with elements higher than 'B', 'B' included, and lower than 'G'" + subset);

	}
}
