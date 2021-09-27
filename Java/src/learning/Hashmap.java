package learning;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {

	public static void main(String[] args) {

		//ArrayList<String> arr = new ArrayList<String>();
		//HashMap<key, value> map = new HashMap<String, String>();
		/*HashMap<String, String> map = new HashMap<String, String>();
		map.put("TN", "Chennai");
		map.put("KA", "Bangalore");
		map.put("KL", "Cochin");
		
		System.out.println(map);
		
		System.out.println(map.get("KA"));

		map.size();
		System.out.println(map.keySet());
		for(String i: map.values()) {
			System.out.println(i);
		}
		*/
		HashSet<String> cars = new HashSet<String>();
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		System.out.println(cars.contains("Skoda"));
		if(cars.contains("skoda")) {
			System.out.println("Skoda is already present in the list");
		} else {
			cars.add("Skoda");
		}
		
		System.out.println(cars);
		
	}

}
