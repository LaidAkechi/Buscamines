package TQSPractica;

import java.util.Random;

public class Board {

	protected static String userMatrix[][] = new String[10][10];
	protected static Box boxMatrix[][] = new Box[10][10]; 
	User user;
	boolean endGame = false;
	boolean winGame = false;
	int n_mines;

	public Board() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				userMatrix[i][j] = "#";
				boxMatrix[i][j] = new Box();
			}
		}
	}

	public void setUser(User t) {
		user = t;
	}
	public void userPosition() {
		user.userSetPosition();
	}
	public boolean isMine() {
		if (boxMatrix[user.getRow()][user.getColumn()].getValue() == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void fillMines() {
	
	}

	



}
