package listas;

import java.util.ArrayList;
import java.util.List;

public class RecorridosArrayList {
	
	public static void main(String args[]) {	
	
	List<String> al = new ArrayList<String>();
	
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	
	System.out.println("tama�o inicial: " + al.size());
	
	System.out.println("Recorrido con for e indices");
	
	for (int i=0; i< al.size() ; i++ ) {
		
		System.out.print(al.get(i) + ",");
		
		System.out.flush();
		
	}
	
System.out.println("\nRecorrido con for, modo foreach");
	
	for (String s: al) {
		
		System.out.print(s + ",");
		
		System.out.flush();
		
	}
	
	System.out.println("\nRecorrido metodo forEach con lambda Consumer");
	
	al.forEach((s) -> {
			System.out.print(s + ",");
		
			System.out.flush();	
	
	});
	
	
	}

}
