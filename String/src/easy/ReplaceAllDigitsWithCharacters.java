package easy;

public class ReplaceAllDigitsWithCharacters {



	static public String replaceDigits(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		for (int i = 0; i < s.length(); i++) 
			if (Character.isDigit(s.charAt(i))) 
				sb.append((char)(Character.getNumericValue(s.charAt(i)) + s.charAt(i - 1)));
			 else
				sb.append(s.charAt(i));
		return sb.toString();
	}

//	public static void shift(char x, int y) {
//		arr[s.charAt(i) - 'a']++;
//	}

	public static void main(String[] args) {
		String s = "a1b2c3d4e";
		System.out.println(replaceDigits(s));
	}
}
