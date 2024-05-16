package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTraversals {
	
	public static void main(String args[]) {	
	
	List<String> al = new ArrayList<String>();
	
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	
	System.out.println("Initial size: " + al.size());
	
	System.out.println("Traversal with the for-loop and indexes");
	
	for (int i=0; i< al.size() ; i++ ) {
		
		System.out.print(al.get(i) + ",");
		
		System.out.flush();
		
	}
	
System.out.println("\nTraversal with for each");
	
	for (String s: al) {
		
		System.out.print(s + ",");
		
		System.out.flush();
		
	}
	
	System.out.println("\nForEach traversal with lambda Consumer");
	
	al.forEach((s) -> {
			System.out.print(s + ",");
		
			System.out.flush();	
	
	});
	
	
	}

}
