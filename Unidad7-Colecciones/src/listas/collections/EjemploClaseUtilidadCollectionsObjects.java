package listas.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modelo.ComparatorEmpleadoNombre;
import modelo.Employee;

public class EjemploClaseUtilidadCollectionsObjects  {
	
	
	public static List<Employee> devuelveListEmpl() {
		ArrayList<Employee> empleados = new ArrayList<Employee>();
		
		empleados.add(new Employee(0,"Pepe" ,"Lopez"));
		empleados.add( new Employee(1,"Raul" ,"Fernandez"));
		empleados.add(new Employee(2,"Luis" ,"Suñer"));
		empleados.add(new Employee(3,"Ivan" ,"Garcia"));
		empleados.add(new Employee(4,"Rodolfo" ,"Langostino"));
		empleados.add(new Employee(5,"Jeru" ,"Abad"));
		empleados.add(new Employee(6,"Joshua" ,"Edelman"));
		empleados.add(new Employee(7,"Rob" ,"Camavinga"));
		
		return empleados;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> listaEmpl = devuelveListEmpl();
		
		System.out.println("Colección sin ordenar: " + listaEmpl);
		
		
		//Ordenar por el comparator de empleado
		Collections.sort(listaEmpl);
		System.out.println("Colección ordenada por el comparator de la clase Empleado, Aoellidos nombre:\n " + listaEmpl);
		
		//Ordenar por el comparator pasado como parametro
		
		Collections.sort(listaEmpl, new ComparatorEmpleadoNombre());
		
		System.out.println("Colección ordenada por el comparator ComparatorEmpleadoNombre, ordenado por nombre:\n " + listaEmpl);
		

		//Ordenar por el comparator pasado como parametro lambda
		
		
		Collections.sort(listaEmpl, (e1,e2) -> e1.getId()>e2.getId()?1:e1.getId()==e2.getId()?0:-1);
		
		
		System.out.println("Colección ordenada por el comparator lambda, ordenado por id:\n " + listaEmpl);
	
		
		//Ordenar paralelo usando nucleos de procesador
		
	
		System.out.println("Reemplazando");
		
		
		
		
		Employee empOrig = listaEmpl.get(4);
		Employee empReemplazar = new Employee(7,"Rodolfo" ,"Langostinoss");
		
		Collections.replaceAll(listaEmpl, empOrig, empReemplazar);
		
		
		System.out.println("Coleccion empleados despues de reemplazar:\n"+  listaEmpl);
		
	    System.out.println("Máximo elemento de items:" + Collections.max(listaEmpl));
	    
	    System.out.println("Mínimo elemento de items con Comparator de id:" 
	    + Collections.min(listaEmpl, (e1,e2) -> e1.getId()>e2.getId()?1:e1.getId()==e2.getId()?0:-1));
		
	}



}
