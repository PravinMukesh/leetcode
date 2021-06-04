package practice;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map = null;
//		map.put("A", "Aeroplane");
//		map.put("B", "Ball");
//		map.put("C", "Cat");
//		map.put("D", "Dog");
//		map.put("E", "Elephant");
		
		if(null != map && map.containsKey("F")) {
			System.out.println("Key present");
		} else {
			System.out.println("Key doesn't present");
		}
	}

}
