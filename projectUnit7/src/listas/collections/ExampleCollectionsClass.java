package listas.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExampleCollectionsClass {

	public static void main(String args[]) {
		// Creating a list
		// Declaring object of string type
		List<String> items = new ArrayList<>();

		String array[] = { "Fruits", "Comics", "Icecream", "Notebook", "Bicycle", "Pencils" };
		List<String> items2 = Arrays.asList(array);
		List<Integer> numbers = Arrays.asList(0, 5, 3, 2, 4, 2, 8, 10);

		// adding elements
		items.add("Screws");
		items.add("Nuts");

		// adding more elements at once
		Collections.addAll(items, "Fruits", "Vegetables", "Meat");

		System.out.println("Colection: " + items.toString());

		// Sorting according to reverse ordering
		Collections.sort(items, Collections.reverseOrder());

		System.out.println("Colection reverse sort: " + items.toString());

		// sorting with the default comparable String
		// using sort()
		Collections.sort(items);

		Collections.sort(items);

		System.out.println("Sorted item collection : " + items);

		Collections.sort(items2, (s1, s2) -> (s1.compareTo(s2) * -1));

		System.out.println("Sorted collection: " + items.toString());

		System.out.println("item2 reverse order with lambdas: " + items2);

		System.out.println("number collection unsorted: " + numbers);

		Collections.reverse(numbers);

		System.out.println("Numbers collection inverse order: " + numbers);

		System.out.println("To perform the bynary search the collection must be sorted first");

		// BinarySearch items
		System.out.println("The index for fruit is " + Collections.binarySearch(items, "Fruits"));

		// BinarySearch
		System.out.println("The index for Nuts is  " + Collections.binarySearch(items, "Nuts"));

		System.out.println("Items e items2 do not have elements in common: " + Collections.disjoint(items, items2));

		System.out.println("Items2 before copying from items: " + items2.toString());

		Collections.copy(items2, items);

		System.out.println("Items2 after copying from items: " + items2.toString());

		System.out.println("Max element from items:" + Collections.max(items));

		System.out.println("Min element from the number collection:" + Collections.min(numbers));

		System.out.println("Max element from items2 with lambda comparator:"
				+ Collections.max(items, (item1, item2) -> item1.compareTo(item2)));

		System.out.println("Numbers " + numbers);

		System.out.println(
				"sublist indexes 2,3 for numbers: " + Collections.indexOfSubList(numbers, Arrays.asList(2, 3)));

		System.out.println("Numbers before swapping elements: " + numbers);

		Collections.swap(numbers, 1, 3);

		System.out.println("Numbers collection after swapping elements at  1 and 3 index: " + numbers);

		System.out.println("Number 2 frequency in the numbers collections: " + Collections.frequency(numbers, 2));

		Collections.replaceAll(items, "Fruits", "Pizzas");

		System.out.println("Replacing Fruits for Pizzas: " + items);

	}

}
