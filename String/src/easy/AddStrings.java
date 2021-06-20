package easy;

public class AddStrings {

	public static String addStrings(String num1, String num2) {
		StringBuilder res = new StringBuilder();
		int carry = 0;
		int p1 = num1.length() - 1;
		int p2 = num2.length() - 1;
		while (p1 >= 0 || p2 >= 0) {
			int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
			int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
			int value = (x1 + x2 + carry) % 10;
			carry = (x1 + x2 + carry) / 10;
			res.append(value);
			p1--;
			p2--;
		}

		if (carry != 0)
			res.append(carry);
		return res.reverse().toString();
	}

	public static void main(String[] args) {
//		String num1 = "1";
//		String num2 = "2";
		String num1 = "6913259244";
		String num2 = "71103343";
//		String num1 = "3876620623801494171";
//		String num2 = "6529364523802684779";
		System.out.println(addStrings(num1, num2));
	}

}
