package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size: " +
				al.size());
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		
		
		Iterator<String> it = al.iterator();
		
		String elem="";
		while (it.hasNext()) {
			
			elem= it.next();
			
			if (elem=="D")
				it.remove();
			
			System.out.print(elem+ " ,");
			System.out.flush();
				
			
		}
		
		System.out.println("\nWe have traversed the arrayList and remove all the 'D' elements " + al );

		
		System.out.println("Traversals in both directions with ListIterator");
		
		ListIterator<String> lit = al.listIterator();
		
		String elem2="";
		int index=0;
		while (lit.hasNext()) {
			
			index= lit.nextIndex();
			elem2= lit.next();
			
			
			System.out.print(elem2+ " ," + index + " ;");
			System.out.flush();
				
			
		}
		
		System.out.println();
	
		while (lit.hasPrevious()) {
			index=lit.previousIndex();
			elem2= lit.previous();
			
			
			System.out.print(elem2+ " ," + index + " ;");
			System.out.flush();
				
			
		}
		
		
	}

}
