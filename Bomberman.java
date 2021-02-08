import java.io.*;
import java.util.*;

public class Bomberman {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int files = scanner.nextInt();
        int columnes = scanner.nextInt();
        
        int[][] tablero = new int[files][columnes];
        
        // Leer el tablero
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }
        
        // Leer la bomba
        int bomb = scanner.nextInt();
        int fila, columna; // Fila y columna que explotan
        fila = columna = 0;
                
        // Buscar la bomba y guardar la fila y la columna donde se encuentra
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (tablero[i][j] == bomb) {
                    fila = i;
                    columna = j;
                }
            }
        }
        
        // Imprimir el tablero teniendo en cuenta fila y columna (donde está la bomba)
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                
                // Si es la fila o la columna de la bomba imprimir @
                if (i == fila || j == columna ) System.out.print("@");
                else  System.out.print("#");
            }
            System.out.println();
        }
        
        
    }
}
