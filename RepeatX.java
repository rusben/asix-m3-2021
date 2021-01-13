import java.io.*;
import java.util.*;

public class RepeatX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.print(num);
        }
    }
}
