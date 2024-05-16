package domain;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	String lastName;

	public Employee() {

	}

	public Employee(int id, String name, String lastName) {

		this.id = id;
		this.name = name;
		this.lastName = lastName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nombre) {
		this.name = nombre;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(lastName, other.lastName) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		String nombreCompEmp1 = this.getLastName() + " " + this.getName();
		String nombreCompEmp2 = o.getLastName() + " " + o.getName();

		return nombreCompEmp1.compareTo(nombreCompEmp2);

	}

}