package TQSPractica;

public class MockTablero extends Board{
    public MockTablero() {
		super();

	}
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
					System.out.print(boxMatrix[i][j].getValue());
					this.user.setColumn(j);
					this.user.setRow(i);
					openPositionBox();
				}
				System.out.print(userMatrix[i][j]);
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
}