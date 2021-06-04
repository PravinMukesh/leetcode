package easy;

public class ThousandSeperator {

	static int counter;
	static StringBuffer sb = new StringBuffer();
	public static String thousandSeparator(int n) {
		
		sb.append(Integer.toString(n));
		for(int i = sb.length()-1 ; i > 0;i--) {			
			if(counter == 2) {
				sb.insert(i, ".");
				counter = 0;
			} else
				counter++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 12345;
		System.out.println(thousandSeparator(n));
	}

}
