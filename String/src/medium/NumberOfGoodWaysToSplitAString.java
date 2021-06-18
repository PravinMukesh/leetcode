package medium;

public class NumberOfGoodWaysToSplitAString {

	public static int numSplits(String s) {
		int splits = 0;
		int[] left = new int[26];
		int[] right = new int[26];
		int leftCounter = 0;
		int rightCounter = 0;
		for(char c : s.toCharArray()) {
			left[c - 'a']++;
			if(left[c-'a'] == 1)
				leftCounter++;
		}
		for(char c : s.toCharArray()) {
			right[c-'a']++;
			if(right[c-'a'] == 1)
				rightCounter++;
			left[c-'a']--;
			if(left[c-'a'] == 0)
				leftCounter--;
			if(rightCounter == leftCounter)
				splits++;
		}
		return splits;
	}

	public static void main(String[] args) {
//		String s = "aacaba";
//		String s = "abcd";
//		String s = "aaaaa";
//		String s = "acbadbaada";
		String s = "ababbbbbbb";
		System.out.println(numSplits(s));
	}

}
