package easy;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {

	static int stage = -1;
	static int counter;

	static List<String> value = new ArrayList<String>();

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

		switch (ruleKey) {
		case "type": stage = 0;
			break;
		case "color": stage = 1;
			break;
		case "name": stage = 2;
			break;
		default:
			break;
		}
		for (int i = 0; i < items.size(); i++)
			if (items.get(i).get(stage).equalsIgnoreCase(ruleValue))
				counter++;
		return counter;
	}

	public static void main(String[] args) {
		List<String> preItems = new ArrayList<String>();
		preItems.add("phone");
		preItems.add("blue");
		preItems.add("pixel");

		List<String> preItems2 = new ArrayList<String>();
		preItems2.add("computer");
		preItems2.add("silver");
		preItems2.add("lenovo");

		List<String> preItems3 = new ArrayList<String>();
		preItems3.add("phone");
		preItems3.add("gold");
		preItems3.add("iphone");

		List<List<String>> items = new ArrayList<List<String>>();
		items.add(preItems);
		items.add(preItems2);
		items.add(preItems3);
		String ruleKey = "type";
		String ruleValue = "phone";

		System.out.println(countMatches(items, ruleKey, ruleValue));
	}

}
