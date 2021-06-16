package medium;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

	public static int minSteps(String s, String t) {
		int[] arr = new int[26];
		int steps = 0;
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		for(int i = 0; i < sChar.length; i++) {
			arr[sChar[i] - 'a']++;
		}
		for(int j = 0; j < tChar.length; j++) {
			if(arr[tChar[j] - 'a'] != 0) {
				arr[tChar[j] - 'a']--;	
			} else
				steps++;
		}
		return steps;
	}

	public static void main(String[] args) {
//		String s = "gctcxyuluxjuxnsvmomavutrrfb";
//		String t = "qijrjrhqqjxjtprybrzpyfyqtzf";
//		String s = "bab";
//		String t = "aba";

//		String s = "leetcode";
//		String t = "practice";

//		String s = "anagram";
//		String t = "mangaar";

		String s = "sa";
		String t = "aa";

//		String s = "xxyyzz";
//		String t = "xxyyzz";
		System.out.println(minSteps(s, t));
	}

}
