package maps;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

import modelo.Employee;

public class TreeMapDemo {

	public static NavigableMap<Integer, Employee> devuelveMapEmpl() {
		TreeMap<Integer, Employee> empleados = new TreeMap<Integer, Employee>();

		empleados.put(0, new Employee(0, "Pepe", "Lopez"));
		empleados.put(1, new Employee(1, "Raul", "Fernandez"));
		empleados.put(2, new Employee(2, "Luis", "Suñer"));
		empleados.put(3, new Employee(3, "Ivan", "Garcia"));
		empleados.put(4, new Employee(4, "Rodolfo", "Langostino"));
		empleados.put(5, new Employee(5, "Jeru", "Abad"));
		empleados.put(6, new Employee(6, "Joshua", "Edelman"));
		empleados.put(7, new Employee(7, "Rob", "Camavinga"));

		return empleados;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer,Employee> empleadosMap = (TreeMap<Integer, Employee>) devuelveMapEmpl();
		NavigableMap<Integer, Employee> empleadosOrdenIdInversoNavigable;
		
		System.out.println("Empleado orden natural" + empleadosMap);
		
		TreeMap<Integer, Employee> empleadosOrdenIdInverso 
		= new TreeMap<Integer, Employee>((k1,k2) -> -1*k1.compareTo(k2));
		
		empleadosOrdenIdInverso.putAll(empleadosMap);
		
		System.out.println("Empleado orden inverso con Comparator" + empleadosOrdenIdInverso);
		
		
		empleadosOrdenIdInversoNavigable = empleadosMap.descendingMap();
		
		System.out.println("Empleado orden inverso con método y navigable" + empleadosOrdenIdInverso);
		
		
		NavigableSet<Integer> navSet = empleadosMap.descendingKeySet();
		
		System.out.println("Set de claves en inverso"); 
		
		navSet.forEach((k) -> { System.out.print( k + ", ") ; System.out.flush(); });
		
		
		System.out.println("\nCeiling de entrada de clave -1: " + empleadosMap.ceilingEntry(-1));
		
		System.out.println("La clave devuelta para el floor de clave 9: " + empleadosMap.floorKey(9));
		
		System.out.println("Primera Entrada " + empleadosMap.firstEntry());
		
		System.out.println("HeadMap menores de 3 " + empleadosMap.headMap(3));
		
		System.out.println("SubMap mayor o igual que 4, menor o igual que 6 " + empleadosMap.subMap(4, true, 6, true));
		
	}

}
