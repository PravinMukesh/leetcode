package easy;

public class CountTheNumberOfConsistentStringsUsingArrays {

	public static int countConsistentStrings(String allowed, String[] words) {
		int consistent = 0;
		int[] ans = new int[26];
		for (int i = 0; i < allowed.length(); i++) {
			ans[allowed.charAt(i) - 'a']++;
		}
		for (int j = 0; j < words.length; j++) {
			String word = words[j];
			consistent++;
			for (int k = 0; k < word.length(); k++) {
				if (ans[word.charAt(k) - 'a'] == 0) {
					consistent--;
					break;
				}
			}
		}
		return consistent;
	}

	public static void main(String[] args) {
//		String allowed = "ab";
//		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
//		String allowed = "abc";
//		String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
//		String allowed = "cad";
//		String[] words = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
		String allowed = "fstqyienx";
		String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
		System.out.println(countConsistentStrings(allowed, words));
	}

}
