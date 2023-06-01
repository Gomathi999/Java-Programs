package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeys__HashMap {

	static void toSortMapKeys(Map<String, Integer> hash) {
		Map<String, Integer> sortValues = new TreeMap<>();
		sortValues.putAll(hash);

		System.out.println("\nAfter Sorting........");
		for(Map.Entry<String, Integer> map : sortValues.entrySet()) {  
			System.out.println(map.getKey()+" : " +map.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> hash = new HashMap<>();
		hash.put("Meena", 1001);
		hash.put("Shiva", 1000);
		hash.put("Baby", 1011);
		hash.put("Arathya", 5002);
		hash.put("Rojan", 1100);
		System.out.println(hash);  	
		toSortMapKeys(hash);	
	}
}
