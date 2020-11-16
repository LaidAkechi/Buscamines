
package TQSPractica;

public class Game {
  
	Board board;

	public Game()
	{
		User user = new User();
		board = new Board();
		board.setUser(user);
		
	}
	
	
	public void play()
	{
		board.fillMines();
		while (!board.isEndGame() && !board.isWinGame()) 
		{
        
			board.print();
			board.userPosition();
			board.openPositionBox();
			board.winGame();
       
		}		
	}
	
}
