package easy;

public class Ballon {

	static final String s = "balloon";
	static StringBuffer sb = new StringBuffer();
	static StringBuffer sb1 = new StringBuffer();
	static int counter;

	public static int maxNumberOfBallons(String text) {
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (text.charAt(i) == s.charAt(j)) {
					sb.append(text.charAt(i));
					break;
				}
			}
		}
		return findTimes(sb);
	}

	public static int findTimes(StringBuffer sb) {
		System.out.println(sb.toString());
		if (sb.length() >= s.length()) {
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < sb.length(); j++) {
					if (s.charAt(i) == sb.charAt(j)) {
						sb1.append(s.charAt(i));
						sb.deleteCharAt(j);
						break;
					}
				}
			}
			counter++;// it has to be here
			if (sb.length() != 0) {
				findTimes(sb);
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// String text = "nlaebolko";
		String text = "looooooooo";
		System.out.println(maxNumberOfBallons(text));
	}

}
