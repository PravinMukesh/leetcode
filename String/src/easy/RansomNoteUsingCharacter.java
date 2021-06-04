package easy;

public class RansomNoteUsingCharacter {

	static boolean canConstruct(String ransomNote, String magazine) {
		int[] arr = new int[26];

		for (int i = 0; i < magazine.length(); i++)
			arr[magazine.charAt(i) - 'a']++;

		for (int i = 0; i < ransomNote.length(); i++) {
			arr[ransomNote.charAt(i) - 'a']--;
			if (arr[ransomNote.charAt(i) - 'a'] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String ransomNote = "ad";
		String magazine = "aabce";
		System.out.println(canConstruct(ransomNote, magazine));
	}

}
