package designPattern;

/*
Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Do not provide setter methods (methods that modify fields) for variables, so that it can not be set.
Make all mutable fields final so that their values can be assigned only once.
Initialize all the fields through a constructor doing the deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
If the instance fields include references to mutable objects, don’t allow those objects to be changed
Don’t provide methods that modify the mutable objects.
Don’t share references to the mutable objects. 
Never store references to external, mutable objects passed to the constructor. 
If necessary, create copies and store references to the copies. 
Similarly, create copies of our internal mutable objects when necessary to avoid returning the originals in our methods.
*/

final class Employee {
	   private final String empName;
	   private final int age;
	   private final Address address;
	   public Employee(String name, int age, Address address) {
	      super();
	      this.empName = name;
	      this.age = age;
	      this.address = address;
	   }
	   public String getEmpName() {
	      return empName;
	   }
	   public int getAge() {
	      return age;
	   }
	   /* public Address getAddress() {
	      return address;
	      }
	   */
	   public Address getAddress() throws CloneNotSupportedException {
	      return (Address) address.clone();
	   }
	}
//Address.java
class Address implements Cloneable {
public String addressType;
public String address;
public String city;
public Address(String addressType, String address, String city) {
   super();
   this.addressType = addressType;
   this.address = address;
   this.city = city;
}
public String getAddressType() {
   return addressType;
}
public void setAddressType(String addressType) {
    this.addressType = addressType;
 }
 public String getAddress() {
    return address;
 }
 public void setAddress(String address) {
    this.address = address;
 }
 public String getCity() {
    return city;
 }
 public void setCity(String city) {
    this.city = city;
 }
 public Object clone() throws CloneNotSupportedException {
    return super.clone();
 }

 @Override
 public String toString() {
    return "Address Type - "+addressType+", address - "+address+", city - "+city;
 }
}
public class ImmutableApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"));
	      Address address = emp.getAddress();
	      System.out.println(address);
	      address.setAddress("Hi-tech City");
	      address.setAddressType("Office");
	      address.setCity("Hyderabad");
	      System.out.println(emp.getAddress());

	}

}
