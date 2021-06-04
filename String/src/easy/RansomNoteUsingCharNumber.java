package easy;

public class RansomNoteUsingCharNumber {

	static boolean canConstruct(String ransomNote, String magazine) {
		
		int[] charCount = new int[26];
		for (char c : magazine.toCharArray()) {
			charCount[c - 97]++;
		}

		for (char c : ransomNote.toCharArray()) {
			if (--charCount[c - 97] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String ransomNote = "ad";
		String magazine = "aabce";
		System.out.println(canConstruct(ransomNote, magazine));
	}

}
