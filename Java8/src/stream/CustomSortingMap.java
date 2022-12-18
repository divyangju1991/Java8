package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CustomSortingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, 21, "Pooja", "pooja@outlook.com");
		Person p2 = new Person(1, 31, "Komal", "komal@outlook.com");
		Person p3 = new Person(1, 41, "Divyang", "divyang@outlook.com");
		Person p4 = new Person(1, 11, "Krutarth", "krutarth@outlook.com");
		
		Map<Person, Integer> map = new TreeMap(Comparator.comparing(Person::getEmail));
		map.put(p1, p1.getId());
		map.put(p2, p2.getId());
		map.put(p3, p3.getId());
		map.put(p4, p4.getId());
		
		System.out.println(map);
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		List<Person> persons2 = persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		System.out.println(persons2);
	}

}
