import java.util.Scanner;

public class Recortar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int h = scanner.nextInt();
        int w = scanner.nextInt();

        int[][] matrix = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();

        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        for (int i = ax; i <= bx; i++) {
            for (int j = ay; j <= by; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
