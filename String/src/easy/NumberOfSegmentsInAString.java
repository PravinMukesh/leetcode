package easy;

public class NumberOfSegmentsInAString {

	public static int countSegments(String s) {
		int counter = 0;
		int word = 0;
		StringBuilder sb = new StringBuilder(s.length());
		if (s.isEmpty())
			return 0;
		sb.append(s);
		for (int i = 0; i < sb.length();) {
			if (Character.isWhitespace(sb.charAt(i))) {
				sb.deleteCharAt(i);
			} else
				break;
		}
		if (sb.length() > 0) {
			for (int i = sb.length() - 1;; i--) {
				if (Character.isWhitespace(sb.charAt(i))) {
					sb.deleteCharAt(i);
				} else
					break;
			}
		} else
			return 0;
		for (int i = 0; i < sb.length() - 1; i++) {
			if (Character.isWhitespace(sb.charAt(i)) && !Character.isWhitespace(sb.charAt(i + 1)))
				counter++;
		}
		return counter + 1;
	}

	public static void main(String[] args) {
		String s = "     Hello,   my name is John             ";
//		String s = "Hello";
//		String s = "love live! mu'sic forever";
//		String s = "";
//		String s = "                ";
//		String s = ", , , ,        a, eaefa";
		System.out.println(countSegments(s));
	}

}
