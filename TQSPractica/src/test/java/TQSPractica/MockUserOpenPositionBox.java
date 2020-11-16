package TQSPractica;

public class MockUserOpenPositionBox extends User{

	 int row[]= {};
	 int column[]= {};
	 int countRow;
	 int countColumn;
	
	public MockUserOpenPositionBox() {
		countRow = 0;
		countColumn = 0;

		int n_row[] =    {1,9,1,1,3,3,10,10,6};
		int n_column[] = {1,1,5,8,6,10,10,6,9}; 
		row = n_row;
		column = n_column;
		
	}
	
	@Override
	public void userSetPosition() {
		countRow ++ ;
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
	
	@Override
	public void setRow(int fil) 
	{
		row[countRow-1] = fil+1;
	}
	
	@Override
	public void setColumn(int col) 
	{
		column[countColumn-1] = col+1;
	}
	
	
}