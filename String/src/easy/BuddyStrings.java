package easy;

import java.util.ArrayList;
import java.util.List;

public class BuddyStrings {

	public static boolean buddyStrings(String a, String b) {
		List<Integer> list = new ArrayList<>(a.length());
		if(a.length() != b.length())
			return false;
		for (int i = 0; i < b.length(); i++) {
			if (a.charAt(i) != b.charAt(i))
				list.add(i);
		}
		if (list.size() > 2) {
			return false;
		}
		if (list.isEmpty()) {
			char[] ans = b.toCharArray();
			char temp;
			for (int x = 0; x < b.length()-1; x++) {
				for (int y = x+1; y < b.length(); y++) {
						temp = ans[x];
						ans[x] = ans[y];
						ans[y] = temp;	
						if(String.valueOf(ans).equalsIgnoreCase(a))
							return true;
						else
							ans = b.toCharArray();
				}
			}
		}
		if (list.size() == 2 && b.charAt(list.get(1)) == a.charAt(list.get(0))
				&& b.charAt(list.get(0)) == a.charAt(list.get(1))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String a = "abab";
		String b = "abab";
		System.out.println(buddyStrings(a, b));
	}
}
