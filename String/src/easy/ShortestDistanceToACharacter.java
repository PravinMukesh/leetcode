package easy;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToACharacter {

	public static int[] shortestToChar(String s, char c) {
		int[] value = new int[s.length()];
		List<Integer> prevChar = new ArrayList<>();
		char[] ans = s.toCharArray();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == c) {
//				prevChar.add(i);
//			}
//		}
//		int k = 0;
//		for (int j = 0; j < s.length(); j++) {
//			while (k < prevChar.size()) {
//				if (s.indexOf(j) < prevChar.get(k)) {
//					value[j] = Math.abs(j - prevChar.get(k));
//				} else if(s.indexOf(j) == prevChar.get(k)) {
//					value[j] = 0;
//				} else if(s.indexOf(j) > prevChar.get(k)) {
//					if(s.indexOf(c, j)) {
//						
//					}
//				}
//			}
//		}
		int index = s.indexOf(c);
		int first = 0;
		int second = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == c) {
				
				value[i] = 0;
				second = s.indexOf(c, i + 1);
				first = second;
			} else {
				if (i < index)
					value[i] = Math.abs(index - i);
				else if(i > index) {
					value[i] = Math.min(Math.abs(first - i), Math.abs(second - i));
					index = second;
//					second = s.indexOf(c, i+1);
				}
			}
		}
		return value;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		System.out.println(shortestToChar(s, c));
	}

}
