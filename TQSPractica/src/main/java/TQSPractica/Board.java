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

	public boolean isEndGame() {
		return endGame;
	}

	public boolean isWinGame() {
		return winGame;
	}

	public void setEndGame(boolean endGame) {
		this.endGame = endGame;
	}

	public void setWinGame(boolean winGame) {
		this.winGame = winGame;
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
		Random r = new Random();
		int num = r.nextInt(9 - 0) + 0;
		boolean isTouched = true;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				boxMatrix[i][j].setValue(0);
				boxMatrix[i][j].setFilled(false);
			}
		}

		for (int i = 0; i < 10; i++) {
			num = r.nextInt(4 - 2) + 2;
			for (int j = 0; j < num; j++) {
				isTouched = true;
				while (isTouched == true) {
					int columna = r.nextInt(10 - 0) + 0;

					if (boxMatrix[i][columna].getValue() != 1) {
						isTouched = false;
						boxMatrix[i][columna].setValue(1);
						boxMatrix[i][columna].setFilled(true);

					}
				}
			}
		}
	}

	public int getBoxPosition(int n_row, int n_column) {

		if ((n_row < 10 && n_row >= 0) && n_column < 10 && n_column >= 0) {
			return boxMatrix[n_row][n_column].getValue();
		} else {
			return 0;
		}
	}

	public void print() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(userMatrix[i][j]);
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}

	public void winGame() {
		int j = 0, i = 0;
		while (i < 10 && winGame == true) {
			while (j < 10 && winGame == true) {
				if (boxMatrix[i][j].isFilled() == false) {
					winGame = false;
				}
				j++;
			}
			i++;
		}
	}
	
	
	public void openPositionBox() {
		if (!isMine()) {
			n_mines = minesArround();
			boxMatrix[user.getRow()][user.getColumn()].setValue(n_mines);
			userMatrix[user.getRow()][user.getColumn()] = Integer.toString(n_mines);
			boxMatrix[user.getRow()][user.getColumn()].setFilled(true);

			if (n_mines > 0) {}
			else {

				if (user.getColumn() >= 1) {
					if (boxMatrix[user.getRow()][user.getColumn() - 1].isFilled() == false) {
						user.setColumn(user.getColumn() - 1);
						this.openPositionBox();
						user.setColumn(user.getColumn() + 1);
					}
				}
				if (user.getColumn() >= 1 && user.getRow() >= 1) {
					if (boxMatrix[user.getRow() - 1][user.getColumn() - 1].isFilled() == false) {

						user.setColumn(user.getColumn() - 1);
						user.setRow(user.getRow() - 1);
						this.openPositionBox();
						user.setRow(user.getRow() + 1);
						user.setColumn(user.getColumn() + 1);
					}
				}
				if (user.getRow() >= 1) {
					if (boxMatrix[user.getRow() - 1][user.getColumn()].isFilled() == false) {
						user.setRow(user.getRow() - 1);
						this.openPositionBox();
						user.setRow(user.getRow() + 1);
					}
				}
				if (user.getColumn() < 9 && user.getRow() >= 1) {
					if (boxMatrix[user.getRow() - 1][user.getColumn() + 1].isFilled() == false) {
						user.setRow(user.getRow() - 1);
						user.setColumn(user.getColumn() + 1);
						this.openPositionBox();
						user.setRow(user.getRow() + 1);
						user.setColumn(user.getColumn() - 1);
					}
				}
				if (user.getColumn() < 9) {
					if (boxMatrix[user.getRow()][user.getColumn() + 1].isFilled() == false) {
						user.setColumn(user.getColumn() + 1);
						this.openPositionBox();
						user.setColumn(user.getColumn() - 1);
					}
				}
				if (user.getColumn() < 9 && user.getRow() < 9) {
					if (boxMatrix[user.getRow() + 1][user.getColumn() + 1].isFilled() == false) {
						user.setRow(user.getRow() + 1);
						user.setColumn(user.getColumn() + 1);
						this.openPositionBox();
						user.setRow(user.getRow() - 1);
						user.setColumn(user.getColumn() - 1);
					}
				}
				if (user.getRow() < 9) {
					if (boxMatrix[user.getRow() + 1][user.getColumn()].isFilled() == false) {
						user.setRow(user.getRow() + 1);
						this.openPositionBox();
						user.setRow(user.getRow() - 1);
					}
				}
				if (user.getColumn() >= 1 && user.getRow() < 9) {
					if (boxMatrix[user.getRow() + 1][user.getColumn() - 1].isFilled() == false) {
						user.setRow(user.getRow() + 1);
						user.setColumn(user.getColumn() - 1);
						this.openPositionBox();
						user.setRow(user.getRow() - 1);
						user.setColumn(user.getColumn() + 1);

					}
				}
			}
		} else {
			System.out.println("You find a mine");
			endGame = true;
		}

	}

	public int minesArround() {
		int i = -1, j = -1;
		int bombCount = 0;

		while (i != 2) {
			j = -1;
			while (j != 2) {
				if (this.getBoxPosition(user.getRow() + i, user.getColumn() + j) == 1) {
					bombCount++;
				}
				j++;
			}
			i++;
		}

		return bombCount;
	}
	
	
}
