package TQSPractica;

import static org.junit.Assert.*;

import org.junit.Test;


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
    
    @Test 
	public void setFilledTest() {
		
		boolean filled = true;
		Box box = new MockBox();
		box.setFilled(filled);
		
		assertEquals(box.isFilled(),filled);
	}
    @Test 
	public void setValueTest() {
		
		int value = 3;
		Box box = new MockBox();
		box.setValue(value);
		
		assertEquals(box.getValue(),value);
	}

}