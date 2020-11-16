package TQSPractica;

public class Box {
	
	int value;
	private int numberBombs;
	boolean filled;
	
	
	public Box() 
	{
		filled = false;
		numberBombs = 0;
		value = 0;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public int getNumberBombs() {
		return numberBombs;
	}


	public void setNumberBombs(int numberBombs) {
		this.numberBombs = numberBombs;
	}


	public boolean isFilled() {
		return filled;
	}


	public boolean setFilled(boolean filled) {
		return this.filled = filled;
	}
	
	 
	

}
