package easy;

public class DIStringMatch {

	public static int[] diStringMatch(String s) {
		int[] arr = new int[s.length() + 1];
		int i = 0;
		int d = s.length();
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == 'I') {
				arr[j] = i;
				i++;
			} else {
				arr[j] = d;
				d--;
			}
		}
		if (s.charAt(s.length() - 1) == 'I') {
			arr[s.length()] = i;
		} else {
			arr[s.length()] = d;
		}
		return arr;
	}

	public static void main(String[] args) {
//		String s = "IDID";
		String s = "III";
//		String s = "DDI";
//		String s = "IDIIID";
		System.out.println(diStringMatch(s));
	}

}
