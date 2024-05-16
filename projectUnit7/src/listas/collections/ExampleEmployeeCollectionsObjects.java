package listas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.ComparatorEmployeeName;
import domain.Employee;

public class ExampleEmployeeCollectionsObjects {

	public static List<Employee> returnListEmpl() {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(0, "Pepe", "Lopez"));
		employees.add(new Employee(1, "Raul", "Fernandez"));
		employees.add(new Employee(2, "Luis", "Vaughan"));
		employees.add(new Employee(3, "Ivan", "Garcia"));
		employees.add(new Employee(4, "Rodolfo", "Langostino"));
		employees.add(new Employee(5, "Jeru", "Abad"));
		employees.add(new Employee(6, "Joshua", "Edelman"));
		employees.add(new Employee(7, "Rob", "Camavinga"));

		return employees;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> listEmpl = returnListEmpl();

		System.out.println("Unsorted Colection: " + listEmpl);

		// Sorted by the comparable by default
		Collections.sort(listEmpl);
		System.out.println("Sorted Colection by the Employee Comparable:\n " + listEmpl);

		// Sorted by the comparator passed as a parameter

		Collections.sort(listEmpl, new ComparatorEmployeeName());

		System.out.println("Colection sorter by the ComparatorEmployeeName, by name:\n " + listEmpl);

		// Sorted by id with a lambda

		Collections.sort(listEmpl, (e1, e2) -> e1.getId() > e2.getId() ? 1 : e1.getId() == e2.getId() ? 0 : -1);

		System.out.println("Collection sorted by a lambda, sorted by id:\n " + listEmpl);

		System.out.println("Replacing");

		Employee empOrig = listEmpl.get(4);
		Employee empReemplazar = new Employee(7, "Rodolfo", "Langostinoss");

		Collections.replaceAll(listEmpl, empOrig, empReemplazar);

		System.out.println("Collection after replacing:\n" + listEmpl);

		System.out.println("Max elements in the collection:" + Collections.max(listEmpl));

		System.out.println("Min Element ordered by id:" + Collections.min(listEmpl,
				(e1, e2) -> e1.getId() > e2.getId() ? 1 : e1.getId() == e2.getId() ? 0 : -1));

	}

}
