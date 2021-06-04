package easy;

public class DetectCapital {
	static int counterUpper;
	static int counterLower;

	public static boolean detectCapitalUse(String word) {

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)) && !Character.isLowerCase(word.charAt(0))) {
				counterUpper++;
			} else if (Character.isUpperCase(word.charAt(0))) {
				if (Character.isLowerCase(word.charAt(i))) {
					counterLower++;
				}
			}
			if (Character.isLowerCase(word.charAt(i)) && !Character.isUpperCase(word.charAt(0))) {
				counterLower++;
			}
		}
		return (counterUpper == word.length() || counterLower == word.length()
				|| counterUpper == 1 && counterLower == word.length() - 1) ? true : false;
	}

	public static void main(String[] args) {
		String word = "USAaASD";
		System.out.println(detectCapitalUse(word));
	}

}
