package medium;

public class BattleshipsInABoard {

	public static int countBattleships(char[][] board) {
		int ships = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X' 
						&& (i == 0 || board[i - 1][j] != 'X') 
						&& (j == 0 || board[i][j - 1] != 'X'))
					ships++;
			}
		}
		return ships;
	}

	public static void main(String[] args) {
		char[][] board = { { 'X', '.', '.', 'X' },
						   { '.', '.', '.', 'X' },
						   { 'X', '.', '.', 'X' } };
		System.out.println(countBattleships(board));
	}
}
