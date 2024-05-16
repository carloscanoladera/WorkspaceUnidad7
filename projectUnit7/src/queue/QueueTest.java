package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();

		queue1.add(3);
		queue1.add(1);
		queue1.add(2);
		queue1.add(4);
		queue1.add(1);

		print("The elements are queued in the queue as they arrived: ", queue1);

		System.out.println("Number of elementes in the Queue:" + queue1.size());
		System.out.println("We get an element out of the queue:" + queue1.poll());
		print("Queue after extracting the element with poll ", queue1);
		System.out.println("Number of elementes in the Queue:" + queue1.size());
		System.out.println("We read the first element of the queue without extracting it:" + queue1.peek());
		print("AFter reading with peek the element is not taken out ", queue1);
		System.out.println("Number of elementes in the Queue:" + queue1.size());

		System.out.println("We pull all the elements from the queue until:");
		while (!queue1.isEmpty())
			System.out.print(queue1.poll() + "-");
		System.out.println();

		print("We print queue elements as we empty it: ", queue1);

		Queue<Integer> queue2 = new LinkedList<Integer>();
		queue2.add(70);
		queue2.add(120);
		queue2.add(6);
		System.out.println("Printing the queue elements");
		for (Integer elemento : queue2)
			System.out.print(elemento + "-");
		System.out.println();
		System.out.println("Deleting the queue");
		queue2.clear();
		System.out.println("Number of integer elements in the queue:" + queue2.size());
	}

	public static void print(String text, Queue<Integer> queue) {
		System.out.println(text);
		queue.forEach((number) -> {
			System.out.print("| " + number + " |");
		});
		System.out.println("\n");
	}

}