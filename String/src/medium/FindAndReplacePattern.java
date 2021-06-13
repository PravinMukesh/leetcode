package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAndReplacePattern {
	static List<Integer> style = new ArrayList<>();
	static List<Integer> listOfWord = new ArrayList<>();

	public static List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> list = new ArrayList<>();
		checkPattern(pattern);
		for (String word : words) {
			if (pattern.length() == word.length()) {
				for (int x = 0; x < word.length(); x++) {
					for (int y = x + 1; y < word.length(); y++) {
						if (word.charAt(x) == word.charAt(y)) {
								listOfWord.add(x);
								listOfWord.add(y);
						}
					}
				}
			} 
			if(style.equals(listOfWord)) {
				list.add(word);
				listOfWord = new ArrayList<>();
			} else {
				listOfWord = new ArrayList<>();
			}
				
		}
		return list;
	}

	public static List<Integer> checkPattern(String pattern) {
		for (int i = 0; i < pattern.length(); i++) {
			for (int j = i + 1; j < pattern.length(); j++) {
				if (pattern.charAt(i) == pattern.charAt(j)) {
						style.add(i);
						style.add(j);
				}
			}
		}
		return style;
	}

	public static void main(String[] args) {
		String[] words = { "ab", "deq", "mee", "aqq", "dkd", "ccc" };
		String pattern = "abb";
//		String[] words = {"a","b","c"};
//		String pattern = "a";
		System.out.println(findAndReplacePattern(words, pattern));
	}
}