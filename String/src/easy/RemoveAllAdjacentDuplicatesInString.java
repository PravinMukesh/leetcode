package easy;

public class RemoveAllAdjacentDuplicatesInString {

	public static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		int first = 0;
		int last = 0;
		sb.append(s);
		for (int i = 0; i < sb.length() - 1;) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				first = i;
				last = i + 1;
				sb.delete(first, last + 1);
				i = 0;
			} else
				i++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		String s = "abbaca";
		String s = "azxxzy";
		System.out.println(removeDuplicates(s));
	}
}
