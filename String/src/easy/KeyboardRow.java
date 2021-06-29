package easy;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public static String[] findWords(String[] words) {
		List<String> list = new ArrayList<>();
		int row = 0;
		int start = 0;
		String firstRow = "qwertyuiop";
		String secondRow = "asdfghjkl";
		String thirdRow = "zxcvbnm";
		StringBuilder sb = new StringBuilder();
		int word = 0;
		while (word < words.length) {
			for (int i = 0; i < words[word].length(); i++) {
				if (firstRow.indexOf((words[word].toLowerCase().charAt(i))) != -1 && (row == 0 || row == 1)) {
					row = 1;
					sb.append(words[word].charAt(i));
				} else if (secondRow.indexOf((words[word].toLowerCase().charAt(i))) != -1 && (row == 0 || row == 2)) {
					row = 2;
					sb.append(words[word].charAt(i));
				} else if (thirdRow.indexOf((words[word].toLowerCase().charAt(i))) != -1 && (row == 0 || row == 3)) {
					row = 3;
					sb.append(words[word].charAt(i));
				} else {
					break;
				}
			}
			if (words[word].toLowerCase().toString().equalsIgnoreCase(sb.toString())) {
				for (int j = start; j < start + 1; j++) {
					list.add(words[word]);
				}
				start++;
			}
			sb = new StringBuilder();
			row = 0;
			word++;
		}
		String[] ans = new String[list.size()];
		for (int k = 0; k < list.size(); k++) {
			ans[k] = list.get(k);
		}
		return ans;
	}

	public static void main(String[] args) {
//		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
//		String[] words = {"omk"};
//		String[] words = {"adsdf","sfd"};
		String[] words = { "a", "b" };
		System.out.println(findWords(words));
	}

}
