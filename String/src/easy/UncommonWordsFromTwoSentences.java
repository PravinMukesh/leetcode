package easy;

import java.util.HashSet;
import java.util.Set;

public class UncommonWordsFromTwoSentences {

	static Set<String> sets = new HashSet<>();

//	public static String[] uncommonFromSentences(String s1, String s2) {
//		boolean flag = false;
//		compare(s1, flag);
//		flag = true;
//		compare(s2, flag);
//		String[] str = new String[sets.size()];
//		int i = 0;
//		while(i < str.length)
//		for(String set : sets) {
//			str[i] = set;
//			i++;
//		}
//		return str;
//	}
//
//	public static Set<String> compare(String compareString, Boolean flag) {
//		String[] strArr = compareString.split(" ");
//		for (String str : strArr) {
//			if (!sets.contains(str))
//				sets.add(str);
//			else if (flag)
//				sets.remove(str);
//		}
//		return sets;
//	}

	public static String[] uncommonFromSentences(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.append(" ");
		sb.append(s2);
		String[] strArr = sb.toString().split(" ");
		for (String strs : strArr) {
			if (!sets.contains(strs))
				sets.add(strs);
			else
				sets.remove(strs);
		}
		String[] str = new String[sets.size()];
		
		return str;
	}

	public static Set<String> compare(String compareString) {
		String[] strArr = compareString.split(" ");
		for (String str : strArr) {
			if (!sets.contains(str))
				sets.add(str);
			else
				sets.remove(str);
		}
		return sets;
	}

	public static void main(String[] args) {
//		String s1 = "this apple is sweet";
//		String s2 = "this apple is sour";
//		String s1 = "apple apple";
//		String s2 = "banana";
		String s1 = "s z z z s";
		String s2 = "s z ejt";
		System.out.println(uncommonFromSentences(s1, s2));
	}

}
