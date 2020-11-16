package TQSPractica;



	public class MockBoardOpenPositionBox extends Board {

			
		
		@Override
		public void fillMines() {
			for(int i = 0; i<10; i++) 
			{
				boxMatrix[i][3].setValue(1);
				boxMatrix[i][7].setValue(1);
				boxMatrix[5][i].setValue(1);
				
			}
			
		}
		
}
	