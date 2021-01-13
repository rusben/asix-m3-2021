import java.io.*;
import java.util.*;

public class TrobantMines  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int filas = input.nextInt();
        int columnas = input.nextInt();
        
        int elemento;
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                elemento = input.nextInt();
                
                if (elemento == 1) { // Hay mina
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
