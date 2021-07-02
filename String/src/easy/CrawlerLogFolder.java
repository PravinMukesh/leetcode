package easy;

import java.util.Stack;

public class CrawlerLogFolder {

	public static int minOperations(String[] logs) {
		Stack stack = new Stack();
		for (String log : logs) {
			for (int i = 0; i < log.length(); i++) {
				if (Character.isAlphabetic(log.charAt(0))) {
					stack.push(log);
					break;
				} else if (Character.isDigit(log.charAt(0))) {
					stack.push(log);
					break;
				} else {
					if (log.length() == 2) {
						break;
					} else {
						if (!stack.isEmpty())
							stack.pop();
						break;
					}
				}
			}
		}
		return stack.size();
	}

	public static void main(String[] args) {
//		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
//		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
//		String[] logs = {"d1/","../","../","../"};
		String[] logs = { "1/" };
		System.out.println(minOperations(logs));
	}

}
