import java.io.*;
import java.util.*;

public class JumpJump {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int a, b, saltos;
        
        // Leemos el primer elemento
        a = input.nextInt();
        b = input.nextInt();
        
        
        saltos = 0;
        
        while (b != -1) {
            if (a < b) { // salta
                saltos++;
            }
            
            a = b;
            b = input.nextInt();
        }
        
        System.out.println(saltos);
    }
}
