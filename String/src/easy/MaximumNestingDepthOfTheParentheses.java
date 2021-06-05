package easy;

public class MaximumNestingDepthOfTheParentheses {

	public static int maxDepth(String s) {
		int counter = 0;
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				counter++;
			}
			if(s.charAt(i) == ')') {
				if(max < counter)
					max = counter;
				counter--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
//		String s = "(1+(2*3)+((8)/4))+1";
//		String s = "(1)+((2))+(((3)))";
//		String s = "1+(2*3)/(2-1)";
		String s = "1";
		System.out.println(maxDepth(s));
	}

}
