/*
Primero lee la línea de texto y guardala en un array de tipo char.
Para leer un línea de texto y convertirla en un array de caracteres puedes utilizar:
scanner.nextLine().toCharArray()

Después recorre el array de caracteres e imprime los caracteres uno a uno (en la misma línea). Cada
caracteres imprime un salto de línea.

Sample Input 4

Java is a general-purpose, concurrent, class-based, object-oriented language.
21

Sample Output 4

Java is a general-pur
pose, concurrent, cla
ss-based, object-orie
nted language.


*/
import java.util.Scanner;

public class AjusteTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] linea = scanner.nextLine().toCharArray();
        int n = scanner.nextInt();

        int caracteresImprimidosEnLaLinea = 0;
        for (int i = 0; i < linea.length; i++) {

            System.out.print(linea[i]);

            caracteresImprimidosEnLaLinea++;

            if (caracteresImprimidosEnLaLinea == n) {
                System.out.println();
                caracteresImprimidosEnLaLinea = 0;
            }

        }

    }
}
