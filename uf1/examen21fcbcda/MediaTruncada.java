import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaTruncada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
    	
        int N = scanner.nextInt();
        
        float[] puntuaciones = new float[N];
        
        for (int i = 0; i < N; i++) {
            puntuaciones[i] = scanner.nextFloat();
        }
        
        // Buscar max y min
        float max = puntuaciones[0];
        float min = puntuaciones[0];
        int maxPosition = 0;
        int minPosition = 0;
        for (int i = 0; i < N; i++) {
           if (puntuaciones[i] > max) {
               max = puntuaciones[i];
               maxPosition = i;
           }
            
           if (puntuaciones[i] < min) {
               min = puntuaciones[i];
               minPosition = i;
           }
        }
        
        float total = 0;
        // Sumamos todos menos los que estan en las posiciones de max y min
        for (int i = 0; i < N; i++) {
            
            if (i != maxPosition && i != minPosition) {
                total += puntuaciones[i];
            }
            
            
        }
        
    
        System.out.println(total / (N-2));
        
        
    }
}
