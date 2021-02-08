import java.io.*;
import java.util.*;

public class Estadistica {

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
  
  for (int i = 0; i < 10; i++) {
	 
    int n = scanner.nextInt();
    
    for (int j = 0; j < n; j++) {
    	System.out.print("X");
    }
    System.out.println();
	 
  }



    }
}
