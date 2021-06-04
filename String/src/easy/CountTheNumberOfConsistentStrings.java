package easy;

public class CountTheNumberOfConsistentStrings {

	public static int countConsistentStrings(String allowed, String[] words) {
		int counter = 0;
		int consistent = 0;
		for (String eachWord : words) {
			for (int i = 0; i < allowed.length(); i++) {
				for (int j = 0; j < eachWord.length(); j++) {
					if (eachWord.charAt(j) == allowed.charAt(i))
						counter++;
				}
			}
			if (counter == eachWord.length())
				consistent++;
			counter = 0;
		}
		return consistent;
	}

	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
//		String allowed = "abc";
//		String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
//		String allowed = "cad";
//		String[] words = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
		System.out.println(countConsistentStrings(allowed, words));
	}

}
