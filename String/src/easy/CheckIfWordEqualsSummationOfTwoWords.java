package easy;

public class CheckIfWordEqualsSummationOfTwoWords {

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

		int first = calculateCount(firstWord);
		int second = calculateCount(secondWord);
		int result = calculateCount(targetWord);

		return first + second == result ? true : false;
	}

	public static int calculateCount(String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			sb.append((int) (word.charAt(i)) - 97);
		}
		return Integer.valueOf(sb.toString());
	}

	public static void main(String[] args) {
		String firstWord = "aaa";
		String secondWord = "a";
		String targetWord = "aaaa";
		System.out.println(isSumEqual(firstWord, secondWord, targetWord));
	}
}
