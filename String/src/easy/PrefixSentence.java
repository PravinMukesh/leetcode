package easy;

public class PrefixSentence {
	static int constant;
	static int whiteSpaceCounter;

//	public static int isPrefixOfWord(String sentence, String searchWord) {
//
//		for (int i = 0; i < sentence.length(); i++) {
//			if (constant < searchWord.length() && !Character.isWhitespace(sentence.charAt(i))) {
//				if (sentence.charAt(i) == searchWord.charAt(constant) && i == 0) {
//					constant++;
//				} else if (sentence.charAt(i) == searchWord.charAt(constant)
//						&& Character.isWhitespace(sentence.charAt(i - 1))) {
//					constant++;
//				} else
//					constant = 0;
//			} else if (Character.isWhitespace(sentence.charAt(i))) {
//				whiteSpaceCounter++;
//			} else {
//				return whiteSpaceCounter + 1;
//			}
//		}
//		return -1;
//	}

	public static int isPrefixOfWord(String sentence, String searchWord) {
		for (int i = 0; i < sentence.length(); i++) {
			if (constant < searchWord.length() && !Character.isWhitespace(sentence.charAt(i))) {
				if (sentence.startsWith(searchWord)) {
					return whiteSpaceCounter + 1;
				} else {
					if (sentence.charAt(i) == searchWord.charAt(constant) && constant == 0 && i != 0) {
						if (Character.isWhitespace(sentence.charAt(i - 1)))
							constant++;
					} else {
						if (sentence.charAt(i) == searchWord.charAt(constant))
							constant++;
						else
							constant = 0;
					}
				}
			} else if (Character.isWhitespace(sentence.charAt(i)) && constant < searchWord.length()) {
				whiteSpaceCounter++;
				constant = 0;
			} else
				return whiteSpaceCounter + 1;
		}
		return (constant != 0) ? whiteSpaceCounter + 1 : -1;
	}

	public static void main(String[] args) {
		 String sentence = "love errichto jonathan dumb";
		 String searchWord = "dumb";
//		 String sentence = "this problem is an easy problem";
//		 String searchWord = "pro";
//		 String sentence = "i am tired";
//		 String searchWord = "am";
//		String sentence = "i use triple pillow";
//		String searchWord = "pill";
//		 String sentence = "hello from the other side";
//		 String searchWord = "they";
//		String sentence = "hellohello hellohellohello";
//		String searchWord = "ell";
//		String sentence = "dumb dream duck duck i";
//		String searchWord = "drea";
//		String sentence = "b bu bur burg burger";
//		String searchWord = "burg";
		System.out.println(isPrefixOfWord(sentence, searchWord));
	}

}
