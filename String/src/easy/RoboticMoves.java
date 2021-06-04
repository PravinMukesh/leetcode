package easy;

public class RoboticMoves {

	static int counterUD;
	static int counterLR;

	public static boolean judgeCircle(String moves) {
		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
			case 'U':
				counterUD++;
				break;
			case 'D':
				counterUD--;
				break;
			case 'L':
				counterLR++;
				break;
			case 'R':
				counterLR--;
				break;
			default:
				return false;
			}
		}
		return (0 == counterUD && 0 == counterLR) ? true : false;
	}

	public static void main(String[] args) {
		String moves = "UD";
		System.out.println(judgeCircle(moves));
	}

}
