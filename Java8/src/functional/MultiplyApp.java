package functional;

public class MultiplyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiplyInterface m = (a, b) -> a*b;
		System.out.println(m.mul(10, 20));
	}

}
