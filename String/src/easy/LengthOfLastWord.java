package easy;

public class LengthOfLastWord {


	public static int lengthOfLastWord(String s) {
		int counter = 0;
		int previousLength = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				counter++;
			} else {
				if (counter != 0)
					previousLength = counter;
				counter = 0;
			}
		}

		return counter == 0 ? previousLength : counter;
	}

	public static void main(String[] args) {
		String s = "Pravin Mukesh Ravi!";
		System.out.println(lengthOfLastWord(s));
	}

}
