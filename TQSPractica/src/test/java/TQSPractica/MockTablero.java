package TQSPractica;

public class MockTablero extends Board{
    public MockTablero() {
		super();

	}
<<<<<<< HEAD
    	// Initialize the matrix on 0 and not visited
	public void llenarMinas(String[] tablero) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Board.boxMatrix[i][j].setValue( Integer.parseInt(tablero[i+j]));
				if (Board.boxMatrix[i][j].getValue() != 1) {
					Board.boxMatrix[i][j].setFilled(true);

				}else {
					boxMatrix[i][j].setFilled(false);
=======
    public void llenarMinas(Integer[] tablero) {
    	Integer contador=0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(tablero[i+j]!=null)
				{
					Board.boxMatrix[i][j].setValue(tablero[contador]);
					if (Board.boxMatrix[i][j].getValue() != 1) {
						Board.boxMatrix[i][j].setFilled(true);
	
					}else {
						boxMatrix[i][j].setFilled(false);
					}
					contador++;
>>>>>>> 5d7b9f1f025612b873979790d1fd1551babe6145
				}
			}
		}

    }
    public void mostrarTablero() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				System.out.print(boxMatrix[i][j].getValue());
				System.out.print("  ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(boxMatrix[i][j].getValue()!=1){
<<<<<<< HEAD
					//System.out.print(boxMatrix[i][j].getValue());
					user.setColumn(j);
					user.setRow(i);
=======
					System.out.print(boxMatrix[i][j].getValue());
					this.user.setColumn(j);
					this.user.setRow(i);
>>>>>>> 5d7b9f1f025612b873979790d1fd1551babe6145
					openPositionBox();
				}
				System.out.print(userMatrix[i][j]);
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 5d7b9f1f025612b873979790d1fd1551babe6145
