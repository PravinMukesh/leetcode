package easy;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAStringIII {

	public static String reverseWords(String s) {
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
		StringBuilder sb = new StringBuilder();
		for(String listOfString : list) {
			for(int i = listOfString.length() -1; i >= 0; i--) {
				sb.append(listOfString.charAt(i));
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
//		String s = "Let's chill out!!";
		String s = "God Ding";
		System.out.println(reverseWords(s));
	}

}
