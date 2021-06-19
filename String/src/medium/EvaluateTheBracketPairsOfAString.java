package medium;

import java.util.ArrayList;
import java.util.List;

public class EvaluateTheBracketPairsOfAString {

	public static String evaluate(String s, List<List<String>> knowledge) {
		StringBuffer sb = new StringBuffer();
		int start = 0;
		int end = 0;
		boolean flag = true;
		sb.append(s);
		for (int i = 0; i < sb.length(); i++) {
			flag = true;
			if (sb.charAt(i) == '(') {
				start = i;
				for (int j = i + 1; j < sb.length(); j++) {
					if (sb.charAt(j) == ')') {
						end = j;
						break;
					}
				}
				for (int k = 0; k < knowledge.size(); k++) {
					if (knowledge.get(k).get(0).toString().equalsIgnoreCase(sb.substring(start + 1, end))) {
						sb.replace(start, end + 1, knowledge.get(k).get(1));
						flag = false;
						break;
					}
				}
				if (flag) {
					sb.replace(start, end + 1, "?");
				}
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		String s = "(name)is(age)yearsold";
//		String s = "(a)(a)(a)aaa";
//		String s = "(a)(b)";
//		String s = "hi(name)";
		String s = "(zib)";

		List<String> list1 = new ArrayList<>();
		list1.add("qfviuwjo");
		list1.add("w");

		List<String> list2 = new ArrayList<>();
		list2.add("kppdajmk");
		list2.add("n");
		
		List<String> list3 = new ArrayList<>();
		list3.add("zib");
		list3.add("c");
		
		List<String> list4 = new ArrayList<>();
		list4.add("ztfljcff");
		list4.add("i");
		
		List<String> list5 = new ArrayList<>();
		list5.add("aoayyihi");
		list5.add("d");

		List<List<String>> knowledge = new ArrayList<List<String>>();
		knowledge.add(list1);
		knowledge.add(list2);
		knowledge.add(list3);
		knowledge.add(list4);
		knowledge.add(list5);
		System.out.println(evaluate(s, knowledge));
	}

}
