package easy;

public class Truncate {

	static StringBuffer sb = new StringBuffer();
	static int k;
	public static String truncateString(String s, int k) {
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isWhitespace(s.charAt(i)) && k != 0) {
				sb.append(s.charAt(i));
			}else {
				k--;
				if(k!=0) 
					sb.append(" ");
				else
					return sb.toString();
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s = "Hello how are you consultant";
		k = 4;
		System.out.println(truncateString(s, k));
	}

}
