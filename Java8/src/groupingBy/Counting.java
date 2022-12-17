package groupingBy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.List<String> strings = Arrays.asList("Zohne", "Redy", "Zohne", "Redy", "Stome");
        java.util.Map<String, Long> nameCount = strings.stream().collect(Collectors.groupingBy(string -> string, Collectors.counting()));
        nameCount.forEach((name, count) -> {
            System.out.println(name + ":" + count);
        });
	}

}
