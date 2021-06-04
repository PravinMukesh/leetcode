package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTheSentence {

	public static String sortSentence(String s) {
		String temp = null;
		List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).length(); j++) {
				if (Character.isDigit(list.get(i).charAt(j))) {
					temp = list.get(Character.getNumericValue(list.get(i).charAt(j) - 1));
					list.set(Character.getNumericValue(list.get(i).charAt(j) - 1), list.get(i));
					list.set(i, temp);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).replaceAll("[0-9]+", " "));
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
//		String s = "Myself2 Me1 I4 and3";
//		String s = "is2 sentence4 This1 a3";
		String s = "H8 A1 F6 G7 B2 D4 E5 C3";
//		String s = "RJTxYqNHdRdEocgzGuA8 lnX1 JEvuSQZ6 IdMGROfR7 LYud2 pCqLfGZ4 bLgRLsgL5 AForVgJScezJbz3";
		System.out.println(sortSentence(s));
	}

}
