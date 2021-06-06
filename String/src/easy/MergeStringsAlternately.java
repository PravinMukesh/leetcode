package easy;

public class MergeStringsAlternately {

	public static String mergeAlternately(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word1.length(); i++) {
			for (int j = i; j < word2.length();) {
				sb.append(word1.charAt(i));
				sb.append(word2.charAt(j));
				break;
			}
		}
		if (word1.length() > word2.length()) {
			for (int k = word2.length(); k < word1.length(); k++) {
				sb.append(word1.charAt(k));
			}
		} else if (word1.length() == word2.length()) {
			return sb.toString();
		} else {
			for (int k = word1.length(); k < word2.length(); k++) {
				sb.append(word2.charAt(k));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "abcd";
		System.out.println(mergeAlternately(word1, word2));
	}

}
