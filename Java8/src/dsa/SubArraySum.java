package dsa;

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySum {
	
public static int[] subarraySum(int[] arr, long sum) {
        
        // Create an empty HashMap where key = prefix sum ,value = index of prefix sum.
        HashMap<Long, Integer> map = new HashMap(); 
      
        // Stores the subarray sum.
        long currentSum = 0; 

        // Store the size of array.
        int n = arr.length;
      
        // Traverse the array.
        for (int i = 0; i < n; i++) {

            // Add current element to currentSum.
            currentSum = currentSum + arr[i]; 
      
			/* 
				If currentSum is equal to target sum 
				we found a subarray starting from index 0 
				and ending at index i.
			*/
            if (currentSum == sum) { 
                return new int[]{0 , i}; 
            } 
      
            // If currentSum - sum already exists in map, we have found a subarray with target sum. 
            if (map.containsKey(currentSum - sum)) { 
                //return new int[]{map.get(currentSum - sum) + 1 , i};
            	int idx1 = map.get(currentSum - sum) + 1;
            	int idx2 = i;
            	if(idx1 != idx2){
            		return new int[]{idx1, idx2};
            	}
            } 
      
            // Update the HashMap with prefix sum upto ith index equals to currentSum.
            map.put(currentSum, i);

        } 
      
        // If we reach here, then no subarray exists.
        return new int[]{-1, -1};

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {60,10,90,40,50,30,70,80,20,100};
		System.out.println(Arrays.toString(subarraySum(a, 100)));
	}

}
