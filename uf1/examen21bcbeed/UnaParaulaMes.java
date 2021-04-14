import java.util.Scanner;

public class UnaParaulaMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        int palabrasQueHayQueImprimir = 1;
        for (int i = 0; i < n; i++) {

             for (int j = 0; j < palabrasQueHayQueImprimir; j++) {
                System.out.print(words[j]+" ");
             }
             palabrasQueHayQueImprimir++;

             System.out.println();

        }

    }
}
