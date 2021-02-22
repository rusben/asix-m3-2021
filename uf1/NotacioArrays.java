import java.io.*;
import java.util.*;

public class NotacioArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int elementos = input.nextInt();
        
        System.out.print("int[] myArray = { ");
        
        for (int i = 0; i < elementos; i++) {
            int valor = input.nextInt();
            System.out.print(valor);
            
            if (i == elementos-1) { // El último valor
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }
        }
        
        System.out.print("};");
    }
}
