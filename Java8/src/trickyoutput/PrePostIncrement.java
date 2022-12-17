package trickyoutput;

public class PrePostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int meal = 5;
		 int tip = 2;
		 int total = meal + (meal>6 ? tip++ : tip--);
		 System.out.print(total);
	}

}
