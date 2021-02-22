import java.io.*;
import java.util.*;

public class EstadisticaV {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
//Lee una serie de 10 números del 1 al 10 (puede haber repetidos) 
//Imprime una especie de gràfico, en horizontal.

//1 2 1 8 7 1 9 1 1 1

//X
//XX
//X
//XXXXXXXX
//XXXXXXX
//X
//XXXXXXXXX
//X
//X
//X

  Scanner scanner = new Scanner(System.in);

  char matrix[][] = new char[10][10];
  
  // Init
  for (int i = 0; i < 10; i++) {
	  for (int j = 0; j < 10; j++) {
	  		matrix[i][j] = ' ';
	  }
  }

  for (int i = 0; i < 10; i++) {
	 
    int n = scanner.nextInt();
    
    for (int j = 0; j < n; j++) {
	matrix[i][j] = 'X';
    }
 
  }

  for (int i = 0; i < 10; i++) {
  	for (int j = 0; j < 10; j++) {
		System.out.print(matrix[i][j]);
  	}
  	System.out.println();
  }
  
    for (int i = 9; i >= 0; i--) {
  	for (int j = 0; j < 10; j++) {
		System.out.print(matrix[j][i]);
  	}
  	System.out.println();
  }
  
  
  



    }
}
