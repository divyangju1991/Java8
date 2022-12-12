package functional;

@FunctionalInterface
public interface MultiplyInterface {
	
	public int mul(int a, int b);
	
	public default int div(int a, int b){
		return a/b;
	}
	
	public default int min(int a, int b){
		return a - b;
	}
	
	public static int ans(){
		return 0;
	}
	
	public static int ans2(){
		return 100;
	}
	
	//public int check(int a, int b);
}
