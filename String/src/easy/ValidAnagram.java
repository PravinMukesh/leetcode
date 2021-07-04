package easy;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for (int j = 0; j < t.length(); j++) {
			if (arr[t.charAt(j) - 'a'] > 0) {
				arr[t.charAt(j) - 'a']--;
			} else
				return false;
		}
		for (int k = 0; k < s.length(); k++) {
			if (arr[s.charAt(k) - 'a'] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		String s = "anagram";
//		String t = "nagaram";
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s, t));
	}

}
