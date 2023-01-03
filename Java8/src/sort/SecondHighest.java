package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		//final int[] i = {0};
		List<Integer> list = Arrays.stream(nums)
									.boxed()
									.collect(Collectors.toList());
		int secondHighest = list.stream()
				                .sorted(Comparator.reverseOrder())
				                .collect(Collectors.toList())
				                .get(1);
		System.out.println(secondHighest);
		
		Integer[] nums2 = {1, 2, 3, 4, 5, 6, 7};
		List<Integer> list2  = Arrays.asList(nums2);
		Integer[] ans2 = (Integer[]) Arrays.stream(nums2)
				             .sorted(Comparator.reverseOrder())
				             .toArray(Integer[]::new);
		System.out.println(ans2[1]);
		
	}

}
