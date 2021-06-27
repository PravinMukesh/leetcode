package easy;

public class DeleteColumnsToMakeSorted {

	public static int minDeletionSize(String[] strs) {
		int deletedColumn = 0;
		char prevChar = '\0';
		for(int i = 0; i < strs[0].length(); i++) {
			prevChar = '\0';
			for(int j = 0; j < strs.length;j++) {
				if(prevChar == '\0') {
					prevChar = strs[j].charAt(i);
				} else {
					if(prevChar < strs[j].charAt(i)) {
						prevChar = strs[j].charAt(i);
					} else if(prevChar > strs[j].charAt(i)) {
						deletedColumn++;
						break;
					} else {
						prevChar = strs[j].charAt(i);
					}
				}
			}
		}
		return deletedColumn;
	}

	public static void main(String[] args) {
//		String[] strs = {"abc", "bce", "cae"};
//		String[] strs = { "cba", "daf", "ghi" };
		String[] strs = { "a", "a", "c", "c" };
//		String[] strs = {"ab","ab"};
//		String[] strs = {"zyx","wvu","tsr"};
//		String[] strs = {"rrjka","furtb","guzma"};
		System.out.println(minDeletionSize(strs));
	}

}
