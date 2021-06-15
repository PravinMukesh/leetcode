package medium;

public class BulbSwitcherIV {
	public static int minFlips(String target) {
		int flips = 0;
		char lastValue = '0';
		for (int i = 0; i < target.length(); i++) {
			if (target.charAt(i) != lastValue) {
				lastValue = target.charAt(i);
				flips++;
			}
		}
		return flips;
	}

	public static void main(String[] args) {
//		String target = "10111";
//		String target = "101";
//		String target = "00000";
//		String target = "001011101";
		String target = "010000000";
		System.out.println(minFlips(target));
	}

}
