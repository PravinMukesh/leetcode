package easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyLetters {

	public static String reverseOnlyLetters(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		List<Integer> list = new ArrayList<>(s.length());
		for(int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				sb.append(s.charAt(i));
			} else {
				list.add(i);
			}
		}
		sb.reverse();
		for(int j = 0; j < list.size(); j++) {
			int ans = list.get(j);
			sb.insert(ans, s.charAt(list.get(j)));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		String s = "ab-cd";
//		String s = "a-bC-dEf-ghIj";
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}

}
