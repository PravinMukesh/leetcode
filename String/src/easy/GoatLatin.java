package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoatLatin {

	public static String toGoatLatin(String sentence) {
		StringBuilder sb = new StringBuilder();
//		List<String> lst = new ArrayList<>(Arrays.asList(sentence.split(" ")));
		String[] lst = sentence.split(" ");
		char consonent = '\0';
		int wordCount = 0;
		for (String str : lst) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(0) == 'A' || str.charAt(0) == 'a' || str.charAt(0) == 'E' || str.charAt(0) == 'e'
						|| str.charAt(0) == 'I' || str.charAt(0) == 'i' || str.charAt(0) == 'O' || str.charAt(0) == 'o'
						|| str.charAt(0) == 'U' || str.charAt(0) == 'u') {
					sb.append(str.charAt(i));
					if (i == str.length() - 1)
						sb.append("ma");
				} else {
					if (i != 0)
						sb.append(str.charAt(i));
					else
						consonent = str.charAt(0);
				}
			}
			wordCount++;
			if (consonent == '\0') {
				for (int charAdd = 0; charAdd < wordCount; charAdd++) {
					sb.append("a");
				}
				sb.append(" ");
			} else {
				sb.append(consonent);
				sb.append("ma");
				for (int charAdd = 0; charAdd < wordCount; charAdd++) {
					sb.append("a");
				}
				consonent = '\0';
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
//		String sentence = "I speak Goat Latin";
		String sentence = "The quick brown fox jumped over the lazy dog";
		System.out.println(toGoatLatin(sentence));
	}
}
