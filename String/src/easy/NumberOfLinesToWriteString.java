package easy;

public class NumberOfLinesToWriteString {

	public static int[] numberOfLines(int[] widths, String s) {
		int[] length = new int[2];
		int sum = 0;
		int lines = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length;) {
			sum += widths[c[i] - 'a'];
			if (sum <= 100) {
				i++;
			} else {
				lines++;
				sum = 0;
			}
		}
		lines++;
		length[0] = lines;
		length[1] = sum;
		return length;
	}

	public static void main(String[] args) {
//		int[] widths = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
//				10, 10 };
//		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		String s = "bbbcccdddaaa";
		System.out.println(numberOfLines(widths, s));
	}

}
