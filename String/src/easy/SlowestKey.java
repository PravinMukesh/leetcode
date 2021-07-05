package easy;

public class SlowestKey {

	public static char slowestKey(int[] releaseTimes, String keysPressed) {
		char c = '\0';
		int previous = 0;
		int previousDifference = 0;
		int difference = 0;
		for (int i = 0; i < releaseTimes.length; i++) {
			difference = Math.abs(previous - releaseTimes[i]);
			if (previousDifference < difference) {
				previous = releaseTimes[i];
				previousDifference = difference;
				c = keysPressed.charAt(i);
			} else if (previousDifference == difference) {
				if (keysPressed.charAt(i) > c) {
					previous = releaseTimes[i];
					c = keysPressed.charAt(i);
				} else {
					previous = releaseTimes[i];
				}
			} else {
				previous = releaseTimes[i];
			}
		}
		return c;
	}

	public static void main(String[] args) {
//		int[] releaseTimes = { 9, 29, 49, 50 };
//		String keysPressed = "cbcd";
//		int[] releaseTimes = { 12, 23, 36, 46, 62 };
//		String keysPressed = "spuda";
		int[] releaseTimes = { 2, 3, 18, 23, 25, 28, 43, 52, 70, 85 };
		String keysPressed = "jsjqofhxzp";
		System.out.println(slowestKey(releaseTimes, keysPressed));
	}

}
