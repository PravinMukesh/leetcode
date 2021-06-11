package easy;

public class MakeTheStringGreat {

	public static String makeGood(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		for (int i = 0; i < sb.length() - 1;) {
			if (Character.isUpperCase(sb.charAt(i)) && Character.isLowerCase(sb.charAt(i + 1))) {
				if (Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(i + 1))) {
					sb.replace(i, i + 2, "");
					i = 0;
				} else {
					i++;
				}
			} else if (Character.isLowerCase(sb.charAt(i)) && Character.isUpperCase(sb.charAt(i + 1))) {
				if (Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(i + 1))) {
					sb.replace(i, i + 2, "");
					i = 0;
				} else {
					i++;
				}
			} else {
				i++;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "leEeetcode";
//		String s = "abBAcC";
//		String s = "s";
//		String s = "abceBbAcC";
		System.out.println(makeGood(s));
	}

}
