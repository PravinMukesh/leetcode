package easy;

public class GenerateAStringWithCharactersThatHaveOddCounts {

	public static String generateTheString(int n) {
		StringBuilder sb = new StringBuilder();
<<<<<<< HEAD
		int temp = 0;
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				if (i != n - 1) {
					sb.append((char) 97);
				} else {
					sb.append((char) 122);
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if(i < n-2) {
					sb.append((char) 97);
				} else {
					sb.append((char) (temp + 98));
					temp++;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 17;
=======
		for(int i = 0; i < n; i++)
		{
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 2;
>>>>>>> branch 'master' of https://github.com/PravinMukesh/leetcode.git
		System.out.println(generateTheString(n));
	}

}
