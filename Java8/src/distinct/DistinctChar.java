package distinct;

import java.util.stream.Collectors;

public class DistinctChar {

	public static void main(String[] args) {
		
		String str = "Umbrella";
		String ans = str.chars()
					  .mapToObj(x -> (char) x)
					  .distinct()
					  .map(s -> s.toString())
					  .collect(Collectors.joining());
		
		System.out.println(ans);
	}

}
