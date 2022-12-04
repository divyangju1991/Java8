package groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Create a map with key as Age and value as list of employees in that age group
**/
public class ListOfEmployeeByAge {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setAge(30);
		emp1.setName("Divyang");
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setAge(30);
		emp2.setName("Komal");
		empList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setAge(10);
		emp3.setName("Krutarth");
		empList.add(emp3);
		
		Map<Integer, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
		System.out.println(empList.toString());
		empMap.entrySet().forEach(entry ->{
			System.out.println(entry.getKey() + ", val : "+entry.getValue());	
		});
				
		
	}

}
