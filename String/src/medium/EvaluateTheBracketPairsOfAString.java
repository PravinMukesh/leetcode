package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluateTheBracketPairsOfAString {

	public static String evaluate(String s, List<List<String>> knowledge) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = new HashMap<>(knowledge.size());
		for (List<String> list : knowledge) {
			map.put(list.get(0), list.get(1));
		}
		int start = 0;
		int end = 0;
		sb.append(s);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '(') {
				start = i;
				end = sb.indexOf(")", start);
					sb.replace(start, end + 1, map.getOrDefault(sb.substring(start + 1, end), "?"));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "(name)is(age)yearsold";
//		String s = "(a)(a)(a)aaa";
//		String s = "(a)(b)";
//		String s = "hi(name)";
//		String s = "(zib)";

		List<String> list1 = new ArrayList<>();
		list1.add("name");
		list1.add("bob");

		List<String> list2 = new ArrayList<>();
		list2.add("age");
		list2.add("two");

//		List<String> list3 = new ArrayList<>();
//		list3.add("zib");
//		list3.add("c");
//
//		List<String> list4 = new ArrayList<>();
//		list4.add("ztfljcff");
//		list4.add("i");
//
//		List<String> list5 = new ArrayList<>();
//		list5.add("aoayyihi");
//		list5.add("d");

		List<List<String>> knowledge = new ArrayList<List<String>>();
		knowledge.add(list1);
		knowledge.add(list2);
//		knowledge.add(list3);
//		knowledge.add(list4);
//		knowledge.add(list5);
		System.out.println(evaluate(s, knowledge));
	}

}
