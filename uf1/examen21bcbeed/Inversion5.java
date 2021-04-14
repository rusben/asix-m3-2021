import java.util.Scanner;

public class Inversion5 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        /*
        Crea 3 arrays (int, boolean, String) y luego, con un bucle, guarda en ellos los valores de los

datos de la entrada.

Recorre el array en orden inverso e imprime primero el String invertido (con un bucle), segundo el booleano invertido (!) y tercero el entero con el signo cambiado(-).
        */

        int n = scanner.nextInt();

        int[] e = new int[n];
        boolean[] b = new boolean[n];
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            e[i] = scanner.nextInt();
            b[i] = scanner.nextBoolean();
            s[i] = scanner.next();
        }


        for (int i = n - 1; i >= 0; i--) {

            for (int j = s[i].length() - 1; j >= 0; j--) {
                System.out.print(s[i].charAt(j));
            }

            System.out.print(" ");
            System.out.print(!b[i]);
            System.out.print(" ");
            System.out.print(e[i] * -1);
            System.out.println();
        }

    }
}
