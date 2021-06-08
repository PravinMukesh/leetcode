package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {

	public static int countGoodSubstrings(String s) {
		List<String> list = new ArrayList<>(s.length());
		Set<Character> setChar = new HashSet<>();
		char[] character = null;
		for (int i = 0; i < s.length(); i++) {
			if (i + 3 <= s.length()) {
				character = s.substring(i, i + 3).toCharArray();
				for (int j = 0; j < character.length; j++) {
					setChar.add(character[j]);
				}
				if (setChar.size() == 3) {
					setChar.clear();
					list.add(s.substring(i, i + 3));
				} else
					setChar.clear();
			}
		}
		return list.size();
	}

	public static void main(String[] args) {
//		String s = "xyzzaz";
//		String s = "aababcabc";
		String s = "qas";
		System.out.println(countGoodSubstrings(s));
	}

}
