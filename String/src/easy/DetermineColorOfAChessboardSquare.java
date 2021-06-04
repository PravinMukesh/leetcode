package easy;

public class DetermineColorOfAChessboardSquare {

	public static boolean squareIsWhite(String coordinates) {
		char[] f = { 'a', 'c', 'e', 'g' };
		boolean result = true;
		if (Character.isAlphabetic(coordinates.charAt(0))) {
			for (char ans : f) {
				if (coordinates.toLowerCase().charAt(0) == ans) {
					result = false;
					break;
				}
			}
		}
		if (Character.isDigit(coordinates.charAt(1))) {
			if (result) {
				return coordinates.charAt(1) % 2 == 0 ? false : true;
			} else {
				return coordinates.charAt(1) % 2 == 0 ? true : false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String coordinates = "c7";
		System.out.println(squareIsWhite(coordinates));
	}

}
