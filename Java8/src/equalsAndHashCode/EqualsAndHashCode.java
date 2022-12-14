package equalsAndHashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	
	Integer id;
	String name;
	boolean isMale;
	String city;
	
	public Employee(Integer id, String name, boolean isMale, String city){
		this.id = id;
		this.name = name;
		this.isMale = isMale;
		this.city = city;
	}
	
	/*
	@Override
	public boolean equals(Object o){
		if(this == o)
			return true;
		if(o == null && this == null)
			return true;
		if(o == null || this == null)
			return false;
		Employee other = (Employee) o;
		//return this.id == other.id;
		return this.name == other.name;
	}
	
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime * 31 + id.hashCode();
		return prime;
	}
	*/

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", isMale=" + isMale + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}

public class EqualsAndHashCode {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(10, "Divyang", true, "Ahmedabad"));
		empSet.add(new Employee(10, "Komal", true, "Rajkot"));
		empSet.add(new Employee(30, "Komal", true, "Baroda"));
				
		System.out.println(empSet);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(50, "Divyang", true, "Ahmedabad"));
		empList.add(new Employee(60, "Divyang2", true, "Baroda"));
		empList.add(new Employee(70, "Divyang2", true, "Baroda"));
		
		System.out.println(empList);
		
		
		//Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(e -> e.getName()));
		System.out.println("map : " + empList.stream().collect(Collectors.groupingBy(Employee::getName)).toString());
		System.out.println("map : " + empList.stream().collect(Collectors.partitioningBy(e -> "Baroda".equals(e.getCity()))));
		//System.out.println("map : " + empList.stream().collect(Collectors.partitioningBy(e -> "Baroda".equals(Employee::getCity))));
		System.out.println("Check : " + empList.stream().collect(Collectors.groupingBy(Employee::getName)).values());
		List<List<Employee>> empList5 = (List<List<Employee>>) empList.stream().collect(Collectors.groupingBy(Employee::getName)).values();
		
		
		//System.out.println("ans : " + empList.stream().filter(e -> "Baroda".equals(e.city)).filter(distinctByKey(Employee::getName)).collect(Collectors.toList()));
		/*
		Person p1 = new Person(21, "Divyang", "dj@gmail.com");
		Person p2 = new Person(21, "Divyang", "dj@gmail.com");
		Person p3 = new Person(21, "Divyang", "dj@gmail.com");
		*/
		//List<Person> personList = new ArrayList<>();
		
	
	}

}
