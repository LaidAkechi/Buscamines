package TQSPractica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class UserTest extends User {
	
	/*
	@Test
	public void User() {
		User user = new MockUser();
		user.userSetPosition();
		assertEquals(user.getRow(),0);
		assertEquals(user.getColumn(),0);
	}
	*/

	
	@Test
	public void getRowTest() {
		User user = new MockUser();
		user.userSetPosition();
		assertNotNull(user.getRow());
	}

	@Test
	public void getColumnTest() {
		User user = new MockUser();
		user.userSetPosition();
		assertNotNull(user.getColumn());
	}
	
	// Test de la funcion userSetPosition, per tant demanarà per consola una fila i columna
	// Valida si els valors introduits no son null
	@Test
	public void userSetPositionTest() {
		int row = (int)Math.random()*9;
		int column = (int)Math.random()*9;
		
		
		User user = new User();
		user.userSetPosition();
		
		assertThat(row,notNullValue());
		assertThat(column, notNullValue());

	}
}
