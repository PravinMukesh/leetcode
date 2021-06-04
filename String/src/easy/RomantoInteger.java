package easy;

public class RomantoInteger {

	static int result;

	public static int romanToInt(String s) {
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				if (i >= 0 && i < s.length() - 1) {
					if (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')
						result -= 1;
					else
						result += 1;
				} else {
					result += 1;
				}
				break;
			case 'V':
				result += 5;
				break;
			case 'X':
				if (i >= 0 && i < s.length() - 1) {
					if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')
						result -= 10;
					else
						result += 10;
				} else {
					result += 10;
				}
				break;
			case 'L':
				result += 50;
				break;
			case 'C':
				if (i >= 0 && i < s.length() - 1) {
					if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')
						result -= 100;
					else
						result += 100;
				} else {
					result += 100;
				}
				break;
			case 'D':
				result += 500;
				break;
			case 'M':
				result += 1000;
				break;
			default:
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "LVIII";
		System.out.println(romanToInt(s));
	}

}
