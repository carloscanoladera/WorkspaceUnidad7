package queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	static ArrayDeque<Integer> deque;

	public static void main(String[] args) {
		// empty deque array
		deque = new ArrayDeque<>();

		//  add() insert elements
		deque.add(45);
		deque.add(27);
		deque.add(98);
		deque.add(19);
		print("ArrayDeque");

		deque.addFirst(99);
		print("99 element inserted");

		deque.addLast(77);
		print("77 element added at the end");

		// get queue first element
		int a = deque.getFirst();
		// get queue last element
		int b = deque.getLast();
		print("First element [" + a + "] .:. Last element [" + b + "]");

		// remove first and last element
		deque.removeFirst();
		deque.removeLast();
		print("remove first and last element");

		// get first element of the queue
		a = deque.peekFirst();
		// get last element of the queue
		b = deque.peekLast();
		print("First element [" + a + "] Last element [" + b + "]");

		// elimina y obtiene el primer elemento de la cola
		a = deque.pop();
		print("remove first element [" + a + "]");

		deque.push(69);
		print("add element [" + 69 + "]");

		deque.removeLastOccurrence(98);
		print("remove element [" + 98 + "]");

		System.out.println("queue size " + deque.size());
	}

	public static void print(String text) {
		System.out.println(text);
		deque.forEach((number) -> {
			System.out.print("| " + number + " |");
		});
		System.out.println("\n");
	}

}