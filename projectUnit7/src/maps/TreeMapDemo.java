package maps;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

import domain.Employee;

public class TreeMapDemo {

	public static NavigableMap<Integer, Employee> returnMapEmpl() {
		TreeMap<Integer, Employee> employees = new TreeMap<Integer, Employee>();

		employees.put(0, new Employee(0, "Pepe", "Lopez"));
		employees.put(1, new Employee(1, "Raul", "Fernandez"));
		employees.put(2, new Employee(2, "Luis", "Suarez"));
		employees.put(3, new Employee(3, "Ivan", "Garcia"));
		employees.put(4, new Employee(4, "Rodolfo", "Langostino"));
		employees.put(5, new Employee(5, "Jeru", "Abad"));
		employees.put(6, new Employee(6, "Joshua", "Edelman"));
		employees.put(7, new Employee(7, "Rob", "Camavinga"));

		return employees;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, Employee> employeeMap = (TreeMap<Integer, Employee>) returnMapEmpl();
		NavigableMap<Integer, Employee> employeeSortedIdReverseNavigable;

		System.out.println("Employees natural order" + employeeMap);

		TreeMap<Integer, Employee> employeeSortedIdReverse = new TreeMap<Integer, Employee>(
				(k1, k2) -> -1 * k1.compareTo(k2));

		employeeSortedIdReverse.putAll(employeeMap);

		System.out.println("Employees reverse order with Comparator" + employeeSortedIdReverse);

		employeeSortedIdReverseNavigable = employeeMap.descendingMap();

		System.out.println("Employees reverse order with Method and navigable" + employeeSortedIdReverse);

		NavigableSet<Integer> navSet = employeeMap.descendingKeySet();

		System.out.println("Set of keys on reverse Map");

		navSet.forEach((k) -> {
			System.out.print(k + ", ");
			System.out.flush();
		});

		System.out.println("\nCeiling of the entry with key -1: " + employeeMap.ceilingEntry(-1));

		System.out.println("The returned key for the entry floor to 9: " + employeeMap.floorKey(9));

		System.out.println("First entry " + employeeMap.firstEntry());

		System.out.println("HeadMap lower than 3 " + employeeMap.headMap(3));

		System.out.println(
				"SubMap higher or equal than 4, lower or equal than 6 " + employeeMap.subMap(4, true, 6, true));

	}

}
