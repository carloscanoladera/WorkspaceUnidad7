package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColeccionesMetods {
	// PARA VALIENTES
	public static <T extends Number> List<T> generaArrayListT(int n, T max) {
		
		
			int maxInt = max.intValue();

		if (max instanceof Integer) {

		}
		
		// la otra posibilidad 
		
		if (max.getClass().equals(Integer.class)) {
			
			
		}
		


	}

	public static List<Integer> generaArrayList(int n, int max) {

		boolean esEntero = true;
		int capacity = (int) (n * (1.5));
		ArrayList<Integer> arrayList = new ArrayList<Integer>(capacity);
		Random rand = new Random();

		for (int i = 0; i < n; i++) {

			if (esEntero) {

				arrayList.add(rand.nextInt(max + 1));

			}

		}
		
		return arrayList;

	}

}
