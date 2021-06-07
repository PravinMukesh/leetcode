package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (String email : emails) {
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					sb.append(email.substring(i, email.length()));
					i = email.length();
					break;
				} else {
					if (Character.isAlphabetic(email.charAt(i))) {
						sb.append(email.charAt(i));
					}
				}
				if (email.charAt(i) == '.') {
					continue;
				}
				if (email.charAt(i) == '+') {
					for (int j = i; j <= email.length(); j++) {
						if (email.charAt(j) == '@') {
							sb.append(email.substring(j, email.length()));
							i = email.length();
							break;
						}
					}
				}
			}
			set.add(sb.toString());
			sb = new StringBuilder();
		}
		return set.size();
	}

	public static void main(String[] args) {
//		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
//				"testemail+david@lee.tcode.com" };
//		String[] emails = { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" };
		String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
//		String[] emails = { "a@leetcode.com" };
		System.out.println(numUniqueEmails(emails));
	}

}
