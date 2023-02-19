package trickyoutput;

//duplicate method we should override in child class
public class ImplSolution implements I1, I2 {

	@Override
	public String check(){
		return "I1";
	}
}
