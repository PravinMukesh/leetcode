package easy;

import java.util.Stack;

public class CrawlerLogFolder {

	public static int minOperations(String[] logs) {
		Stack<String> stack = new Stack<>();
		int log = 0;
		while (log < logs.length) {
			if (Character.isAlphabetic(logs[log].charAt(0))) {
				stack.push(logs[log]);
				log++;
			} else if (Character.isDigit(logs[log].charAt(0))) {
				stack.push(logs[log]);
				log++;
			} else {
				if (logs[log].length() == 2)
					log++;
				else {
					if (!stack.isEmpty()) {
						stack.pop();
						log++;
					} else
						log++;
				}
			}
		}
		return stack.size();
	}

	public static void main(String[] args) {
//		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
//		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
//		String[] logs = {"d1/","../","../","../"};
//		String[] logs = { "1/" };
		String[] logs = { "./", "b9/", "aw8/", "./", "vw7/", "./", "d0/", "../", "p6/", "../" };
		System.out.println(minOperations(logs));
	}

}
