import java.io.*;
import java.util.*;

public class DelReves {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int[] elementos = new int[total];
        
        for (int i = 0; i < total; i++) {
            // Leemos cada vuelta un elemento y lo guardamos en su posición correspondiente
            elementos[i] = input.nextInt(); 
        }
        
        // Ya está el array leído, lo imprimimos en el mismo orden
        // for (int i = 0; i < elementos.length; i++) {
        //   System.out.print(elementos[i]+ " "); 
        // }
        
        for (int i = elementos.length - 1; i >= 0; i--) {
           System.out.print(elementos[i]+ " "); 
        }
    }
}
