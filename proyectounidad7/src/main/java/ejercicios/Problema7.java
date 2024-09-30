package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Problema7 {
	
	private static final String apellidos[] = { "García", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez",
			"Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Ruiz", "Hernandez", "Diaz", "Moreno", "Muñoz", "Alvarez",
			"Romero", "Alonso", "Gutierrez", "Navarro", "Torres", "Dominguez", "Vazquez", "Ramos", "Gil", "Ramirez",
			"Serrano", "Blanco", "Molina", "Morales", "Suarez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
			"Marin", "Sanz", "Nuñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos" };



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<String,Integer>(apellidos.length + ((int) (apellidos.length*0.75)));


		for(String apellido: apellidos) {
			
			map.put(apellido,  apellido.hashCode());
		}
		
	 Arrays.stream(apellidos).forEach((nombre)-> map.put(nombre,  nombre.hashCode()));
	 
	 
	 for (Map.Entry<String, Integer> entrada:  map.entrySet()) {
		 
		 System.out.println("Clave: " + entrada.getKey() + " ; Valor: " + entrada.getValue() );
	 }
	 
	 //Ordenar transformando a TreeSet
	 Set<Map.Entry<String, Integer>> entradas = map.entrySet();
	 
	 System.out.println("\nentradas sin ordenar");
	 
	 System.out.println(entradas);
	 
	 TreeSet <Map.Entry<String, Integer>> entradasOrdenadas = 
			 new  TreeSet <Map.Entry<String, Integer>>((entrada1,entrada2)-> entrada1.getValue()- entrada2.getValue());
	 
		
	entradasOrdenadas.addAll(entradas);
	
	 System.out.println("\nentradas  ordenadas por valor");
	 System.out.println(entradasOrdenadas);
	
	// Ordenar transformado a Lista
	
	ArrayList<Map.Entry<String, Integer>> listaOrdenadaDeEntradas= new ArrayList<Map.Entry<String, Integer>> (entradas);
	
	listaOrdenadaDeEntradas.sort((entrada1,entrada2)-> entrada1.getValue()- entrada2.getValue());
	
	 System.out.println("\nentradas  ordenadas por valor");
	 System.out.println(listaOrdenadaDeEntradas);
	
	// Ordenando por clave con la clase Collections
	Collections.sort(listaOrdenadaDeEntradas, (entrada1,entrada2)-> entrada1.getKey().compareTo(entrada2.getKey()));
	 System.out.println("\nentradas  ordenadas por clave\n");
	 System.out.println(listaOrdenadaDeEntradas);
	 
	}

}
