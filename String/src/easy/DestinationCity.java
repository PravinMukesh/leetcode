package easy;

import java.util.ArrayList;
import java.util.List;

public class DestinationCity {

	public static String destCity(List<List<String>> paths) {
		List<String> destination = new ArrayList<String>(paths.size());
		List<String> origin = new ArrayList<String>(paths.size());
		for (int i = 0; i < paths.size(); i++)
			destination.add(paths.get(i).get(1));
		for (int j = 0; j < paths.size(); j++)
			origin.add(paths.get(j).get(0));
		for (int m = 0; m < destination.size();) {
			for (int n = 0; n < origin.size();) {
				if (destination.get(m).contains(origin.get(n))) {
					destination.remove(m);
					n=0;
					m=0;
				} else {
					n++;
					continue;
				}
			}
			 m++;
		}
		return destination.get(0);
	}

	public static void main(String[] args) {
		List<String> singleDest = new ArrayList<String>();
//		singleDest.add("London");
//		singleDest.add("New York");
//		singleDest.add("B");
//		singleDest.add("C");
		singleDest.add("A");
		singleDest.add("Z");
	//	singleDest.add("A");
	//	singleDest.add("B");
		List<String> singleDest2 = new ArrayList<String>();
//		singleDest2.add("New York");
//		singleDest2.add("Lima");
//		singleDest2.add("D");
//		singleDest2.add("B");
//		singleDest2.add("C");
//		singleDest2.add("A");
		List<String> singleDest3 = new ArrayList<String>();
	//	singleDest3.add("Lima");
//		singleDest3.add("Sao Paulo");
//		singleDest3.add("C");
//		singleDest3.add("A");
		
		List<List<String>> list = new ArrayList<List<String>>();
		list.add(singleDest);
//		list.add(singleDest2);
//		list.add(singleDest3);
		System.out.println(destCity(list));
	}

}
