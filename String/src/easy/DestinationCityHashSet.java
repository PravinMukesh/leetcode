package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCityHashSet {
	
	
	private static String destCity(List<List<String>> paths) {
		HashSet<String> set = new HashSet<>();
		for(List<String> list : paths) {
			set.add(list.get(0));
		}
		
		for(List<String> list : paths) {
			if(!set.contains(list.get(1))) {
				return list.get(1);
			}
		}
		
		return null;
	}


	public static void main(String[] args) {
		ArrayList<String> singleDest = new ArrayList<String>();
		singleDest.add("London");
		singleDest.add("New York");
//		singleDest.add("B");
//		singleDest.add("C");
//		singleDest.add("A");
//		singleDest.add("Z");
		// singleDest.add("A");
		// singleDest.add("B");
		ArrayList<String> singleDest2 = new ArrayList<String>();
		singleDest2.add("New York");
		singleDest2.add("Lima");
//		singleDest2.add("D");
//		singleDest2.add("B");
//		singleDest2.add("C");
//		singleDest2.add("A");
		ArrayList<String> singleDest3 = new ArrayList<String>();
		singleDest3.add("Lima");
		singleDest3.add("Sao Paulo");
//		singleDest3.add("C");
//		singleDest3.add("A");

		List<List<String>> list = new ArrayList<List<String>>();
		list.add(singleDest);
		list.add(singleDest2);
		list.add(singleDest3);
		System.out.println(destCity(list));
	}
}
