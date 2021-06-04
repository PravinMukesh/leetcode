package easy;

public class StringHalves {
	
	static int counter;
	
	public static boolean halvesAreAlike(String s) {
		String a = s.substring(0, s.length()/2);
		String b = s.substring(s.length()/2, s.length());
		int aCount = vowels(a.toLowerCase());
		counter = 0;
		int bCount = vowels(b.toLowerCase());
		return (aCount == bCount) ? true:false;
	}
	
	public static int vowels(String halves) {
		String value = "aeiou";
		halves.toLowerCase();
		for(int i = 0; i < halves.length(); i++) {
			for(int j = 0; j < value.length(); j++) {
				if(halves.charAt(i) == value.charAt(j)) {
					counter++;
				}
			}
			
		}
		return counter;
	}
	
	public static void main(String[] args) {
		String s = "Uo";
		System.out.println(halvesAreAlike(s));
	}

}
