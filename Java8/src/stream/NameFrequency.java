package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import groupingBy.Employee;

public class NameFrequency {

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
		
		/*
		List<String> empNames = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		Map<String, Long> map2 = empNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<String> names2 = map2.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
		System.out.println(names2);
		
		List<String> empNames2 = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		Set<String> names4 = empNames2.stream().filter(name -> Collections.frequency(empNames2, name) > 1).collect(Collectors.toSet());
		System.out.println("names4" + names4);
		*/
		
		List<String> empNames = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		Set<String> names5 = empNames.stream().filter(name -> Collections.frequency(empNames, name) > 1).collect(Collectors.toSet());
		System.out.println(names5);
		
		
		

	}

}
