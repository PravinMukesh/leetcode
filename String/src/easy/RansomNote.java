package easy;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {

	static boolean canConstruct(String ransomNote, String magazine) {
		List<Character> listRansomNote = new ArrayList<>(ransomNote.length());
		for (int i = 0; i < ransomNote.length(); i++) {
			listRansomNote.add(ransomNote.charAt(i));
		}
		List<Character> listMagazine = new ArrayList<>(magazine.length());
		for (int i = 0; i < magazine.length(); i++) {
			listMagazine.add(magazine.charAt(i));
		}
		for (int i = 0; i < listRansomNote.size();) {
			for (int j = 0; j < listMagazine.size();) {
				if (!listRansomNote.isEmpty() && !listMagazine.isEmpty()
						&& listRansomNote.get(i) == listMagazine.get(j)) {
					listRansomNote.remove(i);
					listMagazine.remove(j);
					j = 0;
					i = 0;
				} else {
					j++;
				}
			}
			return listRansomNote.isEmpty() ? true : false;
		}
		return listRansomNote.isEmpty() ? true : false;
	}

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";
		System.out.println(canConstruct(ransomNote, magazine));
	}

}
