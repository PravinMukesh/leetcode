package easy;

public class ReformatDate {

	static int[] dd;

	public static String reformatDate(String date) {
		for (int i = 0; i < date.length(); i++) {
			if(!Character.isWhitespace(date.charAt(i))) {
				
			}
		}
		return "";
	}

	public static void main(String[] args) {
		String date = "20th Jun 2016";
		System.out.println(reformatDate(date));
	}

}
