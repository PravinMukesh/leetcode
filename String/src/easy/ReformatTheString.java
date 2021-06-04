package easy;

public class ReformatTheString {
	//static StringBuilder character = new StringBuilder();
	//static StringBuilder digit = new StringBuilder();
	//static StringBuilder result = new StringBuilder();
	static int counter;

	public static String reformat(String s) {
		StringBuilder character = new StringBuilder(s.length());
		StringBuilder digit = new StringBuilder(s.length());
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				character.append(s.charAt(i));
			} else {
				digit.append(s.charAt(i));
			}
		}
		StringBuilder result = new StringBuilder(s.length());
		if (Math.abs(Math.subtractExact(character.length(), digit.length())) < 2) {
			if (character.length() > digit.length()) {
				for (int n = 0; n < character.length(); n++) {
					result.append(character.charAt(n));
					for (int m = counter; m < digit.length(); ) {
						result.append(digit.charAt(m));
						counter++;
						break;
					}
				}
			} else {
				for (int m = 0; m < digit.length(); m++) {
					result.append(digit.charAt(m));
					for (int n = counter; n < character.length();) {
						result.append(character.charAt(n));
						counter++;
						break;
					}
				}
			}

		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(reformat(s));
	}

}
