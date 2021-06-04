package easy;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

	public static int numDifferentIntegers(String word) {
		StringBuilder sb = new StringBuilder(word.length());
		Set<String> set = new HashSet<>();
		if (word.length() == 0)
			return 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				sb.append(word.charAt(i));
			} else {
				if (sb.length() != 0)
					sb.append(" ");
			}
		}
		if (sb.length() == 0)
			return 0;
		String[] ans = sb.toString().split("\\s+");
		for (int i = 0; i < ans.length; i++) {
			String answer = ans[i].replaceAll("^0+(?!$)", "");
			if (!answer.equalsIgnoreCase(""))
				set.add(answer);
		}
		return set.size();
	}

	public static void main(String[] args) {
//		String word = "a123bc34d8ef34";
//		String word = "leet1234code234";
//		String word = "a1b01c001";
//		String word = "      ";
		String word = "0a2d4";
		System.out.println(numDifferentIntegers(word));
	}

}
