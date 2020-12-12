package TQSPractica;

public class MockBoard extends Board {

	@Override
	public void fillMines() {
		// set all box full of mines
		boxMatrix[0][0].setValue(1);
		boxMatrix[0][1].setValue(1);
		boxMatrix[1][1].setValue(1);
		boxMatrix[2][0].setValue(1);
		boxMatrix[2][1].setValue(1);
		 
		//test rodejat de bombes aprofitant les anteriors bombes
		boxMatrix[0][2].setValue(1);
		boxMatrix[0][3].setValue(1);
		boxMatrix[1][3].setValue(1);
		boxMatrix[2][2].setValue(1);
		boxMatrix[2][3].setValue(1);
		
		//test limit tauler dreta
		boxMatrix[0][8].setValue(1);
		boxMatrix[0][9].setValue(1);
		boxMatrix[1][8].setValue(1);
		boxMatrix[2][8].setValue(1);
		boxMatrix[2][9].setValue(1);
		
		//test limit tauler amunt
		boxMatrix[0][5].setValue(1);
		boxMatrix[0][7].setValue(1);
		boxMatrix[1][5].setValue(1);
		boxMatrix[1][6].setValue(1);
		boxMatrix[1][7].setValue(1);
		
				
		//test limit tauler abaix
		boxMatrix[8][5].setValue(1);
		boxMatrix[8][7].setValue(1);
	
	}

}
