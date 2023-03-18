package nioPackages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path filePath = Paths.get("D:", "pc", "file.txt");
		//Path filePath = Paths.get("C:"+fileSeparator+"Users"+fileSeparator+"divya"+fileSeparator+"OneDrive"+fileSeparator+"Documents"+fileSeparator
				//+"GitHub"+fileSeparator+"Java8"+fileSeparator+"Java8"+fileSeparator+"src"+fileSeparator+"nioPackages"+fileSeparator+"file.txt");
				 
		  final Map<String, Integer> map = new HashMap<>(); 
		//try-with-resources
				try (Stream<String> lines = Files.lines( filePath )) 
				{
				  lines.forEach((line) -> {
					  String[] words = line.split("\\s+");
					  Arrays.stream(words)
			            .forEach((word) -> {
			                map.put(word, map.getOrDefault(word, 0)+1);
			            });
				  });
				} 
				catch (IOException e) 
				{
				  e.printStackTrace();
				}
				
				Supplier<TreeMap<Integer, String>> myMapSupplier = () -> new TreeMap<>(Comparator.reverseOrder());

				 Map<Integer, String> ansMap = map.entrySet()
				         .stream()
				         .collect(Collectors.toMap(Entry::getValue, Entry::getKey, (e1, e2) -> e1, myMapSupplier));
				 
				 System.out.println("ansMap => "+ansMap);
	}

}