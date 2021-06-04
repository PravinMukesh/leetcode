package easy;

import java.util.ArrayList;
import java.util.List;

public class Implement_strStr {

	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0;
		char[] a = haystack.toCharArray();
		char[] b = needle.toCharArray();
		int first = -1;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < needle.length(); i++) {
			for (int j = 0; j < haystack.length(); j++) {
				if (b[i] == a[j]) {
					list.add(j);
					a[j] = '\0';
					break;
				}
			}
			if (list.isEmpty())
				return -1;
		}
		if (list.size() == needle.length()) {
			first = list.get(0);
			for (int x = 0; x < list.size(); x++) {
				if (first == list.get(x))
					first += 1;
				else
					return -1;
			}
		} else
			return -1;
		return list.get(0);
	}

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(strStr(haystack, needle));
	}
}