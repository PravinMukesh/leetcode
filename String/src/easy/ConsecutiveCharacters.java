package easy;

public class ConsecutiveCharacters {

	static int counter;

	public static int maxPower(String s) {
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				counter++;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(maxPower(s));
	}

}
