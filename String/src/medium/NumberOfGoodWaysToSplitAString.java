package medium;

import java.util.HashSet;
import java.util.Set;

public class NumberOfGoodWaysToSplitAString {

	public static int numSplits(String s) {
		char[] sChar = s.toCharArray();
		int split = 0;
		Set<Integer> set1 = new HashSet<>(s.length());
		Set<Integer> set2 = new HashSet<>(s.length());
		for(int i = 0; i < sChar.length; i++) {
			set1.add(Character.getNumericValue(sChar[i]));
			for(int j = i+1; j < sChar.length; j++) {
				set2.add(Character.getNumericValue(sChar[j]));
			}
			if (set1.size() == set2.size()) {
				split++;
				set2.clear();
			} else {
				set2.clear();
			}
		}

//		Set<Integer> set1 = new HashSet<>(s.length());
//		Set<Integer> set2 = new HashSet<>(s.length());
//		int split = 0;
//		for (int i = 1; i < s.length(); i++) {
//			char[] sChar1 = s.substring(0, i).toCharArray();
//			char[] sChar2 = s.substring(i).toCharArray();
//			for (int j = 0; j < sChar1.length; j++)
//				set1.add(Character.getNumericValue(sChar1[j]));
//			for (int k = 0; k < sChar2.length; k++)
//				set2.add(Character.getNumericValue(sChar2[k]));
//			if (set1.size() == set2.size()) {
//				split++;
//				set1.clear();
//				set2.clear();
//			} else {
//				set1.clear();
//				set2.clear();
//			}
//		}
	return split;

	}

	public static void main(String[] args) {
//		String s = "aacaba";
//		String s = "abcd";
//		String s = "aaaaa";
//		String s = "acbadbaada";
		String s = "ababbbbbbb";
		System.out.println(numSplits(s));
	}

}
