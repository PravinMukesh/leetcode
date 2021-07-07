package easy;

public class ExcelSheetColumnTitle {

	public static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		int reminder = -1;
		int value = 0;
		while (columnNumber > 26) {
			reminder = columnNumber % 26;
			sb.append((char) (reminder - 1 + 'A'));
			value = columnNumber - reminder;
			columnNumber = value / 26;
		}
		if (columnNumber != 0) {
			reminder = columnNumber % 26;
			if (reminder != 0)
				sb.append((char) (reminder - 1 + 'A'));
			else
				sb.append((char) (columnNumber - 1 + 'A'));
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
//		int columnNumber = 1;
//		int columnNumber = 28;
//		int columnNumber = 701;
		int columnNumber = 26;
//		int columnNumber = 2147483647;
		System.out.println(convertToTitle(columnNumber));
	}

}
