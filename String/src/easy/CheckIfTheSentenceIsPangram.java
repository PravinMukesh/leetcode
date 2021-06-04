package easy;

public class CheckIfTheSentenceIsPangram {

	public static boolean checkIfPangram(String sentence) {
		if (sentence.isEmpty())
			return false;
		int[] ans = new int[26];
		for (int i = 0; i < sentence.length(); i++) {
			ans[sentence.charAt(i) - 'a']++;
		}
		for (int j = 0; j < ans.length; j++) {
			if (ans[j] == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String sentence = "aaabbbcccddddeeefffggghhiiijjklllmmnnooppqqqqrrrssssssststttttssststtsssuuuuvvvwwwxxxyyyzzzz";
		System.out.println(checkIfPangram(sentence));
	}

}
