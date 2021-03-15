import java.util.Locale;
import java.util.Scanner;

public class TPV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        
        int N = scanner.nextInt();
        String[] productes = new String[N];
        float[] preus = new float[N];
                
        for (int i = 0; i < N; i++) {
            productes[i] = scanner.next();
        }
        
        for (int i = 0; i < N; i++) {
            preus[i] = scanner.nextFloat();
        }
        
      	int P = scanner.nextInt();
        
        float total = 0;
        for (int i = 0; i < P; i++) {
            // Leer producto
            String producto = scanner.next();
            int cantidad = scanner.nextInt();
            
            // Buscar producto
            for (int j = 0; j < N; j++) {
                if (producto.equals(productes[j])) {
                    total += cantidad * preus[j];
                }
            }
        }
        
        System.out.println(total);
    }
}
