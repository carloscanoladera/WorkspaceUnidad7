package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetOperationsExample {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();

		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		System.out.println("Set A: " + a);

		Set<Integer> b = new HashSet<Integer>();

		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0 }));

		System.out.println("Set B: " + b);

		if (a.isEmpty()) {

			System.out.println("Set A is empty");
		} else {

			System.out.println("Set A with elements, is not empty");
		}

		if (b.contains(1)) {

			System.out.println("Set B contains 1, or 1 belongs to set b");

		} else {

			System.out.println("Set B does not contain 1, or 1 does not belong to set b");
		}

		if (b.containsAll(Arrays.asList(1, 2))) {

			System.out.println("Set B contains 1,2, or 1 and 2  belong to set b");

		} else {

			System.out.println("Set B does not contain 1,2, or 1 and 2 does not belong to set b");
		}

		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of two sets ");
		System.out.println(union);

		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of two sets ");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference between two sets ");
		System.out.println(difference);

	}

}
