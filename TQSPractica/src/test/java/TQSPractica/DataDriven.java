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

	@SuppressWarnings("null")
	private Integer[] getTablero(String file) throws IOException {
		List<String> inputs = new ArrayList<String>();
		File fichero = new File(file);
		FileInputStream flujo = new FileInputStream(fichero);
		BufferedReader lector = new BufferedReader(new InputStreamReader(flujo));
		String line;
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
	}
	private String[] getInputs(String file, int pos) throws IOException {
		List<String> inputs = new ArrayList<String>();
		File fichero = new File(file);
		FileInputStream flujo = new FileInputStream(fichero);
		BufferedReader lector = new BufferedReader(new InputStreamReader(flujo));
		String line;
		while((line = lector.readLine()) != null) {
		    inputs.add(line.split(";")[pos]);
		}
		lector.close();
		flujo.close();
		String[] entradas = new String[inputs.size()];
		return inputs.toArray(entradas);
	}
	//Test para 
	@Test
	public void testtestTableroAbrirCasilla() throws IOException {
		Integer[] tablero = getTablero("casillas.txt");
		String[] casillasX = getInputs("abrircasillas.txt", 0);
		String[] casillasY = getInputs("abrircasillas.txt", 1);
		String[] mina = getInputs("abrircasillas.txt", 3);
		MockTablero Board= new MockTablero();
		User user = new User();
		Board.setEndGame(false);
		Board.llenarMinas(tablero);
		Board.setUser(user);
		System.out.print("\n");
		System.out.print(tablero[0]);
		System.out.print("\n");
		Board.mostrarTablero();
		System.out.print("\n");
		System.out.print(tablero[2]);
		for(int i = 0; i < casillasX.length; i++) {
			int x = Integer.parseInt(casillasX[i]);
			int y = Integer.parseInt(casillasY[i]);
			Board.user.setColumn(x);
			Board.user.setRow(y);
			Board.setEndGame(false);
			Board.openPositionBox();
			System.out.print("Abrir casillas \n");
			System.out.print("Columna: "+x+" Fila: "+y+"\n");
			if (Boolean.parseBoolean(mina[i])) {
				System.out.print("Se pierde la partida = "+mina[i]+Board.isEndGame()+"\n");
				assertEquals(Boolean.parseBoolean(mina[i]), Board.isEndGame()); 
			}else {
				System.out.print("Se puede seguir jugando = "+mina[i]+Board.isEndGame()+"\n");
				assertEquals(Boolean.parseBoolean(mina[i]), Board.isEndGame());
			}
		}
	}
	
 	@Test
	public void testboardComprovarmina() throws IOException {
 		Integer[] tablero = getTablero("casillas.txt");
		MockTablero Board= new MockTablero();
		User user = new User();
		Board.llenarMinas(tablero);
		Board.setUser(user);
		String[] casillasX = getInputs("abrircasillas.txt", 0);
		String[] casillasY = getInputs("abrircasillas.txt", 1);
		String[] mina = getInputs("abrircasillas.txt", 3);

		for(int i = 0; i < casillasX.length; i++) {
			int x = Integer.parseInt(casillasX[i]);
			int y = Integer.parseInt(casillasY[i]);
			Board.user.setColumn(x);
			Board.user.setRow(y);
			System.out.print("Abrir casillas \n");
			System.out.print("Columna: "+x+" Fila: "+y+"\n");
			System.out.print("Esmina esperado: "+mina[i]+" Esmina de funcion: "+Board.isMine()+"\n");
			assertEquals(Boolean.parseBoolean(mina[i]), String.valueOf(Board.isMine()));
		}
	}
 	@Test
	public void testboardMinasalrededor() throws IOException {
 		Integer[] tablero = getTablero("casillas.txt");
		MockTablero Board= new MockTablero();
		User user = new User();
		Board.llenarMinas(tablero);
		Board.setUser(user);
		String[] casillasX = getInputs("abrircasillas.txt", 0);
		String[] casillasY = getInputs("abrircasillas.txt", 1);
		String[] valor = getInputs("abrircasillas.txt", 2);

		for(int i = 0; i < casillasX.length; i++) {
			int x = Integer.parseInt(casillasX[i]);
			int y = Integer.parseInt(casillasY[i]);
			Board.user.setColumn(x);
			Board.user.setRow(y);
			System.out.print("minas alredeor \n");
			System.out.print("Columna: "+x+" Fila: "+y+"\n");
			System.out.print("Valor casilla esperado: "+valor[i]+" Valor casilla funcion: "+Board.minesArround()+"\n");
			if(Integer.parseInt(valor[i]) == -1) {
				assertEquals(0, String.valueOf(Board.minesArround()));
			}
			else {
				assertEquals(valor[i], String.valueOf(Board.minesArround()));
			}
		}
	}

}