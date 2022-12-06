package stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import groupingBy.Employee;

public class FIndDuplicateNamesAndUniqueNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setAge(30);
		emp1.setName("Divyang");
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setAge(40);
		emp2.setName("Komal");
		empList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setAge(30);
		emp3.setName("Divyang");
		empList.add(emp3);
		
		List<String> names = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		Set<String> uniqueNames = new HashSet<>();
		List<String> duplicateNames = names.stream().filter(name -> !uniqueNames.add(name)).collect(Collectors.toList());
		System.out.println("uniqueNames : "+uniqueNames);
		
		System.out.println("duplicateNames : "+duplicateNames);
	}

}
