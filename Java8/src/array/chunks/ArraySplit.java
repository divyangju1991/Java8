package array.chunks;

import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] original = {1,2,3,4,5};
		//int chunk = 2; // chunk size to divide
		for(int chunk =1; chunk<=original.length; ++chunk){
			for(int i=0;i<original.length;i+=chunk){
			    System.out.println(Arrays.toString(Arrays.copyOfRange(original, i, Math.min(original.length,i+chunk))));
			} 
		}
		
		 
	}

}
