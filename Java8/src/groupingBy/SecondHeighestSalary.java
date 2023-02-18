package groupingBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondHeighestSalary {
	
	public static Employee getSecondHighest(List<Employee> list){
		int index = 0;
		int n = list.size();
		double max1 = 0.0;
		double max2 = 0.0;
		
		for(int i=0; i<n; ++i){
			double salary = list.get(i).getSalary();
			if(salary > max1){
				max2 = max1;
				max1 = salary;
			} else if(salary > max2 && salary != max1){
				max2 = salary;
				index = i;
			}
		}
		
		return list.get(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("Divyang");
		e1.setSalary(25000.25);
		
		Employee e2 = new Employee();
		e2.setName("Komal");
		e2.setSalary(25000.25);
		
		Employee e3 = new Employee();
		e3.setName("Krutarh");
		e3.setSalary(15000.25);
		
		Employee e4 = new Employee();
		e4.setName("Kamlesh");
		e4.setSalary(18000.25);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		//Employee emp = list.stream()
		double secSalary = list.stream()
						   	.map(e -> e.getSalary())
						   	.distinct()
						   	.sorted(Comparator.reverseOrder())
						   	.skip(1)
						   	.findFirst()
						   	.orElse(null)
						   	.doubleValue();
		
		
				           //.sorted(Comparator.comparingDouble(Employee::getSalary))
				           //.
				           
				           //.filter((e1, e2) -> e1.getSalary() != e2.getSalary())
				          // .
				           //.get();
		
		System.out.println(secSalary);
		
		Set<Double> salarySet = new HashSet<>();
		Employee emp  = list.stream()
				            .filter(e -> salarySet.add(e.getSalary()))
				            .sorted(Comparator.comparingDouble(Employee::getSalary))
				            .skip(1)
				            .findFirst()
				            .get();
		
		System.out.println("Second : " + secSalary);
				           
		Employee e = getSecondHighest(list);
		System.out.println("Third : "+e.getSalary());
	}

}