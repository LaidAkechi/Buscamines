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

<<<<<<< HEAD
	private String[] getInputs(String file, int pos) throws IOException {
=======
	@SuppressWarnings("null")
	private Integer[] getInputs(String file) throws IOException {
>>>>>>> 5d7b9f1f025612b873979790d1fd1551babe6145
		List<String> inputs = new ArrayList<String>();
		File fichero = new File(file);
		FileInputStream flujo = new FileInputStream(fichero);
		BufferedReader lector = new BufferedReader(new InputStreamReader(flujo));
		String line;
<<<<<<< HEAD
		while((line = lector.readLine()) != null) {
		    inputs.add(line.split(" ")[pos]);
		}
		lector.close();
		flujo.close();
		String[] entradas = new String[inputs.size()];
		return inputs.toArray(entradas);
=======
		String[] text = null;
		Integer[] cadena;
		Integer contador=0;
		Integer i=0;
		cadena = new Integer[100];
		while((line = lector.readLine()) != null) {
		    text = line.split(";");
		    
		    for(String character : text)
		    {
		    	if(character!=null)
		    	{
		    		cadena[i]= Integer.parseInt(character);
		    		System.out.print(cadena[i]);
		    		i++;
		    	}
		    }
		    contador++;
		    
		}
		lector.close();
		flujo.close();
		return cadena;
>>>>>>> 5d7b9f1f025612b873979790d1fd1551babe6145
	}
	
	@Test
	public void testtestTablero() throws IOException {
<<<<<<< HEAD
		String[] tablero = getInputs("casillas.txt", 0);
		MockTablero Board= new MockTablero();
		Board.llenarMinas(tablero);
		Board.mostrarTablero();
=======
		Integer[] tablero = getInputs("casillas.txt");
		MockTablero Board= new MockTablero();
		
		Board.llenarMinas(tablero);
		System.out.print("\n");
		System.out.print(tablero[99]);
		System.out.print("\n");
		Board.mostrarTablero();
		System.out.print("\n");
		System.out.print(tablero[100]);
>>>>>>> 5d7b9f1f025612b873979790d1fd1551babe6145
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