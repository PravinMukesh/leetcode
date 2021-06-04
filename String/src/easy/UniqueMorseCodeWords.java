package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	public static int uniqueMorseRepresentations(String[] words) {
		Set<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				switch (words[i].charAt(j)) {
				case 'a':
					sb.append(".-");
					break;
				case 'b':
					sb.append("-...");
					break;
				case 'c':
					sb.append("-.-.");
					break;
				case 'd':
					sb.append("-..");
					break;
				case 'e':
					sb.append(".");
					break;
				case 'f':
					sb.append("..-.");
					break;
				case 'g':
					sb.append("--.");
					break;
				case 'h':
					sb.append("....");
					break;
				case 'i':
					sb.append("..");
					break;
				case 'j':
					sb.append(".---");
					break;
				case 'k':
					sb.append("-.-");
					break;
				case 'l':
					sb.append(".-..");
					break;
				case 'm':
					sb.append("--");
					break;
				case 'n':
					sb.append("-.");
					break;
				case 'o':
					sb.append("---");
					break;
				case 'p':
					sb.append(".--.");
					break;
				case 'q':
					sb.append("--.-");
					break;
				case 'r':
					sb.append(".-.");
					break;
				case 's':
					sb.append("...");
					break;
				case 't':
					sb.append("-");
					break;
				case 'u':
					sb.append("..-");
					break;
				case 'v':
					sb.append("...-");
					break;
				case 'w':
					sb.append(".--");
					break;
				case 'x':
					sb.append("-..-");
					break;
				case 'y':
					sb.append("-.--");
					break;
				case 'z':
					sb.append("--..");
					break;
				default:
					break;
				}
			}
			set.add(sb.toString());
			sb = new StringBuilder();
		}
		return set.size();
	}

	public static void main(String[] args) {
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));
	}

}
