package flatMap;

import java.util.*;
import java.util.stream.Collectors;

class Department{
    private int id;
    
    public Department(int id){
        this.id = id;
    }
}

class Employee {
    private int id;
    private Department department;
    private String name;
    
    public Employee(int id, Department department, String name){
        this.id = id;
        this.department = department;
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setDepartment(Department department){
        this.department = department;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Department getDepartment(){
        return department;
    }
    
    @Override
    public String toString(){
        return "{id : "+id+", name : "+name+"}";
    }
    
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Employee e1 = new Employee(1, new Department(1), "Divyang");
        Employee e2 = new Employee(2, new Department(2), "Krutarth");
        Employee e3 = new Employee(3, new Department(1), "Komal");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("empList : "+ empList);
        
        List<Employee> empList2 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().flatMap(entry -> entry.getValue().stream()).collect(Collectors.toList());
        System.out.println("empList2 : "+ empList2);
        
        Map<Department, List<Employee>> empList3 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("empList2 : "+ empList3);
    }
}