import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	
        String[] teclas = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        
        int N = scanner.nextInt();
        
        int offset = 0;
        for (int i = 0; i < N; i++) {
            
            offset += scanner.nextInt();
            
            if (offset < 0) offset = 0;
            else if (offset >= teclas.length) offset = teclas.length-1;
            else System.out.print(teclas[offset]);
         
            
            
        }
      	
    }
}
