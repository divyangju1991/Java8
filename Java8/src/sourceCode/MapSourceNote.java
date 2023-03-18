package sourceCode;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapSourceNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
		linkedMap.put("a1", "");
		//i = (n - 1) & hash
		//put Method used of HashMap
		
		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("a1", "");
		// int index = (hash & 0x7FFFFFFF) % tab.length;
		//0x7FFFFFFF is a number in hexadecimal (2,147,483,647 in decimal) that represents the maximum positive value for a 32-bit signed binary integer.
		//Integer.Max_VALUE in hexadecimal format
		
	}

}
