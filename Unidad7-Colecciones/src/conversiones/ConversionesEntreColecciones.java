package conversiones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ConversionesEntreColecciones {

	private static final String nombres[] = { "ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO",
			"JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER", "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA",
			"MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA", "PAULA", "ELENA", "MARIA LUISA", "RAQUEL" };

	public static void main(String args[]) {

		List<String> arraylist1, arraylist2;
		List<Integer> arraylistKeys;
		LinkedList<String> linkList;
		Set<String> set1;
		TreeSet<String> set2;
		Set<Integer> setKeys;
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		TreeMap<String, String> map3 = new TreeMap<String, String>();

		arraylist1 = Arrays.asList(nombres);

		arraylist2 = new ArrayList<String>(arraylist1);

		arraylist2.removeAll(arraylist1);
		arraylist2.addAll(arraylist1);

		linkList = new LinkedList<String>(arraylist1);
		linkList = new LinkedList<String>();
		linkList.addAll(arraylist2);

		arraylist2 = new ArrayList<String>(linkList);
		arraylist2.removeAll(linkList);
		arraylist2.addAll(linkList);

		set1 = new HashSet<String>(arraylist1);

		set1.removeAll(arraylist1);
		set1.addAll(arraylist2);

		arraylist2.addAll(set1);

		arraylist2 = new ArrayList<String>(set1);

		set2 = new TreeSet<String>(arraylist2);
		set2.removeAll(arraylist2);

		set2.addAll(arraylist1);

		for (int i = 0; i < arraylist1.size(); i++) {

			map1.put(arraylist1.get(i), arraylist1.get(i));
		}

		for (int i = 0; i < arraylist2.size(); i++) {

			map2.put(i, arraylist1.get(i));
		}

		for (int i = 0; i < arraylist2.size(); i++) {

			map3.put(arraylist1.get(i), arraylist1.get(i));
		}

	
		for (String valor: set2) {

			map3.put(valor, valor);
			
		}
		
		arraylist1 = new ArrayList<String>(map1.values());
		arraylist1.removeAll(map1.values());
		arraylist1.addAll(map1.values());

		set1.addAll(map3.values());

		setKeys = map2.keySet();
		arraylistKeys = new ArrayList<Integer>(setKeys);

	}
}
