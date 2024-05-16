package domainusers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Users implements Comparable {
	private int id;
	private String name;
	private String lastName;
	private Integer age;
	private Double hoursOfUsage;
	private int numConnections;

	public Users(int id, String name, String lastName, Integer age, Double hoursOfUsage, int numConnections) {

		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.hoursOfUsage = hoursOfUsage;
		this.numConnections = numConnections;
	}

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public Double getHoursOfUsage() {
		return hoursOfUsage;
	}

	public int getNumConnections() {
		return numConnections;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(Integer age) {
		age = age;
	}

	public void setHoursOfUsage(Double hoursOfUsage) {
		this.hoursOfUsage = hoursOfUsage;
	}

	public void setNumConnections(int numConnections) {
		this.numConnections = numConnections;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + ", hoursOfUsage="
				+ hoursOfUsage + ", numConnections=" + numConnections + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		Users u2 = (Users) o;
		return this.getNumConnections() > u2.getNumConnections() ? 1
				: (this.getNumConnections() == u2.getNumConnections() ? 0 : -1);
	}

}
