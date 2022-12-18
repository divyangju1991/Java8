package stream;

public final class Immutable {
	
	private final int id;
	private final Person person;
	
	public Immutable(int id, Person person){
		this.id = id;
		this.person = (Person) person.clone();
	}
	

	public int getId() {
		return id;
	}

	public Person getPerson() {
		return (Person) person.clone();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
