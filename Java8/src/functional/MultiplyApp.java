package functional;

public class MultiplyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiplyInterface m = (a, b) -> a*b;
		System.out.println(m.mul(10, 20));
		
		System.out.println(MultiplyInterface.ans());
		
		MultiplyInterface mInterface = new MultiplyImpl();
		System.out.println(mInterface.div(20, 30));
		
		System.out.println(mInterface.min(18, 21));
		
	}

}
