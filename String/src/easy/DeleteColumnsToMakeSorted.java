package easy;

public class DeleteColumnsToMakeSorted {

	public static int minDeletionSize(String[] strs) {
		int deletedColumn = 0;
		char prevChar = '\0';
		int i = 0;
		int j = 0;
		while (i < strs[0].length()) {
			prevChar = '\0';
			j = 0;
			while (j < strs.length) {
				if (prevChar == '\0') {
					prevChar = strs[j].charAt(i);
				} else {
					if (prevChar < strs[j].charAt(i)) {
						prevChar = strs[j].charAt(i);
						j++;
					} else if (prevChar > strs[j].charAt(i)) {
						deletedColumn++;
						break;
					} else {
						prevChar = strs[j].charAt(i);
						j++;
					}
				}
			}
			i++;
		}
		return deletedColumn;
	}

	public static void main(String[] args) {
//		String[] strs = {"abc", "bce", "cae"};
//		String[] strs = { "cba", "daf", "ghi" };
//		String[] strs = { "a", "a", "q", "c" };
//		String[] strs = {"ab","ab"};
		String[] strs = { "zyx", "wvu", "tsr" };
//		String[] strs = {"rrjk","furt","guzm"};
		System.out.println(minDeletionSize(strs));
	}

}
