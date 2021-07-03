package easy;

import java.util.Stack;

public class CrawlerLogFolder {

	public static int minOperations(String[] logs) {
		int steps = 0;
		for (String log : logs) {
			if (log.equals("../")) {
				if (steps > 0)
					steps--;
			} else if (log.equals("./"))
				continue;
			else
				steps++;
		}
		return steps;
	}

	public static void main(String[] args) {
//		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
//		String[] logs = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
		String[] logs = { "d1/", "../", "../", "../" };
//		String[] logs = { "1/" };
//		String[] logs = { "./", "b9/", "aw8/", "./", "vw7/", "./", "d0/", "../", "p6/", "../" };
		System.out.println(minOperations(logs));
	}

}
