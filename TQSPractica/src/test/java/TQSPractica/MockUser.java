package TQSPractica;

public class MockUser extends User{

	private int row[];
	private int column[];
	private int countRow;
	private int countColumn;
	
	public MockUser() {
		int n_row[] = {1,1,3,1,2,3,1,2,0,2};
		int n_column[]= {1,2,3,2,1,3,2,1,0,9};
		
	//	int n_row[] = {1,1,3,1,2,3,1,2,0,2};
	//	int n_column[]= {1,2,3,2,1,3,2,1,0,9};

		row = n_row;
		column = n_column;
		
	}
	
	@Override
	public void userSetPosition() {
		countRow++;
		countColumn++;
		
		
	}
	
	@Override
	public int getRow() {
		return (row[countRow-1]-1);
	}
	
	@Override
	public int getColumn() {
		return (column[countColumn-1]-1);
	}
	
	
}
