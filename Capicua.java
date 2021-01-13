import java.io.*;
import java.util.*;

public class Capicua {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int total = input.nextInt();
        int[] elementos = new int[total];
        
        // Leer los valores y guardarlos en el array
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = input.nextInt();
        }
        
        
        int i = 0;
        int j = elementos.length - 1;
        boolean capicua = true;
        
        while( i < elementos.length / 2) {
            if (elementos[i] != elementos[j]) { // No es capicua
                capicua = false;
                break;
            }
            
            i++;
            j--;
        }
        
        if (capicua) System.out.println("SI");
        else System.out.println("NO");
        
    }
}
