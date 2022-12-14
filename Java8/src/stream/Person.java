package stream;

public class Person implements Cloneable {
	
	public Person(int id, int age, String name, String email) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
	}


	private int id;
	private int age; 
    private String name; 
    private String email; 
    
    

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	 public Object clone()
	    {
		 try {
			 return super.clone();
		 } catch(CloneNotSupportedException e) {
			 return this;
		 }
	        
	    }

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
