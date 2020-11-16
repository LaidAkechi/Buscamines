package TQSPractica;

import static org.junit.Assert.*;


import org.junit.Test;

public class BoardTest  {

	//test posicio actual mina
	@Test
	public void isMineTest_true() {
		Board board = new MockBoard();
		MockUser user = new MockUser();
		board.setUser(user);
		board.fillMines();
		board.userPosition();
		board.boxMatrix[user.getRow()][user.getColumn()].setValue(1);
		assertTrue(board.isMine());

	}
	@Test
	public void isMineTest_false() {
		Board board = new MockBoard();
		MockUser user = new MockUser();
		board.setUser(user);
		board.fillMines();
		board.userPosition();
		board.boxMatrix[user.getRow()][user.getColumn()].setValue(0);
		assertFalse(board.isMine());
		
	}

	
	
	//test caixa negre
	@Test
	public void isMineTest() {
		Board board = new MockBoard();
		MockUser user = new MockUser();
		board.setUser(user);
		board.fillMines();
		board.userPosition();
		assertEquals(board.isMine(),true);
	}
		
	
	@Test
	public void userPositionTest() {
		Board board = new MockBoard();
		MockUser user = new MockUser();
		board.setUser(user);
		
		
	}
	

	@Test
	public void gettersTest() {
		Board board = new MockBoard();
		board.isEndGame();
		board.isWinGame();
	}
	
	@Test
	public void printTest() {
		Board board = new MockBoard();
		board.print();
	}

		
	@Test
	public void getBoxPositionTest_true() {
		int n_row = (int)Math.random()*9;
		int n_column = (int) Math.random()*9;
		Board board = new MockBoard();
		board.fillMines();
		assertNotEquals(board.getBoxPosition(n_row, n_column), 0);
		
	}
	
	@Test
	public void getBoxPositionTest_false() {
		int n_row = 11;
		int n_column = 11;
		Board board = new MockBoard();
		board.fillMines();
		assertEquals(board.getBoxPosition(n_row, n_column),0);
		
		n_row = 11;
		n_column = 10;
		board.fillMines();
		assertEquals(board.getBoxPosition(n_row, n_column),0);
		
		n_row = -1;
		n_column = 6;
		board.fillMines();
		assertEquals(board.getBoxPosition(n_row, n_column),0);
		
		n_row = 6;
		n_column = -1;
		board.fillMines();
		assertEquals(board.getBoxPosition(n_row, n_column),0);
		
		n_row = -1;
		n_column = -1;
		board.fillMines();
		assertEquals(board.getBoxPosition(n_row, n_column),0);
		
		n_row = 10;
		n_column = 12;
		board.fillMines();
		assertEquals(board.getBoxPosition(n_row, n_column),0);
		
	}
	
	@Test
	public void setEndGame() {
		Board board = new MockBoard();
		board.setEndGame(false);
		assertEquals(board.isEndGame(),false);
	}
	

	@Test
	public void winGameTest_true_true() {
		Board board = new MockBoard();
		board.winGame = true;
		board.winGame();
	}
	
	@Test
	public void winGame_true() {
		
		Board board = new MockBoard();
		Box box = new MockBox();
		board.fillMines();
		board.winGame();
		board.setWinGame(true);
		assertTrue(board.winGame);
		box.setFilled(false);
		assertFalse(box.isFilled());

	}
	
	
}
