package domain;

import java.util.EnumSet;

public class EmployeeWithCategories extends Employee {

	public EnumSet<EmployeeCategories> categories = EnumSet.noneOf(EmployeeCategories.class);

	public EmployeeWithCategories() {

	}

	public EmployeeWithCategories(int id, String name, String lastName) {
		super(id, name, lastName);

	}

	public EmployeeWithCategories(int id, String name, String lastName, EnumSet<EmployeeCategories> categories) {

		super(id, name, lastName);

		this.categories = categories;
	}

	public EnumSet<EmployeeCategories> getCategories() {
		return categories;
	}

	public void setCategories(EnumSet<EmployeeCategories> categories) {
		this.categories = categories;
	}

	public void addCategory(EmployeeCategories enumCat) {

		categories.add(enumCat);

	}

	public void removeCategory(EmployeeCategories enumCat) {

		categories.remove(enumCat);
	}

	@Override
	public String toString() {
		return "EmployeeWithCategories [categories=" + categories + ", id=" + id + ", name=" + name + ", lastName="
				+ lastName + "]";
	}

}
