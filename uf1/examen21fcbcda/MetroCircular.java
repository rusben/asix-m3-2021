import java.util.Scanner;

public class MetroCircular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	
      	int n = scanner.nextInt();
        String[] e = new String[n];
        int[] t = new int[n];
        
        for (int i = 0; i < n; i++) {
            e[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        
        String origen = scanner.next();
        String destino = scanner.next();
        
        int nori = 0;
        int ndes = 0;
        for (int i = 0; i < n; i++) {
            if (origen.equals(e[i])) {
                nori = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (destino.equals(e[i])) {
                ndes = i;
                break;
            }
        }
        
        int a = 0;
        int b = 0;
        
        for (int i = nori;;) {
            if (i == ndes) {
                break;
            }
            a += t[i];
            i++;
            if (i == n) {
                i = 0;
            }
        }
        for (int i = nori;;) {
            if (i == ndes) {
                break;
            }
            if (i - 1 == -1) {
               b += t[n-1];
            } else {
                b += t[i-1];
            }
            
            i--;
            if (i == -1) {
                i = n - 1;
            } else if (i == ndes) {
                break;
            }
        }
        if (a < b) {
            for (int i = nori;;) {
                System.out.println(e[i]);
                if (i == ndes) {
                    break;
                }
                i++;
                if (i == n) {
                    i = 0;
                }
            }
        System.out.println(a); 
        } else {
            for (int i = nori;;) {
                System.out.println(e[i]);
                if (i == ndes) {
                    break;
                }
                i--;
                if (i == -1) {
                    i = n - 1;
                }
            }
        System.out.println(b);
        }
    }
}
