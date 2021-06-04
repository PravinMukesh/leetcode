package easy;

import java.util.ArrayList;
import java.util.List;

public class CheckIfOneStringSwapCanMakeStringsEqual {

// Below method works, but WORST coding

//	public static boolean areAlmostEqual(String s1, String s2) {
//		char[] arr = new char[s2.length()];
//		StringBuilder sb = new StringBuilder(s2.length());
//		int node = -1;
//		int[] a = new int[26];
//		int[] b = new int[26];
//		for(int i = 0; i < s1.length(); i++)
//			a[s1.charAt(i) - 'a']++;
//		for(int j = 0; j < s2.length(); j++)
//			b[s2.charAt(j) - 'a']++;
//		if (s1.length() > 2 && s2.length() > 2 && s1.length() == s2.length() && Arrays.equals(a, b)) {
//			for (int i = 0; i < s2.length(); i++) {
//				if (s2.charAt(i) == s1.charAt(i)) {
//					arr[i] = s2.charAt(i);
//				} else {
//					for (int j = i; j < s2.length(); j++) {
//						if (s1.charAt(j) != s2.charAt(j)) {
//							if (node == -1) {
//								node = j;
//								
//								if(s2.contains(Character.toString(s1.charAt(j))))
//									arr[j] = s1.charAt(j);
//								else
//									return false;
//							} else {
//								arr[j] = s2.charAt(node);
//								node = -1;
//							}
//						}
//					}
//				}
//			}
//			for (char ans : arr) {
//				sb.append(ans);
//			}
//		} else if (s1.length() == s2.length() && s1.length() == 2) {
//			if (s2.equalsIgnoreCase(s1)) {
//				return true;
//			} else {
//				sb.append(s2.charAt(1));
//				sb.append(s2.charAt(0));
//				if (sb.toString().equalsIgnoreCase(s1))
//					return true;
//				else
//					return false;
//			}
//		} else {
//			if (s2.equalsIgnoreCase(s1))
//				return true;
//			return false;
//		}
//		return sb.toString().equalsIgnoreCase(s1) ? true : false;
//	}

	// Above method works, but WORST coding

	public static boolean areAlmostEqual(String s1, String s2) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				list.add(i);
		}
		if (list.size() > 2)
			return false;
		if (list.isEmpty())
			return true;
		if (list.size() == 2 && s1.charAt(list.get(0)) == s2.charAt(list.get(1))
				&& s2.charAt(list.get(0)) == s1.charAt(list.get(1)))
			return true;
		return false;
	}

	public static void main(String[] args) {
		String s1 = "abca";
		String s2 = "abca";
		System.out.println(areAlmostEqual(s1, s2));
	}

}
