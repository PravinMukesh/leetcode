package easy;

public class LongPressedName {

	public static boolean isLongPressedName(String name, String typed) {
		char[] original = name.toCharArray();
		char[] extra = typed.toCharArray();
		char previousChar = '\0';
		if (original.length <= extra.length) {
			int i = 0;
			for (int j = 0; j < extra.length;) {
				if (i < name.length() && extra[j] == original[i]) {
					previousChar = original[i];
					i++;
					j++;
				} else if (extra[j] == previousChar)
					j++;
				else
					return false;
			}
			if (i == name.length()) {
				if (previousChar == (original[original.length - 1]))
					return true;
				else
					return false;
			} else
				return false;
		} else
			return false;
	}

	public static void main(String[] args) {
//		String name = "vtkgn";
//		String typed = "vttkgnn";
		String name = "pyplrz";
		String typed = "ppyypllr";
//		String name = "bdad";
//		String typed = "bbbd";
		System.out.println(isLongPressedName(name, typed));
	}
}
