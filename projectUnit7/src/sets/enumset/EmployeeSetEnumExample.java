package sets.enumset;

import java.util.EnumSet;

import domain.EmployeeCategories;
import domain.EmployeeWithCategories;

public class EmployeeSetEnumExample {
	
    public static void main(String[] args) {
    	
    
    	EnumSet<EmployeeCategories> setCat =  EnumSet.of(EmployeeCategories.ASSOCIATED, EmployeeCategories.HIRED);
    	
    	EmployeeWithCategories emplCat = new EmployeeWithCategories(4,"Charles","Madsen", setCat );
    	
    	emplCat.addCategory(EmployeeCategories.PERMANENT);
    	emplCat.removeCategory(EmployeeCategories.HIRED);
    	
    	System.out.println("Employee created: " + emplCat);
    }

}
