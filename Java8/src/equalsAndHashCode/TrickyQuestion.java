package equalsAndHashCode;

public class TrickyQuestion {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Divyang", true, "Ahmedabad");
		Employee e2 = new Employee(10, "Divyang", true, "Ahmedabad");
		
		System.out.println(e1.equals(e2));
	}
}
