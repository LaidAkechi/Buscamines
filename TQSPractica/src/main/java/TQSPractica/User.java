package TQSPractica;

import java.util.Scanner;

public class User {
  
  static int row;
    static int column;
    private Scanner userScanner = new Scanner(System.in);

    public User() {
        row = 0;
        column = 0;
    }


    public void userSetPosition() 
    {
        int n_row = 0; 
        int n_column = 0;


            while(n_row > 10 || n_row < 1) {
                System.out.println("Introdueix numeros del 1 al 10:");
                System.out.println("Fila:");
                n_row = userScanner.nextInt();
            }

            row = n_row;
            row--;

            while (n_column > 10 || n_column < 1) {
                System.out.println("Introdueix numeros del 1 al 10:");
                System.out.println("Columna:"); 
                n_column = userScanner.nextInt();
            }
            column = n_column;
            column--;

    }



    public int getRow() {
        return row;
    }



    public void setRow(int row) {
        this.row = row;
    }



    public int getColumn() {
        return column;
    }



    public void setColumn(int column) {
        this.column = column;
    }


}
