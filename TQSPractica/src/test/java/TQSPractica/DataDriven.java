package TQSPractica;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class DataDriven {

	private String[] getInputs(String file, int pos) throws IOException {
		List<String> inputs = new ArrayList<String>();
		File fichero = new File(file);
		FileInputStream flujo = new FileInputStream(fichero);
		BufferedReader lector = new BufferedReader(new InputStreamReader(flujo));
		String line;
		while((line = lector.readLine()) != null) {
		    inputs.add(line.split(" ")[pos]);
		}
		lector.close();
		flujo.close();
		String[] entradas = new String[inputs.size()];
		return inputs.toArray(entradas);
	}
	
	@Test
	public void testtestTablero() throws IOException {
		String[] tablero = getInputs("casillas.txt", 0);
		MockTablero Board= new MockTablero();
		Board.llenarMinas(tablero);
		Board.mostrarTablero();
	}
	
/* 	@Test
	public void testboardDescubreCasillas() throws IOException {
		String[] casillasX = getInputs("Casillas.txt", 0);
		String[] casillasY = getInputs("Casillas.txt", 1);
		String[] mina = getInputs("Casillas.txt", 2);
		Board board = board.getMockboard();
		for(int i = 0; i < casillasX.length; i++) {
			int x = Integer.parseInt(casillasX[i]);
			int y = Integer.parseInt(casillasY[i]);
			assertEquals(mina[i], String.valueOf(board.descubreCasilla(x, y)));
		}
	}
	
	@Test
	public void testboardCuentaMinas() throws IOException {
		String[] casillasX = getInputs("CasillasContar.txt", 0);
		String[] casillasY = getInputs("CasillasContar.txt", 1);
		String[] minasAlrededor = getInputs("CasillasContar.txt", 2);
		Board board = board.getMockboardConZeros();
		for(int i = 0; i < casillasX.length; i++) {
			int x = Integer.parseInt(casillasX[i]);
			int y = Integer.parseInt(casillasY[i]);
			assertEquals(minasAlrededor[i], String.valueOf(board.cuentaMinasAlrededor(x, y)));
		}
	} */

}