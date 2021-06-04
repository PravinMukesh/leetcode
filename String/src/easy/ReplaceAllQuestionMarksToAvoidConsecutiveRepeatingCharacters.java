package easy;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters {

//	public static String modifyString(String s) {
//		List<Integer> list = new ArrayList<>(s.length());
//		StringBuilder sb = new StringBuilder(s.length());
//		sb.append(s);
//		int[] x = new int[26];
////		for(int i = 0; i < s.length(); i++) 
////			x[s.charAt(i) - 'a']++;
//			//if(s.charAt(i) != '?')
//			//	x[s.charAt(i) - 'a']++;
//		//	else
//		//		 list.add(i);
//		
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != '?')
//				x[s.charAt(i) - 'a']++;
//			else {
//				if (i != 0 && i != s.length() - 1) {
//
//				} else if(i == 0 && i < s.length()-1) {
//					for(int j = 1; j < s.length(); j++) {
//						if(x[i+j] == 0) {
//							sb.replace(i, i, "a");
//							}
//					}
//				} else {
//				//	a = 
//				}
//			}
//		}
//
//		return sb.toString();
//	}

	public static String modifyString(String s) {
		StringBuffer sb = new StringBuffer(s.length());
		int[] arr = new int[100];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '?')
				arr[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '?') {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == 0) {
						arr[j] = 1;
						sb.append((char) (j + 'a'));
						break;
					}
				}
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "?s???????????asdasdf";
		System.out.println(modifyString(s));
	}
}