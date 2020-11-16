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
	

	
	

		
	
	
	
	
	
}
