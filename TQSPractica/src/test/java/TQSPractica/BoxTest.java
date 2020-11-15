package TQSPractica;

import static org.junit.Assert.*;


public class BoxTest extends Box {
	
	@Test
	public void BoxTest() {
		
		Box box = new MockBox();
		
		assertEquals(box.value, 0 );
		assertEquals(box.getNumberBombs() , 0 );
		assertFalse(box.filled);				
	}
	
	@Test
	public void getValueTest() {
		Box box = new MockBox();
		assertEquals(box.getValue(),0);
	}
	
	@Test
	public void getNumberBombsTest() {
		Box box = new MockBox();
		assertEquals(box.getNumberBombs(),0);
	}
	
	@Test
	public void isFilledTest() {
		Box box = new MockBox();
		assertFalse(box.isFilled());
	}
	
	@Test 
	public void setNumberBombsTest() {
		
		int numberBombs = 3;
		Box box = new MockBox();
		box.setNumberBombs(numberBombs);
		
		assertEquals(box.getNumberBombs(),3);
	}
	

}
