package sets.enumset;

import java.util.EnumSet;

enum Languages {
	JAVA, PYTHON, C, LISP, CSHARP, JAVASCRIPT
};

// Main class
// EnumSetExample
public class ProgrammingLanguages {

	// Main driver method
	public static void main(String[] args) {

		// Creating a set
		EnumSet<Languages> set1, set2, set3, set4, set5;

		// Adding elements
		set1 = EnumSet.of(Languages.JAVA, Languages.PYTHON, Languages.CSHARP);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(Languages.class);
		set4 = EnumSet.range(Languages.LISP, Languages.JAVASCRIPT);
		set5 = EnumSet.copyOf(set3);

		// Printing corresponding elements in Sets
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);
		System.out.println("Set 5: " + set5);

		System.out.println("Enumerate s1");

		for (Languages sEl : set1) {

			System.out.print(sEl + ",");
			System.out.flush();

		}

		set1.add(Languages.LISP);

		set2.remove(Languages.LISP);

	}

}