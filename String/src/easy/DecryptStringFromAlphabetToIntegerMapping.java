package easy;

public class DecryptStringFromAlphabetToIntegerMapping {

	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		StringBuilder check = new StringBuilder(s.length());
		for (int i = 0; i < s.length(); i++) {
			if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
				for (int j = i; j < s.length(); j++) {
					if (s.charAt(j) != '#') {
						check.append(s.charAt(j));
						i++;
					} else {
						int a = Integer.valueOf(check.toString()) + 96;
						sb.append(Character.valueOf((char) a));
						check = new StringBuilder();
						i++;
					}
				}
				if (check.length() != 0) {
					for (int k = 0; k < check.length(); k++) {
						if (check.charAt(k) != '0') {
							sb.append(Character.valueOf((char) (Character.getNumericValue(check.charAt(k)) + 96)));
						}
					}
				}
			} else {
				if (s.charAt(i) != '0') {
					sb.append(Character.valueOf((char) (Character.getNumericValue(s.charAt(i)) + 96)));
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		String s = "10#11#12";
//		String s = "1326#";
//		String s = "25#";
//		String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
//		String s = "824#15#826#";
		String s = "510#510#";
		System.out.println(freqAlphabets(s));
	}

}
