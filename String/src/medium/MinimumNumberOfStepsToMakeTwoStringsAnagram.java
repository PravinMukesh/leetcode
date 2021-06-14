package medium;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

	public static int minSteps(String s, String t) {
		StringBuilder sb = new StringBuilder(s.length());
		StringBuilder sb1 = new StringBuilder(t.length());
		sb.append(s);
		sb1.append(t);
		for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < sb1.length();) {
				if (sb1.charAt(j) == sb.charAt(i)) {
					sb.replace(i, i + 1, "");
					sb1.replace(j, j + 1, "");
					i = j = 0;
				} else
					j++;
			}
		}
		return sb.length();
	}

	public static void main(String[] args) {
		String s = "bab";
		String t = "aba";

//		String s = "leetcode";
//		String t = "practice";

//		String s = "anagram";
//		String t = "mangaar";

//		String s = "sa";
//		String t = "aa";

//		String s = "xxyyzz";
//		String t = "xxyyzz";
		System.out.println(minSteps(s, t));
	}

}
