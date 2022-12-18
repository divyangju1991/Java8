package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LimitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-[-25,10,20,30,7,17 ]
		//[-25,10,-20,30,7,17]
		
		int[] nums = {-25,10,20,30,7,17}; //{-25,10,-20,30,7,17};
		
		//throw exception size is less than 3 or return default values as per requirement
		
		int len = nums.length;
		List<Integer> res = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
		System.out.println(res);
		List<Integer> ans = new ArrayList<>();
		
			int min1 = res.get(0);
			int min2 = res.get(1);
			int max1 = res.get(len-1); 
			int max2 = res.get(len-2);
			int max3 = res.get(len-3);
			
			if((min1 * min2 * max1) >= (max1 * max2 * max3)){

				ans.add(max1);
				ans.add(min1);
				ans.add(min2);
			} else {
				ans.add(max1);
				ans.add(max2);
				ans.add(max3);
			}
		
			System.out.println(ans);
		
		int[] nums2 = {-25,10,-20,30,7,17};//{-25,10,20,30,7,17};
		min1 = Integer.MAX_VALUE;
		min2 = Integer.MAX_VALUE;
		max1 = Integer.MIN_VALUE;
		max2 = Integer.MIN_VALUE;
		max3 = Integer.MIN_VALUE;
		
		for(int i=0; i<nums2.length; ++i){
			
			if(nums2[i] <= min1){
				min2 = min1;
				min1 = nums2[i];
			} else if(nums2[i] <= min2){
				min2 = nums2[i];
			}
			
			if(nums2[i] >= max1){
				max3 = max2;
				max2 = max1;
				max1 = nums2[i];
			} else if(nums2[i] >= max2){
				max3 = max2;
				max2 = nums2[i];
			} else if(nums2[i] >= max3){
				max3 = nums2[i];
			}
		}
		List<Integer> res2 = new ArrayList<>();
		
		if((min1 * min2 * max1) >= (max1 * max2 * max3)){
			res2.add(max1);
			res2.add(min1);
			res2.add(min2);
		} else {
			res2.add(max1);
			res2.add(max2);
			res2.add(max3);
		}
		
		System.out.println("updated res : "+ res2);
		
		/*
		int[] nums = {-25,10,-20,30,7,17};//{-25,10,20,30,7,17};
		
		        int min1 = Integer.MAX_VALUE;
		        int min2 = Integer.MAX_VALUE;
			    int max1 = Integer.MIN_VALUE;
			    int max2 = Integer.MIN_VALUE;
			    int max3 = Integer.MIN_VALUE;
			    List<Integer> ans = new ArrayList<>();
			    
			    for (int i = 0;  i < nums.length; ++i) {
			        if (nums[i] <= min1) {
			            min2 = min1;
			            min1 = nums[i];
			        } else if (nums[i] <= min2) {     // n lies between min1 and min2
			            min2 = nums[i];
			        }
			        if (nums[i] >= max1) {            // n is greater than max1, max2 and max3
			            max3 = max2;
			            max2 = max1;
			            max1 = nums[i];
			        } else if (nums[i] >= max2) {     // n lies betweeen max1 and max2
			            max3 = max2;
			            max2 = nums[i];
			        } else if (nums[i] >= max3) {     // n lies betwen max2 and max3
			            max3 = nums[i];
			        }
			    }
			    
			    if((min1 * min2 * max1) >= (max1 * max2 * max3)){
			    	ans.add(min1);
			    	ans.add(min2);
			    	ans.add(max1);
			    } else {
			    	ans.add(max1);
			    	ans.add(max2);
			    	ans.add(max3);
			    }
			    
			    System.out.println(ans);
			    		*/
	}

}
