package easy;

public class ExcelSheetColumnTitle {

	public static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while (columnNumber > 0) {
			columnNumber--;
			sb.insert(0, (char) ('A' + columnNumber % 26));
			columnNumber /= 26;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		int columnNumber = 1;
//		int columnNumber = 28;
		int columnNumber = 701;
//		int columnNumber = 26;
//		int columnNumber = 2147483647;
		System.out.println(convertToTitle(columnNumber));
	}

}
