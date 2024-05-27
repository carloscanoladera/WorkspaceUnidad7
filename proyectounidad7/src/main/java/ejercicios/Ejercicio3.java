package ejercicios;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.StringTokenizer;

public class Ejercicio3 {

	public static String string = "'Aaran',  'Aaren ',  'Aarez ',  'Aarman',  'Aaron',  'Aaron-James ',  'Aarron',  'Aaryan',  'Aaryn',  'Aayan',  'Aazaan',  'Abaan',  'Abbas',  'Abdallah ',  'Abdalroof',  'Abdihakim',  'Abdirahman',  'Abdisalam',  'Abdul',  'Abdul-Aziz ',  'Abdulbasir ',  'Abdulkadir ',  'Abdulkarem ',  'Abdulkhader ',  'Abdullah ',  'Abdul-Majeed ',  'Abdulmalik ',  'Abdul-Rehman ',  'Abdur ',  'Abdurraheem ',  'Abdur-Rahman ',  'Abdur-Rehmaan ',  'Abel ',  'Abhinav ',  'Abhisumant ',  'Abid ',  'Abir ',  'Abraham ',  'Abu ',  'Abubakar ',  'Ace ',  'Adain ',  'Adam ',  'Adam-James ',  'Addison '";
	public static String COMA = ",";
	public static String COMILLA = "'";
	public static String EMPTY = "";

	public static void main(String[] args) {
		
		

		StringTokenizer palabras = new StringTokenizer(string, COMA);

		int capacity = palabras.countTokens() + Double.valueOf(palabras.countTokens() * 0.75).intValue();

		ArrayList<String> arrayPalabras = new ArrayList<String>(capacity);

		while (palabras.hasMoreTokens()) {
			
			arrayPalabras.add(palabras.nextToken().replace(COMILLA, EMPTY).trim());

		}
		System.out.println();
		System.out.println("*****************************");
		System.out.println("Pasando método");
		System.out.println("*****************************");
		System.out.println();
		arrayPalabras.forEach( System.out::println);
		System.out.println();
		System.out.println("*****************************");
		System.out.println("Pasando lambda");		
		System.out.println("*****************************");
		System.out.println();
		arrayPalabras.forEach( s-> System.out.println(s));
		
		// Insertar
		
		arrayPalabras.add(20,"Hal");
		
	
		
		// Modificar
		arrayPalabras.set(20, "Hal1");
		
		
		// Leer de indice
		
		System.out.println("Leer de indice 20" + arrayPalabras.get(20));
		
		
		// Mostrar inverso
		
		ListIterator listIt = arrayPalabras.listIterator();
		
		while (listIt.hasPrevious()) {
			
			
			System.out.println(listIt.previous());
		}

	}

}
