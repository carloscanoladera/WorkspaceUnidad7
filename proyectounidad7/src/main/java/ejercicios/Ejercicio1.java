package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista = new ArrayList<Integer>(30);
		
		Random rand= new Random();
		
		for (int i=0; i<20; i++) {
			
			lista.add(rand.nextInt(1, 21));
		}
		System.out.println();	
		lista.forEach((s)-> {
			
			System.out.print(s+" ,");
			System.out.flush();
		
		
	}  );
		
		lista.sort((n1,n2)->(n1-n2)*-1);
		System.out.println();
		lista.forEach((s)-> {
	
				System.out.print(s+" ,");
				System.out.flush();
			
			
		}  );
		
		
		Integer i = 6;
		
		Number d= 4;
		


	}

}
