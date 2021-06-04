package easy;

public class FirstUniqueCharacterInAString {
	static int counter;

	public static int firstUniqChar(String s) {
//		char[] a = s.toCharArray();
//		for (int i = 0; i < s.length(); i++) {
//			if (counter == s.length() - i)
//				return i - 1;
//			for (int j = i+1; j < s.length(); j++) {
//				if (a[i] == a[j]) {
//					counter = 0;
//					break;
//				} else {
//					counter++;
//				}
//			}
//			// return s.charAt(i);
//		}
//		return -1;
		int[] a = new int[26];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (a[s.charAt(i) - 97] == 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(firstUniqChar(s));
	}

}
