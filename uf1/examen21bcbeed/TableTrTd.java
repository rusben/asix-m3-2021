import java.util.Scanner;


public class TableTrTd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int c = scanner.nextInt();

        String[][] celdas = new String[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                celdas[i][j] = scanner.next();
            }
        }

        System.out.println("<table>");
        for (int i = 0; i < f; i++) {
            System.out.println("    <tr>");
            for (int j = 0; j < c; j++) {
                System.out.println("        <td>"+celdas[i][j]+"</td>");
            }
            System.out.println("    </tr>");
        }
        System.out.println("</table>");

    }
}
