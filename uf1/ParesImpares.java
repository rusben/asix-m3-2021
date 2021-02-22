import java.io.*;
import java.util.*;

public class ParesImpares {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int sumapares = 0;
        int mulimpares = 1;
        int total = 0;
        
        while (x != -1) {
            
            if (x % 2 == 0) { // Es par
                sumapares += x;
            } else { // Es impar
                mulimpares *= x;
            }
            
            total++;
            
            x = input.nextInt();
            
        }
        
        System.out.println(sumapares);
        System.out.println(mulimpares);
        System.out.println(total);
    }
}
