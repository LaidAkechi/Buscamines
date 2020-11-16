package TQSPractica;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest extends Game{
	
	
	@Test
	public void play_possitive() {
		Board board = new Board();
		board.fillMines();
		board.endGame = false;
		board.winGame = false;
		assertFalse(board.isEndGame());
		assertFalse(board.isWinGame());
		
	}

	@Test
	public void play_negative() {
		Board board = new Board();
		board.fillMines();
		board.endGame = true;
		board.winGame = true;
		assertTrue(board.isEndGame());
		assertTrue(board.isWinGame());
		
	}
	
	
	
}
