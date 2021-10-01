package easy;

public class ReverseString {

	public static void reverseString(char[] s) {
		int base = s.length - 1;
		for (int i = 0; i < s.length / 2; i++) {
			char temp = s[i];
			s[i] = s[base];
			s[base] = temp;
			base--;
		}
	}

	public static void main(String[] args) {
//		char[] stringArray = {'H','e','l','l','o'};
		char[] stringArray = { 'H', 'a', 'n', 'n', 'a', 'h' };
		reverseString(stringArray);
	}
}
