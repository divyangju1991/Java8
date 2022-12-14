package stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import groupingBy.Employee;

public class MinMax {

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
		
		
		IntSummaryStatistics ageSummary = empList.stream().mapToInt(emp -> emp.getAge()).summaryStatistics();
		System.out.println(ageSummary.getMax());
		System.out.println(ageSummary.getMin());
		
		empList.stream().distinct().forEach(emp -> {
			System.out.println(emp);
		});
		
		List<Integer> ages = empList.stream().map(emp -> emp.getAge()).collect(Collectors.toList());
		System.out.println(ages);
		
		List<Integer> ans = ages.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(ans);
		
		
		List<String> empNames = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		String allNames = empNames.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(","));
		
		System.out.println(allNames);
	}

}
