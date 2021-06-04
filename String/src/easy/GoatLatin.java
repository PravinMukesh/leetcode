package easy;

public class GoatLatin {

	static StringBuffer sb = new StringBuffer();
	public static String toGoatLatin(String sentence) {
		for(int i = 0; i < sentence.length(); i++) {
			if(!Character.isWhitespace(sentence.charAt(i)))
				sb.append(sentence.charAt(i));
			else
				sb.append("ma");
		}
		return sb.toString()+"ma";
	}

	public static void main(String[] args) {
		String sentence = "I speak Goat Latin";
		System.out.println(toGoatLatin(sentence));
	}

}
