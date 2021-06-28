package easy;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToACharacter {

	public static int[] shortestToChar(String s, char c) {
		int[] value = new int[s.length()];
		char[] ans = s.toCharArray();
		int index = s.indexOf(c);
		int first = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == c) {
				index = i;
				value[i] = 0;
				first = s.indexOf(c, i + 1);
			} else {
				if (i < index)
					value[i] = Math.abs(index - i);
				else if(i > index) {
					value[i] = Math.min(Math.abs(index - i), Math.abs(first - i));
				}
			}
		}
		return value;
	}

	public static void main(String[] args) {
//		String s = "loveleetcode";
//		char c = 'e';
		String s = "aaab";
		char c = 'b';
		System.out.println(shortestToChar(s, c));
	}

}
