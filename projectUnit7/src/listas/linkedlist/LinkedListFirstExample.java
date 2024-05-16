package listas.linkedlist;

import java.util.LinkedList;

public class LinkedListFirstExample {

	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();

		linkedlist.add("F");
		linkedlist.add("B");
		linkedlist.add("D");
		linkedlist.add("E");
		linkedlist.add("C");
		linkedlist.add("E2");
		linkedlist.addLast("Z");
		linkedlist.addFirst("A");
		linkedlist.add(1, "A2");
		System.out.println("l: " + linkedlist);

		linkedlist.remove("F");
		linkedlist.remove(2);
		System.out.println("Contents after deleting: " + linkedlist);
		// Remove first and last elements.
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("ll after deleting first and last: " + linkedlist);

		if (linkedlist.offerLast("S")) {

			System.out.println("S inserction went right");
		}
		linkedlist.addLast("R");
		linkedlist.addFirst("M");

		if (linkedlist.offerFirst("X")) {

			System.out.println("X insertion went right");

		}

		System.out.println("ll after  addition " + linkedlist);

		System.out.println("First: " + linkedlist.getFirst() + " Last: " + linkedlist.getLast());

		System.out.println("Index of A2: " + linkedlist.indexOf("A2"));

		if (linkedlist.removeIf((s) -> s.startsWith("E"))) {

			System.out.println("If there E element exitst it gets deleted");
		}

	}

}
