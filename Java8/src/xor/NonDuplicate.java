package xor;

import java.util.Arrays;

public class NonDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,2,3,3,4,4,5,5,7,7,9};
		final int[] result = {0};
		Arrays.stream(arr)
		      .forEach(e -> {
		    	  result[0] ^= e;
		      });
		System.out.println(result[0]);
		
		
		int[] arr2 = {1,1,2,2,3,4,4,5,5,7,7,9,9};
		final int[] result2 = {0};
		Arrays.stream(arr2)
		      .forEach(e -> {
		    	  result2[0] ^= e;
		      });
		System.out.println(result2[0]);
	}

}
