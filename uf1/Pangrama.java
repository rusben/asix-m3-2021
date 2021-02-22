import java.io.*;
import java.util.*;

public class Pangrama {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";   
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        
        
        // Para cada letra del alfabeto...
        for (int i = 0; i < alphabet.length(); i++) {
            
            // Buscamos la letra dentro de la frase
            char letra = alphabet.charAt(i);
            boolean letraAparece = false;
                
            for (int j = 0; j < sentence.length(); j++) {
                if (letra == sentence.charAt(j)) {
                    // La letra está en la frase
                    letraAparece = true;
                    break;
                    // break para pasar a la siguiente letra
                }
            }
            
            if (letraAparece == false) {
                // Si la letra no aparece podemos acabar de buscar
                System.out.println("false");
                System.exit(0); // salir sin errores
            }           
        }
        
        System.out.println("true");
        
    }
}
